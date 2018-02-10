package com.sree.springbooth2.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class SessionMgmt {

	@Id
	private String sessionJWTID;
	@Temporal(TemporalType.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/dd/yyyy", timezone="EST")
	private Date createOn;
	private Boolean expired;
	
	public Boolean getExpired() {
		return expired;
	}
	public void setExpired(Boolean expired) {
		this.expired = expired;
	}
	public String getSessionJWTID() {
		return sessionJWTID;
	}
	public void setSessionJWTID(String sessionJWTID) {
		this.sessionJWTID = sessionJWTID;
	}
	public Date getCreateOn() {
		return createOn;
	}
	public void setCreateOn(Date createOn) {
		this.createOn = createOn;
	}
	
	
}
