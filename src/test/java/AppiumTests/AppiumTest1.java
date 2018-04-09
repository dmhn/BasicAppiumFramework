package AppiumTests;
import io.appium.java_client.MobileBy;
//working script
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.appiumbookblog.qa.base.AppiumDriverBase;

import io.appium.java_client.MobileBy;
public class AppiumTest1 extends AppiumDriverBase {
	    //Test Annotation changes any java function to TestNG test case
	    @Test
	    public void sampeTest(){
	 
	    //click on Accessibility link
	    wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Accessibility")));
	    driver.findElement(MobileBy.AccessibilityId("Accessibility")).click();
	 
	    //click on 'Accessibility Node Querying' link
	    wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Accessibility Node Querying")));
	    driver.findElement(MobileBy.AccessibilityId("Accessibility Node Querying")).click();
	 
	    //back
	    driver.navigate().back();
	 
	    //back
	    driver.navigate().back();
	    }
	 
	}


