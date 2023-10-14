package com.blackfury.restdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.blackfury.restdemo.model.CloudVendor;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {
    
}
