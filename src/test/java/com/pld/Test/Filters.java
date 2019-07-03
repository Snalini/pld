package com.pld.Test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pld.Base.PldTestBase;
import com.pld.Pages.FiltersPage;

public class Filters extends PldTestBase{
	
	FiltersPage filterspage;
	
	@BeforeClass
	public void setUp()
	{
		filterspage= new FiltersPage();
		
	}
	
	@Test(priority=1)
	public void verifyFilters() throws InterruptedException
	{
		filterspage.clickOnFilters();
		
	}
	@Test(priority=2)
	public void verifyLaborPoolTest()
	{
		Assert.assertTrue(filterspage.verifyLaborPool());
		
	}
	@Test(priority=3)
	public void clickOnlaborPoolTest()
	{
		filterspage.clickOnlaborPool();
	}

}
