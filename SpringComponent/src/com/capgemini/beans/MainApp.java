package com.capgemini.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("empXml.xml");
	Employee employee=(Employee)context.getBean("employee");
	/*employee.setEmpName("siv");
	employee.setEmpNum(101);*/
	/*System.out.println(employee.getEmpName());
	System.out.println(employee.getEmpNum());*/
	System.out.println(employee.getAddress().getCity());
	

}
}
