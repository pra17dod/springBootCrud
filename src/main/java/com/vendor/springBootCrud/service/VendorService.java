package com.vendor.springBootCrud.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vendor.springBootCrud.bean.*;
import com.vendor.springBootCrud.repository.*;


@Service
public class VendorService {
    @Autowired
	public VendorRepository vendorRepo;

	public List<Vendor> getAllVendors()
	{
		List<Vendor> vendors = new ArrayList<>();
		vendorRepo.findAll().forEach(vendors::add);
		return vendors;
	}

	public void addVendor(Vendor vendor) {
		vendorRepo.save(vendor);

	}

	public void updateVendor(String id, Vendor vendor) {
		vendorRepo.save(vendor);

	}

	public void deleteVendor(String id) {
		vendorRepo.deleteById(id);

	}
}
