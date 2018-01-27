
package com.basant.json.parse.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "Country", "Data" })
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Country {

	@JsonProperty("Country")
	private String country;
	@JsonProperty("Data")
	private Data data;

	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}

}
