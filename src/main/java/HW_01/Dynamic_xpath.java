package HW_01;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dynamic_xpath {
// Tag with a single attribute
	@FindBy(xpath = "//button[@class='search-icon__container']")
	WebElement searchButton;

// Tag with inner text
	@FindBy(xpath = "//button[text()='Resident']")
	WebElement residentButton;

// Tag with partial inner text from any website.
	@FindBy(xpath = "//a[contains(text(),'Texas by ')]")
	WebElement tByT;

// Tag with multiple attributes with 'and' logic
	@FindBy(xpath = "//button[@class='main-nav__nav-button' and text()='Find Services']")
	WebElement findService;

}
