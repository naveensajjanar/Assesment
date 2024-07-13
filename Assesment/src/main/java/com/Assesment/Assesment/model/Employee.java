package com.Assesment.Assesment.model;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;



@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
 public class Employee {

	     @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String name;
	    private String designation;
	    private double ctc;
	    @Column(unique = true)
	    private String email;
	   
	}
	

