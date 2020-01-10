/**
 * @author Mehmet
 *
 * 10 Ağu 2018
 *
 * 21:34:26
 */

package tr.com.sbf.model;

import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CreationTimestamp;

@Entity(name = "demand")
public class Demand {

	@Id
	private String id;
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private long userId;

	@OneToOne(cascade = CascadeType.ALL)
	private DemandTypes demandType;

	@CreationTimestamp
	private Calendar createdTime;
	@JoinColumn(name = "detail_id")
	private long detailId;
	private DemandState demandState;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public DemandTypes getDemandType() {
		return this.demandType;
	}

	public void setDemandType(DemandTypes demandType) {
		this.demandType = demandType;
	}

	public Calendar getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Calendar createdTime) {
		this.createdTime = createdTime;
	}

	public long getDetailId() {
		return this.detailId;
	}

	public void setDetailId(long detailId) {
		this.detailId = detailId;
	}

	public long getUserId() {
		return this.userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public DemandState getDemandState() {
		return this.demandState;
	}

	public void setDemandState(DemandState demandState) {
		this.demandState = demandState;
	}

}
