package com.pld.Test;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SimpleAPITest {
	@Test
	public void getDropDownValues()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/Menu/viewutilization-by/MenuItem/?filter[fields][label]=true&filter[fields][value]=true&filter[order]=menuItemld";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		JsonPath jsonPathEvaluator = response.jsonPath();
	   
		List<String> dropdownvlaue = jsonPathEvaluator.getList("label");
	    for(String label:dropdownvlaue )
	    {
		System.out.println("label recieved from Response  " +label);
	    }
	}   
	
	}
				
	



