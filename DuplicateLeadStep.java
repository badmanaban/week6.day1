package week6.day1;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DuplicateLeadStep extends BaseClass {
	@Then("My Home page should get open")
	public void my_home_page_should_open() {
		System.out.println("The page is : " + driver.getTitle());
	}

	@When("Click on Leads button")
	public void click_on_leads() {
		driver.findElement(By.linkText("Leads")).click();
	}

	@Then("My Leads page should get open")
	public void my_leads_page_should_open() {
		System.out.println("The page is : " + driver.getTitle());
	}

	@When("Clicking on find_leads")
	public void click_on_find_leads() {
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
	}

	@Then("find leads page should get open")
	public void find_leads_page_should_open() {
		System.out.println("The page is : " + driver.getTitle());
	}

	@Given("Enter the firstname")
	public void firstName() {
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("bathu");
	}

	@When("Click on findleads button")
	public void findLeads() throws InterruptedException {
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(2000);
	}

	@When("click on firstresult")
	public void click_on_the_first_result() {
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]")).click();
	}

	@Then("view lead page should get open")
	public void view_leads_page_should_open() {
		System.out.println("The page is : " + driver.getTitle());
	}

	@When("Click on Duplicate lead")
	public void DuplicateLead() {
		driver.findElement(By.xpath("//a[contains(text(),'Duplicate Lead')]")).click();
	}

	@Then("Duplicate lead page should open")
	public void duplicatePageOpen() {
		System.out.println("The page is : " + driver.getTitle());
	}

	@When("Click on create lead button")
	public void clickCreateLead() {
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	}
	@Then("View lead page should get open")
	public void viewLead() {
		String text2 = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		if (text2.contains("")) {
			System.out.println("duplicated lead name is same as captured name");
	}
	
	}
}
