package com.example.postMappingToDatabase.service;

import com.example.postMappingToDatabase.dao.AddressRepository;
import com.example.postMappingToDatabase.entity.Address;
import com.example.postMappingToDatabase.entity.Employee;
import jakarta.transaction.Transactional;
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
        return  addressRepository.findById(id).get();

    }

    @Override
    public Address findByAddress(Integer id) {
        return addressRepository.findById(id).get();
    }

    @Override
    @Transactional
    public void deleteByAddressId(Integer id) {
    addressRepository.deleteById(id);

    }
}
