package com.pld.Pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.Point;

import com.pld.Base.PldTestBase;


public class UtilizationPage extends PldTestBase{
	
	@FindBy(xpath = "//*[contains(text(),'Utilization')]")
	WebElement Utiltile;
	
	@FindBy(xpath = "//*[contains(text(),'Actuals')]")
	WebElement Utiltile_Acttext;
	
	@FindBy(xpath = "//*[contains(text(),'Target (pts)')]")
	WebElement Utiltile_Targettext;
	
	@FindBy(xpath = "//*[contains(text(),'YTY (pts)')]")
	WebElement Utiltile_YTYtext;
	
	@FindBy(xpath = "//*[contains(text(),'Prior Year')]")
	WebElement Utiltile_Prioryeartext;
	
	@FindBy(xpath = "//*[contains(text(),'Billable')]")
	WebElement Utiltile_Billabletext;
	
	@FindBy(xpath = "//*[contains(text(),'Chargeable')]")
	WebElement utiltile_Chargetext;
	
	@FindBy(xpath = "//*[contains(text(),'Productive')]")
	WebElement utiltile_Productivetext;
	
	@FindBy(xpath = "//*[contains(text(),'Target Utilization')]")
	WebElement TargetUtilization;
	
	@FindBy(xpath = "//*[contains(text(),'QTD & YTD as of')]")
	WebElement QTDandYTDasof;
	
	@FindBy(xpath = "//*[@class='ACTUALS-header-row']")
	List<WebElement> TipValues;
	
	@FindBy(xpath="//util-bar-chart//*[name()='svg']")
	WebElement UtilBargraph;
	
	
	

	public UtilizationPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyUtilTile()
	{
		return Utiltile.isDisplayed();
	}
	
	public boolean verifyUtilTileActtext()
	{
		return Utiltile_Acttext.isDisplayed();
	}

	public boolean verifyUtilTileTargettext()
	{
		return Utiltile_Targettext.isDisplayed();
	}
	
	public boolean verifyUtilTileYTYtext()
	{
		return Utiltile_YTYtext.isDisplayed();
	}
	
	public boolean verifyUtilTilePrioritytext()
	{
		return Utiltile_Prioryeartext.isDisplayed();
	}
	
	public boolean verifyUtilTileBillabletext()
	{
		return Utiltile_Billabletext.isDisplayed();
	}
	public boolean verifyUtilTileChargetext()
	{
		return utiltile_Chargetext.isDisplayed();
	}
	
	public boolean verifyUtilTileProductivetext()
	{
		return utiltile_Productivetext.isDisplayed();
	}
	
	public boolean verifyTargetUtilizationText()
	{
		return TargetUtilization.isDisplayed();
	}
	
	public boolean verifyQTDandYTDasofText()
	{
		return QTDandYTDasof.isDisplayed();
	}
	public List<WebElement> getTextValue()
	{
		
		
		System.out.println(TipValues.size());
		
		for(int i=0;i<TipValues.size();i++)
		{
		String text = TipValues.get(i).getText();
		
		System.out.println("Actuals are: "+ text);
		}
		
		return TipValues;
	}
	
	public boolean verifyUtilBarGraph()
	{
		return UtilBargraph.isDisplayed();
	}
	
}
