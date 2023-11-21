/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setterinjectionautowire;

import JavaClass.EmployeeAutowire;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author tejswini
 */
public class SetterInjectionAutowire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("----DISPLAYING THE MESSAGE IN SETTER INJECTION USING AUTOWIRE-----");
        
       ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
      EmployeeAutowire empAuto=(EmployeeAutowire) context.getBean("emp");
      empAuto.displayInfoAutowire();
    }
    
}
