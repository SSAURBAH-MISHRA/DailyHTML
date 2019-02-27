package com.capgemini.salesmanagement.test;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.salesmanagement.exception.ProductNameNotMatchedException;
import com.capgemini.salesmanagement.service.ISaleService;
import com.capgemini.salesmanagement.service.SaleService;

public class SaleJUnitTest {
	ISaleService saleService=new SaleService();
	@Before
	public void setUp() throws Exception {
	}
	@Test(expected=com.capgemini.salesmanagement.exception.ProductNameNotMatchedException.class)
	public void test() throws ProductNameNotMatchedException {
		saleService.validateProductName("iPhone");
	}

}
