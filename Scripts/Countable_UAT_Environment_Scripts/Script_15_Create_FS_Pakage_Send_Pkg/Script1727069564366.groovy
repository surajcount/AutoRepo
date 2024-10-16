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

'This script cover all feature of create and send FS package.\r\nIt also cover the client login and verification of sent FS package on mail too.\r\nRequire Two the same respective user email and client email to Run this script.'
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

WebUI.waitForElementClickable(findTestObject('Sign-Offs_FinalReview_Object/ComSign-Off_Tootgle'), 10)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/ComSign-Off_Tootgle'))

WebUI.waitForElementClickable(findTestObject('Sign-Offs_FinalReview_Object/Final_Review_Sec'), 5)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Final_Review_Sec'))

WebUI.waitForElementVisible(findTestObject('Sign-Offs_FinalReview_Object/Verify Final_Review_Heading'), 10)

WebUI.scrollToElement(findTestObject('Sign-Offs_FinalReview_Object/Client_Sign_off_date_label_Format_Verfication'), 10)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Assign_Packager_List_Drp_Dwn'))

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Assign_Packager_As_Surya_LoggedIn'))

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Assign_button_Packager'))

WebUI.scrollToElement(findTestObject('Sign-Offs_FinalReview_Object/Verify_Finalize_Report_Heading'), 20)

WebUI.waitForElementClickable(findTestObject('Create_FS_Package_Send_FS_Pkg/Create_FS_Package_Section'), 10)

WebUI.click(findTestObject('Create_FS_Package_Send_FS_Pkg/Create_FS_Package_Section'))

WebUI.verifyElementText(findTestObject('Create_FS_Package_Send_FS_Pkg/FS_Package_Heading'), 'Final FS Package')

WebUI.waitForElementPresent(findTestObject('Create_FS_Package_Send_FS_Pkg/Trial_Balance_Check_Box'), 5)

WebUI.click(findTestObject('Create_FS_Package_Send_FS_Pkg/Trial_Balance_Check_Box'))

WebUI.click(findTestObject('Create_FS_Package_Send_FS_Pkg/Finacial_Statement_Check_Box_Crt_Pakg'))

WebUI.waitForElementClickable(findTestObject('Create_FS_Package_Send_FS_Pkg/Create_Pakage_Btn'), 10)

WebUI.click(findTestObject('Create_FS_Package_Send_FS_Pkg/Create_Pakage_Btn'))

WebUI.delay(5)

WebUI.waitForElementClickable(findTestObject('Create_FS_Package_Send_FS_Pkg/Send_Package_Section'), 10)

WebUI.click(findTestObject('Create_FS_Package_Send_FS_Pkg/Send_Package_Section'))

WebUI.waitForElementClickable(findTestObject('Create_FS_Package_Send_FS_Pkg/Trial_Balance_Check_Box'), 5)

WebUI.click(findTestObject('Create_FS_Package_Send_FS_Pkg/Trial_Balance_Check_Box'))

WebUI.click(findTestObject('Create_FS_Package_Send_FS_Pkg/Finacial_Statement_Check_Box_Crt_Pakg'))

try {
    WebUI.click(findTestObject('Create_FS_Package_Send_FS_Pkg/Send_To_Client_BTN'))

    WebUI.waitForElementClickable(findTestObject('Create_FS_Package_Send_FS_Pkg/Select_Send_to_Client_Chk_Box'), 8)

    WebUI.click(findTestObject('Create_FS_Package_Send_FS_Pkg/Select_Send_to_Client_Chk_Box'))

    WebUI.waitForElementPresent(findTestObject('Create_FS_Package_Send_FS_Pkg/Send_By_Email_Chck_Box'), 8)

    WebUI.click(findTestObject('Create_FS_Package_Send_FS_Pkg/Send_By_Email_Chck_Box'))

    WebUI.waitForElementVisible(findTestObject('Create_FS_Package_Send_FS_Pkg/Verify_Client_Email_FS_Package'), 10)

    String clientemail_fs_pck_send = WebUI.getText(findTestObject('Create_FS_Package_Send_FS_Pkg/Verify_Client_Email_FS_Package'))

    WebUI.verifyEqual(ClientEmail_CANADA, clientemail_fs_pck_send)

    String Email_Content = WebUI.getText(findTestObject('Create_FS_Package_Send_FS_Pkg/Send_FS_Email_Content'), FailureHandling.STOP_ON_FAILURE)

    Email_Content = Email_Content.replaceAll('\\s+', '')

    String expectedemailtxt = 'Hi,ThisistonotifythatFinancialStatementspackagearebeingreleasedforyourreview.Pleaseprovideyoursignoffandacceptanceaftergoingthroughthepackageorrevertbackforanychangesorrectificationasnecessary.Thanks'

    WebUI.verifyEqual(Email_Content, expectedemailtxt)

    WebUI.click(findTestObject('Create_FS_Package_Send_FS_Pkg/Send_BTN_Fs_Package'))

    WebUI.delay(2)

    WebUI.verifyElementVisible(findTestObject('Create_FS_Package_Send_FS_Pkg/Verify_Final_Send_Package_Toaster'))
}
catch (Exception e) {
    WebUI.click(findTestObject('Create_FS_Package_Send_FS_Pkg/Resend_To_Client_BTN'))

    WebUI.waitForElementClickable(findTestObject('Create_FS_Package_Send_FS_Pkg/Select_Send_to_Client_Chk_Box'), 8)

    WebUI.click(findTestObject('Create_FS_Package_Send_FS_Pkg/Select_Send_to_Client_Chk_Box'))

    WebUI.waitForElementPresent(findTestObject('Create_FS_Package_Send_FS_Pkg/Send_By_Email_Chck_Box'), 8)

    WebUI.click(findTestObject('Create_FS_Package_Send_FS_Pkg/Send_By_Email_Chck_Box'))

    WebUI.waitForElementVisible(findTestObject('Create_FS_Package_Send_FS_Pkg/Verify_Client_Email_FS_Package'), 10)

    String clientemail_fs_pck_send = WebUI.getText(findTestObject('Create_FS_Package_Send_FS_Pkg/Verify_Client_Email_FS_Package'))

    WebUI.verifyEqual(ClientEmail_CANADA, clientemail_fs_pck_send)

    String Email_Content = WebUI.getText(findTestObject('Create_FS_Package_Send_FS_Pkg/Send_FS_Email_Content'), FailureHandling.STOP_ON_FAILURE)

    Email_Content = Email_Content.replaceAll('\\s+', '')

    String expectedemailtxt = 'Hi,ThisistonotifythatFinancialStatementspackagearebeingreleasedforyourreview.Pleaseprovideyoursignoffandacceptanceaftergoingthroughthepackageorrevertbackforanychangesorrectificationasnecessary.Thanks'

    WebUI.verifyEqual(Email_Content, expectedemailtxt)

    WebUI.click(findTestObject('Create_FS_Package_Send_FS_Pkg/Send_BTN_Fs_Package'))

    WebUI.delay(2)

    WebUI.verifyElementText(findTestObject('Create_FS_Package_Send_FS_Pkg/Resend_FS_Toaster_Msg'), 'Final FS Package resent to client successfully.')
} 

