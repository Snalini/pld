package com.pld.DynamicText.Expansion;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DemandCoverageAPI {
	
	@Test
	public void verifyDemandCoverageExpAsOf()
	{
		RestAssured.baseURI = "http://bldbz173018.bld.dst.ibm.com:9080/api/pldDemandCoverageExpAsof";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray ja_data = jsonobj.getJSONArray("Plddemandcoverageexpasof");
		int length  = ja_data.length();
		for(int i=0;i<length;i++)
		{
			JSONObject json = ja_data.getJSONObject(i);
			String Tranining_Date = json.getString("TRAINING_DATE");
			System.out.println(Tranining_Date);
		}
	}
	
	@Test
	public void verifyDemandCoverageDetailsAPI()
	{
		RestAssured.baseURI = "http://bldbz173018.bld.dst.ibm.com:9080/api/pldDemandCoverageDetails";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray ja_data = jsonobj.getJSONArray("Plddemandcoveragedetails");
		int length  = ja_data.length();
		for(int i=0;i<length;i++)
		{
			JSONObject json = ja_data.getJSONObject(i);
			int Year = json.getInt("YR");
			int Month = json.getInt("MO");
			String Month_Name = json.getString("MO_NM");
			String Current_Qtr = json.getString("CURR_QTR");
			String Current_Month = json.getString("CURR_MO");
			String Dela_type = json.getString("DEAL_TYPE");
			int Deals = json.getInt("DEALS");
			Double TCV = json.getDouble("TCV");
			
			System.out.println(Year);
			System.out.println(Month);
			System.out.println(Month_Name);
			System.out.println(Current_Qtr);
			System.out.println(Current_Month);
			System.out.println(Dela_type);
			System.out.println(Deals);
			System.out.println(TCV);
			
			
		}

	}
	
	@Test
	public void verifyOpportunityDetailsASOfAPI()
	{
		RestAssured.baseURI = "http://bldbz173018.bld.dst.ibm.com:9080/api/pldDemandCoverageExpAsof";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray ja_data = jsonobj.getJSONArray("Plddemandcoverageexpasof");
		int length  = ja_data.length();
		for(int i=0;i<length;i++)
		{
			JSONObject json = ja_data.getJSONObject(i);
			String Tranining_Date = json.getString("TRAINING_DATE");
			System.out.println(Tranining_Date);
		}
	}

	@Test
	public void verifyOpportunityDetailsViewdropdown()
	{
		RestAssured.baseURI = "http://bldbz173018.bld.dst.ibm.com:9080/api/pldOpptyDetailsViewBy";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray ja_data = jsonobj.getJSONArray("Pldopptydetailsviewby");
		int length  = ja_data.length();
		for(int i=0;i<length;i++)
		{
			JSONObject json = ja_data.getJSONObject(i);
			String View_By = json.getString("VIEW_BY");
			String ColorClass = json.getString("COLORCLASS");
			System.out.println(View_By);
			System.out.println(ColorClass);
			
		}
	}
	
	@Test
	public void verifyOpportunityDetailstableAPI()
	{
		RestAssured.baseURI = "http://bldbz173018.bld.dst.ibm.com:9080/api/pldOpptyDetails";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray ja_data = jsonobj.getJSONArray("Pldopptydetails");
		int length  = ja_data.length();
		for(int i=0;i<length;i++)
		{
			JSONObject json = ja_data.getJSONObject(i);
			String Cust_name = json.getString("CUST_NM");
			String DCSn_date = json.getString("DCSN_DT");
			String TCV = json.getString("TCV");
			String Win_Odds = json.getString("WIN_ODDS");
			String Sales_Stage= json.getString("SALES_STAGE");
			String Roadmap= json.getString("ROADMAP");
			String Start_date = json.getString("START_DT");
			String Duration = json.getString("DURATION");
			String Oppty_id = json.getString("OPPTY_ID");
			String Oppty_Name = json.getString("OPPTY_NM");
			String Email = json.getString("EMAIL");
			String Oppty_Owner = json.getString("OPPTY_OWNR");
			String Offering = json.getString("OFFERING");
			String Deal_type = json.getString("DEAL_TYPE");
			String Colorclass = json.getString("COLORCLASS");
			String open_Seat_flg = json.getString("OPEN_SEAT_FLG");
			String Staffg_plan_flag = json.getString("STAFFG_PLAN_FLG");
			
			System.out.println(Cust_name);
			System.out.println(DCSn_date);
			System.out.println(TCV);
			System.out.println(Win_Odds);
			System.out.println(Sales_Stage);
			System.out.println(Roadmap);
			System.out.println(Start_date);
			System.out.println(Duration);
			System.out.println(Oppty_id);
			System.out.println(Oppty_Name);
			System.out.println(Email);
			System.out.println(Oppty_Owner);
			System.out.println(Offering);
			System.out.println(Deal_type);
			System.out.println(Colorclass);
			System.out.println(open_Seat_flg);
			System.out.println(Staffg_plan_flag);
			
					
			
		}
	}
	
	/*@Test
	public void verifyOpportunityDetailsOopIDPopOverAPI()
	{
		RestAssured.baseURI = "http://bldbz173018.bld.dst.ibm.com:9080/api/pldOpenPositionDetails?opptny_id=8O-KE8NC0R";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
	}*/
}
