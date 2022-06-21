//package com.kodlamaio.rentACar.Api;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.kodlamaio.rentACar.Business.Abstracts.RentalDetailService;
//import com.kodlamaio.rentACar.Business.Requests.rentalDetails.CreateRentalDetailRequest;
//import com.kodlamaio.rentACar.Business.Requests.rentalDetails.DeleteRentalDetailRequest;
//import com.kodlamaio.rentACar.Business.Requests.rentalDetails.UpdateRentalDetailRequest;
//import com.kodlamaio.rentACar.Business.Responces.rentalDetails.GetAllRentalDetailResponse;
//import com.kodlamaio.rentACar.Business.Responces.rentalDetails.GetRentalDetailResponse;
//import com.kodlamaio.rentACar.Core.Utilities.Results.DataResult;
//import com.kodlamaio.rentACar.Core.Utilities.Results.Result;
//import com.kodlamaio.rentACar.Core.Utilities.Results.SuccessResult;
//import com.kodlamaio.rentACar.Entities.Concretes.RentalDetail;
//
//@RestController
//@RequestMapping("api/rentaldetails")
//public class RentalDetailsController {
//	@Autowired
//	private RentalDetailService rentalDetailService;
//	
//	@PostMapping("/add")
//	public Result add(@RequestBody CreateRentalDetailRequest createRentalDetailRequest) {
//		var result = rentalDetailService.add(createRentalDetailRequest);
//		if(result.isSuccess()) {
//			return new SuccessResult(result.getMessage());
//				
//			} else {
//				
//				return new SuccessResult(result.getMessage());
//			}
//		}
//	
//	@PostMapping("/update")
//	public Result update(@RequestBody UpdateRentalDetailRequest updateRentalDetailRequest) {
//		rentalDetailService.update(updateRentalDetailRequest);
//		return new SuccessResult();
//	}
//	
//	@PostMapping("/delete")
//	public Result delete(@RequestBody DeleteRentalDetailRequest deleteRentalDetailRequest) {
//		rentalDetailService.delete(deleteRentalDetailRequest);
//		return new SuccessResult();
//		
//	}
//	@GetMapping("/getbyid")
//	public DataResult<RentalDetail> getById(GetRentalDetailResponse getRentalDetailResponse){
//		return this.rentalDetailService.getById(getRentalDetailResponse);
//	}
//	@GetMapping("/getall")
//	public DataResult<List<GetAllRentalDetailResponse>> getAll(){
//		return this.rentalDetailService.getAll();
//		
//	}
//	
//
//
//}
