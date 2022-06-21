package com.kodlamaio.rentACar.Business.Responces.rentalDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetAllRentalDetailResponse {
	private int id;
	private double totalPrice;
	private int rentalId;

}
