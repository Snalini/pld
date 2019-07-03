package com.pld.DynamicText.DashBoard;

import java.math.BigDecimal;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DemandCoverageAsOf {
	
	@Test
	public void verifyDemandCoverageAsOf()
	{
		RestAssured.baseURI = "http://bldbz173018.bld.dst.ibm.com:9080/api/pldDemandCoverageAsof";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray ja_data = jsonobj.getJSONArray("Plddemandcoverageasof");
		int length  = ja_data.length();
		for(int i=0;i<length;i++)
		{
			JSONObject json = ja_data.getJSONObject(i);
			String TrainingDate = json.getString("TRAINING_DATE");
			System.out.println("Training date as of -->"+TrainingDate);
			
		}
		
	}
	
	@Test
	public void verifyDemandCoverageChart()
	{
		RestAssured.baseURI = "http://bldbz173018.bld.dst.ibm.com:9080/api/pldDemandCoverage";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray jsonarray = jsonobj.getJSONArray("Plddemandcoverage");
		//System.out.println(jsonarray);
		
		int length = jsonarray.length();
		for(int i=0;i<length;i++)
		{
			JSONObject coverage_data = jsonarray.getJSONObject(i);
			if(coverage_data.has("coverage"))
			{
				JSONObject coverage = coverage_data.getJSONObject("coverage");
				BigDecimal cover_deal = coverage.getBigDecimal("DEAL");
				BigDecimal cover_TCV = coverage.getBigDecimal("TCV");
				
				System.out.println("cover_deal -->"+cover_deal);
				System.out.println("cover_TCV -->"+cover_TCV);
				
			}
			
			/*if(coverage_data.has("deals"))
			{
				JSONObject deals = coverage_data.getJSONObject("deals");
				BigDecimal deals_NoPlan = deals.getBigDecimal("NO_PLAN");
				BigDecimal deals_witPlan = deals.getBigDecimal("WITH_PLAN");
				int deals_tot = deals.getInt("TOT");
				BigDecimal deals_noPlanReq = deals.getBigDecimal("NO_PLAN_REQD");
				System.out.println("deals_NoPlan -->"+deals_NoPlan);
				System.out.println("deals_witPlan-->"+deals_witPlan);
				System.out.println("deals_tot-->"+deals_tot);
				System.out.println("deals_noPlanReq-->"+deals_noPlanReq);
			}*/
			
			if(coverage_data.has("tcv"))
			{
				JSONObject tcv = coverage_data.getJSONObject("tcv");
				BigDecimal tcv_NoPlan = tcv.getBigDecimal("NO_PLAN");
				BigDecimal tcv_witPlan = tcv.getBigDecimal("WITH_PLAN");
				int tcv_tot = tcv.getInt("TOT");
				BigDecimal tcv_noPlanReq = tcv.getBigDecimal("NO_PLAN_REQD");
				System.out.println("tcv_NoPlan-->"+tcv_NoPlan);
				System.out.println("tcv_witPlan-->"+tcv_witPlan);
				System.out.println("tcv_tot-->"+tcv_tot);
				System.out.println("tcv_noPlanReq-->"+tcv_noPlanReq);
				
			}
			
		}
	}

}
