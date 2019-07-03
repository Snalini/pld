package com.pld.DynamicText.Expansion;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GapSupplyAndDemandAPI {
	
	@Test
	public void verifySupplyAndDemand()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldGapSupplyDemand";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray ja_data = jsonobj.getJSONArray("Pldgapsupplydemand");
		int length  = ja_data.length();
		for(int i=0;i<length;i++)
		{
			JSONObject json = ja_data.getJSONObject(i);
			String Month_Date = json.getString("MONTH_DT");
			int RollOffs_Bench = json.getInt("SUP_RB");
			int ANOBs = json.getInt("SUP_ANOBS");
			int Depart = json.getInt("SUP_DEPART");
			int Total_Qty = json.getInt("SUPP_TOT_QTY");
			int Dem_Comm = json.getInt("DEM_COMM");
			int Dem_Oppty = json.getInt("DEM_OPPTY");
			int Dem_Other = json.getInt("DEM_OTHER");
			int Dem_Tot = json.getInt("DEM_TOT");
			
			System.out.println(Month_Date);
			System.out.println(RollOffs_Bench);
			System.out.println(ANOBs);
			System.out.println(Depart);
			System.out.println(Total_Qty);
			System.out.println(Dem_Comm);
			System.out.println(Dem_Oppty);
			System.out.println(Dem_Other);
			System.out.println(Dem_Tot);
		}
			
	}
	
	@Test
	public void verifyMonthsColumnheader()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldGapColumnHeaders";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray ja_data = jsonobj.getJSONArray("Pldcolumnheaders");
		int length  = ja_data.length();
		for(int i=0;i<length;i++)
		{
			JSONObject json = ja_data.getJSONObject(i);
			String Month1 = json.getString("MO1");
			String Month2 = json.getString("MO2");
			String Month3 = json.getString("MO3");
			System.out.println(Month1);
			System.out.println(Month2);
			System.out.println(Month3);
		}
	}

	@Test
	public void verifyMonthsColumnheader2()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldGapColumnHeaders";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray ja_data = jsonobj.getJSONArray("Pldcolumnheaders");
		int length  = ja_data.length();
		for(int i=0;i<length;i++)
		{
			JSONObject json = ja_data.getJSONObject(i);
			String Month1 = json.getString("MO1");
			String Month2 = json.getString("MO2");
			String Month3 = json.getString("MO3");
			System.out.println(Month1);
			System.out.println(Month2);
			System.out.println(Month3);
		}
	}
	
	@Test
	public void verifyTopExcesses()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldGapExcesses";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray jarray = jsonobj.getJSONArray("Pldgapexcesses");
		int length =jarray.length();
		for(int i=0;i<length;i++)
		{
			JSONObject obj = jarray.getJSONObject(i);
			if(obj.has("JRSS"))
			{
			JSONObject jrss = obj.getJSONObject("JRSS");
			String label = jrss.getString("label");
			System.out.println(label);
			
			JSONArray values = jrss.getJSONArray("values");
			int length2 = values.length();
			for(int j=0;j<length2;j++)
			{
				JSONObject obj2 = values.getJSONObject(j);
				String desc = obj2.getString("DESC");
				int Tot_HC = obj2.getInt("TOT_HC");
				int Sub_HC = obj2.getInt("SUBK_HC");
				int Current_gap = obj2.getInt("CURR_GAP");
				int MO0 = obj2.getInt("MO0");
				int MO1 = obj2.getInt("MO1");
				int MO2 = obj2.getInt("MO2");
				int IND = obj2.optInt("IND");
				System.out.println(desc);
				System.out.println(Tot_HC);
				System.out.println(Sub_HC);
				System.out.println(Current_gap);
				System.out.println(MO0);
				System.out.println(MO1);
				System.out.println(MO2);
				System.out.println(IND);
			}
			
		}
			
			if(obj.has("CAP_GRP"))
			{
			JSONObject Cap_group = obj.getJSONObject("CAP_GRP");
			String label = Cap_group.getString("label");
			System.out.println(label);
			
			JSONArray values = Cap_group.getJSONArray("values");
			int length3 = values.length();
			for(int k=0;k<length3;k++)
			{
				JSONObject obj3 = values.getJSONObject(k);
				String desc = obj3.getString("DESC");
				int Tot_HC = obj3.getInt("TOT_HC");
				int Sub_HC = obj3.getInt("SUBK_HC");
				int Current_gap = obj3.getInt("CURR_GAP");
				int MO0 = obj3.getInt("MO0");
				int MO1 = obj3.getInt("MO1");
				int MO2 = obj3.getInt("MO2");
				int IND = obj3.optInt("IND");
				System.out.println(desc);
				System.out.println(Tot_HC);
				System.out.println(Sub_HC);
				System.out.println(Current_gap);
				System.out.println(MO0);
				System.out.println(MO1);
				System.out.println(MO2);
				System.out.println(IND);
			}
			
		}
			
			if(obj.has("PRAC_GRP"))
			{
			JSONObject Practice_group = obj.getJSONObject("PRAC_GRP");
			String label = Practice_group.getString("label");
			System.out.println(label);
			
			JSONArray values = Practice_group.getJSONArray("values");
			int length4 = values.length();
			for(int m=0;m<length4;m++)
			{
				JSONObject obj4 = values.getJSONObject(m);
				String desc = obj4.getString("DESC");
				int Tot_HC = obj4.getInt("TOT_HC");
				int Sub_HC = obj4.getInt("SUBK_HC");
				int Current_gap = obj4.getInt("CURR_GAP");
				int MO0 = obj4.getInt("MO0");
				int MO1 = obj4.getInt("MO1");
				int MO2 = obj4.getInt("MO2");
				int IND = obj4.optInt("IND");
				System.out.println(desc);
				System.out.println(Tot_HC);
				System.out.println(Sub_HC);
				System.out.println(Current_gap);
				System.out.println(MO0);
				System.out.println(MO1);
				System.out.println(MO2);
				System.out.println(IND);
			}
			
		}
		}
	}
	
	@Test
	public void verifyTopShortageTable()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldGapShortages";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray jarray = jsonobj.getJSONArray("PldGapShortages");
		int length =jarray.length();
		for(int i=0;i<length;i++)
		{
			JSONObject obj = jarray.getJSONObject(i);
			if(obj.has("JRSS"))
			{
			JSONObject jrss = obj.getJSONObject("JRSS");
			String label = jrss.getString("label");
			System.out.println(label);
			
			JSONArray values = jrss.getJSONArray("values");
			int length2 = values.length();
			for(int j=0;j<length2;j++)
			{
				JSONObject obj2 = values.getJSONObject(j);
				String desc = obj2.getString("DESC");
				int Tot_HC = obj2.getInt("TOT_HC");
				int Sub_HC = obj2.getInt("SUBK_HC");
				int Current_gap = obj2.getInt("CURR_GAP");
				int MO0 = obj2.getInt("MO0");
				int MO1 = obj2.getInt("MO1");
				int MO2 = obj2.getInt("MO2");
				int IND = obj2.optInt("IND");
				System.out.println(desc);
				System.out.println(Tot_HC);
				System.out.println(Sub_HC);
				System.out.println(Current_gap);
				System.out.println(MO0);
				System.out.println(MO1);
				System.out.println(MO2);
				System.out.println(IND);
			}
			
		}
			
			if(obj.has("CAP_GRP"))
			{
			JSONObject Cap_group = obj.getJSONObject("CAP_GRP");
			String label = Cap_group.getString("label");
			System.out.println(label);
			
			JSONArray values = Cap_group.getJSONArray("values");
			int length3 = values.length();
			for(int k=0;k<length3;k++)
			{
				JSONObject obj3 = values.getJSONObject(k);
				String desc = obj3.getString("DESC");
				int Tot_HC = obj3.getInt("TOT_HC");
				int Sub_HC = obj3.getInt("SUBK_HC");
				int Current_gap = obj3.getInt("CURR_GAP");
				int MO0 = obj3.getInt("MO0");
				int MO1 = obj3.getInt("MO1");
				int MO2 = obj3.getInt("MO2");
				int IND = obj3.optInt("IND");
				System.out.println(desc);
				System.out.println(Tot_HC);
				System.out.println(Sub_HC);
				System.out.println(Current_gap);
				System.out.println(MO0);
				System.out.println(MO1);
				System.out.println(MO2);
				System.out.println(IND);
			}
			
		}
			
			if(obj.has("PRAC_GRP"))
			{
			JSONObject Practice_group = obj.getJSONObject("PRAC_GRP");
			String label = Practice_group.getString("label");
			System.out.println(label);
			
			JSONArray values = Practice_group.getJSONArray("values");
			int length4 = values.length();
			for(int m=0;m<length4;m++)
			{
				JSONObject obj4 = values.getJSONObject(m);
				String desc = obj4.getString("DESC");
				int Tot_HC = obj4.getInt("TOT_HC");
				int Sub_HC = obj4.getInt("SUBK_HC");
				int Current_gap = obj4.getInt("CURR_GAP");
				int MO0 = obj4.getInt("MO0");
				int MO1 = obj4.getInt("MO1");
				int MO2 = obj4.getInt("MO2");
				int IND = obj4.optInt("IND");
				System.out.println(desc);
				System.out.println(Tot_HC);
				System.out.println(Sub_HC);
				System.out.println(Current_gap);
				System.out.println(MO0);
				System.out.println(MO1);
				System.out.println(MO2);
				System.out.println(IND);
			}
			
		}
		}
	}

}
