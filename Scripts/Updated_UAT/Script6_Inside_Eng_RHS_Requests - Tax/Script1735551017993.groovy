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

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/New_Request_RHS_Documents'))

WebUI.delay(2)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Back_Button_RHS_Doc_Req'))

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/New_Request_RHS_Documents'))

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

WebUI.delay(2)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Priority_DocReq_RHS_CLIOnbrd'))

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Priority_HIgh_Doc_Req_RHS'))

WebUI.setText(findTestObject('RHS_Objects_Client_Dashborad_Login/Doc_Request_Doc_Name_RHS'), 'Test Doc Re_ CLinOnbrd')

WebUI.scrollToElement(findTestObject('RHS_Objects_Client_Dashborad_Login/Doc_Req_File_Upld'), 10)

WebUI.setText(findTestObject('RHS_Objects_Client_Dashborad_Login/Doc_Request_CLI_Onbrd_Notes'), 'Notes document request test')

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Due_Date_Calander_Doc_Req'))

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Calander_Next_BTN'))

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Calander_Next_BTN'))

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Calander_Next_BTN'))

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Select_Du_DT'))

WebUI.uploadFile(findTestObject('RHS_Objects_Client_Dashborad_Login/Doc_Req_File_Upld'), 'C:\\Users\\Admin\\Desktop\\Upload_Functions_Test\\Automation Notes (12).pdf')

WebUI.delay(2)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Send_Request_BTN'))

WebUI.scrollToElement(findTestObject('RHS_Objects_Client_Dashborad_Login/Send_Request_BTN'), 10)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Send_Doc_Req_BTN'))

WebUI.delay(3)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Select_Engagement_Folder'))

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Client_Onbrding_Folder_RHS'))

WebUI.delay(2)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Choose_engagement_folder_requests'))

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Independence_Folder'))

WebUI.delay(2)

WebUI.verifyTextPresent('There are no requests to show up', false)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Choose_engagement_folder_requests'))

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Sub_Folder_CLI_Acpt_RHS'))

WebUI.delay(2)

WebUI.verifyTextNotPresent('There are no requests to show up', false)

WebUI.delay(2)

JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

js.executeScript('window.open()')

WebUI.switchToWindowIndex(1)

WebUI.delay(1)

WebUI.navigateToUrl(UAT)

WebUI.setText(findTestObject('Page_UAT (Countable)/EmailElement'), EmailClientLogin)

WebUI.setEncryptedText(findTestObject('Page_UAT (Countable)/Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Page_UAT (Countable)/span_Login'))

WebUI.delay(3)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/GoInside_Comp_Eng_Client_Dash'))

WebUI.delay(2)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Work_Flow_Engagement_Client'))

WebUI.takeScreenshotAsCheckpoint('Client_Login_Enagement_Request_Dashboard')

'Increase Count on Every Run by 1 for now, refer description in case of any update.'
WebUI.verifyElementText(findTestObject('RHS_Objects_Client_Dashborad_Login/Request_Count_Client_Dashboard_inside_Eng'), 
    '01', FailureHandling.CONTINUE_ON_FAILURE)

String fontClolor = WebUI.getCSSValue(findTestObject('RHS_Objects_Client_Dashborad_Login/Request_Count_Client_Dashboard_inside_Eng'), 
    'color')

String font_weight = WebUI.getCSSValue(findTestObject('RHS_Objects_Client_Dashborad_Login/Request_Count_Client_Dashboard_inside_Eng'), 
    'font-weight')

String fontSize = WebUI.getCSSValue(findTestObject('RHS_Objects_Client_Dashborad_Login/Request_Count_Client_Dashboard_inside_Eng'), 
    'font-size')

println((((('Font_Weight:' + font_weight) + 'fontClolor') + fontClolor) + 'fontSize') + fontSize)

WebUI.verifyEqual(font_weight, '600')

WebUI.verifyEqual(fontClolor, 'rgba(0, 75, 146, 1)')

WebUI.verifyEqual(fontSize, '32px')

String fontClolor1 = WebUI.getCSSValue(findTestObject('RHS_Objects_Client_Dashborad_Login/Overdue_Request_Color_Size_Element'), 
    'color')

String font_weight1 = WebUI.getCSSValue(findTestObject('RHS_Objects_Client_Dashborad_Login/Overdue_Request_Color_Size_Element'), 
    'font-weight')

String fontSize1 = WebUI.getCSSValue(findTestObject('RHS_Objects_Client_Dashborad_Login/Overdue_Request_Color_Size_Element'), 
    'font-size')

println((((('Font_Weight:' + font_weight1) + 'fontClolor') + fontClolor1) + 'fontSize') + fontSize1)

WebUI.verifyEqual(font_weight1, '600')

WebUI.verifyEqual(fontClolor1, 'rgba(247, 144, 9, 1)')

