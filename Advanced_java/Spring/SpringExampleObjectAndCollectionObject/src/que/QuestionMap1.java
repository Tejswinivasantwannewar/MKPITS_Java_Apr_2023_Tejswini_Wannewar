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
public class QuestionMap1 {
  
private int id;  
private String name;  
private Map<AnswerMap,MapUser> answers;
    public QuestionMap1() 
    {
    }

        public QuestionMap1(int id, String name, Map<AnswerMap, MapUser> answers) {
            this.id = id;
            this.name = name;
            this.answers = answers;
        }
  
 public void displayMapInfo(){  
    System.out.println("question id:"+id);  
    System.out.println("question name:"+name);  
    System.out.println("Answers....");  
    Set<Entry<AnswerMap, MapUser>> set=answers.entrySet();  
    Iterator<Entry<AnswerMap, MapUser>> itr=set.iterator();  
    while(itr.hasNext()){  
        Entry<AnswerMap, MapUser> entry=itr.next();  
        AnswerMap ans=entry.getKey();  
        MapUser user=entry.getValue();  
        System.out.println("Answer Information:");  
        System.out.println(ans);  
        System.out.println("Posted By:");  
        System.out.println(user);  
    }  
 
}  
  
  


    }
    
    

