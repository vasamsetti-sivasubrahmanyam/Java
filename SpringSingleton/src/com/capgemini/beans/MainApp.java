package com.capgemini.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp  {
public static void main(String[] args) {
	AbstractApplicationContext context=new ClassPathXmlApplicationContext("empXml.xml");
	context.registerShutdownHook();
	Employee employee=(Employee)context.getBean("Employee");
	employee.setEmpName("ggfgfc");
	employee.setEmpNum(3544);
	System.out.println(employee.getEmpNum());
	System.out.println(employee.getEmpName());

}
}
