/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaClass;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author tejswini
 */
public class Question {
    private int id;
    private String name;
    private List <String> answers;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }
  
    public void displayInfoList(){
        
        System.out.println("id :-" +id);
           
        System.out.println("Question  is:-" +name);
        System.out.println("Answers list are :-");
        
        Iterator <String> itr=answers.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        
        
    }
}
