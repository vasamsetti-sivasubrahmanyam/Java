package com.capgemini.shopmanagement.Dao;

import java.util.List;

import com.capgemini.shopmanagement.entity.Product;
import com.capgemini.shopmanagement.exception.CustomExcep;

public interface ProductDao {
public abstract int addProduct(Product p) throws CustomExcep;

public abstract List<Product> listAllProductRecords();

public abstract Product getProductById(int prdId) ;
 List<Product> deleteProductById(int prId);

 List<Product> updateProductById(int prId1, float updateCost);



}
