package com.capgemini.shopmanagement.junit;





import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.shopmanagement.Dao.ProductDao;
import com.capgemini.shopmanagement.Dao.ProductDaoImpl;
import com.capgemini.shopmanagement.entity.Product;
import com.capgemini.shopmanagement.exception.CustomExcep;

public class ProductTest {
private static ProductDao services;
@BeforeClass
public static void initialize()throws CustomExcep{
	services=new ProductDaoImpl();
	}
@Test(expected=CustomExcep.class)
public void TestExceptionsAfterInsert() throws CustomExcep{
	Product p1=new Product("Company","Model",5000.00f);
	int r=services.addProduct(null);
	
}
	@Test
	public void GetCompanyName()
	{
		Product product=new Product(20000.00f);
		assertEquals("Capgemini",product.getCompanyName());
		
	}
	@Test
	public void GetModelName() {
		Product product1=new Product();
		assertEquals("JEE Full Stack ",product1.getModelName());
	}
@Test
	public void GetId() throws CustomExcep{
		ProductDao serviceDao=new ProductDaoImpl();
		Product p1=new Product("Samsung","Galaxy7",20000.00f);
		int prdId=serviceDao.addProduct(p1);
		assertEquals(1001,prdId);
	}
}

