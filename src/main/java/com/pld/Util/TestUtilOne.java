package com.pld.Util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

//import org.apache.poi.hssf.usermodel.HSSFCell;
//import org.apache.poi.hssf.usermodel.HSSFRow;
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//	import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.pld.Base.PldTestBase;

//import jxl.Sheet;
//import jxl.Workbook;
//import jxl.read.biff.BiffException;

import java.util.Iterator;

/*import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;*/
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;

//import com.gargoylesoftware.htmlunit.javascript.host.Iterator;

public class TestUtilOne extends PldTestBase{
	
	public static List getTestData2() throws IOException, Exception
	{
	String filename = prop.getProperty("SectorComb1");
	 
	 List sheetData = new ArrayList();
	 FileInputStream fis = null;
	        try 
	        {
	        	fis = new FileInputStream(filename);
	// Workbook wb= Workbook.getWorkbook(fis);
	//Sheet sheet= wb.getSheet(0);
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	XSSFSheet sheet = workbook.getSheetAt(0);
	     //org.apache.poi.ss.usermodel.Workbook workbook = WorkbookFactory.create(fis);
	     //org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheetAt(0);
	 
	 Iterator rows = ((XSSFSheet) sheet).rowIterator();
	            while ( rows.hasNext()) {
	                XSSFRow row = (XSSFRow) rows.next();
	                Iterator cells = row.cellIterator();
	 
	                List<XSSFCell> data = new ArrayList<XSSFCell>();
	                while ( cells.hasNext()) {
	                    XSSFCell cell = (XSSFCell) cells.next();
	                    
	                    data.add(cell);
	                    
	                    
	                }
	 
	                sheetData.add(data);
	                workbook.close();
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            if (fis != null) {
	                fis.close();
	                
	            }
	        }
	        return sheetData;

}	
	
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
	
}
