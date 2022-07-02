package com.adminflight.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PnrDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long pnrId;
	private String username;
	private String fromPlc;
	private String toplc;
	private Date fromDate;
	private Date toDate;
	private boolean isDelete;
	public PnrDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PnrDetails(Long pnrId, String username, String fromPlc, String toplc, Date fromDate, Date toDate,
			boolean isDelete) {
		super();
		this.pnrId = pnrId;
		this.username = username;
		this.fromPlc = fromPlc;
		this.toplc = toplc;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.isDelete = isDelete;
	}
	public Long getPnrId() {
		return pnrId;
	}
	public void setPnrId(Long pnrId) {
		this.pnrId = pnrId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFromPlc() {
		return fromPlc;
	}
	public void setFromPlc(String fromPlc) {
		this.fromPlc = fromPlc;
	}
	public String getToplc() {
		return toplc;
	}
	public void setToplc(String toplc) {
		this.toplc = toplc;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	public boolean isDelete() {
		return isDelete;
	}
	public void setDelete(boolean isDelete) {
		this.isDelete = isDelete;
	}
	@Override
	public String toString() {
		return "PnrDetails [pnrId=" + pnrId + ", username=" + username + ", fromPlc=" + fromPlc + ", toplc=" + toplc
				+ ", fromDate=" + fromDate + ", toDate=" + toDate + ", isDelete=" + isDelete + "]";
	}
	

}
