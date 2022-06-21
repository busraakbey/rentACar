//package com.kodlamaio.rentACar.Business.Abstracts;
//
//import java.util.List;
//
//import com.kodlamaio.rentACar.Business.Requests.rentalDetails.CreateRentalDetailRequest;
//import com.kodlamaio.rentACar.Business.Requests.rentalDetails.DeleteRentalDetailRequest;
//import com.kodlamaio.rentACar.Business.Requests.rentalDetails.UpdateRentalDetailRequest;
//import com.kodlamaio.rentACar.Business.Responces.rentalDetails.GetAllRentalDetailResponse;
//import com.kodlamaio.rentACar.Business.Responces.rentalDetails.GetRentalDetailResponse;
//import com.kodlamaio.rentACar.Core.Utilities.Results.DataResult;
//import com.kodlamaio.rentACar.Core.Utilities.Results.Result;
//import com.kodlamaio.rentACar.Entities.Concretes.RentalDetail;
//
//public interface RentalDetailService {
//	Result add(CreateRentalDetailRequest createRentalDetailRequest);
//	Result update(UpdateRentalDetailRequest updateRentalDetailRequest);
//	Result delete(DeleteRentalDetailRequest deleteRentalDetailRequest);
//	DataResult<RentalDetail> getById(GetRentalDetailResponse getRentalDetailResponse);
//	DataResult<List<GetAllRentalDetailResponse>> getAll();
//	
//
//}
