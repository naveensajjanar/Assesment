package com.Assesment.Assesment.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Assesment.Assesment.Reposit.EmployeeRepository;
import com.Assesment.Assesment.Reposit.VendorRepository;
import com.Assesment.Assesment.Service.EmailService;
import com.Assesment.Assesment.model.Employee;
import com.Assesment.Assesment.model.Vendor;


	@RestController
	@CrossOrigin
//	@RequestMapping("/api/admin")
	public class EmpController {
	    @Autowired
	    private EmployeeRepository employeeRepository;
	    @Autowired
	    private VendorRepository vendorRepository;
	    @Autowired
	    private EmailService emailService;

	    @PostMapping("/addemployees")
	    public Employee createEmployee(@RequestBody Employee employee) {
	        return employeeRepository.save(employee);
	    }

	    @PostMapping("/addvendors")
	    public Vendor createVendor(@RequestBody Vendor vendor) {
	        return vendorRepository.save(vendor);
	    }

	    @PostMapping("/send-email")
	    public void sendEmail(@RequestBody List<Vendor> vendors) {
	        for (Vendor vendor : vendors) {
	            String message = "Sending payments to vendor " + vendor.getName() + " at upi " + vendor.getUpi();
	            emailService.sendEmail(vendor, message);
	        }
	    }

	    @GetMapping("/emails")
	    public List<String> getSentEmails() {
	       
	        return new ArrayList<>();
	    }

	    @GetMapping("/employees")
	    public List<Employee> getEmployees() {
	        return employeeRepository.findAll();
	    }

	    @GetMapping("/vendors")
	    public List<Vendor> getVendors() {
	        return vendorRepository.findAll();
	    }
	}