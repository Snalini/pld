package com.pld.DynamicText.DashBoard;

import java.math.BigDecimal;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DemandAPI {
	
	@Test
	public void verifyDemandAsOf()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldDemandAsof/";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray ja_data = jsonobj.getJSONArray("Plddemandasof");
		int length  = ja_data.length();
		for(int i=0;i<length;i++)
		{
			JSONObject json = ja_data.getJSONObject(i);
			String DemandDate = json.getString("DEMAND_DATE");
			System.out.println(DemandDate);
		}
	}
	
	@Test
	public void verifyCoverageDelas()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldDemandCoverageDeals/";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray ja_data = jsonobj.getJSONArray("Plddemandcoveragedeals");
		int length  = ja_data.length();
		for(int i=0;i<length;i++)
		{
			JSONObject json = ja_data.getJSONObject(i);
			int TotalDeals = json.optInt("TOTAL_DEALS");
			int DealsWithPlans = json.optInt("DEALS_WITH_PLANS");
			int Coverageperc = json.optInt("COVERAGE_PERC");
			
			System.out.println(TotalDeals);
			System.out.println(DealsWithPlans);
			System.out.println(Coverageperc);
			
		}
	}
	
	@Test
	public void verifyDemandByCapapcityGroupGraph()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldDemandCapGrp";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray ja_data = jsonobj.getJSONArray("Plddemandcapgrp");
		int length  = ja_data.length();
		for(int i=0;i<length;i++)
		{
			JSONObject json = ja_data.getJSONObject(i);
			String CapacityGroup = json.getString("CAPACITY_GROUP");
			BigDecimal DemandPerc = json.getBigDecimal("DEMAND_PERC");
			String Arrow = json.optString("ARROW");
			BigDecimal Sort = json.getBigDecimal("SORT");
			//String Arrow_Color = json.getString("ARROWCOLOR");
			
			System.out.println(CapacityGroup);
			System.out.println(DemandPerc);
			System.out.println(Arrow);
			System.out.println(Sort);
			//System.out.println(Arrow_Color);
			
		}
	}
	
	@Test
	public void verifyTotal()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldDemandCapTot";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray ja_data = jsonobj.getJSONArray("Plddemandcaptot");
		int length  = ja_data.length();
		for(int i=0;i<length;i++)
		{
			JSONObject json = ja_data.getJSONObject(i);
			int HC = json.getInt("HC");
			System.out.println(HC);
		}
	}
	
	@Test
	public void verifyOpenPositionChart()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldDemandOpPositions";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject json = new JSONObject(responsebody);
		JSONArray demand_open_positions = json.getJSONArray("Plddemandoppositions");
		System.out.println(demand_open_positions);
		int length =demand_open_positions.length();
		for(int i=0;i<length;i++)
		{
			JSONObject OpenPosiitonsData = demand_open_positions.getJSONObject(i);
			String Month = OpenPosiitonsData.getString("month");
			System.out.println(Month);
			
			JSONArray Demand_Month_data = OpenPosiitonsData.getJSONArray("values");
			int length2 = Demand_Month_data.length();
			for(int j=0;j<length2;j++)
			{
				JSONObject Month_data = Demand_Month_data.getJSONObject(j);
				int head_count = Month_data.getInt("headcount");
				String category = Month_data.getString("category");
				System.out.println(head_count);
				System.out.println(category);
			}
		}
	}

}
