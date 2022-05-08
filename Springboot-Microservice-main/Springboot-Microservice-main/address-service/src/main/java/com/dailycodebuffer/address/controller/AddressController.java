package com.dailycodebuffer.address.controller;

import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addresses")
@Slf4j
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping("/")
    public Address saveAddress(@RequestBody Address address) {
        log.info("Inside saveAddress method of AddressController");
        return  addressService.saveAddress(address);
    }

    @GetMapping("/{id}")
    public Address findAddressById(@PathVariable("id") Long addressId) {
        log.info("Inside findAddressById method of AddressController");
        return addressService.findAddressById(addressId);
    }

}
