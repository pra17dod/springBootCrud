package com.vendor.springBootCrud.controller;

import java.util.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.vendor.springBootCrud.bean.*;
import com.vendor.springBootCrud.service.*;

@RestController
public class VendorController {
    @Autowired
	private VendorService vendorService;

	@RequestMapping("/vendors")
	public List<Vendor> getAllVendors()
	{
		return vendorService.getAllVendors();
	}

	@RequestMapping(method = RequestMethod.POST, value="/vendors")
	public void addVendor(@RequestBody Vendor vendor)
	{
		vendorService.addVendor(vendor);
	}

	@RequestMapping(method = RequestMethod.PUT, value="/vendors/{id}")
	public void updateVendor(@PathVariable String id, @RequestBody Vendor vendor)
	{
		vendorService.updateVendor(id, vendor);
	}
	@RequestMapping(method = RequestMethod.DELETE, value="/vendors/{id}")
	public void DeleteVendor(@PathVariable String id)
	{
		vendorService.deleteVendor(id);
	}



}
