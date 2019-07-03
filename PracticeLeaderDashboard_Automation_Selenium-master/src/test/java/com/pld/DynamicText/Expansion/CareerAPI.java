package com.pld.DynamicText.Expansion;

import java.math.BigDecimal;

import org.apache.poi.hpsf.Decimal;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CareerAPI {
	
	@Test
	public void verifyMonthlyTrendChart()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldPCMonthlyTrend";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray ja_data = jsonobj.getJSONArray("Pldpcmonthlytrend");
		int length  = ja_data.length();
		for(int i=0;i<length;i++)
		{
			JSONObject json = ja_data.getJSONObject(i);
			
			String Month = json.getString("Month");
			Double Band_Avg = json.optDouble("BandAvg");
			String Color = json.getString("color");
			String current = json.getString("Current");
			
			System.out.println(Month);
			System.out.println(Band_Avg);
			System.out.println(Color);
			System.out.println(current);
			
			JSONArray jarray = json.getJSONArray("segments");
			int length2 = jarray.length();
			for(int j=0;j<length2;j++)
			{
				JSONObject obj = jarray.getJSONObject(j);
				String range = obj.optString("RANGE");
				String color = obj.optString("COLOR");
				int avg_hc = obj.optInt("AVGHC");
				int Band_Sort = obj.optInt("BAND_SORT");
				System.out.println(range);
				System.out.println(color);
				System.out.println(avg_hc);
				System.out.println(Band_Sort);
				
			}
			
			
			
		}
	}
	
	@Test
	public void verifyAddsAndLossesChart()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldPCQuarterlyAddsLosses";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray ja_data = jsonobj.getJSONArray("Pldpcquarterlyaddslosses");
		int length  = ja_data.length();
		for(int i=0;i<length;i++)
		{
			JSONObject json = ja_data.getJSONObject(i);
			String Band = json.getString("BAND");
			int net = json.getInt("NET");
			
			System.out.println(Band);
			System.out.println(net);
			
			JSONArray jarray = json.getJSONArray("ALTs");
			int length2 = jarray.length();
			for(int j=0;j<length2;j++)
			{
				JSONObject obj = jarray.getJSONObject(j);
				String category = obj.getString("CATEGORY");
				String color = obj.getString("COLOR");
				int count = obj.optInt("COUNT");
				
				System.out.println(category);
				System.out.println(color);
				System.out.println(count);
				
			}
			
			
		}
	}
	
	@Test
	public void verifyAverageTimeinBand()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldPCAvgTimeInBand";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray ja_data = jsonobj.getJSONArray("Pldpcavgtimeinband");
		int length  = ja_data.length();
		for(int i=0;i<length;i++)
		{
			JSONObject json = ja_data.getJSONObject(i);
			String Band = json.getString("BAND");
			BigDecimal AvgTimeInband = json.getBigDecimal("AVGTIB");
			int guideline = json.optInt("GUIDELINE");
			int band_outliers = json.optInt("BAND_OUTLIERS");
			System.out.println(Band);
			System.out.println(AvgTimeInband);
			System.out.println(guideline);
			System.out.println(band_outliers);
			
			
			
			
		}
	}

}
