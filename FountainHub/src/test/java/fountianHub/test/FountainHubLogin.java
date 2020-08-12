package fountianHub.test;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vaadin.testbench.TestBenchTestCase;

import fountainHub.pageObject.IndexViewPageObject;

public class FountainHubLogin extends TestBenchTestCase {
	
	@Before
	public void setUp() {
		
		setDriver(new ChromeDriver());
		getDriver().get("https://hub-qa4.fountain.cool/login");
	}
	
	@Test
	public void FountainHubLogin() {
		
		IndexViewPageObject indexView = new IndexViewPageObject(getDriver());
		indexView.navigateTo();
		
	}

}
