package com.wechat.vo;

import java.sql.Timestamp;


/**
 * BjLcclxx entity. @author MyEclipse Persistence Tools
 */

public class BjLcclxx  implements java.io.Serializable {


    // Fields    

     private Long rwlsh;
     private String bjlsh;
     private String sxbm;
     private String bzbm;
     private String bzmc;
     private String bzlx;
     private Long qxrwlsh;
     private String qxbzbm;
     private String qxbzmc;
     private String dwbm;
     private String dwmc;
     private String gwbm;
     private String gwmc;
     private String zxzbm;
     private String zxzxm;
     private String zgzzlx;
     private String zgzzbm;
     private String zxdd;
     private String gdzxr;
     private Timestamp xczxrq;
     private String cljgbm;
     private String cljgms;
     private String clyjjd;
     private Timestamp cssj;
     private Integer clsx;
     private Timestamp cnwcrq;
     private Timestamp cnwcrqtq1;
     private Timestamp cnwcrqtq2;
     private Timestamp cnwcrqtq3;
     private Integer sygzr;
     private Timestamp sjwcsj;
     private Integer tqycts;
     private String bdbbz;
     private String csmxzxbz;
     private String bzdydwbm;
     private String bzdydwmc;
     private String bzdyagbm;
     private String bzdyagmc;
     private String bzdybgbm;
     private String bzdybgmc;
     private String rwfpgwbm;
     private String rwfpgwmc;
     private String rwfpgwlx;
     private String qxsmbz;
     private String rwzt;
     private Integer rwxljf;
     private String bz;
     private Timestamp zhxgsj;
     private String up;
     private Integer gqcnsx;
     private String gqbz;
     private String ztbz;
     private String bookmarkname;
     private String sfysb;


    // Constructors

    /** default constructor */
    public BjLcclxx() {
    }

	/** minimal constructor */
    public BjLcclxx(Long rwlsh, String bjlsh) {
        this.rwlsh = rwlsh;
        this.bjlsh = bjlsh;
    }
    
    /** full constructor */
    public BjLcclxx(Long rwlsh, String bjlsh, String sxbm, String bzbm, String bzmc, String bzlx, Long qxrwlsh, String qxbzbm, String qxbzmc, String dwbm, String dwmc, String gwbm, String gwmc, String zxzbm, String zxzxm, String zgzzlx, String zgzzbm, String zxdd, String gdzxr, Timestamp xczxrq, String cljgbm, String cljgms, String clyjjd, Timestamp cssj, Integer clsx, Timestamp cnwcrq, Timestamp cnwcrqtq1, Timestamp cnwcrqtq2, Timestamp cnwcrqtq3, Integer sygzr, Timestamp sjwcsj, Integer tqycts, String bdbbz, String csmxzxbz, String bzdydwbm, String bzdydwmc, String bzdyagbm, String bzdyagmc, String bzdybgbm, String bzdybgmc, String rwfpgwbm, String rwfpgwmc, String rwfpgwlx, String qxsmbz, String rwzt, Integer rwxljf, String bz, Timestamp zhxgsj, String up, Integer gqcnsx, String gqbz, String ztbz, String bookmarkname, String sfysb) {
        this.rwlsh = rwlsh;
        this.bjlsh = bjlsh;
        this.sxbm = sxbm;
        this.bzbm = bzbm;
        this.bzmc = bzmc;
        this.bzlx = bzlx;
        this.qxrwlsh = qxrwlsh;
        this.qxbzbm = qxbzbm;
        this.qxbzmc = qxbzmc;
        this.dwbm = dwbm;
        this.dwmc = dwmc;
        this.gwbm = gwbm;
        this.gwmc = gwmc;
        this.zxzbm = zxzbm;
        this.zxzxm = zxzxm;
        this.zgzzlx = zgzzlx;
        this.zgzzbm = zgzzbm;
        this.zxdd = zxdd;
        this.gdzxr = gdzxr;
        this.xczxrq = xczxrq;
        this.cljgbm = cljgbm;
        this.cljgms = cljgms;
        this.clyjjd = clyjjd;
        this.cssj = cssj;
        this.clsx = clsx;
        this.cnwcrq = cnwcrq;
        this.cnwcrqtq1 = cnwcrqtq1;
        this.cnwcrqtq2 = cnwcrqtq2;
        this.cnwcrqtq3 = cnwcrqtq3;
        this.sygzr = sygzr;
        this.sjwcsj = sjwcsj;
        this.tqycts = tqycts;
        this.bdbbz = bdbbz;
        this.csmxzxbz = csmxzxbz;
        this.bzdydwbm = bzdydwbm;
        this.bzdydwmc = bzdydwmc;
        this.bzdyagbm = bzdyagbm;
        this.bzdyagmc = bzdyagmc;
        this.bzdybgbm = bzdybgbm;
        this.bzdybgmc = bzdybgmc;
        this.rwfpgwbm = rwfpgwbm;
        this.rwfpgwmc = rwfpgwmc;
        this.rwfpgwlx = rwfpgwlx;
        this.qxsmbz = qxsmbz;
        this.rwzt = rwzt;
        this.rwxljf = rwxljf;
        this.bz = bz;
        this.zhxgsj = zhxgsj;
        this.up = up;
        this.gqcnsx = gqcnsx;
        this.gqbz = gqbz;
        this.ztbz = ztbz;
        this.bookmarkname = bookmarkname;
        this.sfysb = sfysb;
    }

   
    // Property accessors

