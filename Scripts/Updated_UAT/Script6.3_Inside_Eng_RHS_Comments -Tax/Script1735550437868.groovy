import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.interactions.Actions as Actions
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By

'This script covers the features of RHS section and entire flow of RHS.\r\nSend request and send in batch.\r\nIt also covers the client flow of request resolution. Validation on Count colour and Text size.\r\nPrequisite:\r\nEnsure to use the corresponding login of firm and client email variable as given \r\nwhile onboarding script.\r\nLoginEmail_CANADA\r\nClientEmail_CANADA\r\n\r\n'
WebUI.openBrowser('')

WebUI.navigateToUrl(UAT)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_UAT (Countable)/EmailElement'), EmailLogin)

WebUI.setEncryptedText(findTestObject('Page_UAT (Countable)/Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Page_UAT (Countable)/span_Login'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Create Engagement_Objects/Dashboard_Button'), 40)

WebUI.click(findTestObject('Create Engagement_Objects/Dashboard_Button'))

WebUI.waitForElementPresent(findTestObject('Create Engagement_Objects/SearchBox_Dashboard'), 0)

WebUI.setText(findTestObject('Create Engagement_Objects/SearchBox_Dashboard'), Search_Eng_Type)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Create Engagement_Objects/Comp_Engmnt_GoInside'))

WebUI.delay(5)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/RHS_Sec_Expnd_Buttn'))

WebUI.delay(4)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Comment_Icon'))

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/New_Issue'))

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Select_Folder_Arrow_BTN'))

WebUI.delay(2)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Client_Onbrding_Folder_RHS'))

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/SubFolder_RHS_List_Arrow'))

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Sub_Folder_CLI_Acpt_RHS'))

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Type_Sub_Section_RHS_Arrow_BTN'))

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Type_General_RHS'))

WebUI.delay(1)

WebUI.click(findTestObject('Engagement_Section_LHS/Assigne_Issue_to_Drp_Dwn'))

WebUI.click(findTestObject('Engagement_Section_LHS/Assign_Issue_to_All'))

WebUI.setText(findTestObject('Procedures_Object/Comment_Desc_Procedures'), 'Explicit Waits also known as Dynamic Waits because it is highly specific conditioned. It is implemented by WebDriverWait class.')

WebUI.delay(2)

WebUI.click(findTestObject('Engagement_Section_LHS/Submit_BTN_Raise_Issue'))

'Comment created under client onboarding section'
WebUI.verifyTextPresent('New comment created successfully', false)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Comment_Icon'))

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/New_Issue'))

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Select_Folder_Arrow_BTN'))

WebUI.delay(2)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Doc_Request_Document_Folder'))

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/SubFolder_RHS_List_Arrow'))

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Doc_Req_Document_SubFolder'))

WebUI.delay(1)

WebUI.click(findTestObject('Engagement_Section_LHS/Assigne_Issue_to_Drp_Dwn'))

WebUI.click(findTestObject('Engagement_Section_LHS/Assign_Issue_to_All'))

WebUI.setText(findTestObject('Procedures_Object/Comment_Desc_Procedures'), 'Explicit Waits also known as Dynamic Waits because it is highly specific conditioned. It is implemented by WebDriverWait class.')

WebUI.delay(2)

WebUI.click(findTestObject('Engagement_Section_LHS/Submit_BTN_Raise_Issue'))

'Comment created under DOCUMENTS section'
WebUI.verifyTextPresent('New comment created successfully', false)

WebUI.delay(3)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Expand_ClientAcceptance_Request'))

WebUI.delay(2)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/View_Comment_Details'))

WebUI.delay(1)

WebUI.setText(findTestObject('RHS_Objects_Client_Dashborad_Login/Write_a_Reply'), 'Comment is resolved now')

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Resolve_Request'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/InviteAll_Yes_Button'))

WebUI.verifyTextPresent('Comment resolved successfully', false)

WebUI.delay(4)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Comment_Icon'))

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/New_Issue'))

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Select_Folder_Arrow_BTN'))

WebUI.delay(2)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Doc_Request_Trial_Balance_Folder'))

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Type_Sub_Section_RHS_Arrow_BTN'))

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Type_General_RHS'))

WebUI.delay(1)

WebUI.click(findTestObject('Engagement_Section_LHS/Assigne_Issue_to_Drp_Dwn'))

WebUI.click(findTestObject('Engagement_Section_LHS/Assign_Issue_to_All'))

WebUI.delay(2)

WebUI.setText(findTestObject('Procedures_Object/Comment_Desc_Procedures'), 'Suppose you have a web page consisting of a login form that takes input and loads the Home or Main page content.')

WebUI.delay(2)

WebUI.click(findTestObject('Engagement_Section_LHS/Submit_BTN_Raise_Issue'))

'Comment created under TRIAL BALANCE section'
WebUI.verifyTextPresent('New comment created successfully', false)

WebUI.delay(4)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Comment_Icon'))

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/New_Issue'))

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Select_Folder_Arrow_BTN'))

WebUI.delay(2)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Doc_Req_FS_Folder'))

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/SubFolder_RHS_List_Arrow'))

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Balance_Sheet_Dropdown'))

WebUI.delay(1)

WebUI.click(findTestObject('Engagement_Section_LHS/Assigne_Issue_to_Drp_Dwn'))

WebUI.click(findTestObject('Engagement_Section_LHS/Assign_Issue_to_All'))

WebUI.setText(findTestObject('Procedures_Object/Comment_Desc_Procedures'), 'Consider that you are working on an application that is travel themed and users fill the web form and submit it using submit button. Now, you might need to wait until and unless the specific data is not displayed.')

WebUI.delay(2)

WebUI.click(findTestObject('Engagement_Section_LHS/Submit_BTN_Raise_Issue'))

'Comment created under FINANCIAL STATEMENTS section'
WebUI.verifyTextPresent('New comment created successfully', false)

WebUI.delay(2)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Issue_Kebab'))

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Delete_Request'))

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Delete_Request_Popup'))

WebUI.verifyTextPresent('Comments deleted successfully', false)

WebUI.delay(2)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Undo_Comment_Issue_Request'))

WebUI.verifyTextPresent('Undo comments successfully', false)

WebUI.delay(2)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Expand_Search_CommentIssues'))

WebUI.setText(findTestObject('RHS_Objects_Client_Dashborad_Login/Search_Input'), 'Trial')

WebUI.delay(2)

WebUI.closeBrowser()

