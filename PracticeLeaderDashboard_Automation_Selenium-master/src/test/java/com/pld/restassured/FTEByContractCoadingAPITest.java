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

public class FTEByContractCoadingAPITest extends PldTestBase{
	
	@Test
	public void verifyLabourDistFTE() throws Exception
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
	            			dataurl =prop.getProperty("API")+prop.getProperty("FTE_laborDistFTE")+prop.getProperty("labortype1")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
	            		}
	       		}
		}
		
		
	}

	/*@Test
	public void verifyViewByMenu() throws IOException
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
	
		JSONArray jsonarray = new JSONArray(response);
		
		int length  = jsonarray.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = jsonarray.getJSONObject(k);
			String value = json.getString("value");
			//String menucd = jsonobject.getString("menuCd");
			//int menuitemid = jsonobject.getInt("menuItemId");
			String label = json.getString("label");
			//int id = jsonobject.getInt("id");
			
			System.out.println(value);
			//System.out.println(menucd);
			//System.out.println(menuitemid);
			System.out.println(label);
			//System.out.println(id);
			
		}
            		}
       		}
       
			
		}
	}*/
	
	/*@Test
	public void verifyContributionEmployeetableWithoutGrowthPlatform() throws IOException
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
	            			dataurl =prop.getProperty("API")+prop.getProperty("FTE_TotalEmpContrib")+prop.getProperty("labortype1")+str.replaceAll(",", prop.getProperty("labortype2")); 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		
		
		JSONObject jsonobj = new JSONObject(response);
		JSONArray jarray = jsonobj.getJSONArray("Pldlabortotalempcontrib");
		int length =jarray.length();
		for(int k=0;k<length;k++)
		{
			JSONObject empcont = jarray.getJSONObject(k);
			JSONObject distrbemp = empcont.getJSONObject("employeeContributionData");
			JSONArray jarray2 = distrbemp.getJSONArray("Pldlabordistributionemployees");
			int length2 = jarray2.length();
			for(int l=0;l<length2;l++)
			{
				JSONObject distrb_emp = jarray2.getJSONObject(l);
				String Name = distrb_emp.optString("NAME");
				String band = distrb_emp.getString("BAND");
				String jrss = distrb_emp.getString("JRSS");
				String location = distrb_emp.getString("LOCATION");
				BigDecimal Actual_HRS = distrb_emp.getBigDecimal("ACTUAL_HRS");
				String Client_name = distrb_emp.getString("CLIENT_NM");
				String Account_Class = distrb_emp.getString("ACCOUNT_CLASS");
				String LevelCode = distrb_emp.getString("LVL30CODE");
				String LastClaimdate = distrb_emp.getString("LAST_CLAIM_DT");
				String AvailDate = distrb_emp.getString("AVAIL_DT");
				String ActiveFlag = distrb_emp.getString("ACTIVE_FLG");
				String Email = distrb_emp.getString("EMAIL");
				int cnumid = distrb_emp.optInt("CNUMID");
				String util_type = distrb_emp.getString("UTILZN_TYP");
				String OfferingFlag = distrb_emp.getString("OFFRG_511_FLG");
				
				System.out.println(Name);
				System.out.println(band);
				System.out.println(jrss);
				System.out.println(location);
				System.out.println(Actual_HRS);
				System.out.println(Client_name);
				System.out.println(Account_Class);
				System.out.println(LevelCode);
				System.out.println(LastClaimdate);
				System.out.println(AvailDate);
				System.out.println(ActiveFlag);
				System.out.println(Email);
				System.out.println(cnumid);
				System.out.println(util_type);
				System.out.println(OfferingFlag);
			}
		}
	            		}
				
			}
		}
	}*/
	
	/*@Test  ----Same as above API
	public void verifyContributionEmployeeTableWithGrowthPlatform()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldLaborTotalEmpContrib/?filter[where][DSHB_BUS_AREA_NM]=Cloud%20Application%20Innovation";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
	}*/
	
