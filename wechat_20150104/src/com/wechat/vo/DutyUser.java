package com.wechat.vo;

/**
 * DutyUser entity. @author MyEclipse Persistence Tools
 */

public class DutyUser implements java.io.Serializable {

	// Fields

	private Integer id;
	private String dutycode;
	private String userid;

	// Constructors

	/** default constructor */
	public DutyUser() {
	}

	/** full constructor */
	public DutyUser(Integer id, String dutycode, String userid) {
		this.id = id;
		this.dutycode = dutycode;
		this.userid = userid;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDutycode() {
		return this.dutycode;
	}

	public void setDutycode(String dutycode) {
		this.dutycode = dutycode;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

}