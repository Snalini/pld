package com.pld.Util;
import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Iterator;
import java.util.Vector;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



import com.pld.Base.PldTestBase;

public class TestUtil extends PldTestBase{

	public static long PAGE_LOAD_TIME_OUT = 80;
	public static long IMPLICIT_WAIT = 20;
	public static String TESTDATA_SHEET_PATH = "C://Users//ShireeshaBudida//Desktop//PLD_auto_testing//PracticeLeaderDashboard_Automation_Selenium//src//main//java//com//pld//Testdata//LaborPoolCombinations.xlsx";
	static Workbook book;
	static Sheet sheet;
	public static CellType data1;
	
	public String inputFile;
	String[][] data =null;
	public TestUtil() throws IOException {
		super();


	}
	/*public static CellType getTestData1(String sheetName) throws IOException
	{
		FileInputStream fis = new FileInputStream(new File(TESTDATA_SHEET_PATH));
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		Iterator<Row> rowIterator = sheet.rowIterator();
		while(rowIterator.hasNext())
		{
			Row row =rowIterator.next();
			Iterator<Cell> cellIterator = row.cellIterator();
			while(cellIterator.hasNext())
			{
				Cell cell = cellIterator.next();
				CellType data1 = cell.getCellType();
				switch(cell.getCellType())
				{
				case  NUMERIC:
                    System.out.print(cell.getNumericCellValue());
                    break;
                case STRING:
                    System.out.print(cell.getStringCellValue());
                    break;
				}
			}
			
		}
		fis.close();
		
		return data1;
		
		//System.out.println(sheet.getRow(1).getCell(1));
	}*/
	
	/*public static void getTestData(String sheetName) throws Exception, IOException
	{
		
		FileInputStream file = null;
		
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			book = WorkbookFactory.create(file);
			
		}catch(InvalidFormatException e)
		{
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		//Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		System.out.println(sheet.getLastRowNum() + "...." +sheet.getRow(0).getLastCellNum());
	}
		/*for(int i=0;i<sheet.getLastRowNum();i++) {
			for(int k=0;k<sheet.getRow(0).getLastCellNum();k++)
			{
				data[i][k] = sheet.getRow(i+1).getCell(k).toString();
			}
		}*/
	//return data;
	
	
	
	public static void captureScreenShot(String screenshotname)
	{
		try {
			
			String screendir = "./Screenshots";
			String filename = screenshotname+"_"+".png";
			Path screenshotpath = Paths.get(screendir, filename);
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			//File destFile = new File(fileWithPath);
			//String filename = screenshotname +".png";
			//String directory ="C:\\Users\\ShireeshaBudida\\Desktop\\PLD_auto_testing\\PracticeLeaderDashboard_Automation_Selenium\\Screenshots";
			FileUtils.copyFile(src,screenshotpath.toFile() );
			//FileUtils.copyFile(src, destFile);
			System.out.println("Screen shot taken");
		} catch (Exception e) {
			System.out.println("Exception while taking screenshot "+e.getMessage());
			
		}
	}
	
	/*public static String getTestData2(String sheetName) throws IOException
	{
		FileInputStream fis = new FileInputStream(new File(TESTDATA_SHEET_PATH));
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		Iterator<Row> rowIterator = sheet.rowIterator();
		while(rowIterator.hasNext())
		{
			Row row =rowIterator.next();
			Iterator<Cell> cellIterator = row.cellIterator();
			List<String> cellStoreVector = new ArrayList<String>();
			while(cellIterator.hasNext())
			{
				Cell cell = cellIterator.next();
				String cellvalue = cell.getStringCellValue();
				
				cellStoreVector.add(cellvalue);
				
			}
			
				/*String firstcolumnValue = null;
				String secondcolumnValue = null;
				int i=0;
				firstcolumnValue = cellStoreVector.get(i).toString();
				secondcolumnValue = cellStoreVector.get(i+1).toString();
				System.out.println(firstcolumnValue);*/
				/*}
		return sheetName;
			}*/
			
		
	/*	public static String setData(String sheetName) throws Exception, IOException
		{
			XSSFWorkbook wb = new XSSFWorkbook(new File(TESTDATA_SHEET_PATH));
			XSSFSheet sheet = wb.getSheetAt(0);
			DataFormatter formatter = new DataFormatter();
			for (Iterator iterator = sheet.rowIterator(); iterator.hasNext();) {
			    XSSFRow row = (XSSFRow) iterator.next();
			    for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
			        XSSFCell cell = row.getCell(i);
			        System.out.println(formatter .formatCellValue(cell));
			    }

			}
			return sheetName;
		}*/
		
		 public static String responseMethod(String url)
			{
				StringBuffer response = new StringBuffer();
				try {
			
				URL url1 = new URL(url);
				HttpURLConnection conn = (HttpURLConnection) url1.openConnection();
				String encoded = Base64.getEncoder().encodeToString((prop.getProperty("username")+":"+prop.getProperty("password")).getBytes(StandardCharsets.UTF_8));  //Java 8
				conn.setRequestProperty("Authorization", "Basic "+encoded);
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
	



