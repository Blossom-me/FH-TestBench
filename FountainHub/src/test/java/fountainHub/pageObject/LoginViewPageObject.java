package fountainHub.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vaadin.flow.component.button.testbench.ButtonElement;
import com.vaadin.flow.component.textfield.testbench.TextFieldElement;
import com.vaadin.testbench.TestBenchTestCase;

public class LoginViewPageObject extends TestBenchTestCase {

	public LoginViewPageObject(WebDriver driver) {
		setDriver(driver);
	}

	public void login(String username, String password) {

		TextFieldElement text = $(TextFieldElement.class).first();
		text.setValue("username");
		TextFieldElement pwd = $(TextFieldElement.class).get(2);
		pwd.setValue("password");
	}
	
	public IndexViewPageObject clickLogin() {
		ButtonElement login = $(ButtonElement.class).first();
		login.click();
		return new IndexViewPageObject(getDriver());
	}
	
	public void navigateTo() {
		setDriver(new ChromeDriver());
		getDriver().get("https://hub-qa4.fountain.cool/login");
		
	}

}
