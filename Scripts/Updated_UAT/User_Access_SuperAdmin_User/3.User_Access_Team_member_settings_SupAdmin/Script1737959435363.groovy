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

WebUI.callTestCase(findTestCase('Updated_Prod/User_Access_SuperAdmin_User/3.1.User_Access_Team_member_settings_SupAdmin_Login'), 
    [('LoginEmail') : GlobalVariable.EmailLogin_PROD, ('General_TeamMember') : 'supadmeam20@yopmail.com', ('UAT') : GlobalVariable.UAT
        , ('PROD') : GlobalVariable.PROD, ('LimitedUserByGen') : 'admbysupadm@yopmail.com'], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.openBrowser('')

'This Script Covers addition and updating team member info for firm user.\r\nThis script have adding client through file upload flow where validation of \r\nduplicate/existing and incoorect file format has done.\r\nEnsure to have the respective data in corresponding uploaded file.\r\nUpdate the variable used for adding team member.'
WebUI.navigateToUrl(UAT)

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

WebUI.click(findTestObject('User_Access/Can add team members'))

WebUI.delay(2)

//String Text = WebUI.getText(findTestObject('User_Access/Grant_Permission_popup'))
//WebUI.verifyElementText(findTestObject('User_Access/Grant_Permission_popup'), 'Granting this user access could affect your credit card billing, as they will have the ability to add or remove team members.')
//WebUI.click(findTestObject('User_Access/Proceed_Grant_Permission'))
WebUI.delay(2)

WebUI.click(findTestObject('User_Access/Can edit team members'))

WebUI.delay(2)

WebUI.click(findTestObject('User_Access/Can delete team members'))

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

WebUI.click(findTestObject('User_Access/Team_Page'))

WebUI.delay(2)

WebUI.verifyElementNotClickable(findTestObject('AddTeam_AllRegression_Dashboard/Add_Team_Dropdown'))

WebUI.verifyElementNotClickable(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Edit_Button_Team_Staff_Sec'))

WebUI.verifyElementNotClickable(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Delete_Button_AllTeam_Sec'))

WebUI.delay(2)

WebUI.click(findTestObject('Stripe/User_Profile'))

WebUI.click(findTestObject('OnboardingObjects/Page_UAT (Countable)/span_Log out'))

WebUI.closeBrowser()

