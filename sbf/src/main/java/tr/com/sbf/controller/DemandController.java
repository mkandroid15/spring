/**
 * @author Mehmet
 *
 * 21 Haz 2018
 *
 * 14:50:39
 */

package tr.com.sbf.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import tr.com.sbf.model.Brand;
import tr.com.sbf.model.Consulting;
import tr.com.sbf.model.Customer;
import tr.com.sbf.model.DemandItem;
import tr.com.sbf.model.Insurance;
import tr.com.sbf.model.Talep;
import tr.com.sbf.repository.BrandRepository;
import tr.com.sbf.repository.CitiesDAO;
import tr.com.sbf.repository.ConsultingDemand;
import tr.com.sbf.repository.ConsultingRepository;
import tr.com.sbf.repository.DBFile;
import tr.com.sbf.repository.DemandListRepository;
import tr.com.sbf.repository.DistrictsDAO;
import tr.com.sbf.repository.InsuranceRepository;
import tr.com.sbf.service.DBFileStorageService;
import tr.com.sbf.service.DemandService;

@Controller
public class DemandController extends SbfController {

	private final DemandListRepository demandListRepository;
	private final InsuranceRepository insuranceRepository;
	private final ConsultingRepository consultingRepository;
	private final BrandRepository brandRepository;

	@Autowired
	private DemandService demandService;

	@Autowired
	private DBFileStorageService dbFileStorageService;

	public DemandController(CitiesDAO citiesDAO, DistrictsDAO districtDAO, DemandListRepository demandListRepository,
			InsuranceRepository insuranceRepository, ConsultingRepository consultingRepository,
			BrandRepository brandRepository) {
		super(citiesDAO, districtDAO);
		this.demandListRepository = demandListRepository;
		this.insuranceRepository = insuranceRepository;
		this.consultingRepository = consultingRepository;
		this.brandRepository = brandRepository;
	}

	@RequestMapping("/demand")
	public String getDemandPage(final Model model) {

		final Talep talep = new Talep();
		talep.setPartner(getPartnerInfo());

		final Customer customer = new Customer();
		talep.setCustomer(customer);

		final Consulting consulting = new Consulting();
		talep.setConsulting(consulting);

		model.addAttribute("demand", talep);
		return "demand";

	}

	@RequestMapping("/insuranceDemandlist")
	public String getInsuranceDemandList(Model model) {
		if (isRoleOfficial()) {
			final List<DemandItem> demands = this.demandListRepository.findInsuranceDemands();
			model.addAttribute("demandlist", demands);
			return "insuranceDemands";
		}
		return "home";
	}

	@RequestMapping("/consultingDemandlist")
	public String getConsultingDemandList(Model model) {
		if (isRoleOfficial()) {
			final List<DemandItem> demands = this.demandListRepository.findConsultingDemands();
			model.addAttribute("demandlist", demands);
			return "consultingDemands";
		}
		return "home";
	}

	@RequestMapping("/brandDemandlist")
	public String getBrandDemandList(Model model) {
		final List<DemandItem> demands = this.demandListRepository.findBrandDemands();
		model.addAttribute("demandlist", demands);
		return "brandDemands";
	}

	@RequestMapping(value = "/approvalInsurance/{id}", method = RequestMethod.GET)
	public String approvalInsuranceDemand(@PathVariable String id, Model model) {
		final long insuranceById = this.insuranceRepository.getInsuranceById(id);
		final Optional<Insurance> insuranceList = this.insuranceRepository.findById(insuranceById);
		final Insurance insurance = insuranceList.get();
		insurance.setPartner(getPartnerInfo());
		final Customer customer = insurance.getCustomer();
		insurance.setCustomer(customer);
		model.addAttribute("insurance", insurance);
		model.addAttribute("id", model);
		return "insuranceDemand";
	}

	@RequestMapping(value = "/approvalConsulting/{id}", method = RequestMethod.GET)
	public String approvalConsultingDemand(@PathVariable String id, Model model) {
		final Long consultingById = this.consultingRepository.getConsultingById(id);
		final Optional<ConsultingDemand> consultingList = this.consultingRepository.findById(consultingById);
		final ConsultingDemand consultingDemand = consultingList.get();
		consultingDemand.setPartner(getPartnerInfo());
		model.addAttribute("consulting", consultingDemand);
		model.addAttribute("id", model);

		return "consultingDemand";
	}

