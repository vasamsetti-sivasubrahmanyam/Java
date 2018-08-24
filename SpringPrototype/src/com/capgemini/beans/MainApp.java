package com.capgemini.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("empXml.xml");
	Employee employee=(Employee)context.getBean("Employee");
	employee.setEmpName("siv");
	employee.setEmpNum(101);
	System.out.println(employee.getEmpName());
	System.out.println(employee.getEmpNum());
	Employee employee1=(Employee)context.getBean("Employee");
	/*employee1.setEmpName("siva");
	employee1.setEmpNum(102);*/
	System.out.println(employee1.getEmpName());
	System.out.println(employee1.getEmpNum());
	

}
}
