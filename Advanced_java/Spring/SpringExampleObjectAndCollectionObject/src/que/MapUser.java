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
public class MapUser {
 
private int id;  
private String name,email;  
public MapUser() {}  
public MapUser(int id, String name, String email) {  
    super();  
    this.id = id;  
    this.name = name;  
    this.email = email;  
}  
  
@Override
public String toString(){  
    return "Id:"+id+" Name:"+name+" Email Id:"+email;  
}  
}
