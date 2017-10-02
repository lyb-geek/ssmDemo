
package com.ssm.demo.customer.model;

import java.util.List;

public class DealCustomer extends CustomerInfo {

	private String employeename;
	private String contactname;
	private String phonenumber;
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

	public List<String> getCustomerTagList() {
		return customerTagList;
	}

	public void setCustomerTagList(List<String> customerTagList) {
		this.customerTagList = customerTagList;
	}

}
