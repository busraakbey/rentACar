//package com.kodlamaio.rentACar.Business.Concretes;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.kodlamaio.rentACar.Business.Abstracts.RentalDetailService;
//import com.kodlamaio.rentACar.Business.Requests.rentalDetails.CreateRentalDetailRequest;
//import com.kodlamaio.rentACar.Business.Requests.rentalDetails.DeleteRentalDetailRequest;
//import com.kodlamaio.rentACar.Business.Requests.rentalDetails.UpdateRentalDetailRequest;
//import com.kodlamaio.rentACar.Business.Responces.rentalDetails.GetAllRentalDetailResponse;
//import com.kodlamaio.rentACar.Business.Responces.rentalDetails.GetRentalDetailResponse;
//import com.kodlamaio.rentACar.Core.Utilities.Results.DataResult;
//import com.kodlamaio.rentACar.Core.Utilities.Results.Result;
//import com.kodlamaio.rentACar.Core.Utilities.Results.SuccessDataResult;
//import com.kodlamaio.rentACar.Core.Utilities.Results.SuccessResult;
//import com.kodlamaio.rentACar.Core.Utilities.mapping.ModelMapperService;
//import com.kodlamaio.rentACar.DataAccess.Abstracts.RentalDetailRepository;
//import com.kodlamaio.rentACar.Entities.Concretes.RentalDetail;
//
//@Service
//public class RentalDetailManager implements RentalDetailService {
//	
//	@Autowired
//	private RentalDetailRepository rentalDetailRepository;
//	
//	@Autowired
//	private ModelMapperService modelMapperService;
//
//	@Override
//	public Result add(CreateRentalDetailRequest createRentalDetailRequest) {
//		RentalDetail rentalDetail = modelMapperService.forRequest().map(createRentalDetailRequest, RentalDetail.class);
//		rentalDetailRepository.save(rentalDetail);
//		return new SuccessResult("Kira detay eklendi");
//		
//		
//	}
//
//	@Override
//	public Result update(UpdateRentalDetailRequest updateRentalDetailRequest) {
//		RentalDetail rentalDetailToUpdate = modelMapperService.forRequest().map(updateRentalDetailRequest, RentalDetail.class);
//		rentalDetailRepository.save(rentalDetailToUpdate);
//		return new SuccessResult("Kira detay güncellendi");
//		
//	}
//
//	@Override
//	public Result delete(DeleteRentalDetailRequest deleteRentalDetailRequest) {
//		RentalDetail rentalDetail = modelMapperService.forRequest().map(deleteRentalDetailRequest, RentalDetail.class);
//		rentalDetailRepository.delete(rentalDetail);
//		return new SuccessResult("Kira detay silindi");
//		
//	}
//
//	@Override
//	public DataResult<RentalDetail> getById(GetRentalDetailResponse getRentalDetailResponse) {
//		RentalDetail rentalDetail = this.modelMapperService.forResponce().map(getRentalDetailResponse, RentalDetail.class);
//		rentalDetail = rentalDetailRepository.findById(getRentalDetailResponse.getId()).get();
//		return new SuccessDataResult<RentalDetail>(rentalDetail);
//		
//	}
//	
//
//	@Override
//	public DataResult<List<GetAllRentalDetailResponse>> getAll() {
//		List<RentalDetail> rentalDetails = this.rentalDetailRepository.findAll();
//		List<GetAllRentalDetailResponse> responce = rentalDetails.stream()
//				.map(item -> this.modelMapperService.forResponce()
//						.map(item, GetAllRentalDetailResponse.class)).collect(Collectors.toList());
//		return new SuccessDataResult<List<GetAllRentalDetailResponse>>(responce);
//	}
//
//}
