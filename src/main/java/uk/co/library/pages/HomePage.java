package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//button[@id='save']")
    WebElement acceptAllCookies;
    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitleTextField;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Location']")
    WebElement locationTextField;

    @CacheLookup
    @FindBy(xpath="//select[@id='distance']")
    WebElement distanceDropDown;

    @CacheLookup
    @FindBy(xpath="//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionsLink;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;

    @CacheLookup
    @FindBy(xpath="//input[@id='salarymax']")
    WebElement salaryMax;

    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;

    @CacheLookup
    @FindBy(xpath="//select[@id='tempperm']")
    WebElement jobTypeDropDown;

    @CacheLookup
    @FindBy(xpath="//input[@type='submit'] ")
    WebElement findJobsBtn;

    public void acceptCookies()  {
        log.info("Accept All Cookies " + acceptAllCookies.toString());
        driver.switchTo().frame("gdpr-consent-notice");
        clickOnElement(acceptAllCookies);
    }
    public void enterJobTitle(String jobTitle) {
        sendTextToElement(jobTitleTextField,jobTitle );
    }
    public void enterLocation(String location) {
        sendTextToElement( locationTextField,location );
    }
    public void selectDistance(String distance) {
        selectByVisibleTextFromDropDown(distanceDropDown ,distance );
    }
    public void clickOnMoreSearchOptionLink() {
        clickOnElement(moreSearchOptionsLink);
    }
    public void enterMinSalary(String minSalary) {
        sendTextToElement(salaryMin ,minSalary );
    }
    public void enterMaxSalary(String maxSalary) {
        sendTextToElement(salaryMax,maxSalary );
    }
    public void selectSalaryType(String sType) {
        selectByVisibleTextFromDropDown(salaryTypeDropDown ,sType );
    }
    public void selectJobType(String jobType) {
        selectByVisibleTextFromDropDown(jobTypeDropDown,jobType);
    }
    public void clickOnFindJobsButton() {
        clickOnElement(findJobsBtn);
    }
}
