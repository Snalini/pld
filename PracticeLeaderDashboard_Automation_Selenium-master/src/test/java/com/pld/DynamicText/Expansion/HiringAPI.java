package com.pld.DynamicText.Expansion;

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
	public void verifyKeyStaticsTable()
	{
		RestAssured.baseURI = "http://bldbz173018.bld.dst.ibm.com:9080/api/pldHiringKeyStatistics";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray ja_data = jsonobj.getJSONArray("Pldhiringkeystatistics");
		int length  = ja_data.length();
		for(int i=0;i<length;i++)
		{
			JSONObject json = ja_data.getJSONObject(i);
			String Band = json.getString("BAND");
			BigDecimal Accepts = json.getBigDecimal("ACCEPTS");
			BigDecimal Avg_to_Accept = json.getBigDecimal("AVG_TO_ACCEPT");
			BigDecimal Avg_to_Onboard = json.getBigDecimal("AVG_TO_ONBOARD");
			String females = json.optString("FEMALES");
			int sort = json.getInt("SORT");
			
			System.out.println(Band);
			System.out.println(Accepts);
			System.out.println(Avg_to_Accept);
			System.out.println(Avg_to_Onboard);
			System.out.println(females);
			System.out.println(sort);
			
			
			
		}
	}
	
	@Test
	public void verifyRecentJoiners()
	{
		RestAssured.baseURI = "http://bldbz173018.bld.dst.ibm.com:9080/api/pldRecentJoinersList";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray jarray = jsonobj.getJSONArray("Pldrecentjoinerslist");
		int length = jarray.length();
		for(int i=0;i<length;i++)
		{
			JSONObject obj = jarray.getJSONObject(i);
			JSONObject joiners_data = obj.getJSONObject("joinersData");
			JSONArray jarray2 = joiners_data.getJSONArray("Pldrecentjoinerslist");
			int length2 = jarray2.length();
			for(int j=0;j<length2;j++)
			{
				JSONObject obj2 = jarray2.getJSONObject(j);
				String name = obj2.getString("NAME");
				String band = obj2.getString("BAND");
				String email = obj2.getString("EMAIL");
				String start_date = obj2.getString("START_DATE");
				String location = obj2.getString("LOCATION");
				System.out.println(name);
				System.out.println(band);
				System.out.println(email);
				System.out.println(start_date);
				System.out.println(location);
			}
			
		}
	}
	@Test
	public void verifyHiresYTD_ColumnBy()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/Menu/columnHiresYtd-by/MenuItem/?filter[fields][label]=true&filter[fields][value]=true&filter[order]=menuItemId/";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONArray jsonarray  = new JSONArray(responsebody);
		for(int i=0;i<jsonarray.length();i++)
		{
			JSONObject jsonobject  = jsonarray.getJSONObject(i);
			String value = jsonobject.getString("value");
			//String menucd = jsonobject.getString("menuCd");
			//int menuitemid = jsonobject.getInt("menuItemId");
			String label = jsonobject.getString("label");
			//int id = jsonobject.getInt("id");
			
			System.out.println(value);
			//System.out.println(menucd);
			//System.out.println(menuitemid);
			System.out.println(label);
			//System.out.println(id);
			
			
		}
	}
	
	@Test
	public void verifyHiresYTD_RowBy()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/Menu/rowHiresYtd-by/MenuItem/?filter[fields][label]=true&filter[fields][value]=true&filter[order]=menuItemId/";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONArray jsonarray  = new JSONArray(responsebody);
		for(int i=0;i<jsonarray.length();i++)
		{
			JSONObject jsonobject  = jsonarray.getJSONObject(i);
			String value = jsonobject.getString("value");
			//String menucd = jsonobject.getString("menuCd");
			//int menuitemid = jsonobject.getInt("menuItemId");
			String label = jsonobject.getString("label");
			//int id = jsonobject.getInt("id");
			
			System.out.println(value);
			//System.out.println(menucd);
			//System.out.println(menuitemid);
			System.out.println(label);
			//System.out.println(id);
			
			
		}
	}
	
	@Test
	public void verifyHiringFunnelAsOF()
	{
		RestAssured.baseURI = "http://bldbz173018.bld.dst.ibm.com:9080/api/pldHiringHiringFunnelAsof";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray ja_data = jsonobj.getJSONArray("pldHiringHiringFunnelAsof");
		int length  = ja_data.length();
		for(int i=0;i<length;i++)
		{
			JSONObject json = ja_data.getJSONObject(i);
			String pipelinedate = json.getString("ACTIVE_CANDIDATE_PIPELINE_DATE");
			System.out.println(pipelinedate);
		}
	}
	
	@Test
	public void verifyHiringFunnel()
	{
		RestAssured.baseURI = "http://bldbz173018.bld.dst.ibm.com:9080/api/pldHiringHiringFunnel";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray ja_data = jsonobj.getJSONArray("pldHiringHiringFunnel");
		int length  = ja_data.length();
		for(int i=0;i<length;i++)
		{
			JSONObject json = ja_data.getJSONObject(i);
			String position = json.getString("POSITION");
			int headcount = json.getInt("HEADCOUNT");
			
			System.out.println(position);
			System.out.println(headcount);
		}
	}

}
