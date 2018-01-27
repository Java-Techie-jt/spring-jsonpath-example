
package com.basant.json.parse.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "Capital", "mintemp", "maxtemp", "Currency" })
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Data {

	@JsonProperty("Capital")
	private String capital;
	@JsonProperty("mintemp")
	private Integer mintemp;
	@JsonProperty("maxtemp")
	private Integer maxtemp;
	@JsonProperty("Currency")
	private String currency;

	public Data() {
		super();
		// TODO Auto-generated constructor stub
	}

}
