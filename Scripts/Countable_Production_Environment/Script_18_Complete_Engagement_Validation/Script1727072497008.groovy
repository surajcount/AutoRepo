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

WebUI.openBrowser('')

'This Script is designed to validate the what user should not allow to access post engagement is \r\nmarked completed.'
WebUI.navigateToUrl('https://platform.countable.co/login')

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

WebUI.scrollToElement(findTestObject('Sign-Offs_FinalReview_Object/Assign_Packager_List_Drp_Dwn'), 10)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Assign_Packager_List_Drp_Dwn'))

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Assign_Packager_As_Surya_LoggedIn'))

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Assign_button_Packager'))

WebUI.waitForElementPresent(findTestObject('Sign-Offs_FinalReview_Object/Complete_Archieve_Section'), 10)

WebUI.scrollToElement(findTestObject('Sign-Offs_FinalReview_Object/Complete_Archieve_Section'), 20)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Complete_Archieve_Section'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Sign-Offs_FinalReview_Object/Complete_Now_BTN_Final_Rev_Sec'), 20)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Complete_Now_BTN_Final_Rev_Sec'))

try {
    WebUI.waitForElementPresent(findTestObject('Sign-Offs_FinalReview_Object/Proceed_BTN_Completion'), 10, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Proceed_BTN_Completion'), FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForElementPresent(findTestObject('Sign-Offs_FinalReview_Object/Button_Complete_Final_Review_Complete_Now'), 
        10)

    WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Button_Complete_Final_Review_Complete_Now'), FailureHandling.STOP_ON_FAILURE)
}
catch (Exception e) {
    println('All the Benchmarks are Completed')
} 

WebUI.scrollToElement(findTestObject('Sign-Offs_FinalReview_Object/Verify_Finalize_Report_Heading'), 30)

WebUI.findWebElement(findTestObject('Complete_Archived_Eng_Valid/Disabled_Apply_Btn'))

WebUI.setText(findTestObject('Sign-Offs_FinalReview_Object/formatteddateddmmyyyy'), '11/11/2024')

WebUI.findWebElement(findTestObject('Complete_Archived_Eng_Valid/Disabled_Apply_Btn'))

WebUI.verifyElementNotClickable(findTestObject('Complete_Archived_Eng_Valid/Disabled_Apply_Btn'))

WebUI.click(findTestObject('Complete_Archived_Eng_Valid/TrialBalance_lhs'))

try {
    WebUI.waitForElementPresent(findTestObject('Complete_Archived_Eng_Valid/Automation_Available_Pop_up'), 30, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Complete_Archived_Eng_Valid/Automation_Available_Pop_up'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.verifyElementPresent(findTestObject('Complete_Archived_Eng_Valid/Import_BTN_Disabled'), 10)

    WebUI.verifyElementNotClickable(findTestObject('Complete_Archived_Eng_Valid/Import_BTN_Disabled'))

    WebUI.verifyElementPresent(findTestObject('Complete_Archived_Eng_Valid/TB_Check_Disabled'), 10)

    WebUI.verifyElementNotClickable(findTestObject('Complete_Archived_Eng_Valid/TB_Check_Disabled'))
}
catch (Exception e) {
    println('engament doesnt have trial balance')

    WebUI.verifyElementPresent(findTestObject('Complete_Archived_Eng_Valid/Import_BTN_Disabled'), 10, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.verifyElementNotClickable(findTestObject('Complete_Archived_Eng_Valid/Import_BTN_Disabled'), FailureHandling.CONTINUE_ON_FAILURE)
} 

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Toogle_Finacial_Statement'))

WebUI.delay(2)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Toogle_Financial_St_Doc'))

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/FS_Cover_Page'))

WebUI.verifyElementPresent(findTestObject('Complete_Archived_Eng_Valid/Disabled_Sign_Off_Button'), 15)

WebUI.verifyElementNotClickable(findTestObject('Complete_Archived_Eng_Valid/Disabled_Sign_Off_Button'))

