package com.example.postMappingToDatabase.service;

import com.example.postMappingToDatabase.dao.AddressRepository;
import com.example.postMappingToDatabase.entity.Address;
import com.example.postMappingToDatabase.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService{

    private AddressRepository addressRepository;
@Autowired
    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public Address findByEmpId(Integer id) {
        Optional <Address> address=addressRepository.findById(id);
        return address.get();


    }
}
