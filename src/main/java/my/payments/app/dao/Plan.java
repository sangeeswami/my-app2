package my.payments.app.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long planId;
	private String planCode;
	private String planName;
	
	public Long getPlanId() {
		return this.planId;
	}
	public void setPlanId(Long planId) {
		this.planId = planId;
	}
	
	public String getPlanCode() {
		return this.planCode;
	}
	public void setPlanCode(String planCode) {
		this.planCode = planCode;
	}
	
	public String getPlanName() {
		return this.planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}

}
