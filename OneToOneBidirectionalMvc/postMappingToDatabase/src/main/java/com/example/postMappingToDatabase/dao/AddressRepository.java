package com.example.postMappingToDatabase.dao;

import com.example.postMappingToDatabase.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer> {
}
