package com.kodlamaio.rentACar.core.adapters;

import java.rmi.RemoteException;

import com.kodlamaio.rentACar.business.requests.individualCustomers.CreateIndividualCustomerRequest;
import com.kodlamaio.rentACar.business.requests.individualCustomers.UpdateIndividualCustomerRequest;

public interface UserValidationService {
	boolean checkIfRealPerson(CreateIndividualCustomerRequest createIndividualCustomerRequest)throws NumberFormatException, RemoteException;
	boolean checkIfRealPerson(UpdateIndividualCustomerRequest updateIndividualCustomerRequest)throws NumberFormatException, RemoteException;

}
