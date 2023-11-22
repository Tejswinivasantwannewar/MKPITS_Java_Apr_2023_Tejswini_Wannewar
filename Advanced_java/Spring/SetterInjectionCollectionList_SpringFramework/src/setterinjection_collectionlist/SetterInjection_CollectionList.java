/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setterinjection_collectionlist;

import JavaClass.Question;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author tejswini
 */
public class SetterInjection_CollectionList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Question question=(Question)context.getBean("que");
        question.displayInfoList();
        
    }
    
}