	@RequestMapping(value = "/approvalBrand/{id}", method = RequestMethod.GET)
	public String approvalBrandDemand(@PathVariable String id, Model model) {
		final Long brandId = this.brandRepository.getBrandById(id);
		final Optional<Brand> brandList = this.brandRepository.findById(brandId);
		final Brand brand = brandList.get();
		brand.setPartner(getPartnerInfo());
		model.addAttribute("marka", brand);
		model.addAttribute("id", model);

		return "brandDemand";
	}

	@RequestMapping(value = "/download/{id}", method = RequestMethod.GET)
	@ResponseBody
	public HttpEntity<byte[]> downloadFile(@PathVariable String id) throws Exception {
		final DBFile file = this.dbFileStorageService.getFile(id);

		final HttpHeaders header = new HttpHeaders();
		header.setContentType(MediaType.APPLICATION_PDF);
		header.set(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + file.getFileName());
		header.setContentLength(file.getData().length);

		return new HttpEntity<byte[]>(file.getData(), header);
	}

	@RequestMapping(value = "/talep", method = RequestMethod.POST)
	public String saveConsultingDemand(@ModelAttribute final Talep talep, final ModelMap modelMap) {
		System.out.println("consulting submit oldu.");
		final ConsultingDemand consultingDemand = new ConsultingDemand();
		consultingDemand.setConsultingType(talep.getConsulting().getConsultingType());
		consultingDemand.setCustomer(talep.getCustomer());
		consultingDemand.setDangerState(talep.getConsulting().getDangerState());
		consultingDemand.setDescription(talep.getConsulting().getDescription());
		consultingDemand.setEgitim(setEtigim(talep.getConsulting()));

		try {
			if (talep.getConsulting().getFile() != null) {
				final DBFile storeFile = this.dbFileStorageService.storeFile(talep.getConsulting().getFile());
				consultingDemand.setFileguid(storeFile.getId());
			}
		} catch (final Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		consultingDemand.setNaceCode(talep.getConsulting().getNaceCode());
		consultingDemand.setOsgbDanismanlik(setOsgbDanismanlik(talep.getConsulting()));
		consultingDemand.setOsgbHizmet(setOgsHizmet(talep.getConsulting()));
		consultingDemand.setPartner(talep.getPartner());
		consultingDemand.setPeriyodSaglik(setPeriyodukSaglik(talep.getConsulting()));
		consultingDemand.setPersonCount(talep.getConsulting().getPersonCount());
		consultingDemand.setSubject(talep.getConsulting().getSubject());

		this.consultingRepository.save(consultingDemand);
		this.demandService.CreateDemand(2, consultingDemand.getId());

		return "home";
	}

	private int setPeriyodukSaglik(Consulting consulting) {
		int result = 0;
		if (consulting.isEgitimAcilDurumEkip()) {
			result |= consulting.EGITIM_ACIL_DURUM_EKIP;
		}
		if (consulting.isEgitimAcilDurumPlanTahliye()) {
			result |= consulting.EGITIM_ACIL_DURUM_TAHLIYE;
		}
		if (consulting.isEgitimCalisanTemelIsGuvenligi()) {
			result |= consulting.EGITIM_TEMEL_IS_GUVENLIK;
		}
		if (consulting.isEgitimEkranliAraclarlaCalisma()) {
			result |= consulting.EGITIM_EKRANLI_ARACLAR;
		}
		if (consulting.isEgitimElleKaldirma()) {
			result |= consulting.EGITIM_ELLE_KALDIRMA;
		}
		if (consulting.isEgitimIlkYardim()) {
			result |= consulting.EGITIM_ILK_YARDIM;
		}
		if (consulting.isEgitimIsEkipmanlari()) {
			result |= consulting.EGITIM_IS_EKIPMAN_GUVENLIK;
		}
		if (consulting.isEgitimISGKurulUye()) {
			result |= consulting.EGITIM_TEMEL_ISG_UYE;
		}
		if (consulting.isEgitimIsHijyen()) {
			result |= consulting.EGITIM_IS_HIJYEN;
		}
		if (consulting.isEgitimKapaliAlanCalisma()) {
			result |= consulting.EGITIM_KAPALI_ALAN_CALISMA;
		}
		if (consulting.isEgitimKisiselKoruyucu()) {
			result |= consulting.EGITIM_KISISEL_KORUYUCU;
		}
		if (consulting.isEgitimRiskDegerlendirme()) {
			result |= consulting.EGITIM_RISK_DEGERLENDIRME;
		}
		if (consulting.isEgitimSaglikGuvenlikIsaret()) {
			result |= consulting.EGITIM_SAGLIK_GUVENLIK;
		}
		if (consulting.isEgitimYanginEgitim()) {
			result |= consulting.EGITIM_YANGIN_TATBIKAT;
		}

		return result;
	}

	private int setOgsHizmet(Consulting consulting) {
		int result = 0;
		if (consulting.isOsgbHizmetAylikIsGuvenligi()) {
			result |= consulting.OSGB_HIZMET_AYLIK_IS_GUVENLIGI;
		}
		if (consulting.isOsgbHizmetAylikIsyeri()) {
			result |= consulting.OSGB_HIZMET_AYLIK_ISYERI_HEKIMLIGI;
		}
		if (consulting.isOsgbHizmetAylikSaglikPersonel()) {
			result |= consulting.OSGB_HIZMET_AYLIK_SAGLIK_PERSONEL;
		}
		return result;
	}

	private int setOsgbDanismanlik(Consulting consulting) {
		int result = 0;
		if (consulting.isOsgbDanismanlikAcilDurumPlani()) {
			result |= consulting.OSGB_DANIS_ACIL_DURUM;
		}
		if (consulting.isOsgbDanismanlikIsGuvenligi()) {
			result |= consulting.OSGB_DANIS_IS_GUVENLIGI;
		}
		if (consulting.isOsgbDanismanlikRiskAnalizi()) {
			result |= consulting.OSGB_DANIS_RISK_ANALIZ;
		}
		if (consulting.isOsgbDanismanlikSaglikGuvenlikPlani()) {
			result |= consulting.OSGB_DANIS_SAGLIK_GUVENLIK;
		}
		if (consulting.isOsgbDanismanlikYanginRiskAnalizi()) {
			result |= consulting.OSGB_DANIS_YANGIN_RISK;
		}
		return result;
	}

	private int setEtigim(Consulting consulting) {
		int result = 0;
		if (consulting.isEgitimAcilDurumEkip()) {
			result |= consulting.EGITIM_ACIL_DURUM_EKIP;
		}
		if (consulting.isEgitimAcilDurumPlanTahliye()) {
			result |= consulting.EGITIM_ACIL_DURUM_TAHLIYE;
		}
		if (consulting.isEgitimCalisanTemelIsGuvenligi()) {
			result |= consulting.EGITIM_TEMEL_IS_GUVENLIK;
		}
		if (consulting.isEgitimEkranliAraclarlaCalisma()) {
			result |= consulting.EGITIM_EKRANLI_ARACLAR;
		}
		if (consulting.isEgitimElleKaldirma()) {
			result |= consulting.EGITIM_ELLE_KALDIRMA;
		}
		if (consulting.isEgitimIlkYardim()) {
			result |= consulting.EGITIM_ILK_YARDIM;
		}
		if (consulting.isEgitimIsEkipmanlari()) {
			result |= consulting.EGITIM_IS_EKIPMAN_GUVENLIK;
		}
		if (consulting.isEgitimISGKurulUye()) {
			result |= consulting.EGITIM_TEMEL_ISG_UYE;
		}
		if (consulting.isEgitimIsHijyen()) {
			result |= consulting.EGITIM_IS_HIJYEN;
		}
		if (consulting.isEgitimKapaliAlanCalisma()) {
			result |= consulting.EGITIM_KAPALI_ALAN_CALISMA;
		}
		if (consulting.isEgitimKisiselKoruyucu()) {
			result |= consulting.EGITIM_KISISEL_KORUYUCU;
		}
		if (consulting.isEgitimRiskDegerlendirme()) {
			result |= consulting.EGITIM_RISK_DEGERLENDIRME;
		}
		if (consulting.isEgitimSaglikGuvenlikIsaret()) {
			result |= consulting.EGITIM_SAGLIK_GUVENLIK;
		}
		if (consulting.isEgitimYanginEgitim()) {
			result |= consulting.EGITIM_YANGIN_TATBIKAT;
		}
		return result;
	}

}
