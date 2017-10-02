package com.ssm.demo.customer.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssm.demo.customer.dao.CustomerDao;
import com.ssm.demo.customer.model.DealCustomer;
import com.ssm.demo.customer.model.IntentCustomer;
import com.ssm.demo.customer.service.CustomerService;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;

	@Override
	public List<IntentCustomer> getIntentCustomerList(Map<String, Object> params) {
		return customerDao.getIntentCustomerList(params);
	}

	@Override
	public List<DealCustomer> getDealCustomerList(Map<String, Object> params) {
		return customerDao.getDealCustomerList(params);
	}

}
