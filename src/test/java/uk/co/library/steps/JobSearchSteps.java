package uk.co.library.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;

public class JobSearchSteps {
    @Given("I am on HomePage")
    public void iAmOnHomePage() {
    }

    @When("enter job title {string}")
    public void enterJobTitle(String jobTitle) {
        new HomePage().enterJobTitle(jobTitle);
    }

    @Then("enter Location {string}")
    public void enterLocation(String location) {
        new HomePage().enterLocation(location);
    }

    @And("select distance {string}")
    public void selectDistance(String distance) {
        new HomePage().selectDistance(distance);
    }

    @And("click on moreSearchOptionsLink")
    public void clickOnMoreSearchOptionsLink() {
        new HomePage().clickOnMoreSearchOptionLink();
    }

    @And("enter salaryMin {string}")
    public void enterSalaryMin(String salaryMin) {
        new HomePage().enterMinSalary(salaryMin);
    }

    @And("enter salaryMax {string}")
    public void enterSalaryMax(String salaryMax) {
        new HomePage().enterMaxSalary(salaryMax);
    }

    @And("select salaryType {string}")
    public void selectSalaryType(String salaryType) {
        new HomePage().selectSalaryType(salaryType);
    }

    @And("select jobType {string}")
    public void selectJobType(String jobType) {
        new HomePage().selectJobType(jobType);
    }

    @And("click on Find Jobs button")
    public void clickOnFindJobsButton() {
        new HomePage().clickOnFindJobsButton();
    }

    @And("verify the result {string}")
    public void verifyTheResult(String result) {
        Assert.assertEquals(new ResultPage().verifyTheResults(result) ,result );
    }
}
