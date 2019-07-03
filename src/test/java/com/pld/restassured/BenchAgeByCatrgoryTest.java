package com.pld.restassured;

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

public class BenchAgeByCatrgoryTest extends PldTestBase{
	
	
	@Test
	public void verifyBenchByAgedataTest() throws Exception
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
	            			dataurl =prop.getProperty("API")+prop.getProperty("Bench_ByAgeDate")+prop.getProperty("labortype1")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		JSONObject jsonobj = new JSONObject(response);
		JSONArray ja_data = jsonobj.getJSONArray("Pldbenchbyage");
		int length  = ja_data.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = ja_data.getJSONObject(k);
			Integer TotalHC = json.optInt("TOTAL_HC");
			Integer AgedBenchHC = json.optInt("AGED_BENCH_HC");
			BigDecimal AgedBenchHCpercent = json.optBigDecimal("AGED_BENCH_HC_PERC",null);
			System.out.println("Total headcount is "+TotalHC);
			System.out.println("Aged Bench HC is "+AgedBenchHC);
			System.out.println("Aged bench HC percent is "+AgedBenchHCpercent);
	}
	            		}
	       		}
		}

}
	
	@Test
	public void verifyBenchAgeByCategoryTest() throws Exception
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
	            			dataurl =prop.getProperty("API")+prop.getProperty("Bench_ByAgeCategory")+prop.getProperty("labortype1")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
	    JSONObject jsonobj = new JSONObject(response);
		JSONArray ja_data = jsonobj.getJSONArray("Pldbenchagebycategory");
		int length  = ja_data.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = ja_data.getJSONObject(k);
			String Category = json.getString("CATEGORY");
			int HCvalue = json.getInt("HC_VALUE");
			String Color = json.getString("COLOR");
			
			System.out.println(Category);
			System.out.println(HCvalue);
			System.out.println(Color);
		}
	            		}
	       		}
	}

}
	
	@Test
	public void verifyBenchEmployeeRollOff() throws Exception
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
	            			dataurl =prop.getProperty("API")+prop.getProperty("Bench_EmployeeRolloff")+prop.getProperty("labortype1")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		JSONObject jsonobj = new JSONObject(response);
		JSONArray jsonarray = jsonobj.getJSONArray("Pldbenchemployeerolloff");
		int length =jsonarray.length();
		for(int k=0;k<length;k++)
		{
			JSONObject emp_data = jsonarray.getJSONObject(k);
			JSONObject bench_data = emp_data.getJSONObject("benchData");
			JSONArray jarray2 = bench_data.getJSONArray("Pldbenchemployeerolloff");
			int length2 = jarray2.length();
			for(int l=0;l<length2;l++)
			{
				JSONObject jobj2 = jarray2.getJSONObject(l);
				String name = jobj2.getString("NAME");
				String band = jobj2.getString("BAND");
				String jrss = jobj2.getString("JRSS");
				String location = jobj2.getString("LOCATION");
				String industry = jobj2.getString("INDUSTRY");
				BigDecimal hpp = jobj2.getBigDecimal("HPP");
				BigDecimal qtd_cu = jobj2.getBigDecimal("QTD_CU");
				BigDecimal qtd_pu = jobj2.getBigDecimal("QTD_PU");
				BigDecimal mc = jobj2.getBigDecimal("MC");
				BigDecimal AAID = jobj2.getBigDecimal("AAID");
				BigDecimal timeaway = jobj2.getBigDecimal("TIMEAWAY");
				String prior_assignment = jobj2.getString("PRIOR_ASSIGNMENT");
				String avail_date = jobj2.getString("AVAIL_DATE");
				int bench_Age = jobj2.getInt("BENCH_AGE");
				String inplay = jobj2.optString("INPLAY");
				String category = jobj2.getString("CATEGORY");
				String color = jobj2.getString("COLOR");
				String email = jobj2.getString("EMAIL");
				String cnumID = jobj2.getString("CNUMID");
				int bench_sort = jobj2.getInt("BENCH_SORT");
				
				System.out.println("emp name is=> "+name);
				System.out.println("Emp Band is=>"+band);
				System.out.println("JRSS is =>"+jrss);
				System.out.println("location is=>"+location);
				System.out.println("Industry is =>"+industry);
				System.out.println("HPP is =>"+hpp);
				System.out.println("QTD_CU is =>"+qtd_cu);
				System.out.println("QTD_PU is =>"+qtd_pu);
				System.out.println("MC is =>"+mc);
				System.out.println("AAID is =>"+AAID);
				System.out.println("Time Away is=>"+timeaway);
				System.out.println("Prior_Assignment is=>"+prior_assignment);
				System.out.println("Avail_date =>"+avail_date);
				System.out.println("Bench Age is=>"+bench_Age);
				System.out.println("InPlay is =>"+inplay);
				System.out.println("Category is =>"+category);
				System.out.println("Color is=>"+color);
				System.out.println("Email id is=>"+email);
				System.out.println("CNUM ID =>"+cnumID);
				System.out.println("Bench Sort=>"+bench_sort);
			}
		}
	            		}
	       		}
		}
	}
	
	@Test
	public void verifyBenchHCbyWeekdataTest() throws Exception
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
	            			dataurl =prop.getProperty("API")+prop.getProperty("Bench_HCbyweek")+prop.getProperty("labortype1")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		
		JSONObject jsonobj = new JSONObject(response);
		JSONArray ja_data = jsonobj.getJSONArray("Pldbenchhcbyweek");
		int length  = ja_data.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = ja_data.getJSONObject(k);
			String Segment = json.getString("SEGMENT");
			String X_Axis_Weekdate = json.getString("DATE_WEEK");
			int Y_Axis_HeadCount = json.getInt("HC");
			String ThisWeek = json.getString("THIS_WEEK");
			System.out.println(Segment);
			System.out.println(X_Axis_Weekdate);
			System.out.println(Y_Axis_HeadCount);
			System.out.println(ThisWeek);
	}
	            		}
	       		}
		}

}
	
	@Test
	public void verifyBenchTableFiltersTest() throws Exception
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
	            			dataurl =prop.getProperty("API")+prop.getProperty("Bench_TableFilters")+prop.getProperty("labortype1")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		    JSONObject jsonobj = new JSONObject(response);
			JSONArray ja_data = jsonobj.getJSONArray("Pldbenchtablefilters");
			int length  = ja_data.length();
			for(int k=0;k<length;k++)
			{
				JSONObject json = ja_data.getJSONObject(k);
				String Category = json.optString("CATEGORY");
				int BenchShort = json.getInt("BENCH_SORT");
				String Color = json.optString("COLOR");
				
				System.out.println(Category);
				
				System.out.println(Color);
				System.out.println(BenchShort);
				
		}
	            		}
	       		}
		}
					
	}

}