WebUI.delay(4)

JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

js.executeScript('window.open()')

WebUI.switchToWindowIndex(1)

WebUI.delay(1)

WebUI.navigateToUrl('https://uat.adinovis.com/login')

WebUI.setText(findTestObject('Page_UAT (Countable)/EmailElement'), ClientEmail_CANADA)

WebUI.setEncryptedText(findTestObject('Page_UAT (Countable)/Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Page_UAT (Countable)/span_Login'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('RHS_Objects_Client_Dashborad_Login/SerachBox_Client_Login_Dashboard'), 0)

WebUI.setText(findTestObject('RHS_Objects_Client_Dashborad_Login/SerachBox_Client_Login_Dashboard'), 'In Pr')

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/GoInside_Comp_Eng_Client_Dash'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Create_FS_Package_Send_FS_Pkg/Cl_Login_Final_FS_Package_Fldr'), 5)

WebUI.click(findTestObject('Create_FS_Package_Send_FS_Pkg/Cl_Login_Final_FS_Package_Fldr'))

WebUI.delay(2)

WebUI.click(findTestObject('Create_FS_Package_Send_FS_Pkg/Trial_Balnc_pdf_cl_fs_pckg'))

WebUI.delay(2)

WebUI.click(findTestObject('Create_FS_Package_Send_FS_Pkg/FS_Doc_PDF_File'))

WebUI.delay(3)

WebUI.click(findTestObject('Create_FS_Package_Send_FS_Pkg/Selet_Trial_Bl_pdf'))

WebUI.delay(2)

WebUI.click(findTestObject('Create_FS_Package_Send_FS_Pkg/Select_FS_pdf_file'))

WebUI.delay(1)

WebUI.click(findTestObject('Create_FS_Package_Send_FS_Pkg/DownLoad_BTN_FS_Package'))

WebUI.delay(3)

js.executeScript('window.open()')

WebUI.switchToWindowIndex(2)

WebUI.delay(1)

WebUI.navigateToUrl('https://yopmail.com/')

WebUI.setText(findTestObject('Object Repository/OnboardingObjects/Page_YOPmail - Disposable Email Address - A_32619f/input_Type the Email name of your choice_login'), 
    ClientEmail_CANADA)

WebUI.click(findTestObject('Object Repository/OnboardingObjects/Page_YOPmail - Disposable Email Address - A_32619f/i_'))

try {
    Mail_Subject = WebUI.getText(findTestObject('Create_FS_Package_Send_FS_Pkg/Verify_FS_Package_Mail_Client'))

    Mail_Content = WebUI.getText(findTestObject('Create_FS_Package_Send_FS_Pkg/Mail_Content'))
	Mail_Content = Mail_Content.replaceAll('\\s+', '')

    String expectedemailtxt = 'Note:Thefilesareavailableforyourrecordsontheclientportal,andyoucandownloadatyourconvenienceunderFinalFSPackageinsidetheEngagement.'

    WebUI.verifyEqual(Mail_Content, expectedemailtxt)

    WebUI.mouseOver(findTestObject('Create_FS_Package_Send_FS_Pkg/Trial_BL_Mail_Download_Hower_Element'))

    WebUI.click(findTestObject('Create_FS_Package_Send_FS_Pkg/Dwnld_Trial_Bl_From_mail_clint'))
}
catch (Exception e) {
    WebUI.click(findTestObject('Page_Inbox/button_2023adminadinovis'))

    Mail_Subject = WebUI.getText(findTestObject('Create_FS_Package_Send_FS_Pkg/Verify_FS_Package_Mail_Client'))

    WebUI.mouseOver(findTestObject('Create_FS_Package_Send_FS_Pkg/Trial_BL_Mail_Download_Hower_Element'))

    WebUI.click(findTestObject('Create_FS_Package_Send_FS_Pkg/Dwnld_Trial_Bl_From_mail_clint'))
} 

