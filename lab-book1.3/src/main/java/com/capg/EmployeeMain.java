package com.capg;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;


//if(this.unit == "PES-BU") {
//	this.businessUnit.addSBU();
//}
public class EmployeeMain {
	public static void main(String[] args) {
	 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	 Class configurationClass=JavaConfig.class;
     context.register(configurationClass);
     context.refresh();

     Employee employee = context.getBean(Employee.class);
     SBU sbu = new SBU("PES-BU", "Product Engineering Services", "Kiran Rao");
     employee.setSbu(sbu);
     

     if(employee.getUnit().equals("PES-BU"))
     {
    	 System.out.println("equals");
     	 employee.addSBUList(employee);
     }
     System.out.println("Details are:");
     employee.display();
     
       System.out.println(employee.getSbuDetails().toString());

     
	}
	
//	void printSBUDetails(SBU sbu) {
//		System.out.println("SBU Details= SBU"+"["+"sbuCode:"+sbu.getSbuId()+" "+"sbuHead:"+sbu.getSbuHead()+" "+"sbuName:"+sbu.getSbuName()+"]");
//	}

}