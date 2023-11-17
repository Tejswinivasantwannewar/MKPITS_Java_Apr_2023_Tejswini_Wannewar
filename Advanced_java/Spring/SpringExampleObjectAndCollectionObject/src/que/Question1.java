/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author tejswini
 */
public class Question1 {
  private int id;  
private String name;  
private List<Answer1> answers;  
  
public Question1() {}

public Question1(int id, String name, List<Answer1> answers) {  
    
    super();  
    
    this.id = id;  
    this.name = name;  
    this.answers = answers;  
}  
  
public void displayInfo(){ 
    
    System.out.println(id+" "+name);  
    System.out.println("answers are:"); 
    
    Iterator<Answer1> itr=answers.iterator(); 
    
    while(itr.hasNext())
    {  
        
        System.out.println(itr.next());  
    }  
}  
  
}  