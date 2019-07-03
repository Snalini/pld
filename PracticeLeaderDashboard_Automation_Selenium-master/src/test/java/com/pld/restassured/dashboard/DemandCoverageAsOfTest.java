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

public class DemandCoverageAsOfTest extends PldTestBase{
	
	@Test
	public void verifyDemandCoverageAsOfTest() throws Exception
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
	            			dataurl =prop.getProperty("API")+prop.getProperty("DemandCoverage_Asof")+prop.getProperty("labortype1")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		
		JSONObject jsonobj = new JSONObject(response);
		JSONArray ja_data = jsonobj.getJSONArray("Plddemandcoverageasof");
		int length  = ja_data.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = ja_data.getJSONObject(k);
			String TrainingDate = json.getString("TRAINING_DATE");
			System.out.println("Training date as of -->"+TrainingDate);
			
		}
	            		}
	       		}
		}
		
	}
	
	@Test
	public void verifyDemandCoverageChartTest() throws Exception
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
	            			dataurl =prop.getProperty("API")+prop.getProperty("DemandCoverage_Chart")+prop.getProperty("labortype1")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		JSONObject jsonobj = new JSONObject(response);
		JSONArray jsonarray = jsonobj.getJSONArray("Plddemandcoverage");
		//System.out.println(jsonarray);
		
		int length = jsonarray.length();
		for(int k=0;k<length;k++)
		{
			JSONObject coverage_data = jsonarray.getJSONObject(k);
			if(coverage_data.has("coverage"))
			{
				JSONObject coverage = coverage_data.getJSONObject("coverage");
				BigDecimal cover_deal = coverage.optBigDecimal("DEAL",null);
				BigDecimal cover_TCV = coverage.optBigDecimal("TCV",null);
				
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
				BigDecimal tcv_NoPlan = tcv.optBigDecimal("NO_PLAN",null);
				BigDecimal tcv_witPlan = tcv.optBigDecimal("WITH_PLAN",null);
				int tcv_tot = tcv.optInt("TOT");
				BigDecimal tcv_noPlanReq = tcv.optBigDecimal("NO_PLAN_REQD",null);
				System.out.println("tcv_NoPlan-->"+tcv_NoPlan);
				System.out.println("tcv_witPlan-->"+tcv_witPlan);
				System.out.println("tcv_tot-->"+tcv_tot);
				System.out.println("tcv_noPlanReq-->"+tcv_noPlanReq);
				
			}
			
		}
	}
	       		}
		}
	}

}
