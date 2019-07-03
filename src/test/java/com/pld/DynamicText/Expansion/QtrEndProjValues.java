package com.pld.DynamicText.Expansion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

import com.mongodb.util.JSON;
import com.pld.Base.PldTestBase;
import com.pld.Util.TestUtilOne;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class QtrEndProjValues extends PldTestBase {
	
	 JSONTokener jsonStr;
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
	
	public void getQtrEndProjValue() throws Exception
	
	{
		String dataurl =new String();
		List sheetData =new ArrayList();
		List<String> cellData =new ArrayList<String>();
		sheetData=TestUtilOne.getTestData2();
		//System.out.println(sheetData.size());//112
		for(int i=0;i<sheetData.size();i++)
		{
			List list = (List) sheetData.get(i);
           for (int j = 0; j < list.size(); j++)
           		{
                	XSSFCell cell = (XSSFCell) list.get(j);
                	if(cell.getCellType() == CellType.STRING)
                		{
                			String  str=cell.getRichStringCellValue().getString();
                			//cellData.add(j,str);
                			System.out.println(str);
          
                	//String str1 = str.replaceAll(",", prop.getProperty("labortype"));
           		
         /* if(cellData.size()==1)
        	   {
        	   		dataurl =prop.getProperty("Util_QTDGraph")+URLEncoder.encode(cellData.get(0), StandardCharsets.UTF_8.toString());
        	   		System.out.println(dataurl);
        	   }
           else
        	   {
        	   		dataurl=prop.getProperty("Util_QTDGraph")+URLEncoder.encode(cellData.get(0), StandardCharsets.UTF_8.toString());
        	   		for(int k=1;k<cellData.size();k++)
        	   			{
        	   				dataurl=dataurl+prop.getProperty("labortype")+cellData.get(i);
        	   			
        	   			}
        	   }*/
           dataurl =prop.getProperty("QTR_End_projValue")+str.replaceAll(",", prop.getProperty("labortype")); 
           //URLEncoder.encode(str.replaceAll(",", prop.getProperty("labortype")), StandardCharsets.UTF_8.toString()
           System.out.println("URl is== "+dataurl  );
            String response=responsemethod(dataurl);
		
		//RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldQtrProjectionUtilization";
		/*RequestSpecification request  = RestAssured.given();
		Response response  = request.get();
		String responsebody = response.body().asString();
	    System.out.println("Response Body -->" +responsebody );*/
	    
	   
		JSONObject jsonobj = new JSONObject(response);
		JSONArray ja_data = jsonobj.getJSONArray("Pldqtrprojectionutilization");
		int length  = ja_data.length();
		for(int l=0;l<length;l++)
		{
			JSONObject json = ja_data.getJSONObject(l);
			String utiltype = json.optString("UTIL_TYPE");
			String Qtrendproj = json.optString("QTR_END_PROJ");
			String Target = json.optString("TARGET");
			String Delta_target = json.optString("DELTA_TARGET");
			String Delta_YTY = json.optString("DELTA_YTY");
			System.out.println("Util type is "+utiltype);
			System.out.println("QtrEndPrjection value is "+Qtrendproj);
			System.out.println("Target Value is "+Target);
			System.out.println("Delta Target value is "+Delta_target);
			System.out.println("DeltaYTY value is "+Delta_YTY);
			
		}
	    
                		}       
                	}   
		}
}
	@Test
	public void getDropDownValues() throws Exception
	{
		String dataurl =new String();
		List sheetData =new ArrayList();
		List<String> cellData =new ArrayList<String>();
		sheetData=TestUtilOne.getTestData2();
		//System.out.println(sheetData.size());//112
		for(int i=0;i<sheetData.size();i++)
		{
			List list = (List) sheetData.get(i);
           for (int j = 0; j < list.size(); j++)
           		{
                	XSSFCell cell = (XSSFCell) list.get(j);
                	if(cell.getCellType() == CellType.STRING)
                		{
                			String  str=cell.getRichStringCellValue().getString();
                			//cellData.add(j,str);
                			System.out.println(str);
                			dataurl =prop.getProperty("Label_values")+str.replaceAll(",", prop.getProperty("labortype")); 
                	           //URLEncoder.encode(str.replaceAll(",", prop.getProperty("labortype")), StandardCharsets.UTF_8.toString()
                	           System.out.println("URl is== "+dataurl  );
                	            String response=responsemethod(dataurl);
		/*RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/Menu/viewutilization-by/MenuItem/?filter[fields][label]=true&filter[fields][value]=true&filter[order]=menuItemld";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);*/
                	            JSONArray jsonarray  = new JSONArray(response);
                	    		for(int l=0;l<jsonarray.length();l++)
                	    		{
                	    			JSONObject jsonobject  = jsonarray.getJSONObject(l);
                	    			String value = jsonobject.getString("value");
                	    			String label = jsonobject.getString("label");
                	    			System.out.println(value);
                	    			System.out.println(label);
                	    		}
                		}
           		}
		}
	}
	
	@Test
	public void verifyWeeklyUtilizationbarChart() throws Exception
	{
		/*RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldWeeklyUtilization/";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);*/
		String dataurl =new String();
		List sheetData =new ArrayList();
		List<String> cellData =new ArrayList<String>();
		sheetData=TestUtilOne.getTestData2();
		//System.out.println(sheetData.size());//112
		for(int i=0;i<sheetData.size();i++)
		{
			List list = (List) sheetData.get(i);
           for (int j = 0; j < list.size(); j++)
           		{
                	XSSFCell cell = (XSSFCell) list.get(j);
                	if(cell.getCellType() == CellType.STRING)
                		{
                			String  str=cell.getRichStringCellValue().getString();
                			//cellData.add(j,str);
                			System.out.println(str);
                			dataurl =prop.getProperty("WeeklyUtilizationChart")+str.replaceAll(",", prop.getProperty("labortype")); 
                	           //URLEncoder.encode(str.replaceAll(",", prop.getProperty("labortype")), StandardCharsets.UTF_8.toString()
                	           System.out.println("URl is== "+dataurl  );
                	            String response=responsemethod(dataurl);
		JSONObject jsonobj = new JSONObject(response);
		JSONArray ja_data = jsonobj.getJSONArray("Pldweeklyutilization");
		int length  = ja_data.length();
		for(int l=0;l<length;l++)
		{
			JSONObject json = ja_data.getJSONObject(l);
			String WeekDate = json.getString("WEEK_DT");
			String Current_Week = json.getString("CURRENT_WK");
			BigDecimal Bill_Value = json.getBigDecimal("BILL_VALUE");
			BigDecimal Bill_Targets = json.getBigDecimal("BILL_TARGTS");
			BigDecimal Bill_lastyear = json.getBigDecimal("BILL_LAST_YR");
			BigDecimal Charge_Value = json.getBigDecimal("CHARGE_VALUE");
			BigDecimal Charge_Targets = json.getBigDecimal("CHARGE_TARGTS");
			BigDecimal Charge_lastyear = json.getBigDecimal("CHARGE_LAST_YR");
			BigDecimal Prodctive_Value = json.getBigDecimal("PROD_VALUE");
			BigDecimal Productive_Target = json.getBigDecimal("PROD_TARGTS");
			BigDecimal Productive_lastYear = json.getBigDecimal("PROD_LAST_YR");
			
			System.out.println("WeekDate is "+WeekDate);
			System.out.println("CurrentWeek value is "+Current_Week);
			System.out.println("Bill_Value is "+Bill_Value);
			System.out.println("Bill_Targets value is "+Bill_Targets);
			System.out.println("Bill_lastyear value is "+Bill_lastyear);
			System.out.println("Charge_Value value is "+Charge_Value);
			System.out.println("Charge_Targets value is "+Charge_Targets);
			System.out.println("Charge_lastyear value is "+Charge_lastyear);
			System.out.println("Prodctive_Value value is "+Prodctive_Value);
			System.out.println("Productive_Target value is "+Productive_Target);
			System.out.println("Productive_lastYear value is "+Productive_lastYear);
		}
                		}
           		}
			
		}
	}
}
