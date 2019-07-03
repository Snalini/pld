package com.pld.restassured;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pld.Base.PldTestBase;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Sample2May{
	
	public String responsemethod(String url)
	{
		StringBuffer response = new StringBuffer();
		try {
	
		URL url1 = new URL(url);
		HttpURLConnection conn = (HttpURLConnection) url1.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Accept", "Application/json");
		if(conn.getResponseCode()!= 200)
		{
			throw new RuntimeException("HTTP error code :"+conn.getResponseCode());
			
		}
		BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String inputLine;
		
		while((inputLine = in.readLine())!=null)
		{
			response.append(inputLine);
		
		}
		in.close();
		System.out.println("Response Body"+response.toString());
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return response.toString();
		
		
	}
	
	
	
	@Test
	public void verifyDemandClientAndSkillColor()
	{
		
		String response=responsemethod("https://pld-dev-api.w3ibm.mybluemix.net/api/pldDemandClientSkillColors");
		JSONObject jsonobj = new JSONObject(response);
		
		JSONArray ja_data = jsonobj.getJSONArray("Plddemandclientskillcolors");
		int length  = ja_data.length();
		for(int i=0;i<length;i++)
		{
			JSONObject json = ja_data.getJSONObject(i);
			//System.out.println(json);
			String cat_nm = json.getString("CAT_NM");
			String color = json.getString("COLOR");
			System.out.println(cat_nm);
			System.out.println(color);
		}
		}
	
			
		
		
	
	

	
	@Test
	public void verifyDemandClientAndSkill()
	{
		
		String response=responsemethod("https://pld-dev-api.w3ibm.mybluemix.net/api/pldDemandClientSKill");
		JSONObject jsonobj = new JSONObject(response);
		JSONArray jarray = jsonobj.getJSONArray("Plddemandclientskill");
		int length =jarray.length();
		for(int i=0;i<length;i++)
		{
			JSONObject obj = jarray.getJSONObject(i);
			if(obj.has("CLIENT"))
			{
			JSONObject client = obj.getJSONObject("CLIENT");
			JSONArray values = client.getJSONArray("values");
			int length2 = values.length();
			for(int j=0;j<length2;j++)
			{
				JSONObject obj2 = values.getJSONObject(j);
				String Cat_name = obj2.getString("CAT_NM");
				int number = obj2.getInt("NUM");
				int sort = obj2.getInt("SORT");
				System.out.println(Cat_name);
				System.out.println(number);
				System.out.println(sort);
				
				
			}
		}
			
			if(obj.has("SKILL"))
			{
			JSONObject skill = obj.getJSONObject("SKILL");
			JSONArray Skill_values = skill.getJSONArray("values");
			int length3 = Skill_values.length();
			for(int j=0;j<length3;j++)
			{
				JSONObject obj3 = Skill_values.getJSONObject(j);
				String Cat_name = obj3.getString("CAT_NM");
				int number = obj3.getInt("NUM");
				int sort = obj3.getInt("SORT");
				System.out.println(Cat_name);
				System.out.println(number);
				System.out.println(sort);
				
				
			}
		}
		}
	}

	@Test
	public void verifyDemandOpenPositiondata()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldDemandOpPosTablefilters";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray jarray = jsonobj.getJSONArray("Plddemandoppostablefilters");
		int length =jarray.length();
		for(int i=0;i<length;i++)
		{
			JSONObject obj = jarray.getJSONObject(i);
			if(obj.has("TYPE"))
			{
			JSONObject type = obj.getJSONObject("TYPE");
			JSONArray values = type.getJSONArray("values");
			int length2 = values.length();
			for(int j=0;j<length2;j++)
			{
				JSONObject obj2 = values.getJSONObject(j);
				String Cat_name = obj2.getString("CAT_NM");
				
				System.out.println(Cat_name);
				
			}	
				
			}
			
			if(obj.has("TIMEFRAME"))
			{
			JSONObject TimeFrame = obj.getJSONObject("TIMEFRAME");
			JSONArray values = TimeFrame.getJSONArray("values");
			int length2 = values.length();
			for(int j=0;j<length2;j++)
			{
				JSONObject obj2 = values.getJSONObject(j);
				String Cat_name = obj2.getString("CAT_NM");
				
				System.out.println(Cat_name);
				
			}	
				
			}
		}
			
	}

	
	@Test
	public void verifyOpenPositionChartdata()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldDemandTrend";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray ja_data = jsonobj.getJSONArray("Plddemandtrend");
		int length  = ja_data.length();
		for(int i=0;i<length;i++)
		{
			JSONObject json = ja_data.getJSONObject(i);
			String Month = json.getString("MNTH");
			String cat_grp = json.getString("CAT_GRP");
			String cat = json.getString("CAT");
			Double backlog = json.optDouble("POS_COUNT");
			
			System.out.println(Month);
			System.out.println(cat);
			System.out.println(cat_grp);
			System.out.println(backlog);
		}
	}
	
	@Test
	public void verifyOpenPositiontable()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldDemandOpPosDetails";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray ja_data = jsonobj.getJSONArray("Plddemandopposdetails");
		int length  = ja_data.length();
		for(int i=0;i<length;i++)
		{
			JSONObject json = ja_data.getJSONObject(i);
			String jrss = json.getString("JRSS");
			int seat_id = json.getInt("SEAT_ID");
			String contractor = json.getString("CONTRACTOR");
			int band = json.optInt("BAND");
			String start_date = json.getString("START_DT");
			String start_date_info = json.getString("START_DT_INFO");
			String end_date = json.getString("END_DT");
			String seat_type = json.getString("SEAT_TYPE");
			String interlock = json.getString("INTERLOCK");
			String client_nm = json.getString("CLIENT_NM");
			BigDecimal wins_odds = json.getBigDecimal("WINS_ODDS");
			String opp_owner = json.getString("OPP_OWNR");
			String opp_id = json.optString("OPP_ID");
			String Cat_nm = json.getString("CAT_NM");
			String Loc = json.getString("LOC");
			String cat_nm_timeframe = json.getString("CAT_NM_TIMEFRAME");
			String Os_Owner_email = json.getString("OS_OWNR_EMAIL");
			
			
			System.out.println(jrss);
			System.out.println(seat_id);
			System.out.println(contractor);
			System.out.println(band);
			System.out.println(start_date);
			System.out.println(start_date_info);
			System.out.println(end_date);
			System.out.println(seat_type);
			System.out.println(interlock);
			System.out.println(client_nm);
			System.out.println(wins_odds);
			System.out.println(opp_owner);
			System.out.println(opp_id);
			System.out.println(Cat_nm);
			System.out.println(Loc);
			System.out.println(cat_nm_timeframe);
			System.out.println(Os_Owner_email);
			
			
			
		
		
	}
	}
	
	@Test
	public void verifycolor()
	{
		//RestAssured.baseURI = "https://pld-dev-api.w3ibm.mybluemix.net";
		//RestAssured.basePath="/api/";
		//Response response= 
		try {
			URL url = new URL("https://pld-dev-api.w3ibm.mybluemix.net/api/pldDemandClientSkillColors");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "Application/json");
			if(conn.getResponseCode()!= 200)
			{
				throw new RuntimeException("HTTP error code :"+conn.getResponseCode());
				
			}
			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
			while((inputLine = in.readLine())!=null)
			{
				response.append(inputLine);
			
			}
			in.close();
			System.out.println("Output of connr"+response.toString());
			//Reading json Object
			JSONObject myResponse=new JSONObject(response.toString());
			
			System.out.println("JSON Output"+myResponse);
			
			//Scanner scan = new Scanner(url.openStream());
			//String entireResponse = new String();
			//while(scan.hasNext())
			//{
				//entireResponse+=scan.nextLine();
				//System.out.println(entireResponse);
				
			//}
			conn.disconnect();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
