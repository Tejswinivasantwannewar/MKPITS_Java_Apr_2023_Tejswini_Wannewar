/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que;

import java.util.Date;

/**
 *
 * @author tejswini
 */
public class AnswerMap {
    
   private int id;  
private String answer;  
private Date postedDate; 

public AnswerMap() {}  

public AnswerMap(int id, String answer, Date postedDate) {  
    super();  
    this.id = id;  
    this.answer = answer;  
    this.postedDate = postedDate;  
}  
  
   @Override  
   public String toString(){  
    return "Id:"+id+" Answer:"+answer+" Posted Date:"+postedDate;  
}  
}  

