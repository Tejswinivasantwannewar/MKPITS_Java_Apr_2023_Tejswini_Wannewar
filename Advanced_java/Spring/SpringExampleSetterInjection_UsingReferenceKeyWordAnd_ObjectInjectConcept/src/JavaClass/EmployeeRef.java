/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaClass;

/**
 *
 * @author tejswini
 */
public class EmployeeRef {
    
    private int id;
    private String name;
    private AddressRef addressRef;

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

    public AddressRef getAddressRef() {
        return addressRef;
    }

    public void setAddressRef(AddressRef addressRef) {
        this.addressRef = addressRef;
    }
    
    
    public void displayInfoRef(){
        System.out.println("id is:-"+id+"name is:-"+name);
        System.out.println(addressRef);
    }
    
}
