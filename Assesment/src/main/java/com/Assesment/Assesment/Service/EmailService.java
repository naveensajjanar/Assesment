package com.Assesment.Assesment.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Assesment.Assesment.model.Vendor;

@Service
public class EmailService {
	 public void sendEmail(Vendor vendor, String message) {
	        System.out.println("Sending email to " + vendor.getEmail() + " with message: " + message);
	    }
}