WebUI.verifyEqual(fontSize1, '32px')

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Approved_Document_Client_Login_Dashboard'))

WebUI.delay(2)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/All_Request_Section_Client_Login_Dash'))

WebUI.delay(2)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Expand_All_Request_Client_Login'))

WebUI.delay(2)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Collapse_All_Request_Client_Login_Dash'))

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Expand_CA_List_Request_Client_Login'))

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/View_Doc_Request_CA_Client_Login'))

WebUI.uploadFile(findTestObject('RHS_Objects_Client_Dashborad_Login/Doc_Req_File_Upld'), 'C:\\Users\\Admin\\Desktop\\Upload_Functions_Test\\Client_Reply\\adj entry prod.doc')

WebUI.uploadFile(findTestObject('RHS_Objects_Client_Dashborad_Login/Doc_Req_File_Upld'), 'C:\\Users\\Admin\\Desktop\\Upload_Functions_Test\\Client_Reply\\Adjusting Entries (20).csv')

WebUI.uploadFile(findTestObject('RHS_Objects_Client_Dashborad_Login/Doc_Req_File_Upld'), 'C:\\Users\\Admin\\Desktop\\Upload_Functions_Test\\Client_Reply\\Trial Balance Grouping (89).xlsx')

WebUI.uploadFile(findTestObject('RHS_Objects_Client_Dashborad_Login/Doc_Req_File_Upld'), 'C:\\Users\\Admin\\Desktop\\Upload_Functions_Test\\Client_Reply\\Time Zone Test.pdf')

//WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Download_Request_Doc_Client_Dash'))
//
//WebUI.delay(5)
//
//WebDriver driver = DriverFactory.getWebDriver()
//
//ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles())
//
//WebUI.switchToWindowIndex(tabs.size() - 1)
//
//WebUI.closeWindowIndex(tabs.size() - 1)
//
//WebUI.switchToWindowIndex(1)
//
//WebUI.delay(3)
//
//WebUI.enableSmartWait()
//
//WebUI.waitForElementClickable(findTestObject('RHS_Objects_Client_Dashborad_Login/Attach_Document_Cient_Response_on_docRequest'), 
//    10)
//
//WebUI.delay(3)
WebUI.setText(findTestObject('RHS_Objects_Client_Dashborad_Login/Reply_to_Request_CA'), 'Request Resolved Successfully')

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Send_Client_Reply_Button'))

WebUI.delay(4)

WebUI.closeWindowIndex(1)

WebUI.closeBrowser()

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

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/All_Request_Section_RHS'))

WebUI.delay(4)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Expand_ClientAcceptance_Request'))

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/View_Doc_Request_FirmSide'))

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/DocumentKebab_Menu'))

WebUI.click(findTestObject('Client_All_RegressionCase/Download_Doc_From_Repo'))

WebUI.delay(3)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/DocumentKebab_Menu'))

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Approve_Document'))

WebUI.verifyTextPresent('Document has been approved', false)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Resolve_Request'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/InviteAll_Yes_Button'))

WebUI.verifyTextPresent('Request resolve successfully', false)

WebUI.delay(3)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Back_Arrow_to_request'))

WebUI.delay(2)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/New_Request_RHS_Documents'))

WebUI.delay(2)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Back_Button_RHS_Doc_Req'))

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/New_Request_RHS_Documents'))

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Select_Folder_Arrow_BTN'))

WebUI.delay(2)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Doc_Request_Document_Folder'))

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/SubFolder_RHS_List_Arrow'))

WebUI.delay(2)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Doc_Req_Document_SubFolder'))

WebUI.delay(2)

WebUI.setText(findTestObject('RHS_Objects_Client_Dashborad_Login/Doc_Request_Doc_Name_RHS'), 'Test Doc Rentl Agrement')

WebUI.setText(findTestObject('RHS_Objects_Client_Dashborad_Login/Doc_Request_CLI_Onbrd_Notes'), 'Notes document request test')

WebUI.delay(2)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Due_Date_Calander_Doc_Req'))

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Calander_Next_BTN'))

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Calander_Next_BTN'))

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Calander_Next_BTN'))

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Select_Du_DT'))

WebUI.uploadFile(findTestObject('RHS_Objects_Client_Dashborad_Login/Doc_Req_File_Upld'), 'C:\\Users\\Admin\\Desktop\\Upload_Functions_Test\\Automation Notes (12).pdf')

WebUI.delay(2)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Send_Request_BTN'))

WebUI.scrollToElement(findTestObject('RHS_Objects_Client_Dashborad_Login/Send_Request_BTN'), 10)

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Send_Request_Add_To_Batch'))

WebUI.delay(2)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/All_Request_Section_RHS'))

WebUI.delay(2)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Available_Section_RHS'))

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Batch_Section_RHS'))

