package com.pld.DynamicText.DashBoard;

import java.math.BigDecimal;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LearningAPI {
	
	@Test
	public void verifyLearningAsOf()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldTrainingAsof";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray ja_data = jsonobj.getJSONArray("Pldtrainingasof");
		int length  = ja_data.length();
		for(int i=0;i<length;i++)
		{
			JSONObject json = ja_data.getJSONObject(i);
			String TrainingDate = json.getString("TRAINING_DATE");
			System.out.println(TrainingDate);
			
		}
	}
	
	@Test
	public void verifyTrainingDays()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldTrainingTypes";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray ja_data = jsonobj.getJSONArray("Pldtrainingtypes");
		int length  = ja_data.length();
		for(int i=0;i<length;i++)
		{
			JSONObject json = ja_data.getJSONObject(i);
			String Reason = json.getString("REASON");
			BigDecimal Loss_Perc = json.getBigDecimal("LOSS_PERC");
			int Sort = json.getInt("SORT");
			System.out.println(Reason);
			System.out.println(Loss_Perc);
			System.out.println(Sort);
			
			
		}
	}
	
	@Test
	public void verifyThinkFourty()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldTrainingThinkForty";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray ja_data = jsonobj.getJSONArray("Pldtrainingthinkforty");
		int length  = ja_data.length();
		for(int i=0;i<length;i++)
		{
			JSONObject json = ja_data.getJSONObject(i);
			String Reason = json.getString("REASON");
			BigDecimal Loss_Perc = json.getBigDecimal("LOSS_PERC");
			int LossSort = json.getInt("LOSS_SORT");
			System.out.println(Reason);
			System.out.println(Loss_Perc);
			System.out.println(LossSort);
		}
	}
	
	@Test
	public void verifyDaysOrpersonByDeliveryType()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldTrainingDeliveryType";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray ja_data = jsonobj.getJSONArray("Pldtrainingdeliverytype");
		int length  = ja_data.length();
		for(int i=0;i<length;i++)
		{
			JSONObject json = ja_data.getJSONObject(i);
			int Year = json.getInt("YEAR");
			BigDecimal ClassCount = json.getBigDecimal("CLASS_COUNT");
			BigDecimal VirtualCount = json.getBigDecimal("VIRTUAL_COUNT");
			BigDecimal e_LearningCount = json.getBigDecimal("ELEARNING_COUNT");
			BigDecimal SelfReportedCount = json.getBigDecimal("SELF_REPORTED_COUNT");
			BigDecimal Total = json.getBigDecimal("TOTAL");
			System.out.println(Year);
			System.out.println(ClassCount);
			System.out.println(VirtualCount);
			System.out.println(e_LearningCount);
			System.out.println(SelfReportedCount);
			System.out.println(Total);
		}
	}

}
