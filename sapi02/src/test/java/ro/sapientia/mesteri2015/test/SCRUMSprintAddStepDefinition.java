package ro.sapientia.mesteri2015.test;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class SCRUMSprintAddStepDefinition {
	protected WebDriver driver;
	
  @Before
  public void setUp() {
	  driver = new FirefoxDriver();
  }
  @Given("^I open the sprint add page$")
  public void I_open_the_sprint_add_page() throws Throwable {
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.get("http://localhost:8080/");
  }

  @When("^I enter \"([^\"]*)\" in the title textbox and \"([^\"]*)\" in the Description text area and push the add button$")
  public void I_enter_Title_in_the_title_textbox_and_Description_in_the_Description_text_area_and_push_the_add_button(
		  String titleText, String descText) throws Throwable {
	  WebElement navigationButton = driver.findElement(By.id("navigation-button"));
	  navigationButton.click();
	  
	  WebElement addButton = driver.findElement(By.id("add-button"));
	  addButton.click();
	  
	  WebElement title = driver.findElement(By.id("sprint-title"));
	  title.clear();
	  title.sendKeys(titleText);
	  
	  WebElement description = driver.findElement(By.id("sprint-description"));
	  description.clear();
	  description.sendKeys(descText);
	  
	  WebElement sprintAddButton = driver.findElement(By.id("add-sprint-button"));
	  sprintAddButton.click();
	  
	  
	  
  }
  @Then("^I should get result \"([^\"]*)\" in the sprints list$")
  public void i_should_get_result_in_the_sprints_list(String arg1) throws Throwable {
      // Write code here that turns the phrase above into concrete actions
	  WebElement sprintTextBox = driver.findElement(By.id("sprint-title"));
	  String result = sprintTextBox.getText();
	  
	  Assert.assertEquals(arg1, result);
  }
  
  @After
  public void close() {
	  driver.quit();
  }

}
