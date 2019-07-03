package com.pld.restassured;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pld.Base.PldTestBase;
import com.pld.Util.TestUtil;
import com.pld.Util.TestUtilOne;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DemandClientAndSkillTest extends PldTestBase{
	
	
	
	
	@Test
	public void verifyDemandClientAndSkillColor() throws Exception
	{
		//String response=responsemethod("https://pld-dev-api.w3ibm.mybluemix.net/api/pldDemandClientSkillColors");
		String dataurl =new String();
		List sheetData =new ArrayList();
		List<String> cellData =new ArrayList<String>();
		sheetData=TestUtilOne.getTestData2();
		for(int i=0;i<sheetData.size();i++)
		{
			List list = (List) sheetData.get(i);
	       for (int j = 0; j < list.size(); j++)
	       		{
	            	XSSFCell cell = (XSSFCell) list.get(j);
	            	if(cell.getCellType() == CellType.STRING)
	            		{
	            			String  str=cell.getRichStringCellValue().getString();
	            			System.out.println(str);
	            			dataurl =prop.getProperty("API")+prop.getProperty("Demand_ClientSkillColors")+prop.getProperty("labortype1")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		JSONObject jsonobj = new JSONObject(response);
		
		JSONArray ja_data = jsonobj.getJSONArray("Plddemandclientskillcolors");
		int length  = ja_data.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = ja_data.getJSONObject(k);
			//System.out.println(json);
			String cat_nm = json.getString("CAT_NM");
			String color = json.getString("COLOR");
			System.out.println(cat_nm);
			System.out.println(color);
		}
		}
		
	       		}
		}
	}
			
		
	@Test
	public void verifyDemandClientAndSkill() throws Exception
	{
		//String response=responsemethod("https://pld-dev-api.w3ibm.mybluemix.net/api/pldDemandClientSKill");
		String dataurl =new String();
		List sheetData =new ArrayList();
		List<String> cellData =new ArrayList<String>();
		sheetData=TestUtilOne.getTestData2();
		for(int i=0;i<sheetData.size();i++)
		{
			List list = (List) sheetData.get(i);
	       for (int j = 0; j < list.size(); j++)
	       		{
	            	XSSFCell cell = (XSSFCell) list.get(j);
	            	if(cell.getCellType() == CellType.STRING)
	            		{
	            			String  str=cell.getRichStringCellValue().getString();
	            			System.out.println(str);
	            			dataurl =prop.getProperty("API")+prop.getProperty("Demand_ClientSkill")+prop.getProperty("labortype1")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);

		JSONObject jsonobj = new JSONObject(response);
		JSONArray jarray = jsonobj.getJSONArray("Plddemandclientskill");
		int length =jarray.length();
		for(int k=0;k<length;k++)
		{
			JSONObject obj = jarray.getJSONObject(k);
			if(obj.has("CLIENT"))
			{
			JSONObject client = obj.getJSONObject("CLIENT");
			JSONArray values = client.getJSONArray("values");
			int length2 = values.length();
			for(int l=0;l<length2;l++)
			{
				JSONObject obj2 = values.getJSONObject(l);
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
			for(int m=0;m<length3;m++)
			{
				JSONObject obj3 = Skill_values.getJSONObject(m);
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
	       		}
		}
	}

	@Test
	public void verifyDemandOpenPositiondata() throws Exception
	{
		String dataurl =new String();
		List sheetData =new ArrayList();
		List<String> cellData =new ArrayList<String>();
		sheetData=TestUtilOne.getTestData2();
		for(int i=0;i<sheetData.size();i++)
		{
			List list = (List) sheetData.get(i);
	       for (int j = 0; j < list.size(); j++)
	       		{
	            	XSSFCell cell = (XSSFCell) list.get(j);
	            	if(cell.getCellType() == CellType.STRING)
	            		{
	            			String  str=cell.getRichStringCellValue().getString();
	            			System.out.println(str);
	            			dataurl =prop.getProperty("API")+prop.getProperty("Demand_openPositiontablefilters")+prop.getProperty("labortype1")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);

		
		JSONObject jsonobj = new JSONObject(response);
		JSONArray jarray = jsonobj.getJSONArray("Plddemandoppostablefilters");
		int length =jarray.length();
		for(int k=0;k<length;k++)
		{
			JSONObject obj = jarray.getJSONObject(k);
			if(obj.has("TYPE"))
			{
			JSONObject type = obj.getJSONObject("TYPE");
			JSONArray values = type.getJSONArray("values");
			int length2 = values.length();
			for(int l=0;l<length2;l++)
			{
				JSONObject obj2 = values.getJSONObject(l);
				String Cat_name = obj2.getString("CAT_NM");
				
				System.out.println(Cat_name);
				
			}	
				
			}
			
			if(obj.has("TIMEFRAME"))
			{
			JSONObject TimeFrame = obj.getJSONObject("TIMEFRAME");
			JSONArray values = TimeFrame.getJSONArray("values");
			int length2 = values.length();
			for(int m=0;m<length2;m++)
			{
				JSONObject obj2 = values.getJSONObject(m);
				String Cat_name = obj2.getString("CAT_NM");
				
				System.out.println(Cat_name);
				
			}	
				
			}
		}
	            		}
	       		}
		}
			
	}

	
	@Test
	public void verifyOpenPositionChartdata() throws Exception
	{
		
		//String response=responsemethod("https://pld-dev-api.w3ibm.mybluemix.net/api/pldDemandTrend");
		String dataurl =new String();
		List sheetData =new ArrayList();
		List<String> cellData =new ArrayList<String>();
		sheetData=TestUtilOne.getTestData2();
		for(int i=0;i<sheetData.size();i++)
		{
			List list = (List) sheetData.get(i);
	       for (int j = 0; j < list.size(); j++)
	       		{
	            	XSSFCell cell = (XSSFCell) list.get(j);
	            	if(cell.getCellType() == CellType.STRING)
	            		{
	            			String  str=cell.getRichStringCellValue().getString();
	            			System.out.println(str);
	            			dataurl =prop.getProperty("API")+prop.getProperty("Demand_Trend")+prop.getProperty("labortype1")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);

		JSONObject jsonobj = new JSONObject(response);
		JSONArray ja_data = jsonobj.getJSONArray("Plddemandtrend");
		int length  = ja_data.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = ja_data.getJSONObject(k);
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
	       		}
		}
	}
	
	@Test
	public void verifyOpenPositiontable() throws Exception
	{
		//String response=responsemethod("https://pld-dev-api.w3ibm.mybluemix.net/api/pldDemandOpPosDetails");
		String dataurl =new String();
		List sheetData =new ArrayList();
		List<String> cellData =new ArrayList<String>();
		sheetData=TestUtilOne.getTestData2();
		for(int i=0;i<sheetData.size();i++)
		{
			List list = (List) sheetData.get(i);
	       for (int j = 0; j < list.size(); j++)
	       		{
	            	XSSFCell cell = (XSSFCell) list.get(j);
	            	if(cell.getCellType() == CellType.STRING)
	            		{
	            			String  str=cell.getRichStringCellValue().getString();
	            			System.out.println(str);
	            			dataurl =prop.getProperty("API")+prop.getProperty("Demand_OpenposDetail")+prop.getProperty("labortype1")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		JSONObject jsonobj = new JSONObject(response);
		JSONArray ja_data = jsonobj.getJSONArray("Plddemandopposdetails");
		int length  = ja_data.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = ja_data.getJSONObject(k);
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
	       		}
		}
	}
	}
