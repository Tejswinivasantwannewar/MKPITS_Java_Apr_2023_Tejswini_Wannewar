/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que;

/**
 *
 * @author tejswini
 */
public class Answer1 {
  
private int id;  
private String name;  
private String by;  
  
public Answer1() {}  

public Answer1(int id, String name, String by) {  
    super();  
    this.id = id;  
    this.name = name;  
    this.by = by;  
}  
  
@Override
public String toString(){  
    return id+" "+name+" "+by;  
}  
    
}
