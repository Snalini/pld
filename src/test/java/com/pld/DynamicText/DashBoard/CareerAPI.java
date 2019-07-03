package com.pld.DynamicText.DashBoard;

import java.math.BigDecimal;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CareerAPI {
	
	@Test
	public void verifyCareerAsOf()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldPCAsof";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray ja_data = jsonobj.getJSONArray("Pldpcasof");
		int length  = ja_data.length();
		for(int i=0;i<length;i++)
		{
			JSONObject json = ja_data.getJSONObject(i);
			String PyramidDate = json.getString("PYRAMID_DATE");
			System.out.println(PyramidDate);
			
		}
	}

	@Test
	public void verifyCareerTable()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldPCCareer";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray ja_data = jsonobj.getJSONArray("Pldpccareer");
		int length  = ja_data.length();
		for(int i=0;i<length;i++)
		{
			JSONObject json = ja_data.getJSONObject(i);
			BigDecimal OrganicPlacementActual = json.getBigDecimal("ORGANIC_PLACEMENT_ACTUAL");
			String OrganicPlacementGoal = json.getString("ORGANIC_PLACEMENT_GOAL");
			BigDecimal PromoRateActual = json.getBigDecimal("PROMO_RATE_ACTUAL");
			String PromoRateGoal = json.optString("PROMO_RATE_GOAL");
			BigDecimal AvgTimeInBand = json.getBigDecimal("AVG_TIB");
			int TibOutliers = json.getInt("TIB_OUTLIERS");
			
			
			System.out.println(OrganicPlacementActual);
			System.out.println(OrganicPlacementGoal);
			System.out.println(PromoRateActual);
			System.out.println(PromoRateGoal);
			System.out.println(AvgTimeInBand);
			System.out.println(TibOutliers);
		}
			
	}
}
