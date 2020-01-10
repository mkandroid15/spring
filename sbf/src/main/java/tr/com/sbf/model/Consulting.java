/**
 *
 */
package tr.com.sbf.model;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author Mehmet.Kaynak
 *
 *         13 Ara 2017
 *
 *         18:49:34
 */
/**
 * @author Mehmet.Kaynak
 *
 *         13 Ara 2017
 *
 *         19:04:47
 */
public class Consulting {

	public final int OSGB_HIZMET_AYLIK_IS_GUVENLIGI = 1;
	public final int OSGB_HIZMET_AYLIK_ISYERI_HEKIMLIGI = 2;
	public final int OSGB_HIZMET_AYLIK_SAGLIK_PERSONEL = 4;

	public final int OSGB_DANIS_IS_GUVENLIGI = 1;
	public final int OSGB_DANIS_RISK_ANALIZ = 2;
	public final int OSGB_DANIS_SAGLIK_GUVENLIK = 4;
	public final int OSGB_DANIS_ACIL_DURUM = 8;
	public final int OSGB_DANIS_YANGIN_RISK = 16;

	public final int PERIYOD_SAGLIK_AKCIGER_GRAFIT = 1;
	public final int PERIYOD_SAGLIK_ODIO_SFT = 2;
	public final int PERIYOD_SAGLIK_IDRAR_TAH = 4;
	public final int PERIYOD_SAGLIK_HEMOGRAM = 8;
	public final int PERIYOD_SAGLIK_KAN_GRUBU = 16;
	public final int PERIYOD_SAGLIK_ASL_ALT = 32;
	public final int PERIYOD_SAGLIK_PORTOR = 64;

	public final int EGITIM_TEMEL_IS_GUVENLIK = 1;
	public final int EGITIM_TEMEL_ISG_UYE = 2;
	public final int EGITIM_RISK_DEGERLENDIRME = 4;
	public final int EGITIM_ACIL_DURUM_EKIP = 8;
	public final int EGITIM_YANGIN_TATBIKAT = 16;
	public final int EGITIM_ACIL_DURUM_TAHLIYE = 32;
	public final int EGITIM_ELLE_KALDIRMA = 64;
	public final int EGITIM_SAGLIK_GUVENLIK = 128;
	public final int EGITIM_IS_HIJYEN = 256;
	public final int EGITIM_ILK_YARDIM = 512;
	public final int EGITIM_KISISEL_KORUYUCU = 1024;
	public final int EGITIM_IS_EKIPMAN_GUVENLIK = 2048;
	public final int EGITIM_KAPALI_ALAN_CALISMA = 4096;
	public final int EGITIM_EKRANLI_ARACLAR = 8192;

	ConsultingType consultingType;
	private String subject;
	private String description;
	private MultipartFile file;

	private DangerState dangerState;
	private int personCount;
	private int naceCode;

	private boolean osgbHizmetAylikIsGuvenligi;
	private boolean osgbHizmetAylikIsyeri;
	private boolean osgbHizmetAylikSaglikPersonel;

	private boolean osgbDanismanlikIsGuvenligi;
	private boolean osgbDanismanlikRiskAnalizi;
	private boolean osgbDanismanlikSaglikGuvenlikPlani;
	private boolean osgbDanismanlikAcilDurumPlani;
	private boolean osgbDanismanlikYanginRiskAnalizi;

	private boolean periyodikSaglikAkcigerGrafitisi;
	private boolean periyodikSaglikOdioSft;
	private boolean periyodikSaglikIdrarTahlili;
	private boolean periyodikSaglikHemogram;
	private boolean periyodikSaglikKanGrubu;
	private boolean periyodikSaglikASL;
	private boolean periyodikSaglikPortor;

