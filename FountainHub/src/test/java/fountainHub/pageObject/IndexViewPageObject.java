package fountainHub.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vaadin.testbench.TestBenchTestCase;

import fountainHub.pageObject.LoginViewPageObject;

public class IndexViewPageObject extends TestBenchTestCase {
	
	public IndexViewPageObject(WebDriver driver) {
		setDriver(driver);
	}
	
	public void navigateTo() {
		LoginViewPageObject loginView = new LoginViewPageObject(getDriver());
		
		//setDriver(new ChromeDriver());
	    //getDriver().get("https://qa.chaipoint.com/shark-manager/login");
	    //new WebDriverWait(getDriver(), 5).until(ExpectedConditions.presenceOfElementLocated(By.className("v-button v-widget")));
		//loginView.navigateTo();
		
		loginView.login("admin", "Chai@123^!");
		loginView.clickLogin();
	}

}
