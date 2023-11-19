/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setterinjectioninspringframework;

import JavaClass.Employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author tejswini
 */
public class SetterInjectioninSpringFramework {

   
    public static void main(String[] args) {
        
        System.out.println("............Displaying Employee Class Using Setter injection........");
        
        ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Employee employee=(Employee)context.getBean("emp");
        employee.displayEmployee();
        
      
    }
    
}
