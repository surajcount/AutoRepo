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

'This script is designed to archived Engagement- Comp_Rev and Tax'
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

WebUI.scrollToElement(findTestObject('Sign-Offs_FinalReview_Object/Assign_Packager_List_Drp_Dwn'), 10)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Assign_Packager_List_Drp_Dwn'))

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Assign_Packager_As_Surya_LoggedIn'))

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Assign_button_Packager'))

WebUI.waitForElementPresent(findTestObject('Sign-Offs_FinalReview_Object/Complete_Archieve_Section'), 10)

WebUI.scrollToElement(findTestObject('Sign-Offs_FinalReview_Object/Complete_Archieve_Section'), 20)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Complete_Archieve_Section'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Sign-Offs_FinalReview_Object/Archieve_Now_Button'), 20)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Archieve_Now_Button'))

WebUI.waitForElementPresent(findTestObject('Sign-Offs_FinalReview_Object/Archive_Button_pop_up'), 6)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Archive_Button_pop_up'))

WebUI.waitForElementPresent(findTestObject('Create Engagement_Objects/Dashboard_Button'), 40)

WebUI.click(findTestObject('Create Engagement_Objects/Dashboard_Button'))

WebUI.waitForElementPresent(findTestObject('Create Engagement_Objects/SearchBox_Dashboard'), 10)

WebUI.setText(findTestObject('Create Engagement_Objects/SearchBox_Dashboard'), 'REV')

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

WebUI.scrollToElement(findTestObject('Sign-Offs_FinalReview_Object/Archieve_Now_Button'), 20)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Archieve_Now_Button'))

WebUI.waitForElementPresent(findTestObject('Sign-Offs_FinalReview_Object/Archive_Button_pop_up'), 6)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Archive_Button_pop_up'))

WebUI.waitForElementPresent(findTestObject('Create Engagement_Objects/Dashboard_Button'), 40)

WebUI.click(findTestObject('Create Engagement_Objects/Dashboard_Button'))

WebUI.waitForElementPresent(findTestObject('Create Engagement_Objects/SearchBox_Dashboard'), 10)

WebUI.setText(findTestObject('Create Engagement_Objects/SearchBox_Dashboard'), 'T2-')

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

WebUI.scrollToElement(findTestObject('Sign-Offs_FinalReview_Object/Archieve_Now_Button'), 20)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Archieve_Now_Button'))

WebUI.waitForElementPresent(findTestObject('Sign-Offs_FinalReview_Object/Archive_Button_pop_up'), 6)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Archive_Button_pop_up'))

