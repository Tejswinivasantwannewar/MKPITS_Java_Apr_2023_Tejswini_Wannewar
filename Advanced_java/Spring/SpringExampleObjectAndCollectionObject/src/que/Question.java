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
public class Question {
    private int id;
    private String question;
    private List <String> answers;

    public Question() {
        
    }

    public Question(int id, String question, List<String> answers) {
        this.id = id;
        this.question = question;
        this.answers = answers;
    }
    
      
    public void show(){
          
        System.out.println("id ="+ id +" "+ "name= " +question);
        System.out.println("answers are=");
          
     Iterator  itr = answers.iterator();
        while(itr.hasNext())
    {
        System.out.println(itr.next());
        
     }
        
    }
    
}
