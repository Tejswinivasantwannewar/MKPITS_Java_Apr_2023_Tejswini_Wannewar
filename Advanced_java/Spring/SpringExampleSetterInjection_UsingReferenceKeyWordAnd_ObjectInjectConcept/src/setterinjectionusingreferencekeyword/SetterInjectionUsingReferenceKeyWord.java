/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setterinjectionusingreferencekeyword;

import JavaClass.EmployeeRef;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author tejswini
 */
public class SetterInjectionUsingReferenceKeyWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("............Displaying Employee Class Using Setter injection reference keyword........");
        ApplicationContext context1= new ClassPathXmlApplicationContext("ApplicationContext.xml");
       EmployeeRef empRef=(EmployeeRef) context1.getBean("emp");
       empRef.displayInfoRef();
       
    }
    
}
