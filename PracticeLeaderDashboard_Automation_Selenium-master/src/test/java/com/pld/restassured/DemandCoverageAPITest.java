package com.pld.restassured;

import java.io.IOException;
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

public class DemandCoverageAPITest extends PldTestBase{
	
	@Test
	public void verifyDemandCoverageExpAsOf() throws Exception
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
	            			dataurl =prop.getProperty("API")+prop.getProperty("Demand_Coverage_expasof")+prop.getProperty("labortype1")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		
		JSONObject jsonobj = new JSONObject(response);
		JSONArray ja_data = jsonobj.getJSONArray("Plddemandcoverageexpasof");
		int length  = ja_data.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = ja_data.getJSONObject(k);
			String Tranining_Date = json.getString("TRAINING_DATE");
			System.out.println(Tranining_Date);
		}
	            		}
	       		}
		}
	}
	
	/*@Test
	public void verifyDemandCoverageDetailsAPI() throws IOException
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
	            			dataurl =prop.getProperty("API")+prop.getProperty("UtilLad_DistByBand")+prop.getProperty("labortype1")+str.replaceAll(",", prop.getProperty("labortype2")); 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		
		JSONObject jsonobj = new JSONObject(response);
		JSONArray ja_data = jsonobj.getJSONArray("Plddemandcoveragedetails");
		int length  = ja_data.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = ja_data.getJSONObject(k);
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
	       		}
		}

	}*/
	
	@Test
	public void verifyOpportunityDetailsASOfAPI() throws Exception
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
	            			dataurl =prop.getProperty("API")+prop.getProperty("DemandCoverage_OpptyDetial_expasof")+prop.getProperty("labortype1")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		
		
		JSONObject jsonobj = new JSONObject(response);
		JSONArray ja_data = jsonobj.getJSONArray("Plddemandcoverageexpasof");
		int length  = ja_data.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = ja_data.getJSONObject(k);
			String Tranining_Date = json.getString("TRAINING_DATE");
			System.out.println(Tranining_Date);
		}
	            		}
	       		}
		}
	}

	@Test
	public void verifyOpportunityDetailsViewdropdown() throws Exception
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
	            			dataurl =prop.getProperty("API")+prop.getProperty("DemandCoverage_OpptyDetailsViewBy")+prop.getProperty("labortype1")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		JSONObject jsonobj = new JSONObject(response);
		JSONArray ja_data = jsonobj.getJSONArray("Pldopptydetailsviewby");
		int length  = ja_data.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = ja_data.getJSONObject(k);
			String View_By = json.getString("VIEW_BY");
			String ColorClass = json.getString("COLORCLASS");
			System.out.println(View_By);
			System.out.println(ColorClass);
		}
	            		}
	            	
		}
		}
	}
	
	@Test
	public void verifyOpportunityDetailstableAPI() throws Exception
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
	            			dataurl =prop.getProperty("API")+prop.getProperty("DemandCoverage_OpptyDetails")+prop.getProperty("labortype1")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		
		JSONObject jsonobj = new JSONObject(response);
		JSONArray ja_data = jsonobj.getJSONArray("Pldopptydetails");
		int length  = ja_data.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = ja_data.getJSONObject(k);
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
		}
	}
}
