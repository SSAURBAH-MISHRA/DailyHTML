package com.capgemini.salesmanagement.service;

import java.util.HashMap;
import java.util.Scanner;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.dao.ISaleDAO;
import com.capgemini.salesmanagement.dao.SaleDAO;
import com.capgemini.salesmanagement.exception.ProductNameNotMatchedException;

public class SaleService implements ISaleService {
	ISaleDAO saleDAO = new SaleDAO();
	

	@Override
	public HashMap<Integer, Sale> insertSalesDetails(Sale sale) throws ProductNameNotMatchedException 
	{
		// TODO Auto-generated method stub
		
		
		return saleDAO.insertSalesDetails(sale);
//		if(this.validateProductCode(sale.getProdCode()))
//		{
//			System.out.println("Product code is not Valid.");
//			return null;
//		}
//		if(this.validateQuantity(sale.getQuantity()))
//		{
//			System.out.println("Product Quantity is Over.");
//			return null;
//		}
//		if(this.validateProductCat(sale.getCategory()))
//		{
//			System.out.println("Please! Enter a valid Category name.");
//			return null;
//		}
//		if(this.validateProductPrice(sale.getLineTotal()/sale.getQuantity()))
//		{
//			System.out.println("Product price is not valid.");
//			return null;
//		}
//		if(this.validateProductName(sale.getProductName()))
//		{
//			System.out.println("Product name is not Valid.");
//			return null;
//		}
//
//		return isale.insertSalesDetails(sale);
	}

	@Override
	public boolean validateProductCode(int productId) {
		// TODO Auto-generated method stub
		if (productId == 1001 || productId == 1002 || productId == 1003 || productId == 1004)
			return true;
		else
			return false;
	}

	@Override
	public boolean validateQuantity(int qty) {
		// TODO Auto-generated method stub
		if (qty > 0 && qty < 5) {
			return true;
		}
		return false;

	}

	@Override
	public boolean validateProductCat(String prodCat) {
		// TODO Auto-generated method stub
		if (prodCat.equals("Electronics") || prodCat.equals("Toys")) {
			return true;
		}
		return false;
	}

	@Override
	public boolean validateProductName(String prodName) throws ProductNameNotMatchedException {
		// TODO Auto-generated method stub
		if (prodName.equals("TV") || prodName.equals("Smart Phone") || prodName.equals("Video Game")
				|| prodName.equals("Soft Toy") || prodName.equals("Telescope") || prodName.equals("Barbee Doll")) {
			return true;
		}
		else
		{
			throw new ProductNameNotMatchedException();
		}
	}

	@Override
	public boolean validateProductPrice(float price) {
		// TODO Auto-generated method stub
		if (price > 200) {
			return true;
		}
		return false;
	}

	@Override
	public Sale getProductDetails(int prodcode) 
	{
		return(saleDAO.getProductDetails(prodcode));
	}
	
	
}
