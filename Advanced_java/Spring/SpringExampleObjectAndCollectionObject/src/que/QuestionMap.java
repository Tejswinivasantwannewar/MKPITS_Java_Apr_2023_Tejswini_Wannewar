/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author tejswini
 */
public class QuestionMap {
    private int id;
    private String name;
    private Map <String,String> answers;

    public QuestionMap() {
    }
public QuestionMap(int id, String name, Map<String, String> answers) {  
    super();  
    this.id = id;  
    this.name = name;  
    this.answers = answers;  
}  
  
public void displayInfo(){  
    System.out.println("question id:"+id);  
    System.out.println("question name:"+name);  
    System.out.println("Answers....");  
    
    Set<Entry<String, String>> set=answers.entrySet();  
    Iterator<Entry<String, String>> itr=set.iterator();  
    
    while(itr.hasNext())
    {  
        Entry<String,String> entry=itr.next();  
        System.out.println("Answer:"+entry.getKey()+" Posted By:"+entry.getValue());  
    }  
} 

}
