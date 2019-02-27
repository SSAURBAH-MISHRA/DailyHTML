package com.capgemini.salesmanagement.service;

import java.util.HashMap;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.exception.ProductNameNotMatchedException;

public interface ISaleService {
	public HashMap<Integer, Sale> insertSalesDetails(Sale sale) throws ProductNameNotMatchedException;
	public boolean validateProductCode(int productId);
	boolean validateQuantity(int qty);
	public boolean validateProductCat(String prodCat);
	public boolean validateProductName(String prodName) throws ProductNameNotMatchedException;
	public boolean validateProductPrice(float price);
	public Sale getProductDetails(int prodcode);

}
