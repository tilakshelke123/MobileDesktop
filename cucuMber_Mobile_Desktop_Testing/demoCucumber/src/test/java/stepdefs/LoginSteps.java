package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    // 1st Scenario 
    @Given("I am on the login page")
    public void login() {
        System.out.println("Navigated to login page");
    }

    @When("I enter username {string}")
    public void username(String testUser) {
        System.out.println("Successfully entered username: " + testUser);
    }

    @And("I enter password {string}")
    public void password(String testPass) {
        System.out.println("Successfully entered password: " + testPass);
    }

    @And("I click the login button")
    public void button() {
        System.out.println("I click on login button");
    }

    @Then("I should see the home page")
    public void homePage() {
        System.out.println("Navigated to home page");
    }
    
    //  2nd Scenario 
    @When("I Login with {string} and {string}")
    public void usernamepass(String username, String password) {
        System.out.println("Successfully entered username: " + username+ "Successfully entered username: " + password);
    }
    
    @And("I click on {string} button")
    public void usernamepassLogin(String button) {
        System.out.println("Successfully login"+button);
    }
    //  3rd Scenario 
    @When("I calculate  with {int} and {int}")
    public void cal(Integer a, Integer b) {
        System.out.println("Addition:"+(a+b));
       
    }
   
}