    public Long getRwlsh() {
        return this.rwlsh;
    }
    
    public void setRwlsh(Long rwlsh) {
        this.rwlsh = rwlsh;
    }

    public String getBjlsh() {
        return this.bjlsh;
    }
    
    public void setBjlsh(String bjlsh) {
        this.bjlsh = bjlsh;
    }

    public String getSxbm() {
        return this.sxbm;
    }
    
    public void setSxbm(String sxbm) {
        this.sxbm = sxbm;
    }

    public String getBzbm() {
        return this.bzbm;
    }
    
    public void setBzbm(String bzbm) {
        this.bzbm = bzbm;
    }

    public String getBzmc() {
        return this.bzmc;
    }
    
    public void setBzmc(String bzmc) {
        this.bzmc = bzmc;
    }

    public String getBzlx() {
        return this.bzlx;
    }
    
    public void setBzlx(String bzlx) {
        this.bzlx = bzlx;
    }

    public Long getQxrwlsh() {
        return this.qxrwlsh;
    }
    
    public void setQxrwlsh(Long qxrwlsh) {
        this.qxrwlsh = qxrwlsh;
    }

    public String getQxbzbm() {
        return this.qxbzbm;
    }
    
    public void setQxbzbm(String qxbzbm) {
        this.qxbzbm = qxbzbm;
    }

    public String getQxbzmc() {
        return this.qxbzmc;
    }
    
    public void setQxbzmc(String qxbzmc) {
        this.qxbzmc = qxbzmc;
    }

    public String getDwbm() {
        return this.dwbm;
    }
    
    public void setDwbm(String dwbm) {
        this.dwbm = dwbm;
    }

    public String getDwmc() {
        return this.dwmc;
    }
    
    public void setDwmc(String dwmc) {
        this.dwmc = dwmc;
    }

    public String getGwbm() {
        return this.gwbm;
    }
    
    public void setGwbm(String gwbm) {
        this.gwbm = gwbm;
    }

    public String getGwmc() {
        return this.gwmc;
    }
    
    public void setGwmc(String gwmc) {
        this.gwmc = gwmc;
    }

    public String getZxzbm() {
        return this.zxzbm;
    }
    
    public void setZxzbm(String zxzbm) {
        this.zxzbm = zxzbm;
    }

    public String getZxzxm() {
        return this.zxzxm;
    }
    
    public void setZxzxm(String zxzxm) {
        this.zxzxm = zxzxm;
    }

    public String getZgzzlx() {
        return this.zgzzlx;
    }
    
    public void setZgzzlx(String zgzzlx) {
        this.zgzzlx = zgzzlx;
    }

    public String getZgzzbm() {
        return this.zgzzbm;
    }
    
    public void setZgzzbm(String zgzzbm) {
        this.zgzzbm = zgzzbm;
    }

    public String getZxdd() {
        return this.zxdd;
    }
    
    public void setZxdd(String zxdd) {
        this.zxdd = zxdd;
    }

    public String getGdzxr() {
        return this.gdzxr;
    }
    
    public void setGdzxr(String gdzxr) {
        this.gdzxr = gdzxr;
    }

    public Timestamp getXczxrq() {
        return this.xczxrq;
    }
    
    public void setXczxrq(Timestamp xczxrq) {
        this.xczxrq = xczxrq;
    }

    public String getCljgbm() {
        return this.cljgbm;
    }
    
    public void setCljgbm(String cljgbm) {
        this.cljgbm = cljgbm;
    }

    public String getCljgms() {
        return this.cljgms;
    }
    
    public void setCljgms(String cljgms) {
        this.cljgms = cljgms;
    }

    public String getClyjjd() {
        return this.clyjjd;
    }
    
    public void setClyjjd(String clyjjd) {
        this.clyjjd = clyjjd;
    }

    public Timestamp getCssj() {
        return this.cssj;
    }
    
    public void setCssj(Timestamp cssj) {
        this.cssj = cssj;
    }

    public Integer getClsx() {
        return this.clsx;
    }
    
    public void setClsx(Integer clsx) {
        this.clsx = clsx;
    }

    public Timestamp getCnwcrq() {
        return this.cnwcrq;
    }
    
    public void setCnwcrq(Timestamp cnwcrq) {
        this.cnwcrq = cnwcrq;
    }

    public Timestamp getCnwcrqtq1() {
        return this.cnwcrqtq1;
    }
    
    public void setCnwcrqtq1(Timestamp cnwcrqtq1) {
        this.cnwcrqtq1 = cnwcrqtq1;
    }

