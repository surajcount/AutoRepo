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
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By

WebUI.openBrowser('')

'This Script Covers addition and updating team member info for firm user.\r\nThis script have adding client through file upload flow where validation of \r\nduplicate/existing and incoorect file format has done.\r\nEnsure to have the respective data in corresponding uploaded file.\r\nUpdate the variable used for adding team member.'
WebUI.navigateToUrl(PROD)

WebUI.setText(findTestObject('LoginPage/User_Email'), LoginEmail)

WebUI.setEncryptedText(findTestObject('LoginPage/User_Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('LoginPage/LoginButton'))

WebUI.delay(2)

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.click(findTestObject('Stripe/User_Profile'))

WebUI.click(findTestObject('Stripe/Billing'))

WebUI.click(findTestObject('User_Access/User_And_Access'))

WebUI.delay(2)

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Edit_Button_Team_Staff_Sec'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('User_Access/Engagement_Settings'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('User_Access/Can create engagements'))

WebUI.delay(2)

WebUI.click(findTestObject('User_Access/Can view engagements'))

WebUI.verifyTextPresent('Modify Engagement View Access', false)

WebUI.delay(2)

WebUI.click(findTestObject('User_Access/Back_To_UA_Page'))

WebUI.scrollToElement(findTestObject('User_Access/Engagement_Settings'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('User_Access/Can edit engagements'))

WebUI.click(findTestObject('User_Access/Edit_Engagement_Access'))

WebUI.verifyTextPresent('Modify Engagement Edit Access', false)

WebUI.delay(2)

WebUI.click(findTestObject('User_Access/Back_To_UA_Page'))

WebUI.scrollToElement(findTestObject('User_Access/Engagement_Settings'), 0)

WebUI.click(findTestObject('User_Access/Can delete engagements'))

WebUI.delay(2)

WebUI.click(findTestObject('User_Access/Save_Team_Details'))

WebUI.click(findTestObject('User_Access/Save_Changes_Popup'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Login/User_profile'))

WebUI.click(findTestObject('OnboardingObjects/Page_UAT (Countable)/span_Log out'))

WebUI.delay(2)

WebUI.setText(findTestObject('LoginPage/User_Email'), General_TeamMember)

WebUI.setEncryptedText(findTestObject('LoginPage/User_Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('LoginPage/LoginButton'))

WebUI.delay(3)

WebUI.click(findTestObject('User_Access/Engagements_List_Page'))

WebUI.delay(3)

WebUI.click(findTestObject('User_Access/Engagements_Dropdown'))

WebUI.click(findTestObject('User_Access/All_Engagements'))

WebUI.delay(3)

WebUI.click(findTestObject('User_Access/1st_Engagement'))

WebUI.delay(3)

WebUI.mouseOver(findTestObject('User_Access/Client_Onboarding'))

WebUI.click(findTestObject('User_Access/Kebab_CO'))

WebUI.delay(1)

WebUI.click(findTestObject('User_Access/Raise_Request_Kebab_Option'))

//WebDriver driver = DriverFactory.getWebDriver()
//
//WebElement raiseRequestButton = driver.findElement(By.xpath('//button[@title=\'Raise a request\' and @aria-disabled=\'true\']'))
//
//if (raiseRequestButton.getAttribute('disabled') != null) {
//    WebUI.comment('The \'Raise a request\' button is disabled.')
//} else {
//    WebUI.comment('The \'Raise a request\' button is enabled.')
//}

WebUI.delay(3)

WebUI.refresh(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('User_Access/Engagements_List_Page'))

WebUI.delay(3)

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Create_Engagement_Pravin/Create_engagement_button_listpage'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Create_Engagement_Pravin/Client_Name_on_Popup'))

WebUI.click(findTestObject('Create Engagement_Objects/Select_First_Client_Frm_List'))

WebUI.click(findTestObject('Create_Engagement_Pravin/Engagement_Type'))

WebUI.click(findTestObject('Create_Engagement_Pravin/Compilation_Type'))

WebUI.click(findTestObject('Create_Engagement_Pravin/Proceed_on_popup'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Create_Engagement_Pravin/Engagement_Template'))

WebUI.click(findTestObject('Notes_Firm/span_Master Library'))

WebUI.click(findTestObject('Create_Engagement_Pravin/Compilation_Folder_UnderMaster'))

WebUI.click(findTestObject('Create_Engagement_Pravin/Compilation_Eng_Template'))

WebUI.delay(2)

WebUI.setText(findTestObject('Create_Engagement_Pravin/Period_Year_End_Date'), Eng_Year_End_Date)

WebUI.setText(findTestObject('Create_Engagement_Pravin/Budget'), '1000')

WebUI.scrollToElement(findTestObject('Create_Engagement_Pravin/Add_Engagement_Team_Member'), 0)

WebUI.click(findTestObject('Create_Engagement_Pravin/Add_Engagement_Team_Member'))

WebUI.click(findTestObject('Create_Engagement_Pravin/Select_Team_Option'))

WebUI.click(findTestObject('Create_Engagement_Pravin/First_Team_Member_FromList'))

WebUI.setText(findTestObject('Create_Engagement_Pravin/Time_Allocation'), '100')

WebUI.click(findTestObject('Create_Engagement_Pravin/Check_Icon'))

WebUI.click(findTestObject('Create_Engagement_Pravin/Create_engagement_button_listpage'))

WebUI.verifyTextPresent('Engagement created successfully', false)

WebUI.delay(20)

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Delete_Button_AllTeam_Sec'))

WebUI.click(findTestObject('Notes_Firm/Delete_on_popup'))

WebUI.click(findTestObject('User_Access/Delete_Files'))

WebUI.verifyTextPresent('Engagement and Files deleted', false)

