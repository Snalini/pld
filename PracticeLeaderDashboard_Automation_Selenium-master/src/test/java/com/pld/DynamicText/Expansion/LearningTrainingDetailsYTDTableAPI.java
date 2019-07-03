package com.pld.DynamicText.Expansion;

import java.math.BigDecimal;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LearningTrainingDetailsYTDTableAPI {
	
	@Test
	public void verifyTrainingDetailsYTDTable()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldTrainingThemes";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray jarray = jsonobj.getJSONArray("Pldtrainingthemes");
		int length = jarray.length();
		for(int i=0;i<length;i++)
		{
			JSONObject obj = jarray.getJSONObject(i);
			if(obj.has("TABLE_1"))
			{
			JSONObject table1 = obj.getJSONObject("TABLE_1");
			String label = table1.getString("label");
			System.out.println(label);
			
			JSONArray jarray2 = table1.getJSONArray("values");
			int length2 = jarray2.length();
			for(int j=0;j<length2;j++)
			{
				JSONObject obj2 = jarray2.getJSONObject(j);
				String Desc = obj2.getString("DESC");
				int uniqueparticipants = obj2.getInt("UNIQUE_PARTICIPANTS");
				BigDecimal StudentDays = obj2.getBigDecimal("STUDENT_DAYS");
				BigDecimal PENET_PERC = obj2.getBigDecimal("PENET_PERC");
				BigDecimal Avg_days = obj2.getBigDecimal("AVG_DAYS");
				int sort = obj2.getInt("SORT");
				System.out.println(Desc);
				System.out.println(uniqueparticipants);
				System.out.println(StudentDays);
				System.out.println(PENET_PERC);
				System.out.println(Avg_days);
				System.out.println(sort);
			}
			}
			
			if(obj.has("TABLE_2"))
			{
			JSONObject table2 = obj.getJSONObject("TABLE_2");
			String label = table2.getString("label");
			System.out.println(label);
			
			JSONArray jarray3 = table2.getJSONArray("values");
			int length3 = jarray3.length();
			for(int k=0;k<length3;k++)
			{
				JSONObject obj3 = jarray3.getJSONObject(k);
				String Desc = obj3.getString("DESC");
				int uniqueparticipants = obj3.getInt("UNIQUE_PARTICIPANTS");
				BigDecimal StudentDays = obj3.getBigDecimal("STUDENT_DAYS");
				BigDecimal PENET_PERC = obj3.getBigDecimal("PENET_PERC");
				BigDecimal Avg_days = obj3.getBigDecimal("AVG_DAYS");
				int sort = obj3.getInt("SORT");
				System.out.println(Desc);
				System.out.println(uniqueparticipants);
				System.out.println(StudentDays);
				System.out.println(PENET_PERC);
				System.out.println(Avg_days);
				System.out.println(sort);
			}
			}
			
			if(obj.has("TABLE_3"))
			{
			JSONObject table3 = obj.getJSONObject("TABLE_3");
			String label = table3.getString("label");
			System.out.println(label);
			
			JSONArray jarray4 = table3.getJSONArray("values");
			int length4 = jarray4.length();
			for(int m=0;m<length4;m++)
			{
				JSONObject obj4 = jarray4.getJSONObject(m);
				String Desc = obj4.getString("DESC");
				int uniqueparticipants = obj4.getInt("UNIQUE_PARTICIPANTS");
				BigDecimal StudentDays = obj4.getBigDecimal("STUDENT_DAYS");
				BigDecimal PENET_PERC = obj4.getBigDecimal("PENET_PERC");
				BigDecimal Avg_days = obj4.getBigDecimal("AVG_DAYS");
				int sort = obj4.getInt("SORT");
				System.out.println(Desc);
				System.out.println(uniqueparticipants);
				System.out.println(StudentDays);
				System.out.println(PENET_PERC);
				System.out.println(Avg_days);
				System.out.println(sort);
			}
			}
		}
		
	}

	@Test
	public void verifyStudentYTD()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldTrainingStudentDays";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray ja_data = jsonobj.getJSONArray("Pldtrainingstudentdays");
		int length  = ja_data.length();
		for(int i=0;i<length;i++)
		{
			JSONObject json = ja_data.getJSONObject(i);
			String Learning_Type = json.getString("LEARNING_TYPE");
			BigDecimal H1 = json.getBigDecimal("H1");
			BigDecimal total = json.getBigDecimal("TOTAL");
			int sort = json.getInt("SORT");
			
			System.out.println(Learning_Type);
			System.out.println(H1);
			System.out.println(total);
			System.out.println(sort);
			
			
			
		}
	}
	
	@Test
	public void verifyPrescribedCoreCapabilitylearning()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldTrainingCapabilityLearning";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray ja_data = jsonobj.getJSONArray("Pldtrainingcapabilitylearning");
		int length  = ja_data.length();
		for(int i=0;i<length;i++)
		{
			JSONObject json = ja_data.getJSONObject(i);
			String Band = json.getString("BAND");
			BigDecimal Penet_percent = json.getBigDecimal("PENET_PERC");
			BigDecimal YTY = json.getBigDecimal("YTY");
			int sort = json.getInt("SORT");
			
			System.out.println(Band);
			System.out.println(Penet_percent);
			System.out.println(YTY);
			System.out.println(sort);
			
			
			
		}
	}
}
