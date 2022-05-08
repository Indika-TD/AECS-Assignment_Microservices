package com.dailycodebuffer.address.service;

import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public Address saveAddress(Address address) {
        log.info("Inside saveAddress of AddressService");
        return addressRepository.save(address);
    }

    public Address findAddressById(Long addressId) {
        log.info("Inside saveAddress of AddressService");
        return addressRepository.findByAddressId(addressId);
    }
}
