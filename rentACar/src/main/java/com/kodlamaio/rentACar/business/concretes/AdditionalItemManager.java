package com.kodlamaio.rentACar.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.kodlamaio.rentACar.business.abstracts.AdditionalItemService;
import com.kodlamaio.rentACar.business.requests.additionalItems.CreateAdditionalItemRequest;
import com.kodlamaio.rentACar.business.requests.additionalItems.DeleteAdditionalItemRequest;
import com.kodlamaio.rentACar.business.requests.additionalItems.UpdateAdditionalItemRequest;
import com.kodlamaio.rentACar.business.responses.additionalItems.GetAdditionalItemResponse;
import com.kodlamaio.rentACar.business.responses.additionalItems.GetAllAdditionalItemsResponse;
import com.kodlamaio.rentACar.core.utilities.exceptions.BusinessException;
import com.kodlamaio.rentACar.core.utilities.mapping.ModelMapperService;
import com.kodlamaio.rentACar.core.utilities.results.DataResult;
import com.kodlamaio.rentACar.core.utilities.results.Result;
import com.kodlamaio.rentACar.core.utilities.results.SuccessDataResult;
import com.kodlamaio.rentACar.core.utilities.results.SuccessResult;
import com.kodlamaio.rentACar.dataAccess.abstracts.AdditionalItemRepository;
import com.kodlamaio.rentACar.entities.concretes.AdditionalItem;

public class AdditionalItemManager implements AdditionalItemService {
	private AdditionalItemRepository additionalItemRepository;
	private ModelMapperService modelMapperService;
	
	
	@Autowired
	public AdditionalItemManager(AdditionalItemRepository additionalItemRepository,
			ModelMapperService modelMapperService) {
		
		this.additionalItemRepository = additionalItemRepository;
		this.modelMapperService = modelMapperService;
	}

	
	@Override
	public Result add(CreateAdditionalItemRequest createAdditionalItemRequest) {
		checkIfAdditionalItemNameExists(createAdditionalItemRequest.getName());
		AdditionalItem additionalItem = this.modelMapperService.forRequest()
				.map(createAdditionalItemRequest, AdditionalItem.class);
		this.additionalItemRepository.save(additionalItem);
		return new SuccessResult("ADDITIONAL.ITEM.ADDED");
	
	}




	@Override
	public Result delete(DeleteAdditionalItemRequest deleteAdditionalItemRequest) {
		checkIfAdditionalItemIdExists(deleteAdditionalItemRequest.getId());
		this.additionalItemRepository.deleteById(deleteAdditionalItemRequest.getId());
		return new SuccessResult("ADDITIONAL.ITEM.DELETED");
	}

	@Override
	public Result update(UpdateAdditionalItemRequest updateAdditionalItemRequest) {
		checkIfAdditionalItemIdExists(updateAdditionalItemRequest.getId());
		AdditionalItem additionalItem = this.modelMapperService.forRequest()
				.map(updateAdditionalItemRequest, AdditionalItem.class);
		this.additionalItemRepository.save(additionalItem);
		return new SuccessResult("ADDITIONAL.ITEM.UPDATED");
	}

	@Override
	public DataResult<List<GetAllAdditionalItemsResponse>> getAll() {
		List<AdditionalItem> additionalItems = this.additionalItemRepository.findAll();
		List<GetAllAdditionalItemsResponse> response = additionalItems.stream().map(
				item -> this.modelMapperService.forResponse().map(item, GetAllAdditionalItemsResponse.class))
				.collect(Collectors.toList());
		
		return new SuccessDataResult<List<GetAllAdditionalItemsResponse>>(response,"ADDITIONAL.ITEMS.LISTED");
		
	}

	@Override
	public DataResult<GetAdditionalItemResponse> getById(int id) {
		checkIfAdditionalItemIdExists(id);
		
		AdditionalItem additionalItem = this.additionalItemRepository.findById(id);
		GetAdditionalItemResponse  response = this.modelMapperService.forResponse().map(additionalItem, GetAdditionalItemResponse.class);
		return new SuccessDataResult<GetAdditionalItemResponse>(response);
	}
	
	private void checkIfAdditionalItemIdExists(int id) {
		AdditionalItem additionaltem = this.additionalItemRepository.findById(id);
		if(additionaltem == null) {
			throw new BusinessException("THERE.IS.NOT.ADDITIONAL.ITEM");
		}
	}
	
	private void checkIfAdditionalItemNameExists(String name) {
		AdditionalItem additionaltem = this.additionalItemRepository.findByName(name);
		if(additionaltem != null) {
			throw new BusinessException("ADDITIONAL.ITEM.NAME.EXISTS");
		}
	}

}
