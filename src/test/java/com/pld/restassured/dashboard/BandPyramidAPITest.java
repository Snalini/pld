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
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BandPyramidAPITest extends PldTestBase {
	
	@Test
	public void verifyBandPyramidAsOfTest() throws Exception
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
            			dataurl =prop.getProperty("API")+prop.getProperty("BandPyramid_Asof")+prop.getProperty("labortype1")+str; 
            	           
            	           System.out.println("URl is== "+dataurl  );
            	         String response=TestUtil.responseMethod(dataurl);
		
		JSONObject jsonobj = new JSONObject(response);
		JSONArray ja_data = jsonobj.getJSONArray("Pldpcasof");
		int length  = ja_data.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = ja_data.getJSONObject(k);
			String PyramidDate = json.getString("PYRAMID_DATE");
			System.out.println(PyramidDate);
		}
       }
      }
	}
	}

	
	@Test
	public void verifyBandPyramidChartTest() throws Exception
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
	            			dataurl =prop.getProperty("API")+prop.getProperty("BandPyramid_Chart")+prop.getProperty("labortype1")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
		/*PreemptiveBasicAuthScheme authScheme = new PreemptiveBasicAuthScheme();
		authScheme.setUserName("shbudipa@in.ibm.com");
		authScheme.setPassword("feb@2019!!");
		RestAssured.authentication = authScheme; */
		
		System.out.println(response);
		
		JSONObject BPChart= new JSONObject(response);
		JSONObject band_0 = BPChart.getJSONObject("Pldpcbandpyramid");
		
		//System.out.println(band_0);
		
		JSONObject Avgband = band_0.getJSONObject("AVG_BAND");
		//System.out.println(Avgband);
		BigDecimal HeadQuantity = Avgband.optBigDecimal("HEADCNT_QTY", null);
		String Band = Avgband.getString("BAND");
		System.out.println(HeadQuantity);
		System.out.println(Band);
		
		JSONObject TotalHeadcount = band_0.getJSONObject("TOTAL_HC");
		//System.out.println(TotalHeadcount);
		BigDecimal Hedqty = TotalHeadcount.optBigDecimal("HEADCNT_QTY", null);
		String HC_Band = TotalHeadcount.getString("BAND");
		System.out.println(Hedqty);
		System.out.println(HC_Band);
		
		JSONObject OutOfPositions = band_0.getJSONObject("OUT_OF_POSITION");
		//System.out.println(TotalHeadcount);
		BigDecimal OOP_Head_Qty = OutOfPositions.optBigDecimal("HEADCNT_QTY", null);
		String OOP_Band = OutOfPositions.getString("BAND");
		System.out.println(OOP_Head_Qty);
		System.out.println(OOP_Band);
		
		JSONObject AvgBandGoal = band_0.getJSONObject("AVG_BAND_GOAL");
		//System.out.println(TotalHeadcount);
		BigDecimal ABG_Head_Qty = AvgBandGoal.optBigDecimal("HEADCNT_QTY", null);
		String ABG_Band = AvgBandGoal.getString("BAND");
		System.out.println(ABG_Head_Qty);
		System.out.println(ABG_Band);
		
		JSONArray band = band_0.getJSONArray("BANDS");
		//System.out.println(band);
		int length = band.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = band.getJSONObject(k);
			String HCTotalGoal = json.optString("HC_TOTAL_GOAL");
			int HCTotal = json.getInt("HC_TOTAL");
			String Band_band = json.getString("BAND");
			System.out.println(HCTotalGoal);
			System.out.println(HCTotal);
			System.out.println(Band_band);
			
			JSONArray sub_band = json.getJSONArray("SUB_BANDS");
			//System.out.println(sub_band);
			int length2 = sub_band.length();
			for(int l=0;l<length2;l++)
			{
				JSONObject json2 =sub_band.getJSONObject(l);
				BigDecimal HeadC_qty = json2.optBigDecimal("HEADCNT_QTY", null);
				BigDecimal Sub_Band_Avg_Headcnt_per = json2.getBigDecimal("SUB_BAND_AVG_HEADCNT_PCT");
				int gap = json2.optInt("GAP");
				String subBand = json2.getString("SUB_BAND");
				int band_avg_headcnt_pct_goal = json2.optInt("BAND_AVG_HEADCNT_PCT_GOAL");
				BigDecimal Band_Avg_Headcnt_pct = json2.getBigDecimal("BAND_AVG_HEADCNT_PCT");
				
				System.out.println(HeadC_qty);
				System.out.println(Sub_Band_Avg_Headcnt_per);
				System.out.println(gap);
				System.out.println(subBand);
				System.out.println(band_avg_headcnt_pct_goal);
				System.out.println(Band_Avg_Headcnt_pct);
				
				
			}
			
		}
			
		}
		
	       		}	
		}
	}
}
