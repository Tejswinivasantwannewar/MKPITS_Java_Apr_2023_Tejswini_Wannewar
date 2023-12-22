package com.example.postMappingToDatabase.rest;

import com.example.postMappingToDatabase.entity.Address;
import com.example.postMappingToDatabase.entity.Employee;
import com.example.postMappingToDatabase.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/api")
public class AddressRestController {
    @Autowired
    private AddressService addressService;

    public AddressRestController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping("/address/{id}")
    public Address getStudent(@PathVariable("id") int id){
        return addressService.findByEmpId(id);
    }

     @GetMapping("/addressview/{id}")
      public Employee getAddressStudent(@PathVariable int id){
      Address address=addressService.findByAddress(id);
      Employee employee=address.getEmployee();
      return  employee;
    }

    @DeleteMapping("/addressdelete/{id}")
    public String deleteRecordInTable(@PathVariable @RequestBody int id){
//        Address address= getAddressStudent(id).getAddress();
//    Employee employee=address.getEmployee();
//    employee.setAddress(null);
//    addressService.deleteByAddressId(id);
//    return "data deleted successfully...!!!";
       Address address= addressService.findByEmpId(id);
       Employee employee=address.getEmployee();
       employee.setAddress(null);
       addressService.deleteByAddressId(id);
       return "data deleted successfully..!!";

    }
}
