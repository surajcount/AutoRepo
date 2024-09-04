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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://uat.adinovis.com/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_UAT (Countable)/EmailElement'), EmailLogin)

WebUI.setEncryptedText(findTestObject('Page_UAT (Countable)/Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Page_UAT (Countable)/span_Login'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Create Engagement_Objects/Dashboard_Button'), 40)

WebUI.click(findTestObject('Create Engagement_Objects/Dashboard_Button'))

WebUI.waitForElementPresent(findTestObject('Create Engagement_Objects/SearchBox_Dashboard'), 0)

WebUI.setText(findTestObject('Create Engagement_Objects/SearchBox_Dashboard'), 'COM')

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

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Doc_Request_Document_Folder'))

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/SubFolder_RHS_List_Arrow'))

WebUI.delay(2)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Doc_Req_Document_SubFolder'))

WebUI.delay(2)

WebUI.setText(findTestObject('RHS_Objects_Client_Dashborad_Login/Doc_Request_Doc_Name_RHS'), 'Test Doc Rentl Agrement')

WebUI.setText(findTestObject('RHS_Objects_Client_Dashborad_Login/Doc_Request_CLI_Onbrd_Notes'), 'Notes doc req test doc folder')

WebUI.delay(2)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Due_Date_Calander_Doc_Req'))

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Calander_Next_BTN'))

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Calander_Next_BTN'))

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Calander_Next_BTN'))

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Select_Du_DT'))

WebUI.uploadFile(findTestObject('RHS_Objects_Client_Dashborad_Login/Doc_Req_File_Upld'), 'C:\\Users\\Admin\\Desktop\\Countable_Data_Upload\\TestData_Excl.xlsx')

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

WebUI.uploadFile(findTestObject('RHS_Objects_Client_Dashborad_Login/Doc_Req_File_Upld'), 'C:\\Users\\Admin\\Desktop\\Countable_Data_Upload\\TestData_Excl.xlsx')

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

WebUI.delay(2)

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

WebUI.uploadFile(findTestObject('RHS_Objects_Client_Dashborad_Login/Doc_Req_File_Upld'), 'C:\\Users\\Admin\\Desktop\\Countable_Data_Upload\\TestData_Excl.xlsx')

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

WebUI.uploadFile(findTestObject('RHS_Objects_Client_Dashborad_Login/Doc_Req_File_Upld'), 'C:\\Users\\Admin\\Desktop\\Countable_Data_Upload\\TestData_Excl.xlsx')

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

