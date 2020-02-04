package pages.actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.locators.StandardsHomepageLocators;
import utils.SeleniumDriver;

public class StandardsHomepagesActions {
	
	public static WebDriver driver;

	StandardsHomepageLocators standardsHomepageLocators=null;
    public StandardsHomepagesActions()
    {
        
        this.standardsHomepageLocators=new StandardsHomepageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), standardsHomepageLocators);
    }

    /**
     *  Add actions to be performed on this page
     *  
     */
    
	public void moveToLoginButtonMenu()
	{
		Actions action= new Actions(SeleniumDriver.getDriver());
		action.moveToElement(standardsHomepageLocators.loginButtonLink).perform();
	}
	
	public void clickOnInfostoreMenu()
	{
		WebElement info = SeleniumDriver.getDriver().findElement(By.xpath("//div[@class='desktop-login']//a[contains(text(),'Infostore')]"));
		JavascriptExecutor js = (JavascriptExecutor) SeleniumDriver.getDriver();
		js.executeScript("arguments[0].click();", info);
		
	}

	

	
}
