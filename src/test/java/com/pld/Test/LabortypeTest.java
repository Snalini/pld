package com.pld.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pld.Base.PldTestBase;
import com.pld.Pages.LaborType;

public class LabortypeTest extends PldTestBase {
	
	public LaborType labortype;
	
	@BeforeClass
	public void setUp()
	{
		labortype = new LaborType();
	}
	
	@Test(priority=1)
	public void selectionofComboTest() throws Exception
	{
		labortype.verifyCombinationOflaborType();
	}

}
