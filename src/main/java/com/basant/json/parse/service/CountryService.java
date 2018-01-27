package com.basant.json.parse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.basant.json.parse.dto.CountryResponse;
import com.basant.json.parse.invoker.CountryInvoker;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.JsonPath;

@Service
public class CountryService {
	@Autowired
	private CountryInvoker invoker;

	ObjectMapper mapper = new ObjectMapper();

	public Object getFormatedResponse(String jsonExpression, Class<?> classType) throws JsonProcessingException {
		CountryResponse response = invoker.getCountryInfo();
		String jsonResponse = mapper.writeValueAsString(response);
		Object countryResponse = JsonPath.parse(jsonResponse).read(jsonExpression, classType);
		return countryResponse;
	}

}
