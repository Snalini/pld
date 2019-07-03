package com.pld.DynamicText.DashBoard;

import java.math.BigDecimal;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BenchAsOfAPI {
	
	@Test
	public void verifyBenchAsOF()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldBenchAsof";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray ja_data = jsonobj.getJSONArray("Pldbenchasof");
		int length  = ja_data.length();
		for(int i=0;i<length;i++)
		{
			JSONObject json = ja_data.getJSONObject(i);
			String Benchdate = json.getString("BENCH_DATE");
			System.out.println("Bech Date asOf-->"+Benchdate);
		}
	}
	
	@Test
	public void verifyBenchTable()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldBenchTable";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray ja_data = jsonobj.getJSONArray("Pldbenchtable");
		int length  = ja_data.length();
		for(int i=0;i<length;i++)
		{
			JSONObject json = ja_data.getJSONObject(i);
			String Name = json.getString("name");
			BigDecimal HC = json.getBigDecimal("HC");
			BigDecimal Tot = json.getBigDecimal("TOT");
			int MTM = json.optInt("MTM");
			//String arrow = json.getString("arrow");
			//String color = json.getString("color");
			
			System.out.println("name--> "+Name);
			System.out.println("HC-->"+HC);
			System.out.println("TOT-->"+Tot);
			System.out.println("MTM-->"+MTM);
			//System.out.println(arrow);
			//System.out.println(color);
			
		}
	}

	@Test
	public void verifyBenchMixChart()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldBenchChart";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray ja_data = jsonobj.getJSONArray("Pldbenchchart");
		int length  = ja_data.length();
		for(int i=0;i<length;i++)
		{
			JSONObject json = ja_data.getJSONObject(i);
			BigDecimal SkillsExcessperc = json.getBigDecimal("SKILLS_EXCESS_PERC");
			int SkillsShortagePerc = json.getInt("SKILLS_SHORTAGE_PERC");
			BigDecimal CriticalSkillsExcessPerc = json.getBigDecimal("CRIT_SKILLS_EXCESS_PERC");
			
			System.out.println("SkillsExcessperc -->"+SkillsExcessperc);
			System.out.println("SkillsShortagePerc-->"+SkillsShortagePerc);
			System.out.println("CriticalSkillsExcessPerc -->"+CriticalSkillsExcessPerc);
			
		}
		
			
	}
}
