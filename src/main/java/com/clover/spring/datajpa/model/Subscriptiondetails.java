package com.clover.spring.datajpa.model;

// default package
// Generated 7 May, 2020 7:07:07 PM by Hibernate Tools 5.2.3.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SubscriptionDetails generated by hbm2java
 */
@Entity
@Table(name = "subscription_details", catalog = "sys")
public class Subscriptiondetails implements java.io.Serializable {

	private Integer subscriptionid;
	private String subscriptionName;
	private Integer subscriptionValidityYears;
	private Integer subscriptionValidityDays;
	private Integer benificiaryCount;
	private String status;
	private String insertedBy;
	private Date insertedDate;
	private String modifiedBy;
	private Date modifiedDate;
	private String remarks;

	public Subscriptiondetails() {
	}

	public Subscriptiondetails(String subscriptionName, Integer subscriptionValidityYears,
			Integer subscriptionValidityDays, Integer benificiaryCount, String status, String insertedBy,
			Date insertedDate, String modifiedBy, Date modifiedDate, String remarks) {
		this.subscriptionName = subscriptionName;
		this.subscriptionValidityYears = subscriptionValidityYears;
		this.subscriptionValidityDays = subscriptionValidityDays;
		this.benificiaryCount = benificiaryCount;
		this.status = status;
		this.insertedBy = insertedBy;
		this.insertedDate = insertedDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
		this.remarks = remarks;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "Subscriptionid", unique = true, nullable = false)
	public Integer getSubscriptionid() {
		return this.subscriptionid;
	}

	public void setSubscriptionid(Integer subscriptionid) {
		this.subscriptionid = subscriptionid;
	}

	@Column(name = "SubscriptionName", length = 25)
	public String getSubscriptionName() {
		return this.subscriptionName;
	}

	public void setSubscriptionName(String subscriptionName) {
		this.subscriptionName = subscriptionName;
	}

	@Column(name = "SubscriptionValidity_Years")
	public Integer getSubscriptionValidityYears() {
		return this.subscriptionValidityYears;
	}

	public void setSubscriptionValidityYears(Integer subscriptionValidityYears) {
		this.subscriptionValidityYears = subscriptionValidityYears;
	}

	@Column(name = "SubscriptionValidity_Days")
	public Integer getSubscriptionValidityDays() {
		return this.subscriptionValidityDays;
	}

	public void setSubscriptionValidityDays(Integer subscriptionValidityDays) {
		this.subscriptionValidityDays = subscriptionValidityDays;
	}

	@Column(name = "BenificiaryCount")
	public Integer getBenificiaryCount() {
		return this.benificiaryCount;
	}

	public void setBenificiaryCount(Integer benificiaryCount) {
		this.benificiaryCount = benificiaryCount;
	}

	@Column(name = "Status", length = 25)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "InsertedBy", length = 25)
	public String getInsertedBy() {
		return this.insertedBy;
	}

	public void setInsertedBy(String insertedBy) {
		this.insertedBy = insertedBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "InsertedDate", length = 10)
	public Date getInsertedDate() {
		return this.insertedDate;
	}

	public void setInsertedDate(Date insertedDate) {
		this.insertedDate = insertedDate;
	}

	@Column(name = "ModifiedBy", length = 25)
	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ModifiedDate", length = 10)
	public Date getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@Column(name = "Remarks")
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
