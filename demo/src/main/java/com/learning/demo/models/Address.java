package com.learning.demo.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@Entity
public class Address {
	
	private Integer id;
	
	private String streetName;
	
	private String houseNumber;
	
	private String zipCode;

}
