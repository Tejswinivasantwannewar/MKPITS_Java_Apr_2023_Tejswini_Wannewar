package com.example.postMappingToDatabase.service;


import com.example.postMappingToDatabase.entity.Address;

public interface AddressService {
    Address findByEmpId(Integer id);
    Address findByAddress(Integer id);
    public void deleteByAddressId(Integer id);


}
