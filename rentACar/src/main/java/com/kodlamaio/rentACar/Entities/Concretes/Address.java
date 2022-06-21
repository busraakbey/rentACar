package com.kodlamaio.rentACar.Entities.Concretes;

import java.util.List;

import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Address {
	private int id;
	private String address;
	
	@OneToMany(mappedBy = "address")
	List<User> users ;

}
