package week6.day1;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLeadStep extends BaseClass {

	@Then("My Home page should open")
	public void my_home_page_should_open() {
		System.out.println("The page is : " + driver.getTitle());
	}

	@When("Click on Leads")
	public void click_on_leads() {
		driver.findElement(By.linkText("Leads")).click();
	}

	@Then("My Leads page should open")
	public void my_leads_page_should_open() {
		System.out.println("The page is : " + driver.getTitle());
	}

	@When("Click on find_leads")
	public void click_on_find_leads() {
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
	}

	@Then("find leads page should open")
	public void find_leads_page_should_open() {
		System.out.println("The page is : " + driver.getTitle());
	}

	@Given("Enter the first_name")
	public void firstName() {
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("bathu");
	}

	@When("Click on findleads")
	public void findLeads() throws InterruptedException {
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(2000);
	}

	@When("click on the firstresult")
	public void click_on_the_first_result() {
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]")).click();
	}

	@Then("view lead page should open")
	public void view_leads_page_should_open() {
		System.out.println("The page is : " + driver.getTitle());
	}

	@When("click on edit button")
	public void click_on_edit_button() {
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
	}

	@Then("opentaps page should open")
	public void opentaps_page_should_open() {
		System.out.println("The page is : " + driver.getTitle());
	}

	@Given("Edit the company name")
	public void edit_the_company_name() {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("-edited");
	}

	@When("Click on update button")
	public void click_on_update_button() {
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
	}

	@Then("View lead page should open")
	public void view_lead_page_should_open() {
		System.out.println("The page is : " + driver.getTitle());
	}

}