WebUI.delay(5)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/New_Request_RHS_Documents'))

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Select_Folder_Arrow_BTN'))

WebUI.delay(2)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Doc_Request_Trial_Balance_Folder'))

WebUI.delay(2)

WebUI.setText(findTestObject('RHS_Objects_Client_Dashborad_Login/Doc_Request_Doc_Name_RHS'), 'Test Doc Trial_Balane')

WebUI.setText(findTestObject('RHS_Objects_Client_Dashborad_Login/Doc_Request_CLI_Onbrd_Notes'), 'Notes doc req test Tril balnceFlder')

WebUI.delay(2)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Due_Date_Calander_Doc_Req'))

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Calander_Next_BTN'))

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Calander_Next_BTN'))

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Calander_Next_BTN'))

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Select_Du_DT'))

WebUI.uploadFile(findTestObject('RHS_Objects_Client_Dashborad_Login/Doc_Req_File_Upld'), 'C:\\Users\\Admin\\Desktop\\Upload_Functions_Test\\Automation Notes (12).pdf')

WebUI.delay(2)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Send_Request_BTN'))

WebUI.scrollToElement(findTestObject('RHS_Objects_Client_Dashborad_Login/Send_Request_BTN'), 10)

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Send_Request_Add_To_Batch'))

WebUI.delay(2)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/New_Request_RHS_Documents'))

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Select_Folder_Arrow_BTN'))

WebUI.delay(2)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Doc_Req_FS_Folder'))

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/SubFolder_RHS_List_Arrow'))

WebUI.delay(3)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Doc_Req_RHS_Com_Report_Sub_Fldr'))

WebUI.delay(2)

WebUI.setText(findTestObject('RHS_Objects_Client_Dashborad_Login/Doc_Request_Doc_Name_RHS'), 'Test Doc Req_FS fldr')

WebUI.setText(findTestObject('RHS_Objects_Client_Dashborad_Login/Doc_Request_CLI_Onbrd_Notes'), 'Notes Test Doc Req_FS fldr')

WebUI.delay(2)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Due_Date_Calander_Doc_Req'))

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Calander_Next_BTN'))

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Calander_Next_BTN'))

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Select_Du_DT'))

WebUI.uploadFile(findTestObject('RHS_Objects_Client_Dashborad_Login/Doc_Req_File_Upld'), 'C:\\Users\\Admin\\Desktop\\Upload_Functions_Test\\Automation Notes (12).pdf')

WebUI.delay(2)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Send_Request_BTN'))

WebUI.scrollToElement(findTestObject('RHS_Objects_Client_Dashborad_Login/Send_Request_BTN'), 10)

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Send_Doc_Req_BTN'))

WebUI.delay(7)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/New_Request_RHS_Documents'))

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Select_Folder_Arrow_BTN'))

WebUI.delay(2)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Doc_Req_Comp_Sin_of_Folder'))

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/SubFolder_RHS_List_Arrow'))

WebUI.delay(2)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Doc_Req_Compltion_Sub_Folder_com_sin_of'))

WebUI.delay(2)

WebUI.setText(findTestObject('RHS_Objects_Client_Dashborad_Login/Doc_Request_Doc_Name_RHS'), 'Test Doc compandsinoff')

WebUI.setText(findTestObject('RHS_Objects_Client_Dashborad_Login/Doc_Request_CLI_Onbrd_Notes'), 'Notes doc req comsignoff folder')

WebUI.delay(2)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Due_Date_Calander_Doc_Req'))

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Calander_Next_BTN'))

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Calander_Next_BTN'))

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Calander_Next_BTN'))

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Select_Du_DT'))

WebUI.uploadFile(findTestObject('RHS_Objects_Client_Dashborad_Login/Doc_Req_File_Upld'), 'C:\\Users\\Admin\\Desktop\\Upload_Functions_Test\\Automation Notes (12).pdf')

WebUI.delay(2)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Send_Request_BTN'))

WebUI.scrollToElement(findTestObject('RHS_Objects_Client_Dashborad_Login/Send_Request_BTN'), 10)

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Send_Request_Add_To_Batch'))

WebUI.delay(4)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/All_Request_Section_RHS'))

WebUI.delay(2)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Available_Section_RHS'))

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Batch_Section_RHS'))

WebUI.delay(5)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Select_All_Doc_Requ_Check_Box'))

WebUI.delay(3)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Send_All_Batch_Req_Button'))

WebUI.delay(3)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Available_Section_RHS'))

WebUI.delay(2)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/All_Request_Section_RHS'))

WebUI.delay(2)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/1st_Request_Kebab_AllRequestTab'))

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Delete_Request'))

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Delete_Request_Popup'))

WebUI.verifyTextPresent('Successfully deleted all requests', false)

WebUI.closeBrowser()

