package com.capgemini.salesmanagement.dao;

import java.util.HashMap;
import java.util.Map.Entry;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.util.CollectionUtil;

public class SaleDAO implements ISaleDAO {
	//= new HashMap<Integer, Sale>();
//	static HashMap<Integer, Sale>  sales;
//	static{
//		sales= new HashMap<Integer, Sale>();
//		sales.put(1001, new Sale(1001, "iPhone", "Electronics", 35000));
//		sales.put(1002, new Sale(1002, "LEDTV", "Electronics", 45000));
//		sales.put(1003, new Sale(1003, "Teddy", "Toys", 800));
//		sales.put(1004, new Sale(1004, "Telescope", "Toys", 5000));
//
//	}

	@Override
	public HashMap<Integer, Sale> insertSalesDetails(Sale sale)
	{
		// TODO Auto-generated method stub
	return(CollectionUtil.putSale(sale));
	}

	@Override
	public Sale getProductDetails(int prodcode) {
		// TODO Auto-generated method stub
		
		for(Entry<Integer,Sale> sale:CollectionUtil.getCollection().entrySet())
		{
			if(prodcode==sale.getKey())
				return (sale.getValue());
		}
		return null;
	}
}
