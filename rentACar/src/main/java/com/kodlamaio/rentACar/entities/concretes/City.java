package com.kodlamaio.rentACar.entities.concretes;

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
@Table(name = "cities")
public class City {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
//	@OneToMany(mappedBy = "city") // Bir şehrin bir çok arabası olabililr
//	private List<Car> cars;
//	
//	@OneToMany(mappedBy = "pickUpCityId")
//	private List<Rental> pickUpCityRentals;
//	
//	@OneToMany(mappedBy = "returnCityId")
//	private List<Rental> returnCityRentals;
	
}
