import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import javax.xml.crypto.dsig.keyinfo.KeyValue as KeyValue
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.builtin.FindWebElementKeyword as FindWebElementKeyword
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By
import org.openqa.selenium.WebElement;  // For interacting with web elements
import org.openqa.selenium.support.ui.Select;  // For handling dropdowns
import java.util.List;  // For using List data structure
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;


WebUI.openBrowser('')

'This Script Covers addition and updating team member info for firm user.\r\nThis script have adding client through file upload flow where validation of \r\nduplicate/existing and incoorect file format has done.\r\nEnsure to have the respective data in corresponding uploaded file.\r\nUpdate the variable used for adding team member.'
WebUI.navigateToUrl(PROD)

WebUI.findWebElement(findTestObject('LoginPage/User_Email'), 0)

WebUI.setText(findTestObject('LoginPage/User_Email'), LoginEmail)

WebUI.findWebElement(findTestObject('LoginPage/User_Password'), 5)

WebUI.setEncryptedText(findTestObject('LoginPage/User_Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('LoginPage/LoginButton'))

WebUI.delay(2)

WebUI.maximizeWindow()

WebUI.click(findTestObject('User_Access/Team_Page'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Add_Team_Dropdown'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Add New Member'))

/*
 * WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Choose
 * Category_Object1st'))
 * 
 * WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/
 * Category_Partner_M'))
 * 
 * WebUI.setText(findTestObject('AddTeam_AllRegression_Dashboard/First
 * Name_Team'), 'Narayan')
 * 
 * WebUI.setText(findTestObject('AddTeam_AllRegression_Dashboard/Last
 * Name_Team'), 'Singh')
 * 
 * WebUI.setText(findTestObject('AddTeam_AllRegression_Dashboard/input_Email_M')
 * , General_TeamMember)
 * 
 * WebUI.setText(findTestObject('AddTeam_AllRegression_Dashboard/Title_Team'),
 * 'Mr')
 * 
 * WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/
 AccessType_Dropdwon'))
 */

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/AccessType_Dropdwon'))
WebDriver driver = DriverFactory.getWebDriver()
 List<WebElement> elements = driver.findElements(By.xpath("//ng-dropdown-panel/div/div/div"));

        // Expected values for comparison
       String[] expectedValues = ["Super Admin", "Admin", "General", "Limited"]

        // Iterate through each WebElement and compare with expected values
        for (int i = 0; i < elements.size(); i++) {
            String actualValue = elements.get(i).getText();
            String expectedValue = expectedValues[i];
			System.out.print(actualValue)

            // Assert that the actual value matches the expected value
            Assert.assertEquals("Mismatch at index " + i, expectedValue, actualValue);
        }
WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/span_Admin'))
/*
 * import org.openqa.selenium.WebElement; // To interact with web elements
 * import org.openqa.selenium.support.ui.Select; // To work with select
 * dropdowns import java.util.List; // To store list of options import
 * java.util.ArrayList
 */;  // To create a list

/*
 * // Find the dropdown element TestObject dropdown =
 * findTestObject('AddTeam_AllRegression_Dashboard/AccessType_Dropdwon'); //
 * Replace with actual locator for your dropdown
 * 
 * // Create a Select object to interact with the dropdown Select select = new
 * Select(dropdown);
 * 
 * // Get all options from the dropdown List<WebElement> options =
 * select.getOptions();
 * 
 * // Create a list to store the dropdown values List<String> actualValues = new
 * ArrayList<>();
 * 
 * // Loop through each option and add the text to the list for (WebElement
 * option : options) { actualValues.add(option.getText()); }
 * 
 * // Print the captured values println(actualValues);
 */
