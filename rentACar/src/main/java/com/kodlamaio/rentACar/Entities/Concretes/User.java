package com.kodlamaio.rentACar.Entities.Concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "birth_year")
	private Integer birthYear;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "tc_No")
	private String tcNo;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
//	@OneToMany(mappedBy = "userId")
//	private List<Rental> rentals;
	
	
	

}
