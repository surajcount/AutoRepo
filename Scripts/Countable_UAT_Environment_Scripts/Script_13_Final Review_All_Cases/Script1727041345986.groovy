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

'This script covers Final review features all posible case.\r\n It can be run multiple time on a single user.\r\nOnly the correcponding login user email required in email variable to run this script.'
WebUI.openBrowser('')

WebUI.navigateToUrl('https://uat.adinovis.com/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_UAT (Countable)/EmailElement'), EmailLogin)

WebUI.setEncryptedText(findTestObject('Page_UAT (Countable)/Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Page_UAT (Countable)/span_Login'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Create Engagement_Objects/Dashboard_Button'), 40)

WebUI.click(findTestObject('Create Engagement_Objects/Dashboard_Button'))

WebUI.waitForElementPresent(findTestObject('Create Engagement_Objects/SearchBox_Dashboard'), 10)

WebUI.setText(findTestObject('Create Engagement_Objects/SearchBox_Dashboard'), 'COM')

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Create Engagement_Objects/Comp_Engmnt_GoInside'))

WebUI.delay(5)

WebUI.waitForElementClickable(findTestObject('Sign-Offs_FinalReview_Object/ComSign-Off_Tootgle'), 10)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/ComSign-Off_Tootgle'))

WebUI.waitForElementClickable(findTestObject('Sign-Offs_FinalReview_Object/Final_Review_Sec'), 5)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Final_Review_Sec'))

WebUI.waitForElementVisible(findTestObject('Sign-Offs_FinalReview_Object/Verify Final_Review_Heading'), 10)

WebUI.verifyElementPresent(findTestObject('Sign-Offs_FinalReview_Object/Client_Onboarding_Checklist'), 5)

WebUI.verifyElementClickable(findTestObject('Sign-Offs_FinalReview_Object/CL_Chklist_1st'))

WebUI.verifyElementPresent(findTestObject('Sign-Offs_FinalReview_Object/CL_Checklist_2'), 10)

WebUI.verifyElementClickable(findTestObject('Sign-Offs_FinalReview_Object/CL_Chk_List3'))

WebUI.verifyElementPresent(findTestObject('Sign-Offs_FinalReview_Object/CL-Chk_list4'), 10)

WebUI.verifyElementNotChecked(findTestObject('Sign-Offs_FinalReview_Object/CL-Chck_List5'), 10)

WebUI.scrollToElement(findTestObject('Sign-Offs_FinalReview_Object/Client_Sign_off_date_label_Format_Verfication'), 10)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Assign_Packager_List_Drp_Dwn'))

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Assign_Packager_As_Surya_LoggedIn'))

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Assign_button_Packager'))

WebUI.scrollToElement(findTestObject('Sign-Offs_FinalReview_Object/Verify_Finalize_Report_Heading'), 20)

WebUI.verifyElementVisible(findTestObject('Sign-Offs_FinalReview_Object/Verify_Finalize_Report_Heading'))

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Roll_Forward_Tem_Final_Review'))

WebUI.waitForElementPresent(findTestObject('Sign-Offs_FinalReview_Object/CRF_Template_Sec_Heading'), 5)

WebUI.verifyElementText(findTestObject('Sign-Offs_FinalReview_Object/CRF_Template_Sec_Heading'), 'Create Roll Forward Template, Completion & Archive')

WebUI.verifyElementText(findTestObject('Sign-Offs_FinalReview_Object/CRF_Template_Description'), 'This section allows users to save specific parts and configurations of an engagement as a template, which can be used to create future engagements. Once saved, the template will be available in a dropdown menu for creating engagements in subsequent years. This section also allows users to archive and complete engagements.')

WebUI.verifyElementText(findTestObject('Sign-Offs_FinalReview_Object/Verify_Enagement_Type_CRF'), 'Compilation (COM)')

WebUI.verifyElementText(findTestObject('Sign-Offs_FinalReview_Object/Verify_Preparer_CRF'), 'Surya Countable', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Sign-Offs_FinalReview_Object/CRF_Checklist_CAAC'), 10)

WebUI.delay(2)

WebUI.takeScreenshotAsCheckpoint('CRF_Checkilist_Compilation')

WebUI.scrollToElement(findTestObject('Sign-Offs_FinalReview_Object/Template_Name_CRF'), 10)

WebUI.delay(2)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Save_Btton_CRF_Final_Review'))

WebUI.waitForElementPresent(findTestObject('Sign-Offs_FinalReview_Object/CRF_Template_Toaster_Message'), 10)

WebUI.waitForElementPresent(findTestObject('Sign-Offs_FinalReview_Object/Completion_Description_FR'), 10)

WebUI.verifyElementText(findTestObject('Sign-Offs_FinalReview_Object/Completion_Description_FR'), 'This capability enables users to complete an engagement when at least 2 of the completion benchmarks are met. Please refresh the page to see the latest benchmark status if any change has been made in the system. The completed file can be reopened as needed.')

WebUI.verifyElementText(findTestObject('Sign-Offs_FinalReview_Object/Verify_Completion_Note'), 'Note: The changes you make to the files after reopening will overwrite and replace the old files')

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Benchmark_Status_Refresh_BTN'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Sign-Offs_FinalReview_Object/Completion_Benchmark_Description1'), 2)

WebUI.verifyElementPresent(findTestObject('Sign-Offs_FinalReview_Object/Completion_Benchmark_Description1_2'), 2)

WebUI.verifyElementPresent(findTestObject('Sign-Offs_FinalReview_Object/Completion_Benchmark_Description_2'), 2)

WebUI.verifyElementText(findTestObject('Sign-Offs_FinalReview_Object/Completion_Benchmark_Description_2_1'), '(See Final Review > Final Completion checklist > Sign off Disclaimer)')

WebUI.verifyElementText(findTestObject('Sign-Offs_FinalReview_Object/Completion_Benchmark_Description_3'), 'FS Sign off Date and Signature applied')

WebUI.verifyElementPresent(findTestObject('Sign-Offs_FinalReview_Object/Benchmark_Description_3_2'), 2)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Toogle_Finacial_Statement'))

WebUI.waitForElementClickable(findTestObject('Sign-Offs_FinalReview_Object/Toogle_Financial_St_Doc'), 6)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Toogle_Financial_St_Doc'))

WebUI.waitForElementPresent(findTestObject('Sign-Offs_FinalReview_Object/Cover_Page_FS'), 4)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Cover_Page_FS'))

WebUI.waitForElementPresent(findTestObject('Sign-Offs_FinalReview_Object/FS_Export_Button_CoverPage'), 10)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/FS_Export_Button_CoverPage'))

WebUI.waitForElementPresent(findTestObject('Sign-Offs_FinalReview_Object/PDF_Export_Option'), 3)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/PDF_Export_Option'))

WebUI.delay(6)

WebUI.waitForElementClickable(findTestObject('Sign-Offs_FinalReview_Object/FS_Export_Button_CoverPage'), 10)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/FS_Export_Button_CoverPage'))

WebUI.waitForElementPresent(findTestObject('Sign-Offs_FinalReview_Object/Word_Export_Option'), 3)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Word_Export_Option'))

WebUI.delay(10)

WebUI.waitForElementClickable(findTestObject('Sign-Offs_FinalReview_Object/FS_Setting_Button'), 10)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/FS_Setting_Button'))

try {
    String abc = WebUI.getText(findTestObject('Sign-Offs_FinalReview_Object/Draft_Under_Discussion_Water_Mark'))

    WebUI.waitForElementVisible(findTestObject('Sign-Offs_FinalReview_Object/Draft_Water_Mark_BTN_Applied_State'), 10, FailureHandling.CONTINUE_ON_FAILURE)

    println(abc)

    WebUI.mouseOver(findTestObject('Sign-Offs_FinalReview_Object/Draft_Water_Mark_BTN_Applied_State'))

    WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Draft_Water_Mark_BTN_Applied_State'))
}
catch (Exception e) {
    WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Apply_Draft_Water_Mark'), FailureHandling.CONTINUE_ON_FAILURE)
} 

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Close_FS_Setting_Menu'))

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Final_Review_Sec'))

WebUI.waitForElementPresent(findTestObject('Sign-Offs_FinalReview_Object/Complete_Archieve_Section'), 10)

WebUI.scrollToElement(findTestObject('Sign-Offs_FinalReview_Object/Complete_Archieve_Section'), 20)

