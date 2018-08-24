package com.capgemini.shopmanagement.ui;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.PropertyConfigurator;

import com.capgemini.shopmanagement.entity.Product;
import com.capgemini.shopmanagement.exception.CustomExcep;
import com.capgemini.shopmanagement.service.ProductService;
import com.capgemini.shopmanagement.service.ProductServiceImpl;

public class SampleProject {
public static void main(String[] args) throws CustomExcep {
	PropertyConfigurator.configure("src\\log4j.properties");
	ProductService service;
	{
		service=new ProductServiceImpl();
		
	}
	List mylist;
	Scanner sc=new Scanner(System.in);
	String ans;
	int no;
	do {
		System.out.println("******DMART SERVICES********");
		System.out.println("1.Add Product");
		System.out.println("2.Display all product");
		System.out.println("3.Search for the  product");
		System.out.println("4.Delete  product ");
		System.out.println("5.Update cost of the product");
		System.out.println("Pls enter your choice");
		no=sc.nextInt();
		switch(no) {
		case 1:
			
			System.out.println("*enter product details*\n");
			System.out.println("Enter the brand name");
			String brandName=sc.next();
			System.out.println("enter the model name");
			String modelName=sc.next();
			System.out.println("enter the cost");
			float prdCost=sc.nextFloat();
						Product p=new Product(brandName,modelName,prdCost);
					//	p=service.addProducts(p);
					//	System.out.println(p);
						int prdId=service.addProducts(p);
						System.out.println("your product id is:"+prdId);
			break;
			//default:
				//System.out.println("some error in switch case");
				//break;
			case 2: List<Product>prdList=service.listAllProductrecords();
			System.out.println(prdList);
			break;
			case 3: System.out.println("Enter Product Id");
			int pId=sc.nextInt();
				Product product=service.getProductById(pId);
			case 4:
				System.out.println("select product Id to be deleted");
				int prId=sc.nextInt();
				List<Product>pdList=service.deleteProductById(prId);
				System.out.println(pdList);
				break;
			case 5:
				System.out.println("Enter the id to be updated");
				int prId1=sc.nextInt();
				System.out.println("enter amount to be updated");
				float updateCost=sc.nextFloat();
				List<Product>prdList1=service.updateProductById( prId1, updateCost);
				System.out.println(prdList1);
				break;
	}
		System.out.println("do you want ot continue yes?no");
		ans=sc.next();
	}while(ans.equals("Yes")||ans.equals("y")||ans.equals("yes"));
}
}
