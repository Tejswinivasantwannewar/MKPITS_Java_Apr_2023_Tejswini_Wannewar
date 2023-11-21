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
public class AddressAutowire {
    private String AddressLine;
    private String city;
    private String state;
    private String country;

    public String getAddressLine() {
        return AddressLine;
    }

    public void setAddressLine(String AddressLine) {
        this.AddressLine = AddressLine;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "AddressAutowire{" + "AddressLine=" + AddressLine + ", city=" + city + ", state=" + state + ", country=" + country + '}';
    }
   
    
    
}
