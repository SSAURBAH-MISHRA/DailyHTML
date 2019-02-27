package com.capgemini.salesmanagement.dao;

import java.util.HashMap;
import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.exception.ProductNameNotMatchedException;

public interface ISaleDAO {

	public HashMap<Integer, Sale> insertSalesDetails(Sale sale) throws ProductNameNotMatchedException;
	public Sale getProductDetails(int prodCode);
	
	}
