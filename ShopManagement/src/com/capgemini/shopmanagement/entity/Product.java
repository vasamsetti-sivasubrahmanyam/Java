package com.capgemini.shopmanagement.entity;

public class Product {
int id;
String companyName;
String modelName;
float cost;
/*public Product(String companyName, String modelName, float cost) {
	super();*/
	/*this.id=00;
	this.companyName = companyName;
	this.modelName = modelName;
	this.cost = cost;*/

public Product() {
	super();
	this.id=00;
	this.companyName ="Capgemini";
	this.modelName = "JEE Full Stack ";
	this.cost = cost;
	}
/*public Product(String product) {
	super();
	this.id=00;
	this.companyName ="Capgemini";
	this.modelName = "JEE Full Stack";
	this.cost = 20000.0f;
	}
public Product( float cost) {
	super();
	this.id=00;
	this.companyName = "Capgemini";
	this.modelName = "________";
	this.cost = cost;
	}*/




public Product(String companyName, String modelName, float cost) {
	super();
	this.id=1001;
	this.companyName = companyName;
	this.modelName = modelName;
	this.cost = cost;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public String getModelName() {
	return modelName;
}
public void setModelName(String modelName) {
	this.modelName = modelName;
}
public float getCost() {
	return cost;
}
public void setCost(float cost) {
	this.cost = cost;
}
@Override
public String toString() {
	return "Product [id=" + id + ", companyName=" + companyName + ", modelName=" + modelName + ", cost=" + cost + "]";
}

}
