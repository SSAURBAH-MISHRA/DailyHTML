package com.capgemini.salesmanagement.util;

import java.util.HashMap;

import com.capgemini.salesmanagement.bean.Sale;

public class CollectionUtil {
	private static HashMap<Integer, Sale> sales=new HashMap<Integer,Sale>();
	public static HashMap<Integer,Sale> getCollection()
	{
		return sales;
	}
	public static HashMap<Integer,Sale> putSale(Sale sale)
	{
		sales.put(sale.getProdCode(), sale);
		return sales;
		
	}

}
