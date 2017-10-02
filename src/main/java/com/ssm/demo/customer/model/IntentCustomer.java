package com.ssm.demo.customer.model;

import java.util.List;

public class IntentCustomer extends CustomerInfo {
	private String employeename;
	private String contactname;
	private String phonenumber;
	private int winrate;
	private List<String> customerTagList;

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public String getContactname() {
		return contactname;
	}

	public void setContactname(String contactname) {
		this.contactname = contactname;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public int getWinrate() {
		return winrate;
	}

	public void setWinrate(int winrate) {
		this.winrate = winrate;
	}

	public List<String> getCustomerTagList() {
		return customerTagList;
	}

	public void setCustomerTagList(List<String> customerTagList) {
		this.customerTagList = customerTagList;
	}

	@Override
	public String toString() {
		return "IntentCustomer [employeename=" + employeename + ", contactname=" + contactname + ", phonenumber="
				+ phonenumber + ", winrate=" + winrate + ", customerTagList=" + customerTagList + "]";
	}

}
