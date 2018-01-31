package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

	@FindBy(how=How.XPATH, using="(//*[text()='Sign In'])[2]")
	WebElement SignIn_option;
	
	@FindBy(how=How.XPATH, using="//*[text()='Already a customer?']//ancestor::li[1]//following-sibling::a")
	WebElement SignIn_btn;
	
	public WebElement selectingSignInOption()
	{
		return SignIn_option;
	}
	public WebElement clickingSignIn()
	{
		return SignIn_btn;
		
	}
}
