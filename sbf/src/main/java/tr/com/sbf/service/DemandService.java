/**
 * @author Mehmet
 *
 * 10 Ağu 2018
 *
 * 23:55:01
 */

package tr.com.sbf.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import tr.com.sbf.model.Demand;
import tr.com.sbf.model.DemandState;
import tr.com.sbf.model.DemandTypes;
import tr.com.sbf.model.User;
import tr.com.sbf.repository.DemandRepository;
import tr.com.sbf.repository.DemandTypesRepository;

@Service
public class DemandService {

	@Autowired
	private DemandTypesRepository demandTypesRepository;

	@Autowired
	protected UserService userService;

	@Autowired
	private DemandRepository demandRepository;

	public void CreateDemand(int type, long detailId) {
		final Demand demand = new Demand();

		final Authentication loggedInUser = SecurityContextHolder.getContext().getAuthentication();
		final User user = this.userService.findByUsername(loggedInUser.getName());

		demand.setId(UUID.randomUUID().toString());
		demand.setUserId(user.getId());
		demand.setDemandState(DemandState.WORKING_PROGRESS);

		final DemandTypes demandTtype = new DemandTypes();
		demandTtype.setId(type);
		final Example<DemandTypes> types = Example.of(demandTtype);

		demand.setDemandType(this.demandTypesRepository.findAll(types).get(0));
		demand.setDetailId(detailId);

		this.demandRepository.save(demand);
	}
}
