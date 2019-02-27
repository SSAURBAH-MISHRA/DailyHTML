package com.capgemini.salesmanagement.ui;

import java.time.LocalDate;
import java.util.Scanner;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.exception.ProductNameNotMatchedException;
import com.capgemini.salesmanagement.service.ISaleService;
import com.capgemini.salesmanagement.service.SaleService;

public class Client {

	public static void main(String[] args) throws ProductNameNotMatchedException {
		// TODO Auto-generated method stub

		ISaleService saleService = new SaleService();
		int id = 0;
		Scanner sc = new Scanner(System.in);
		int prodCode;
		while (true) {
			System.out.println("*****************Billing Software Application****************");
			System.out.println("1: Save the Sale Details.");
			System.out.println("2:To Generate sale Details");
			System.out.println("3: Exit.");
			System.out.println("Enter the Choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter the Product code: ");
				prodCode = sc.nextInt();

				while (!saleService.validateProductCode(prodCode)) {
					System.out.println("It is an invalid product Code.");
					prodCode = sc.nextInt();
				}
				System.out.println("It is a valid product Code.");
				System.out.println("Enter the Product Name: ");
				String prodName = sc.next();
				while (!saleService.validateProductName(prodName)) {
					System.out.println("It is an invalid product name.");
					prodName = sc.next();
				}
				System.out.println("It is a valid product name.");
				System.out.println("Enter the Product Category: ");
				String prodCat = sc.next();
				while (!saleService.validateProductCat(prodCat)) {
					System.out.println("Category not matched");
					prodCat = sc.next();
				}
				System.out.println("Category matched.");

				System.out.println("Enter the price: ");
				int price = sc.nextInt();

				while (!saleService.validateProductPrice(price)) {
					System.out.println("Enter price greater than 200.");
					price = sc.nextInt();
				}
				System.out.println("Valid Price.");

				System.out.println("Enter the Quantity: ");
				int qty = sc.nextInt();
				while (!saleService.validateQuantity(qty)) {
					System.out.println("Enter Quantity less than 5.");
					qty = sc.nextInt();
				}
				System.out.println("Valid Quantity.");

				id = (int) Math.random();
				Sale sale = new Sale(id, prodCode, prodName, prodCat, LocalDate.now(), qty, qty * price);
				saleService.insertSalesDetails(sale);
				break;
			case 2:
				System.out.println("Enter the product code");
				int prodCode1 = sc.nextInt();
				System.out.println("Sale ID: " + saleService.getProductDetails(prodCode1).getSaleId() 
						+ "\nProduct Name: " + saleService.getProductDetails(prodCode1).getProductName()
						+"\nProduct Category: "+saleService.getProductDetails(prodCode1).getCategory()
						+"\nQuantity: "+saleService.getProductDetails(prodCode1).getQuantity()
						+"\nDate: "+saleService.getProductDetails(prodCode1).getSaleDate()
						+ "\nLine Total:" + saleService.getProductDetails(prodCode1).getLineTotal());
				break;
			case 3:
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("You have entered an invalid choice");
			}
		}
		// while(true)
		// {
		// System.out.println("Enter Product code:");
		// int productCode = sc.nextInt();
		// System.out.println("Enter the Quantity:");
		// int qty = sc.nextInt();
		// Sale sale=saleService.getProductDetails(productCode);
		// if(saleService.validateProductCode(productCode))
		// {
		// if(saleService.validateQuantity(qty))
		// {
		// System.out.println("Product name is:"+ sale.getProductName());
		// System.out.println("Product category is:"+ sale.getCategory());
		// System.out.println("Product total price is:"+ qty*sale.getLineTotal());
		// System.out.println("Date is:"+ sale.getSaleDate());
		// System.out.println("Sale ID is:"+ sale.getSaleId());
		// }
		// else
		// {
		// System.out.println("Enter a valid quantity.");
		// }
		// }
		// else
		// {
		// System.out.println("Product Code is not Valid. Enter a Valid code.");
		// }
		// }

	}

}
