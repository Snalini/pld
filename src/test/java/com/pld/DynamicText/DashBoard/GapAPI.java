package com.pld.DynamicText.DashBoard;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GapAPI {
	
	@Test
	public void verifyGapAsOf()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldGapAsof";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray ja_data = jsonobj.getJSONArray("Pldgapasof");
		int length  = ja_data.length();
		for(int i=0;i<length;i++)
		{
			JSONObject json = ja_data.getJSONObject(i);
			String GapDate = json.getString("GAP_DATE");
			System.out.println(GapDate);
			
		}
	}
	
	@Test
	public void verifyGapChart()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldGap";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray ja_data = jsonobj.getJSONArray("Pldgap");
		int length  = ja_data.length();
		for(int i=0;i<length;i++)
		{
			JSONObject json = ja_data.getJSONObject(i);
			String Segment = json.getString("SEGMENT");
			int Shortage = json.getInt("SHORTAGE");
			int Excess = json.getInt("EXCESS");
			int NetGap = json.getInt("NET_GAP");
			int Sort = json.getInt("SORT");
			System.out.println(Segment);
			System.out.println(Shortage);
			System.out.println(Excess);
			System.out.println(NetGap);
			System.out.println(Sort);
			
			
			
		}
	}

}
