package com.kodlamaio.rentACar.business.abstracts;

import java.util.List;

import com.kodlamaio.rentACar.business.requests.brands.CreateBrandRequest;
import com.kodlamaio.rentACar.business.requests.brands.DeleteBrandRequest;
import com.kodlamaio.rentACar.business.requests.brands.UpdateBrandRequest;
import com.kodlamaio.rentACar.business.responses.brands.GetAllBrandsResponse;
import com.kodlamaio.rentACar.business.responses.brands.GetBrandResponse;
import com.kodlamaio.rentACar.core.utilities.results.DataResult;
import com.kodlamaio.rentACar.core.utilities.results.Result;

public interface BrandService {
	// response request pattern snırlı veriyoruz entitileri void add(Brand brand);
		// request isstek response cevap burda add(Brand brand) requesttir

		// Result hem error hemde success in base i referansların tutar
		Result add(CreateBrandRequest createBrandRequest); 
		Result delete(DeleteBrandRequest deleteBrandRequest);
		Result update(UpdateBrandRequest updateBrandRequest);

		DataResult<List<GetAllBrandsResponse>> getAll();
		DataResult<GetBrandResponse> getById(int id);

}