	private boolean egitimCalisanTemelIsGuvenligi;
	private boolean egitimISGKurulUye;
	private boolean egitimRiskDegerlendirme;
	private boolean egitimAcilDurumEkip;
	private boolean egitimYanginEgitim;
	private boolean egitimAcilDurumPlanTahliye;
	private boolean egitimElleKaldirma;
	private boolean egitimSaglikGuvenlikIsaret;
	private boolean egitimIsHijyen;
	private boolean egitimIlkYardim;
	private boolean egitimKisiselKoruyucu;
	private boolean egitimIsEkipmanlari;
	private boolean egitimKapaliAlanCalisma;
	private boolean egitimEkranliAraclarlaCalisma;

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(final String subject) {
		this.subject = subject;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public ConsultingType getConsultingType() {
		return this.consultingType;
	}

	public void setConsultingType(final ConsultingType consultingType) {
		this.consultingType = consultingType;
	}

	public DangerState getDangerState() {
		return this.dangerState;
	}

	public void setDangerState(final DangerState dangerState) {
		this.dangerState = dangerState;
	}

	public int getPersonCount() {
		return this.personCount;
	}

	public void setPersonCount(final int personCount) {
		this.personCount = personCount;
	}

	public int getNaceCode() {
		return this.naceCode;
	}

	public void setNaceCode(final int naceCode) {
		this.naceCode = naceCode;
	}

	public boolean isOsgbHizmetAylikIsGuvenligi() {
		return this.osgbHizmetAylikIsGuvenligi;
	}

	public void setOsgbHizmetAylikIsGuvenligi(final boolean osgbHizmetAylikIsGuvenligi) {
		this.osgbHizmetAylikIsGuvenligi = osgbHizmetAylikIsGuvenligi;
	}

	public boolean isOsgbHizmetAylikIsyeri() {
		return this.osgbHizmetAylikIsyeri;
	}

	public void setOsgbHizmetAylikIsyeri(final boolean osgbHizmetAylikIsyeri) {
		this.osgbHizmetAylikIsyeri = osgbHizmetAylikIsyeri;
	}

	public boolean isOsgbHizmetAylikSaglikPersonel() {
		return this.osgbHizmetAylikSaglikPersonel;
	}

	public void setOsgbHizmetAylikSaglikPersonel(final boolean osgbHizmetAylikSaglikPersonel) {
		this.osgbHizmetAylikSaglikPersonel = osgbHizmetAylikSaglikPersonel;
	}

	public boolean isOsgbDanismanlikIsGuvenligi() {
		return this.osgbDanismanlikIsGuvenligi;
	}

	public void setOsgbDanismanlikIsGuvenligi(final boolean osgbDanismanlikIsGuvenligi) {
		this.osgbDanismanlikIsGuvenligi = osgbDanismanlikIsGuvenligi;
	}

	public boolean isOsgbDanismanlikRiskAnalizi() {
		return this.osgbDanismanlikRiskAnalizi;
	}

	public void setOsgbDanismanlikRiskAnalizi(final boolean osgbDanismanlikRiskAnalizi) {
		this.osgbDanismanlikRiskAnalizi = osgbDanismanlikRiskAnalizi;
	}

	public boolean isOsgbDanismanlikSaglikGuvenlikPlani() {
		return this.osgbDanismanlikSaglikGuvenlikPlani;
	}

	public void setOsgbDanismanlikSaglikGuvenlikPlani(final boolean osgbDanismanlikSaglikGuvenlikPlani) {
		this.osgbDanismanlikSaglikGuvenlikPlani = osgbDanismanlikSaglikGuvenlikPlani;
	}

	public boolean isOsgbDanismanlikAcilDurumPlani() {
		return this.osgbDanismanlikAcilDurumPlani;
	}

	public void setOsgbDanismanlikAcilDurumPlani(final boolean osgbDanismanlikAcilDurumPlani) {
		this.osgbDanismanlikAcilDurumPlani = osgbDanismanlikAcilDurumPlani;
	}

	public boolean isOsgbDanismanlikYanginRiskAnalizi() {
		return this.osgbDanismanlikYanginRiskAnalizi;
	}

	public void setOsgbDanismanlikYanginRiskAnalizi(final boolean osgbDanismanlikYanginRiskAnalizi) {
		this.osgbDanismanlikYanginRiskAnalizi = osgbDanismanlikYanginRiskAnalizi;
	}

	public boolean isPeriyodikSaglikAkcigerGrafitisi() {
		return this.periyodikSaglikAkcigerGrafitisi;
	}

	public void setPeriyodikSaglikAkcigerGrafitisi(final boolean periyodikSaglikAkcigerGrafitisi) {
		this.periyodikSaglikAkcigerGrafitisi = periyodikSaglikAkcigerGrafitisi;
	}

	public boolean isPeriyodikSaglikOdioSft() {
		return this.periyodikSaglikOdioSft;
	}

	public void setPeriyodikSaglikOdioSft(final boolean periyodikSaglikOdioSft) {
		this.periyodikSaglikOdioSft = periyodikSaglikOdioSft;
	}

	public boolean isPeriyodikSaglikIdrarTahlili() {
		return this.periyodikSaglikIdrarTahlili;
	}

	public void setPeriyodikSaglikIdrarTahlili(final boolean periyodikSaglikIdrarTahlili) {
		this.periyodikSaglikIdrarTahlili = periyodikSaglikIdrarTahlili;
	}

	public boolean isPeriyodikSaglikHemogram() {
		return this.periyodikSaglikHemogram;
	}

	public void setPeriyodikSaglikHemogram(final boolean periyodikSaglikHemogram) {
		this.periyodikSaglikHemogram = periyodikSaglikHemogram;
	}

	public boolean isPeriyodikSaglikKanGrubu() {
		return this.periyodikSaglikKanGrubu;
	}

	public void setPeriyodikSaglikKanGrubu(final boolean periyodikSaglikKanGrubu) {
		this.periyodikSaglikKanGrubu = periyodikSaglikKanGrubu;
	}

	public boolean isPeriyodikSaglikASL() {
		return this.periyodikSaglikASL;
	}

	public void setPeriyodikSaglikASL(final boolean periyodikSaglikASL) {
		this.periyodikSaglikASL = periyodikSaglikASL;
	}

	public boolean isPeriyodikSaglikPortor() {
		return this.periyodikSaglikPortor;
	}

	public void setPeriyodikSaglikPortor(final boolean periyodikSaglikPortor) {
		this.periyodikSaglikPortor = periyodikSaglikPortor;
	}

	public boolean isEgitimCalisanTemelIsGuvenligi() {
		return this.egitimCalisanTemelIsGuvenligi;
	}

	public void setEgitimCalisanTemelIsGuvenligi(final boolean egitimCalisanTemelIsGuvenligi) {
		this.egitimCalisanTemelIsGuvenligi = egitimCalisanTemelIsGuvenligi;
	}

	public boolean isEgitimISGKurulUye() {
		return this.egitimISGKurulUye;
	}

	public void setEgitimISGKurulUye(final boolean egitimISGKurulUye) {
		this.egitimISGKurulUye = egitimISGKurulUye;
	}

	public boolean isEgitimRiskDegerlendirme() {
		return this.egitimRiskDegerlendirme;
	}

	public void setEgitimRiskDegerlendirme(final boolean egitimRiskDegerlendirme) {
		this.egitimRiskDegerlendirme = egitimRiskDegerlendirme;
	}

	public boolean isEgitimAcilDurumEkip() {
		return this.egitimAcilDurumEkip;
	}

	public void setEgitimAcilDurumEkip(final boolean egitimAcilDurumEkip) {
		this.egitimAcilDurumEkip = egitimAcilDurumEkip;
	}

	public boolean isEgitimYanginEgitim() {
		return this.egitimYanginEgitim;
	}

	public void setEgitimYanginEgitim(final boolean egitimYanginEgitim) {
		this.egitimYanginEgitim = egitimYanginEgitim;
	}

	public boolean isEgitimAcilDurumPlanTahliye() {
		return this.egitimAcilDurumPlanTahliye;
	}

	public void setEgitimAcilDurumPlanTahliye(final boolean egitimAcilDurumPlanTahliye) {
		this.egitimAcilDurumPlanTahliye = egitimAcilDurumPlanTahliye;
	}

	public boolean isEgitimElleKaldirma() {
		return this.egitimElleKaldirma;
	}

	public void setEgitimElleKaldirma(final boolean egitimElleKaldirma) {
		this.egitimElleKaldirma = egitimElleKaldirma;
	}

	public boolean isEgitimSaglikGuvenlikIsaret() {
		return this.egitimSaglikGuvenlikIsaret;
	}

	public void setEgitimSaglikGuvenlikIsaret(final boolean egitimSaglikGuvenlikIsaret) {
		this.egitimSaglikGuvenlikIsaret = egitimSaglikGuvenlikIsaret;
	}

	public boolean isEgitimIsHijyen() {
		return this.egitimIsHijyen;
	}

	public void setEgitimIsHijyen(final boolean egitimIsHijyen) {
		this.egitimIsHijyen = egitimIsHijyen;
	}

	public boolean isEgitimIlkYardim() {
		return this.egitimIlkYardim;
	}

	public void setEgitimIlkYardim(final boolean egitimIlkYardim) {
		this.egitimIlkYardim = egitimIlkYardim;
	}

	public boolean isEgitimKisiselKoruyucu() {
		return this.egitimKisiselKoruyucu;
	}

	public void setEgitimKisiselKoruyucu(final boolean egitimKisiselKoruyucu) {
		this.egitimKisiselKoruyucu = egitimKisiselKoruyucu;
	}

	public boolean isEgitimIsEkipmanlari() {
		return this.egitimIsEkipmanlari;
	}

	public void setEgitimIsEkipmanlari(final boolean egitimIsEkipmanlari) {
		this.egitimIsEkipmanlari = egitimIsEkipmanlari;
	}

	public boolean isEgitimKapaliAlanCalisma() {
		return this.egitimKapaliAlanCalisma;
	}

	public void setEgitimKapaliAlanCalisma(final boolean egitimKapaliAlanCalisma) {
		this.egitimKapaliAlanCalisma = egitimKapaliAlanCalisma;
	}

	public boolean isEgitimEkranliAraclarlaCalisma() {
		return this.egitimEkranliAraclarlaCalisma;
	}

	public void setEgitimEkranliAraclarlaCalisma(final boolean egitimEkranliAraclarlaCalisma) {
		this.egitimEkranliAraclarlaCalisma = egitimEkranliAraclarlaCalisma;
	}

	public MultipartFile getFile() {
		return this.file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

}
