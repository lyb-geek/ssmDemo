package com.ssm.demo.customer.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.demo.customer.model.IntentCustomer;
import com.ssm.demo.customer.service.CustomerService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring.xml" })
public class CustomerTest {
	@Autowired
	private CustomerService customerService;

	@Test
	public void testGetIntentCustomerList() {
		Map<String, Object> params = new HashMap<>();
		params.put("employeeid", "ff8080812fc95ce9012fcbc65b837310");
		// 分页处理，显示第一页的10条数据
		PageHelper.startPage(1, 10);
		List<IntentCustomer> list = customerService.getIntentCustomerList(params);
		// for (IntentCustomer intentCustomer : list) {
		// // System.out.println(intentCustomer);
		// }

		// 取分页信息
		PageInfo<IntentCustomer> pageInfo = new PageInfo<IntentCustomer>(list);
		long total = pageInfo.getTotal(); // 获取总记录数
		List<IntentCustomer> list1 = pageInfo.getList();
		for (IntentCustomer intentCustomer : list1) {
			System.out.println(intentCustomer);
		}

		System.out.println("共有客户信息：" + total);
	}

}