    public Timestamp getCnwcrqtq2() {
        return this.cnwcrqtq2;
    }
    
    public void setCnwcrqtq2(Timestamp cnwcrqtq2) {
        this.cnwcrqtq2 = cnwcrqtq2;
    }

    public Timestamp getCnwcrqtq3() {
        return this.cnwcrqtq3;
    }
    
    public void setCnwcrqtq3(Timestamp cnwcrqtq3) {
        this.cnwcrqtq3 = cnwcrqtq3;
    }

    public Integer getSygzr() {
        return this.sygzr;
    }
    
    public void setSygzr(Integer sygzr) {
        this.sygzr = sygzr;
    }

    public Timestamp getSjwcsj() {
        return this.sjwcsj;
    }
    
    public void setSjwcsj(Timestamp sjwcsj) {
        this.sjwcsj = sjwcsj;
    }

    public Integer getTqycts() {
        return this.tqycts;
    }
    
    public void setTqycts(Integer tqycts) {
        this.tqycts = tqycts;
    }

    public String getBdbbz() {
        return this.bdbbz;
    }
    
    public void setBdbbz(String bdbbz) {
        this.bdbbz = bdbbz;
    }

    public String getCsmxzxbz() {
        return this.csmxzxbz;
    }
    
    public void setCsmxzxbz(String csmxzxbz) {
        this.csmxzxbz = csmxzxbz;
    }

    public String getBzdydwbm() {
        return this.bzdydwbm;
    }
    
    public void setBzdydwbm(String bzdydwbm) {
        this.bzdydwbm = bzdydwbm;
    }

    public String getBzdydwmc() {
        return this.bzdydwmc;
    }
    
    public void setBzdydwmc(String bzdydwmc) {
        this.bzdydwmc = bzdydwmc;
    }

    public String getBzdyagbm() {
        return this.bzdyagbm;
    }
    
    public void setBzdyagbm(String bzdyagbm) {
        this.bzdyagbm = bzdyagbm;
    }

    public String getBzdyagmc() {
        return this.bzdyagmc;
    }
    
    public void setBzdyagmc(String bzdyagmc) {
        this.bzdyagmc = bzdyagmc;
    }

    public String getBzdybgbm() {
        return this.bzdybgbm;
    }
    
    public void setBzdybgbm(String bzdybgbm) {
        this.bzdybgbm = bzdybgbm;
    }

    public String getBzdybgmc() {
        return this.bzdybgmc;
    }
    
    public void setBzdybgmc(String bzdybgmc) {
        this.bzdybgmc = bzdybgmc;
    }

    public String getRwfpgwbm() {
        return this.rwfpgwbm;
    }
    
    public void setRwfpgwbm(String rwfpgwbm) {
        this.rwfpgwbm = rwfpgwbm;
    }

    public String getRwfpgwmc() {
        return this.rwfpgwmc;
    }
    
    public void setRwfpgwmc(String rwfpgwmc) {
        this.rwfpgwmc = rwfpgwmc;
    }

    public String getRwfpgwlx() {
        return this.rwfpgwlx;
    }
    
    public void setRwfpgwlx(String rwfpgwlx) {
        this.rwfpgwlx = rwfpgwlx;
    }

    public String getQxsmbz() {
        return this.qxsmbz;
    }
    
    public void setQxsmbz(String qxsmbz) {
        this.qxsmbz = qxsmbz;
    }

    public String getRwzt() {
        return this.rwzt;
    }
    
    public void setRwzt(String rwzt) {
        this.rwzt = rwzt;
    }

    public Integer getRwxljf() {
        return this.rwxljf;
    }
    
    public void setRwxljf(Integer rwxljf) {
        this.rwxljf = rwxljf;
    }

    public String getBz() {
        return this.bz;
    }
    
    public void setBz(String bz) {
        this.bz = bz;
    }

    public Timestamp getZhxgsj() {
        return this.zhxgsj;
    }
    
    public void setZhxgsj(Timestamp zhxgsj) {
        this.zhxgsj = zhxgsj;
    }

    public String getUp() {
        return this.up;
    }
    
    public void setUp(String up) {
        this.up = up;
    }

    public Integer getGqcnsx() {
        return this.gqcnsx;
    }
    
    public void setGqcnsx(Integer gqcnsx) {
        this.gqcnsx = gqcnsx;
    }

    public String getGqbz() {
        return this.gqbz;
    }
    
    public void setGqbz(String gqbz) {
        this.gqbz = gqbz;
    }

    public String getZtbz() {
        return this.ztbz;
    }
    
    public void setZtbz(String ztbz) {
        this.ztbz = ztbz;
    }

    public String getBookmarkname() {
        return this.bookmarkname;
    }
    
    public void setBookmarkname(String bookmarkname) {
        this.bookmarkname = bookmarkname;
    }

    public String getSfysb() {
        return this.sfysb;
    }
    
    public void setSfysb(String sfysb) {
        this.sfysb = sfysb;
    }
   








}