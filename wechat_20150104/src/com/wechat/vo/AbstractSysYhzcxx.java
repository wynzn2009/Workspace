package com.wechat.vo;

import java.sql.Timestamp;

/**
 * AbstractSysYhzcxx entity provides the base persistence definition of the
 * SysYhzcxx entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSysYhzcxx implements java.io.Serializable {

	// Fields

	private String yhm;
	private String yhnc;
	private String typecode;
	private String type;
	private String password;
	private String question;
	private String answer;
	private String email;
	private String name;
	private String address;
	private String phone;
	private String yl1;
	private String yl2;
	private String yl3;
	private String zjhm;
	private String yyzzsq;
	private String companyname;
	private String zzjgdmz;
	private String fddbr;
	private String frsfzh;
	private String yyzzbh;
	private String fax;
	private String frdh;
	private Timestamp zcsj;
	private String glybz;

	// Constructors

	/** default constructor */
	public AbstractSysYhzcxx() {
	}

	/** minimal constructor */
	public AbstractSysYhzcxx(String yhm, String yhnc, String typecode,
			String type, String password, String question, String answer,
			String email) {
		this.yhm = yhm;
		this.yhnc = yhnc;
		this.typecode = typecode;
		this.type = type;
		this.password = password;
		this.question = question;
		this.answer = answer;
		this.email = email;
	}

	/** full constructor */
	public AbstractSysYhzcxx(String yhm, String yhnc, String typecode,
			String type, String password, String question, String answer,
			String email, String name, String address, String phone,
			String yl1, String yl2, String yl3, String zjhm, String yyzzsq,
			String companyname, String zzjgdmz, String fddbr, String frsfzh,
			String yyzzbh, String fax, String frdh, Timestamp zcsj, String glybz) {
		this.yhm = yhm;
		this.yhnc = yhnc;
		this.typecode = typecode;
		this.type = type;
		this.password = password;
		this.question = question;
		this.answer = answer;
		this.email = email;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.yl1 = yl1;
		this.yl2 = yl2;
		this.yl3 = yl3;
		this.zjhm = zjhm;
		this.yyzzsq = yyzzsq;
		this.companyname = companyname;
		this.zzjgdmz = zzjgdmz;
		this.fddbr = fddbr;
		this.frsfzh = frsfzh;
		this.yyzzbh = yyzzbh;
		this.fax = fax;
		this.frdh = frdh;
		this.zcsj = zcsj;
		this.glybz = glybz;
	}

	// Property accessors

	public String getYhm() {
		return this.yhm;
	}

	public void setYhm(String yhm) {
		this.yhm = yhm;
	}

	public String getYhnc() {
		return this.yhnc;
	}

	public void setYhnc(String yhnc) {
		this.yhnc = yhnc;
	}

	public String getTypecode() {
		return this.typecode;
	}

	public void setTypecode(String typecode) {
		this.typecode = typecode;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getYl1() {
		return this.yl1;
	}

	public void setYl1(String yl1) {
		this.yl1 = yl1;
	}

	public String getYl2() {
		return this.yl2;
	}

	public void setYl2(String yl2) {
		this.yl2 = yl2;
	}

	public String getYl3() {
		return this.yl3;
	}

	public void setYl3(String yl3) {
		this.yl3 = yl3;
	}

	public String getZjhm() {
		return this.zjhm;
	}

	public void setZjhm(String zjhm) {
		this.zjhm = zjhm;
	}

	public String getYyzzsq() {
		return this.yyzzsq;
	}

	public void setYyzzsq(String yyzzsq) {
		this.yyzzsq = yyzzsq;
	}

	public String getCompanyname() {
		return this.companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getZzjgdmz() {
		return this.zzjgdmz;
	}

	public void setZzjgdmz(String zzjgdmz) {
		this.zzjgdmz = zzjgdmz;
	}

	public String getFddbr() {
		return this.fddbr;
	}

	public void setFddbr(String fddbr) {
		this.fddbr = fddbr;
	}

	public String getFrsfzh() {
		return this.frsfzh;
	}

	public void setFrsfzh(String frsfzh) {
		this.frsfzh = frsfzh;
	}

	public String getYyzzbh() {
		return this.yyzzbh;
	}

	public void setYyzzbh(String yyzzbh) {
		this.yyzzbh = yyzzbh;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getFrdh() {
		return this.frdh;
	}

	public void setFrdh(String frdh) {
		this.frdh = frdh;
	}

	public Timestamp getZcsj() {
		return this.zcsj;
	}

	public void setZcsj(Timestamp zcsj) {
		this.zcsj = zcsj;
	}

	public String getGlybz() {
		return this.glybz;
	}

	public void setGlybz(String glybz) {
		this.glybz = glybz;
	}

}