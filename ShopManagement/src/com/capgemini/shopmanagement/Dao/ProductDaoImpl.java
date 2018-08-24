package com.capgemini.shopmanagement.Dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.capgemini.shopmanagement.entity.Product;
import com.capgemini.shopmanagement.exception.CustomExcep;

public class ProductDaoImpl implements ProductDao {
static int prdId=1000;
Product product=null;
static Logger mylogger =Logger.getLogger(ProductDaoImpl.class.getName());
public ArrayList<Product> list;
{
	list=new ArrayList();
	}
public int addProduct(Product p) throws CustomExcep {
		//throws CustomExp{ 
{
		try {
			if(p==null)
				throw new Exception();
			product=p;
				prdId++;
	p.setId(prdId);
	list.add(p);
	mylogger.debug("Debug info Product add to the list");
	mylogger.info("product added in a list");
	return prdId;
}
		catch(Exception e) {
			throw new CustomExcep("Sorry coult not add a record",e);
			}
		
}
		}
@Override
public List<Product> listAllProductRecords() {
	// TODO Auto-generated method stub
	return list;
	
}

@Override
public Product getProductById(int pId)  {
	// TODO Auto-generated method stub
	Iterator<Product> iter= list.iterator();
	while(iter.hasNext()) {
		product=iter.next();
		if(product.getId()==prdId) {
			return product;
		}
	}
	return null;
}
	@Override
	public List<Product> deleteProductById(int prId) {
		Iterator<Product> iter= list.iterator();
		while(iter.hasNext()) {
			product =iter.next();
			if(product.getId()==prId){
				list.remove(product);
				return list;
			}
			
		}return null;
}

	public List<Product> updateProductById(int prId1,float updateCost){
		Scanner sc=new Scanner(System.in);
		Iterator<Product> iter= list.iterator();
		//int flag=1;
		while(iter.hasNext()) {
			product =iter.next();
			if(product.getId()==prId1){
				product.setCost(updateCost);
				
			}
			
		}
		return list;
	}
	
	
}
