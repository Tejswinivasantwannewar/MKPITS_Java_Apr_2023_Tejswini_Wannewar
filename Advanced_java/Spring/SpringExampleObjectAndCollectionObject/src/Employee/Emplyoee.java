/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;





/**
 *
 * @author tejswini
 */
public class Emplyoee {
    private int id;
    private String name;
    private Address address;

    public Emplyoee(int id, String name, Address address) {
        super();
        this.id = id;
        this.name = name;
        this.address=address;
    }
    

    public Emplyoee() {
    }
    
    public void display(){
        
        System.out.println("id = " + id + " " + "name = " + name);
        System.out.println(address.toString());
      
    }
    
    
    
    

    
}
