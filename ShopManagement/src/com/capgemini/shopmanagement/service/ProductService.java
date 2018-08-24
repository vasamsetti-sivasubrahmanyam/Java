package com.capgemini.shopmanagement.service;

import java.util.List;

import com.capgemini.shopmanagement.entity.Product;
import com.capgemini.shopmanagement.exception.CustomExcep;

public interface ProductService {
public abstract int addProducts(Product p) throws CustomExcep;
public List<Product>listAllProductrecords();// throws CustomExcep;
public abstract Product getProductById(int pId) throws CustomExcep;
boolean validateName(String pName);
void acceptProductDeatils(Product p);
List<Product> deleteProductById(int prId);
//public abstract List<Product> updateProductById(int prId1);
public abstract List<Product> updateProductById(int prId1, float updateCost);
}
