/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ourspringproject;

import Employee.Emplyoee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import que.Question;





/**
 *
 * @author tejswini
 */
public class OurSpringProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Resource resource = new ClassPathResource("ApplicationContext.xml");
//        BeanFactory factory = new XmlBeanFactory(resource);
//        
//        Emplyoee employee = (Emplyoee)factory.getBean("emp");
//        employee.display();

        
//  Question question= (Question)factory.getBean("que");
//  question.show();

        ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Question question = (Question)context.getBean("ques");
        question.show();
    }
    
}

