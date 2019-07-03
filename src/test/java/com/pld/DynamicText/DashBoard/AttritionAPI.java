package com.pld.DynamicText.DashBoard;

import java.math.BigDecimal;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AttritionAPI {
	@Test
	public void verifyAttritionAsOF()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldAttritionAsof";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		String ja_data = jsonobj.getJSONObject("Pldattritionasof").get("ATTRITION_DATE").toString();
		System.out.println(ja_data);
	}

	@Test
	public void verifyAttritionByband()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldAttritionByBand";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray ja_data = jsonobj.getJSONArray("Pldattritionbyband");
		int length  = ja_data.length();
		for(int i=0;i<length;i++)
		{
			JSONObject json = ja_data.getJSONObject(i);
			String Band = json.getString("BAND");
			int AttrPerc = json.getInt("ATTR_PERC");
			int BandSort = json.getInt("BAND_SORT");
			System.out.println(Band);
			System.out.println(AttrPerc);
			System.out.println(BandSort);
		}
	}
	
	@Test
	public void verifyAttritionLossReason()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldAttritionLossReason";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray ja_data = jsonobj.getJSONArray("Pldattritionlossreason");
		int length  = ja_data.length();
		for(int i=0;i<length;i++)
		{
			JSONObject json = ja_data.getJSONObject(i);
			String Reason = json.getString("REASON");
			int LossPerc = json.getInt("LOSS_PERC");
			String Arrow = json.getString("ARROW");
			int LossSort = json.getInt("LOSS_SORT");
			System.out.println(Reason);
			System.out.println(LossPerc);
			System.out.println(Arrow);
			System.out.println(LossSort);
		}
	}
	
	@Test
	public void verifyAnnualizedRatesAndVoluntaryLosses()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldAttritionvolLosses_annRate";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray ja_data = jsonobj.getJSONArray("Pldattritionvollosses_annrate");
		int length  = ja_data.length();
		for(int i=0;i<length;i++)
		{
			JSONObject json = ja_data.getJSONObject(i);
			int Vol_losses = json.getInt("VOL_LOSSES");
			BigDecimal AnnualizedratePerc = json.getBigDecimal("ANNUALIZED_RATE_PERC");
			System.out.println(Vol_losses);
			System.out.println(AnnualizedratePerc);
		}
	}
}
