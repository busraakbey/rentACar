package com.kodlamaio.rentACar.Business.Concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlamaio.rentACar.Business.Abstracts.AdditionalServiceService;
import com.kodlamaio.rentACar.Business.Requests.additionalService.CreateAdditionalServiceRequest;
import com.kodlamaio.rentACar.Business.Requests.additionalService.DeleteAdditionalServiceRequest;
import com.kodlamaio.rentACar.Business.Requests.additionalService.UpdateAdditionalServiceRequest;
import com.kodlamaio.rentACar.Business.Responces.additionalService.GetAdditionalServiceResponse;
import com.kodlamaio.rentACar.Business.Responces.additionalService.GetAllAdditionalServiceResponse;
import com.kodlamaio.rentACar.Core.Utilities.Results.DataResult;
import com.kodlamaio.rentACar.Core.Utilities.Results.Result;
import com.kodlamaio.rentACar.Core.Utilities.Results.SuccessResult;
import com.kodlamaio.rentACar.Core.Utilities.mapping.ModelMapperService;
import com.kodlamaio.rentACar.DataAccess.Abstracts.AdditionalItemRepository;
import com.kodlamaio.rentACar.DataAccess.Abstracts.AdditionalServiceRepository;
import com.kodlamaio.rentACar.Entities.Concretes.AdditionalItem;
import com.kodlamaio.rentACar.Entities.Concretes.AdditionalService;

@Service
public class AdditionalServiceManager implements AdditionalServiceService {
	@Autowired
	private AdditionalServiceRepository additionalServiceRepository;
	@Autowired
	private ModelMapperService modelMapperService;
	@Autowired
	private AdditionalItemRepository additionalItemRepository;
	
	

	@Override
	public Result add(CreateAdditionalServiceRequest createAdditionalServiceRequest) {
		AdditionalService additionalService = this.modelMapperService.forRequest().map(createAdditionalServiceRequest, AdditionalService.class);
		AdditionalItem additionalItem = additionalItemRepository.findByName(createAdditionalServiceRequest.getAdditionalItemId()).get();
		double price = additionalItem.getPrice();
		int day = additionalService.getDay();
		additionalItem.setTotalPrice(price*day);
		this.additionalServiceRepository.save(additionalService);
		return new SuccessResult()("id'li ek özelllik başarıyla eklenmiştir.");
	}

	@Override
	public Result delete(DeleteAdditionalServiceRequest deleteAdditionalServiceRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update(UpdateAdditionalServiceRequest updateAdditionalServiceRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<GetAllAdditionalServiceResponse>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<AdditionalService> getById(GetAdditionalServiceResponse getAdditionalServiceResponse) {
		// TODO Auto-generated method stub
		return null;
	}

}
