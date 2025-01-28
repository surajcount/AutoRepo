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
import java.util.List as List
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.junit.Assert as Assert

WebUI.openBrowser('')

'This Script Covers addition and updating team member info for firm user.\r\nThis script have adding client through file upload flow where validation of \r\nduplicate/existing and incoorect file format has done.\r\nEnsure to have the respective data in corresponding uploaded file.\r\nUpdate the variable used for adding team member.'
WebUI.navigateToUrl(UAT)

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.setText(findTestObject('LoginPage/User_Email'), General_TeamMember)

WebUI.setEncryptedText(findTestObject('LoginPage/User_Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('LoginPage/LoginButton'))

WebUI.delay(2)

WebUI.click(findTestObject('User_Access/Team_Page'))

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('AddTeam_AllRegression_Dashboard/Add_Team_Dropdown'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Add_Team_Dropdown'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Add New Member'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Choose Category_Object1st'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Category_Partner_M'))

WebUI.setText(findTestObject('AddTeam_AllRegression_Dashboard/First Name_Team'), 'Super')

WebUI.setText(findTestObject('AddTeam_AllRegression_Dashboard/Last Name_Team'), 'Singh')

WebUI.setText(findTestObject('AddTeam_AllRegression_Dashboard/input_Email_M'), LimitedUserByGen)

WebUI.setText(findTestObject('AddTeam_AllRegression_Dashboard/Title_Team'), 'Sr. Dev')

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/AccessType_Dropdwon'))

WebDriver driver = DriverFactory.getWebDriver()

List<Map> elements = driver.findElements(By.xpath('//ng-dropdown-panel/div/div/div'))

// Expected values for comparison
String[] expectedValues = ['Super Admin', 'Admin', 'General', 'Limited']

// Iterate through each WebElement and compare with expected values
for (int i = 0; i < elements.size(); i++) {
    String actualValue = elements.get(i).getText()

    String expectedValue = expectedValues[i]

    System.out.print(('Dropdown values are : ' + actualValue) + ' ')

    // Assert that the actual value matches the expected value
    Assert.assertEquals('Mismatch at index ' + i, expectedValue, actualValue)
}

WebUI.click(findTestObject('User_Access/Admin_User'))

WebUI.delay(2)

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Add_button_Team'))

try {
    WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/span_Confirm'), FailureHandling.CONTINUE_ON_FAILURE)
}
catch (NoSuchElementException e) {
    System.out.println('Free trial user.')
} 

WebUI.delay(2)

WebUI.verifyTextPresent('Team member record added successfully', false)

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Edit_Button_Team_Staff_Sec'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Edit_Button_Team_Staff_Sec'))

WebUI.setText(findTestObject('User_Access/Cellphone'), '9857458745')

WebUI.click(findTestObject('User_Access/Save_Team_Details'))

WebUI.click(findTestObject('User_Access/Save_Changes_Popup'))

WebUI.verifyTextPresent('Team member record updated successfully', false)

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Delete_Button_AllTeam_Sec'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Delete_Button_AllTeam_Sec'))

WebUI.click(findTestObject('Notes_Firm/Delete_on_popup'))

WebUI.verifyTextPresent('Team member deleted successfully', false)

WebUI.delay(2)

WebUI.click(findTestObject('Stripe/User_Profile'))

WebUI.click(findTestObject('OnboardingObjects/Page_UAT (Countable)/span_Log out'))

WebUI.closeBrowser()

