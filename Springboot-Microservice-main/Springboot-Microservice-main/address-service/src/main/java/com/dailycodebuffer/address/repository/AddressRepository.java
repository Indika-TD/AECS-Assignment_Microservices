package com.dailycodebuffer.address.repository;

import com.dailycodebuffer.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Department, Long> {

    Department findByAddressId(Long addressId);
}
