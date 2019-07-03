package com.pld.Pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pld.Base.PldTestBase;

public class LaborType extends PldTestBase{
	
	@FindBy(xpath = "//*[contains(text(),'Filters')]")
	WebElement Filters;
	@FindBy(css="span[class='button-inner']")
	List<WebElement> FilterList;
	@FindBy(xpath="//span//ion-chip[1]//ion-label")
	List<WebElement> LaborPoolType;
	@FindBy(xpath = "/html/body/ion-app/ion-modal/div/page-filters/ion-header/ion-navbar/div[2]/button/span")
	WebElement DoneButton;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[1]/ion-grid/ion-row[2]/span[1]/ion-chip/button/span/ion-icon")
	WebElement CPSDeliverySel;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[1]/ion-grid/ion-row[2]/span[2]/ion-chip/button/span/ion-icon")
	WebElement CenterOFCompitencySel;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[1]/ion-grid/ion-row[2]/span[3]/ion-chip/button/span/ion-icon")
	WebElement DomesticAffliateSel;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[1]/ion-grid/ion-row[2]/span[4]/ion-chip/button/span/ion-icon")
	WebElement DomesticCenterSel;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[1]/ion-grid/ion-row[2]/span[5]/ion-chip/button/span/ion-icon")
	WebElement DomesticRegularSel;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[1]/ion-grid/ion-row[2]/span[6]/ion-chip/button/span/ion-icon")
	WebElement DomesticsubKSel;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[1]/ion-grid/ion-row[2]/span[7]/ion-chip/button/span/ion-icon")
	WebElement GlobalCenterSel;
public LaborType()
{
	super();
	PageFactory.initElements(driver, this);
}

public void verifyCombinationOflaborType() throws Exception
{
	Thread.sleep(5000);
	Filters.click();
	Thread.sleep(3000);
	
	System.out.println(FilterList.size());
	
	for(int a=0;a<FilterList.size();a++)
	{
	
		WebElement text = FilterList.get(a);

		String values  = text.getText();
		System.out.println("FilterValues are " +values);
		
		if(values.equals("Labor Pool"))
		{
			Thread.sleep(3000);
			((JavascriptExecutor)driver).executeScript("arguments[0].click()",FilterList.get(3));
			
			System.out.println("Size of laborpool "+LaborPoolType.size());
			for(int ah=0;ah<LaborPoolType.size();ah++)
			{
				WebElement laborpool = LaborPoolType.get(ah);
				String LaborType = laborpool.getText();
				System.out.println("LaborType values are "+LaborType);
				
				if(LaborType.equals("Global Center"))
				{
					((JavascriptExecutor)driver).executeScript("arguments[0].click()",GlobalCenterSel);
					((JavascriptExecutor)driver).executeScript("arguments[0].click()",DomesticsubKSel);
					
					
				}
			}
			DoneButton.click();
		}
	}
}
}