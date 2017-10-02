package com.ssm.demo.customer.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.demo.common.model.ResponseResult;
import com.ssm.demo.customer.model.IntentCustomer;
import com.ssm.demo.customer.service.CustomerService;

@Controller
@RequestMapping(value = "customer")
public class CustomerController {
	@Autowired
	private CustomerService customerService;

	@GetMapping(value = "/page")
	public String toCustomerPage() {
		System.out.println("toCustomerPage");
		return "customer/customer";
	}

	@RequestMapping(value = "/getCustomerList")
	@ResponseBody
	public ResponseResult<List<IntentCustomer>> getCustomerList(String employeeId) {
		Map<String, Object> params = new HashMap<>();
		params.put("employeeid", employeeId);
		System.out.println(employeeId);
		List<IntentCustomer> list = customerService.getIntentCustomerList(params);

		return new ResponseResult<List<IntentCustomer>>(list);
	}

}