/*	@Test
	public void verifyOfferingCodeBreakdownViewBy() throws IOException
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
		
		
JSONArray jsonarray = new JSONArray(response);
		
		int length  = jsonarray.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = jsonarray.getJSONObject(k);
			String value = json.getString("value");
			//String menucd = jsonobject.getString("menuCd");
			//int menuitemid = jsonobject.getInt("menuItemId");
			String label = json.getString("label");
			//int id = jsonobject.getInt("id");
			
			System.out.println(value);
			//System.out.println(menucd);
			//System.out.println(menuitemid);
			System.out.println(label);
			//System.out.println(id);
		}
	            		}
	       		}
		}
	}*/
	
	@Test
	public void verifyOfferingCodeBreakdownChartNoGrowthPlatform() throws Exception
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
	            			dataurl =prop.getProperty("API")+prop.getProperty("FTE_OfferingCodeBreakdownNogrowthplatform")+prop.getProperty("labortype1")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		
		
		JSONObject jsonobj = new JSONObject(response);
		JSONArray jarray = jsonobj.getJSONArray("Pldofferingcodebreakdown");
		int length = jarray.length();
		for(int k=0;k<length;k++)
		{
			JSONObject band = jarray.getJSONObject(k);
			if(band.has("Band"))
			{
			JSONArray jarray2 = band.getJSONArray("Band");
			int length2 = jarray2.length();
			for(int l=0;l<length2;l++)
			{
				JSONObject jobj2 = jarray2.getJSONObject(l);
				String segment = jobj2.getString("SEGMENT");
				BigDecimal Exec = jobj2.getBigDecimal("Exec");
				BigDecimal Band10 = jobj2.getBigDecimal("B10");
				BigDecimal Band9 = jobj2.getBigDecimal("B9");
				BigDecimal Band8 = jobj2.getBigDecimal("B8");
				BigDecimal Band7 = jobj2.getBigDecimal("B7");
				BigDecimal Band6 = jobj2.getBigDecimal("B6");
				BigDecimal Band1to5 = jobj2.getBigDecimal("B1-5");
				String color = jobj2.getString("COLOR");
				
				System.out.println(segment);
				System.out.println(Exec);
				System.out.println(Band10);
				System.out.println(Band9);
				System.out.println(Band8);
				System.out.println(Band7);
				System.out.println(Band6);
				System.out.println(Band1to5);
				System.out.println(color);
			}
			}
			
			if(band.has("Client_Name"))
			{
			JSONArray jarray3 = band.getJSONArray("Client_Name");
			int length3 = jarray3.length();
			for(int n=0;n<length3;n++)
			{
				JSONObject jobj3 = jarray3.getJSONObject(n);
				String segment = jobj3.getString("SEGMENT");
				BigDecimal IBMInternal = jobj3.getBigDecimal("IBM Internal");
				BigDecimal IBMAccount = jobj3.optBigDecimal("IBM Account",null);
				//BigDecimal ATTInc = jobj3.getBigDecimal("AT&T INC.");
				//BigDecimal IBMBP = jobj3.getBigDecimal("IBM B&P");
				//BigDecimal MetlifeInc = jobj3.getBigDecimal("METLIFE, INC.");
				//BigDecimal PepsicoInc = jobj3.getBigDecimal("PEPSICO, INC.");
				BigDecimal Other = jobj3.getBigDecimal("Other");
				String color = jobj3.getString("COLOR");
				
				System.out.println(segment);
				System.out.println(IBMInternal);
				System.out.println(IBMAccount);
				//System.out.println(ATTInc);
				//System.out.println(IBMBP);
				//System.out.println(MetlifeInc);
				//System.out.println(PepsicoInc);
				System.out.println(Other);
				System.out.println(color);
			}
			}
			if(band.has("Contract_Offering"))
			{
			JSONArray jarray4 = band.getJSONArray("Contract_Offering");
			int length4 = jarray4.length();
			for(int p=0;p<length4;p++)
			{
				JSONObject jobj4 = jarray4.getJSONObject(p);
				String segment = jobj4.getString("SEGMENT");
				//BigDecimal AMICustomAM = jobj4.getBigDecimal("CPS-Talent & Engagement Process Services");
				//BigDecimal CPSFinanceProcessServices = jobj4.getBigDecimal("CPS-Finance Process Services");
				//BigDecimal AMISapAdm = jobj4.getBigDecimal("CPS-Procurement Process Services");
				//BigDecimal EAMSap = jobj4.getBigDecimal("CPS-Risk And Compliance");
				//BigDecimal CAMOnPremServices = jobj4.getBigDecimal("DXX-Marketing Platforms");
				//BigDecimal AMIIgnite = jobj4.getBigDecimal("CPS-Industry Specific Processing Services");
				BigDecimal Other = jobj4.getBigDecimal("Other");
				String color = jobj4.getString("COLOR");
				
				System.out.println(segment);
				//System.out.println(AMICustomAM);
				//System.out.println(CPSFinanceProcessServices);
				//System.out.println(AMISapAdm);
				//System.out.println(EAMSap);
				//System.out.println(CAMOnPremServices);
				//System.out.println(AMIIgnite);
				System.out.println(Other);
				System.out.println(color);
			}
			}
			
			if(band.has("JR/S"))
			{
			JSONArray jarray5 = band.getJSONArray("JR/S");
			int length5 = jarray5.length();
			for(int m=0;m<length5;m++)
			{
				JSONObject jobj5 = jarray5.getJSONObject(m);
				String segment = jobj5.getString("SEGMENT");
				//BigDecimal ProcessServicesProfessionalFinance = jobj5.getBigDecimal("Process Services Professional-Finance");
				//BigDecimal ApplicationDevJavaAndWebTech = jobj5.getBigDecimal("Process Services Professional-Human Resources Operations");
				//BigDecimal ProjMangAdm = jobj5.getBigDecimal("Process Services Professional-Talent Acquisition Optimization");
				//BigDecimal ApplicationDev = jobj5.getBigDecimal("Process Services Professional-Procurement");
				//BigDecimal TestSpecialistCustomApp = jobj5.getBigDecimal("No Value Available");
				//BigDecimal AppDevMicrosfotNet = jobj5.getBigDecimal("Delivery Manager-Talent Acquisition Optimization");
				BigDecimal Other = jobj5.getBigDecimal("Other");
				String color = jobj5.getString("COLOR");
				
				System.out.println(segment);
				//System.out.println(ProcessServicesProfessionalFinance);
				//System.out.println(ApplicationDevJavaAndWebTech);
				//System.out.println(ProjMangAdm);
				//System.out.println(ApplicationDev);
				//System.out.println(TestSpecialistCustomApp);
				//System.out.println(AppDevMicrosfotNet);
				System.out.println(Other);
				System.out.println(color);
			}
			}
			
			if(band.has("Market"))
			{
			JSONArray jarray6 = band.getJSONArray("Market");
			int length6 = jarray6.length();
			for(int q=0;q<length6;q++)
			{
				JSONObject jobj6 = jarray6.getJSONObject(q);
				String segment = jobj6.getString("SEGMENT");
				//BigDecimal ISA = jobj6.getBigDecimal("ISA");
				//BigDecimal GCG = jobj6.getBigDecimal("GCG");
				//BigDecimal USCommercial = jobj6.getBigDecimal("US Commercial");
				//BigDecimal Japan = jobj6.getBigDecimal("Asean");
				//BigDecimal Asean = jobj6.getBigDecimal("Poland");
				//BigDecimal UKI = jobj6.getBigDecimal("SEE");
				BigDecimal Other = jobj6.getBigDecimal("Other");
				String color = jobj6.getString("COLOR");
				
				System.out.println(segment);
				//System.out.println(ISA);
				//System.out.println(GCG);
				//System.out.println(USCommercial);
				//System.out.println(Japan);
				//System.out.println(Asean);
				//System.out.println(UKI);
				System.out.println(Other);
				System.out.println(color);
			}
			}
		}
	}
	
	/*@Test---Same API as above
	public void verifyOfferingCodeBreakdownChartWithGrowthPlatform()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldOfferingCodeBreakdown/?filter[where][DSHB_BUS_AREA_NM]=Cloud%20Application%20Innovation";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray jarray = jsonobj.getJSONArray("Pldofferingcodebreakdown");
		int length = jarray.length();
		for(int i=0;i<length;i++)
		{
		JSONObject json = jarray.getJSONObject(i);
		
		JSONArray jarray2 = new JSONArray(json);
	    length  = jarray2.length();
		for(int j=0;j<length;j++)
		{
			JSONObject json1 = jarray2.getJSONObject(i);
			String Segement = json1.getString("SEGMENT");
			System.out.println(Segement);
			
		}
		}
		
		

	}*/
}
		}
	}
}
