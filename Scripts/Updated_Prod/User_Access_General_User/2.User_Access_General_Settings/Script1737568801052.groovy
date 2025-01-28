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

WebUI.openBrowser('')

'This Script Covers addition and updating team member info for firm user.\r\nThis script have adding client through file upload flow where validation of \r\nduplicate/existing and incoorect file format has done.\r\nEnsure to have the respective data in corresponding uploaded file.\r\nUpdate the variable used for adding team member.'
WebUI.navigateToUrl(PROD)

WebUI.setText(findTestObject('LoginPage/User_Email'), LoginEmail)

WebUI.setEncryptedText(findTestObject('LoginPage/User_Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Page_UAT (Countable)/span_Login'))

WebUI.delay(2)

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.click(findTestObject('Stripe/User_Profile'))

WebUI.click(findTestObject('Stripe/Billing'))

WebUI.click(findTestObject('User_Access/User_And_Access'))

WebUI.delay(2)

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Edit_Button_Team_Staff_Sec'))

WebUI.delay(2)

WebUI.click(findTestObject('User_Access/Edit firm information'))

WebUI.delay(2)

WebUI.click(findTestObject('User_Access/Access to Billing'))

WebUI.delay(2)

WebUI.click(findTestObject('User_Access/Save_Team_Details'))

WebUI.click(findTestObject('User_Access/Save_Changes_Popup'))

WebUI.verifyTextPresent('Team member record updated successfully', false)

WebUI.delay(2)

WebUI.click(findTestObject('Stripe/User_Profile'))

WebUI.click(findTestObject('OnboardingObjects/Page_UAT (Countable)/span_Log out'))

WebUI.delay(2)

WebUI.setText(findTestObject('LoginPage/User_Email'), General_TeamMember)

WebUI.setEncryptedText(findTestObject('LoginPage/User_Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('LoginPage/LoginButton'))

WebUI.delay(2)

try {
    WebUI.click(findTestObject('User_Access/Luca_AI_Popup'), FailureHandling.CONTINUE_ON_FAILURE)
}
catch (NoSuchElementException e) {
    System.out.println('NO AI Popup')
} 

WebUI.click(findTestObject('Stripe/User_Profile'))

WebUI.click(findTestObject('Stripe/Billing'))

WebUI.verifyTextPresent('Billing', false)

WebUI.delay(2)

WebUI.click(findTestObject('Stripe/User_Profile'))

WebUI.click(findTestObject('User_Access/My_Account_Menu'))

WebUI.delay(2)

WebUI.click(findTestObject('User_Access/Firm_Info_Edit_Button'))

WebUI.clearText(findTestObject('User_Access/Firm_Name'))

WebUI.setText(findTestObject('User_Access/Firm_Name'), 'Edited by general user')

WebUI.click(findTestObject('User_Access/Update_Firm_info'))

WebUI.verifyTextPresent('Firm information updated successfully', false)

WebUI.delay(2)

WebUI.click(findTestObject('Stripe/User_Profile'))

WebUI.click(findTestObject('OnboardingObjects/Page_UAT (Countable)/span_Log out'))

