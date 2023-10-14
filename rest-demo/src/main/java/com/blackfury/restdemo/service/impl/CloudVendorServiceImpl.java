package com.blackfury.restdemo.service.impl;

import com.blackfury.restdemo.model.CloudVendor;
import com.blackfury.restdemo.repository.CloudVendorRepository;
import com.blackfury.restdemo.service.CloudVendorService;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {
    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

   

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        // More Business Logic 
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        // More Business Logic 
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        // More Business Logic 
        cloudVendorRepository.deleteById(cloudVendorId);
        return "Success";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
        // More Business Logic 
        return cloudVendorRepository.findById(cloudVendorId).get();
        
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        // More Business Logic 
        return cloudVendorRepository.findAll();
    }
    
}
