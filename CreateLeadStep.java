package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadStep extends BaseClass {

	
	@When("Click on CRMSFA link")
	public void click_on_crmsfa_link() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	@Then("My Home page should display")
	public void my_home_page_should_display() {
	  System.out.println("The page is : " +  driver.getTitle());
	 
	}
	@When("Click on Contacts")
	public void click_on_contacts() {
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
	}
	@Then("Contacts page should display")
	public void contacts_page_should_display() {
		System.out.println("The page is : " +  driver.getTitle());
	}
	@When("Click on Create Contacts")
	public void click_on_create_contacts() {
		driver.findElement(By.xpath("//a[contains(text(),'Create Contact')]")).click();
	}
	@Then("Create contacts page should display")
	public void create_contacts_page_should_display() {
		System.out.println("The page is : " +  driver.getTitle());
	}
	@When("Enter the first name")
	public void enter_the_first_name() {
		driver.findElement(By.id("firstNameField")).sendKeys("jd");
	}
	@When("Enter the last name")
	public void enter_the_last_name() {
		driver.findElement(By.id("lastNameField")).sendKeys("bathu");
	}
	@When("Enter the Department name")
	public void enter_the_department_name() {
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("IT");
	}
	@When("Enter the Description")
	public void enter_the_description() {
		driver.findElement(By.id("createContactForm_description")).sendKeys("Testing");
	}
	@When("Enter the E-Mail Address")
	public void enter_the_e_mail_address() {
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("jdbathu@gmail.com");
	}
	@When("Select the State")
	public void select_the_state_province() {
		WebElement findElement = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select state = new Select(findElement);
		state.selectByVisibleText("New York");
	}
	@When("Click on Create Lead Button")
	public void click_on_create_lead_button() {
		driver.findElement(By.name("submitButton")).click();
	}
	@Then("View Lead page should be Opened")
	public void view_lead_page_should_be_opened() {
		System.out.println("The page is : " +  driver.getTitle());
	}
	}
	
