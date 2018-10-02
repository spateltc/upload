package com.deloitte.twb.bean;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;

/**
 * The persistent class for the H_TEST_SCREEN_SHOTS database table.
 * 
 */
@Entity
@Table(name = "H_TEST_SCREEN_SHOTS")
public class TestScreenShotBean implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "testSreenshotSeqGen")
	@SequenceGenerator(name = "testSreenshotSeqGen", sequenceName = "H_TEST_SCREEN_SHOTS_SEQ")
	private long id;

	/*private String filename;*/

	@Column(name = "HTDP_DETAIL_INSTANCE_ID")
	@JsonProperty("htdp_detail_instance_id")
	private BigDecimal htdpDetailInstanceId;

	/*@Column(name = "IMAGE_LAST_UPDATE")
	private Timestamp imageLastUpdate;*/

	@Column(name = "ADD_TIMESTAMP")
	private Timestamp addTimestamp;

	@Override
	public String toString() {
		return "TestScreenShotBean [id=" + id + ", htdpDetailInstanceId="
				+ htdpDetailInstanceId + ", addTimestamp=" + addTimestamp
				+ ", imagePath=" + imagePath + ", picFormat=" + picFormat
				+ ", screenShotPic=" + Arrays.toString(screenShotPic)
				+ ", stepId=" + stepId + "]";
	}

	@Column(name = "IMAGE_PATH")
	private String imagePath;

	/*private String mimetype;*/

	@Column(name = "PIC_FORMAT")
	private String picFormat;

	@Lob
	@Column(name = "SCREEN_SHOT_PIC")
	@JsonProperty("screen_shot_pic")
	private byte[] screenShotPic;

	@Column(name = "STEP_ID")
	private BigDecimal stepId;

	/*private String tags;*/

	public TestScreenShotBean() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

/*	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}*/

	public BigDecimal getHtdpDetailInstanceId() {
		return this.htdpDetailInstanceId;
	}

	public void setHtdpDetailInstanceId(BigDecimal htdpDetailInstanceId) {
		this.htdpDetailInstanceId = htdpDetailInstanceId;
	}

	/*public Timestamp getImageLastUpdate() {
		return this.imageLastUpdate;
	}*/

	/*public void setImageLastUpdate(Timestamp imageLastUpdate) {
		this.imageLastUpdate = imageLastUpdate;
	}*/

	public String getImagePath() {
		return this.imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	/*public String getMimetype() {
		return this.mimetype;
	}*/

	/*public void setMimetype(String mimetype) {
		this.mimetype = mimetype;
	}*/

	public String getPicFormat() {
		return this.picFormat;
	}

	public void setPicFormat(String picFormat) {
		this.picFormat = picFormat;
	}

	public byte[] getScreenShotPic() {
		return this.screenShotPic;
	}

	public void setScreenShotPic(byte[] screenShotPic) {
		this.screenShotPic = screenShotPic;
	}

	public BigDecimal getStepId() {
		return this.stepId;
	}

	public void setStepId(BigDecimal stepId) {
		this.stepId = stepId;
	}

	/*public String getTags() {
		return this.tags;
	}*/

	/*public void setTags(String tags) {
		this.tags = tags;
	}*/

	public Timestamp getAddTimestamp() {
		return addTimestamp;
	}

	public void setAddTimestamp(Timestamp addTimestamp) {
		this.addTimestamp = addTimestamp;
	}

}