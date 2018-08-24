package com.capgemini.shopmanagement.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capgemini.shopmanagement.Dao.ProductDao;
import com.capgemini.shopmanagement.Dao.ProductDaoImpl;
import com.capgemini.shopmanagement.entity.Product;
import com.capgemini.shopmanagement.exception.CustomExcep;

public class ProductServiceImpl implements ProductService {
	private ProductDao serviceDao;
	private ArrayList<Product> mylist;
	public ProductServiceImpl() {
		serviceDao=new ProductDaoImpl();
		
	}
public int addProducts(Product p) throws CustomExcep {
//throws CustomExp{
	acceptProductDeatils(p);
	int prdId=serviceDao.addProduct(p);
	return prdId;
	
}
@Override
public List<Product>listAllProductrecords() {
	// TODO Auto-generated method stub
	return serviceDao.listAllProductRecords();
}
	@Override
	public Product getProductById(int prdId) throws CustomExcep {
		Product product=serviceDao.getProductById(prdId);
		return product;
}
	@Override
	public boolean validateName(String brandName) {
		String pattern="[A-Z][a-zA-Z]*";
		if(brandName.matches(pattern)) {
			return true;
		}else {
			return false;
		}
	}
	public void acceptProductDeatils(Product p) {
		Scanner scan=new Scanner(System.in);
		while(true) {
			String str=p.getCompanyName();
			if(validateName(str)) {break;}
			else {
				System.err.println("Wrong Copany name!!! \n start with valid name ");
				System.out.println("enter company name again eg.Company");
				p.setCompanyName(scan.next());
			}
		}
		while(true) {
			String str1=p.getModelName();
			if(validateName(p.getModelName())) {break;}
			else {
				System.err.println("Wrong Model name!!! \n start with valid name ");
				System.out.println("enter Model name again eg.Company");
				p.setModelName(scan.next());
	}
		}
}
	@Override
	public List<Product> deleteProductById(int prId) {
		List<Product> a2=serviceDao.deleteProductById(prId);
		return a2;
	}
	
	
	@Override
	public List<Product> updateProductById(int prId1,float updateCost) {
		List<Product> a1=serviceDao.updateProductById(prId1,updateCost);
		return a1;
	}
	}
		
