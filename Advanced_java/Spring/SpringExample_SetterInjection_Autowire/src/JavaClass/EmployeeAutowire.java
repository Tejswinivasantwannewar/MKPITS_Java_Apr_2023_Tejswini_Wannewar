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
public class EmployeeAutowire {
    private int id;
    private String name;
    private AddressAutowire addAuto;

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

    public AddressAutowire getAddAuto() {
        return addAuto;
    }

    public void setAddAuto(AddressAutowire addAuto) {
        this.addAuto = addAuto;
    }
    
    
    public void displayInfoAutowire(){
        System.out.println("id is :- "+" "+id+"Name is :-"+" "+name);
         System.out.println(addAuto);
    }
}
