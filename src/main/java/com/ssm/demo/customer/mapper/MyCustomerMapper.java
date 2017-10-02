
package com.ssm.demo.customer.mapper;

import java.util.List;
import java.util.Map;

import com.ssm.demo.customer.model.DealCustomer;
import com.ssm.demo.customer.model.IntentCustomer;

public interface MyCustomerMapper {

	List<IntentCustomer> getIntentCustomerList(Map<String, Object> params);

	List<DealCustomer> getDealCustomerList(Map<String, Object> params);

}
