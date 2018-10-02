package com.deloitte.twb.bean;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.sql.Timestamp;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The persistent class for the TEST_PLAN_LIST database table.
 * 
 */
@Entity
@Table(name="TEST_PLAN_LIST")
@NamedQuery(name="TestPlanList.findAll", query="SELECT t FROM TestPlanList t")
public class TestPlanList implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="TEST_PLAN_ID")
	private long testPlanId;

	@Column(name="COMP_CHECK")
	private String compCheck;

	@Column(name="E2E_DEFECTS_LABEL")
	private String e2eDefectsLabel;

	@Column(name="HOME_PAGE_IND")
	private String homePageInd;

	@Column(name="LG_CHECK")
	private String lgCheck;

	@Column(name="MASTER_PROJECT_ID")
	private String masterProjectId;

	@Column(name="PARENT_TEST_PLAN")
	private BigDecimal parentTestPlan;

	@Column(name="PLAN_NAME")
	private String planName;

	@Column(name="RELEASE_NOTES")
	private String releaseNotes;

	@Column(name="RELEASE_SCOPE")
	private String releaseScope;

	@Column(name="TEST_LEAD")
	private String testLead;

	@Column(name="TEST_PLAN_TYPE")
	@JsonProperty("test_plan_type")
	private String testPlanType;
	@Column(name="RELEASE_TYPE")
	private String releaseType;
	@Column(name="SIT_PROGRESSION")
	private String sitProgression;
	
	@Column(name="SIT_REGRESSION")
	private String sitRegression;
	
	@Column(name="AUTOMATED")
	private String automated;
	

	@Column(name="CREATED_TIMESTAMP")
	private Timestamp createdTimestamp;

	@Column(name="DEFECT_CHECK")
	private String defectCheck;

	@Column(name="VALID_TO_REPORT")
	private String validToReport;

	public String getSitProgression() {
		return sitProgression;
	}

	public void setSitProgression(String sitProgression) {
		this.sitProgression = sitProgression;
	}

	public String getReleaseType() {
		return releaseType;
	}

	public void setReleaseType(String releaseType) {
		this.releaseType = releaseType;
	}

	public String getSitRegression() {
		return sitRegression;
	}

	public void setSitRegression(String sitRegression) {
		this.sitRegression = sitRegression;
	}

	public String getAutomated() {
		return automated;
	}

	public void setAutomated(String automated) {
		this.automated = automated;
	}

	public Timestamp getCreatedTimestamp() {
		return createdTimestamp;
	}

	public void setCreatedTimestamp(Timestamp createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

	public String getDefectCheck() {
		return defectCheck;
	}

	public void setDefectCheck(String defectCheck) {
		this.defectCheck = defectCheck;
	}

	public String getValidToReport() {
		return validToReport;
	}

	public void setValidToReport(String validToReport) {
		this.validToReport = validToReport;
	}



	public TestPlanList() {
	}

	public long getTestPlanId() {
		return this.testPlanId;
	}

	public void setTestPlanId(long testPlanId) {
		this.testPlanId = testPlanId;
	}

	public String getCompCheck() {
		return this.compCheck;
	}

	public void setCompCheck(String compCheck) {
		this.compCheck = compCheck;
	}

	public String getE2eDefectsLabel() {
		return this.e2eDefectsLabel;
	}

	public void setE2eDefectsLabel(String e2eDefectsLabel) {
		this.e2eDefectsLabel = e2eDefectsLabel;
	}

	public String getHomePageInd() {
		return this.homePageInd;
	}

	public void setHomePageInd(String homePageInd) {
		this.homePageInd = homePageInd;
	}

	public String getLgCheck() {
		return this.lgCheck;
	}

	public void setLgCheck(String lgCheck) {
		this.lgCheck = lgCheck;
	}

	public String getMasterProjectId() {
		return this.masterProjectId;
	}

	public void setMasterProjectId(String masterProjectId) {
		this.masterProjectId = masterProjectId;
	}

	public BigDecimal getParentTestPlan() {
		return this.parentTestPlan;
	}

	public void setParentTestPlan(BigDecimal parentTestPlan) {
		this.parentTestPlan = parentTestPlan;
	}

	public String getPlanName() {
		return this.planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getReleaseNotes() {
		return this.releaseNotes;
	}

	public void setReleaseNotes(String releaseNotes) {
		this.releaseNotes = releaseNotes;
	}

	public String getReleaseScope() {
		return this.releaseScope;
	}

	public void setReleaseScope(String releaseScope) {
		this.releaseScope = releaseScope;
	}

	public String getTestLead() {
		return this.testLead;
	}

	public void setTestLead(String testLead) {
		this.testLead = testLead;
	}

	public String getTestPlanType() {
		return this.testPlanType;
	}

	public void setTestPlanType(String testPlanType) {
		this.testPlanType = testPlanType;
	}
public String toString(){
	return "program name:"+this.testPlanType;
}
}