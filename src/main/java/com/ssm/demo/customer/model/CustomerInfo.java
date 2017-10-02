
package com.ssm.demo.customer.model;

import java.util.Date;

public class CustomerInfo {

	private String customerid;

	private String domainid;

	private String employeeid;

	private String branchid;

	private String companyname;

	private String serialnumber;

	private Integer level;

	private String source;

	private String industry;

	private String subindustry;

	private String area;

	private String subarea;

	private String address;

	private String website;

	private String remark;

	private Integer issetdomain;

	private Integer customermode;

	private Date obtaintime;

	private Date contacttime;

	private Date createtime;

	private Date updatetime;

	private Integer isdeal;

	private Integer giveupcount;

	private String param1;

	private String param2;

	private String param3;

	private int frommail;

	private Integer remainoutdays;

	private int winrate;

	private String intentionproduct;

	private String membernumber;

	private String memberno;

	private String phonenumber;

	private String oldemployeeid;

	private String oldemployeename;

	public String getOldemployeeid() {
		return oldemployeeid;
	}

	public void setOldemployeeid(String oldemployeeid) {
		this.oldemployeeid = oldemployeeid;
	}

	public String getOldemployeename() {
		return oldemployeename;
	}

	public void setOldemployeename(String oldemployeename) {
		this.oldemployeename = oldemployeename;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getCustomerid() {
		return customerid;
	}

	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}

	public String getDomainid() {
		return domainid;
	}

	public void setDomainid(String domainid) {
		this.domainid = domainid;
	}

	public String getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}

	public String getBranchid() {
		return branchid;
	}

	public void setBranchid(String branchid) {
		this.branchid = branchid;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getSerialnumber() {
		return serialnumber;
	}

	public void setSerialnumber(String serialnumber) {
		this.serialnumber = serialnumber;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getSubindustry() {
		return subindustry;
	}

	public void setSubindustry(String subindustry) {
		this.subindustry = subindustry;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getSubarea() {
		return subarea;
	}

	public void setSubarea(String subarea) {
		this.subarea = subarea;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getIssetdomain() {
		return issetdomain;
	}

	public void setIssetdomain(Integer issetdomain) {
		this.issetdomain = issetdomain;
	}

	public Integer getCustomermode() {
		return customermode;
	}

	public void setCustomermode(Integer customermode) {
		this.customermode = customermode;
	}

	public Date getObtaintime() {
		return obtaintime;
	}

	public void setObtaintime(Date obtaintime) {
		this.obtaintime = obtaintime;
	}

	public Date getContacttime() {
		return contacttime;
	}

	public void setContacttime(Date contacttime) {
		this.contacttime = contacttime;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	public Integer getIsdeal() {
		return isdeal;
	}

	public void setIsdeal(Integer isdeal) {
		this.isdeal = isdeal;
	}

	public Integer getGiveupcount() {
		return giveupcount;
	}

	public void setGiveupcount(Integer giveupcount) {
		this.giveupcount = giveupcount;
	}

	public String getParam1() {
		return param1;
	}

	public void setParam1(String param1) {
		this.param1 = param1;
	}

	public String getParam2() {
		return param2;
	}

	public void setParam2(String param2) {
		this.param2 = param2;
	}

	public String getParam3() {
		return param3;
	}

	public void setParam3(String param3) {
		this.param3 = param3;
	}

	public int getFrommail() {
		return frommail;
	}

	public void setFrommail(int frommail) {
		this.frommail = frommail;
	}

	public Integer getRemainoutdays() {
		return remainoutdays;
	}

	public void setRemainoutdays(Integer remainoutdays) {
		this.remainoutdays = remainoutdays;
	}

	public int getWinrate() {
		return winrate;
	}

	public void setWinrate(int winrate) {
		this.winrate = winrate;
	}

	public String getIntentionproduct() {
		return intentionproduct;
	}

	public void setIntentionproduct(String intentionproduct) {
		this.intentionproduct = intentionproduct;
	}

	public String getMembernumber() {
		return membernumber;
	}

	public void setMembernumber(String membernumber) {
		this.membernumber = membernumber;
	}

	public String getMemberno() {
		return memberno;
	}

	public void setMemberno(String memberno) {
		this.memberno = memberno;
	}

	@Override
	public boolean equals(Object anObject) {
		if (anObject == null)
			return false;
		if (this == anObject) {
			return true;
		}
		if (anObject instanceof CustomerInfo) {
			CustomerInfo anotherObject = (CustomerInfo) anObject;
			if (customerid == null || customerid.length() == 0) {
				return false;
			} else {
				return customerid.equals(anotherObject.getCustomerid());
			}
		}
		return false;
	}

	public static void main(String[] args) {
	}

}