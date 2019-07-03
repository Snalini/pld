package com.pld.restassured.dashboard;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import com.pld.Base.PldTestBase;
import com.pld.Util.TestUtil;
import com.pld.Util.TestUtilOne;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BenchAsOfAPITest extends PldTestBase{
	
	@Test
	public void verifyBenchAsOFTest() throws Exception
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
                			dataurl =prop.getProperty("API")+prop.getProperty("Bench_AsOf")+prop.getProperty("labortype1")+str; 
                	           
                	           System.out.println("URl is== "+dataurl  );
                	         String response=TestUtil.responseMethod(dataurl);
		
		JSONObject jsonobj = new JSONObject(response);
		JSONArray ja_data = jsonobj.getJSONArray("Pldbenchasof");
		int length  = ja_data.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = ja_data.getJSONObject(k);
			String Benchdate = json.getString("BENCH_DATE");
			System.out.println("Bech Date asOf-->"+Benchdate);
		}
	}
   }
           
}  
	}		
		
	
	@Test
	public void verifyBenchTableTest() throws Exception
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
                			dataurl =prop.getProperty("API")+prop.getProperty("Bench_Table")+prop.getProperty("labortype1")+str; 
                	           
                	           System.out.println("URl is== "+dataurl  );
                	         String response=TestUtil.responseMethod(dataurl);
		
		
		JSONObject jsonobj = new JSONObject(response);
		JSONArray ja_data = jsonobj.getJSONArray("Pldbenchtable");
		int length  = ja_data.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = ja_data.getJSONObject(k);
			String Name = json.optString("name");
			BigDecimal HC = json.optBigDecimal("HC",null);
			BigDecimal Tot = json.optBigDecimal("TOT",null);
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
    }
  }
}

	@Test
	public void verifyBenchMixChartTest() throws Exception
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
                			dataurl =prop.getProperty("API")+prop.getProperty("Bench_MixChart")+prop.getProperty("labortype1")+str; 
                	           
                	           System.out.println("URl is== "+dataurl  );
                	         String response=TestUtil.responseMethod(dataurl);
		
		JSONObject jsonobj = new JSONObject(response);
		JSONArray ja_data = jsonobj.getJSONArray("Pldbenchchart");
		int length  = ja_data.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = ja_data.getJSONObject(k);
			BigDecimal SkillsExcessperc = json.optBigDecimal("SKILLS_EXCESS_PERC",null);
			int SkillsShortagePerc = json.optInt("SKILLS_SHORTAGE_PERC");
			BigDecimal CriticalSkillsExcessPerc = json.optBigDecimal("CRIT_SKILLS_EXCESS_PERC",null);
			
			System.out.println("SkillsExcessperc -->"+SkillsExcessperc);
			System.out.println("SkillsShortagePerc-->"+SkillsShortagePerc);
			System.out.println("CriticalSkillsExcessPerc -->"+CriticalSkillsExcessPerc);
			
		}
       }
      }		
	}
}
}
