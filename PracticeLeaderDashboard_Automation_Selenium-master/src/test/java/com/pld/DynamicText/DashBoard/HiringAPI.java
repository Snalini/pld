package com.pld.DynamicText.DashBoard;

import java.math.BigDecimal;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class HiringAPI {
	
	@Test
	public void verifyHiringAsOf()
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
	public void verifyHiringTable()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldPCHiring";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray ja_data = jsonobj.getJSONArray("Pldpchiring");
		int length  = ja_data.length();
		for(int i=0;i<length;i++)
		{
			JSONObject json = ja_data.getJSONObject(i);
			int YtdHiresActual = json.getInt("YTD_HIRES_ACTUAL");
			int ANOBsActual = json.getInt("ANOBS_ACTUAL");
			int OpenReqsActual = json.getInt("OPEN_REQS_ACTUAL");
			BigDecimal EPHActual = json.getBigDecimal("EPH_ACTUAL");
			String YtdHiresAvgBnd = json.optString("YTD_HIRES_AVG_BND");
			String ANOBsAvgBnd = json.optString("ANOBS_AVG_BND");
			String OpenReqsAvgBnd = json.optString("OPEN_REQS_AVG_BND");
			String EphAvgBnd = json.optString("EPH_AVG_BND");
			
			System.out.println(YtdHiresActual);
			System.out.println(ANOBsActual);
			System.out.println(OpenReqsActual);
			System.out.println(EPHActual);
			System.out.println(YtdHiresAvgBnd);
			System.out.println(ANOBsAvgBnd);
			System.out.println(OpenReqsAvgBnd);
			System.out.println(EphAvgBnd);
			
			
			
			
		}
	}

}
