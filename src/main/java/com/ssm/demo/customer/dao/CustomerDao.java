package com.ssm.demo.customer.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssm.demo.customer.mapper.MyCustomerMapper;
import com.ssm.demo.customer.model.DealCustomer;
import com.ssm.demo.customer.model.IntentCustomer;

@Repository
public class CustomerDao {
	@Autowired
	private MyCustomerMapper myCustomerMapper;

	public List<IntentCustomer> getIntentCustomerList(Map<String, Object> params) {
		return myCustomerMapper.getIntentCustomerList(params);
	}

	public List<DealCustomer> getDealCustomerList(Map<String, Object> params) {
		return myCustomerMapper.getDealCustomerList(params);
	}

}
