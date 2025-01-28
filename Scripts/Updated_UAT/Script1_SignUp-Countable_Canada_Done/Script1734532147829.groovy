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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.NoSuchElementException as NoSuchElementException
import com.kms.katalon.core.exception.StepFailedException as StepFailedException

'This Script is designed to Sign-up a new user on Canada. Prequiste to run this script is just\r\nto change the email variable of a new user.\r\nThis script is of single run use for a particaular user.'
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(UAT)

WebUI.click(findTestObject('Object Repository/OnboardingObjects/Page_UAT (Countable)/a_Sign Up'))

WebUI.click(findTestObject('Object Repository/OnboardingObjects/Page_UAT (Countable)/Country_Dropdown'))

WebUI.click(findTestObject('Object Repository/OnboardingObjects/Page_UAT (Countable)/mat-option_Canada'))

WebUI.setText(findTestObject('Object Repository/OnboardingObjects/Page_UAT (Countable)/First Name'), 'UAT')

WebUI.setText(findTestObject('Object Repository/OnboardingObjects/Page_UAT (Countable)/Last Name'), 'QA Team ')

WebUI.setText(findTestObject('Object Repository/OnboardingObjects/Page_UAT (Countable)/Firm_Name'), 'QA Team corporation')

WebUI.setText(findTestObject('Object Repository/OnboardingObjects/Page_UAT (Countable)/Firm size (No. of users)'), '10')

WebUI.setText(findTestObject('Object Repository/OnboardingObjects/Page_UAT (Countable)/E-mail'), emailSignup)

WebUI.setText(findTestObject('Object Repository/OnboardingObjects/Page_UAT (Countable)/Phone number'), '(123) 456-7890')

WebUI.click(findTestObject('Object Repository/OnboardingObjects/Page_UAT (Countable)/How_did_you_hear_about'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('OnboardingObjects/Page_UAT (Countable)/DevlopementPartner_ListHearFromUS'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_UAT (Countable)/DevPartnerList_ArrowBTN'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_UAT (Countable)/SelectXero_Dev_Partner'))

WebUI.click(findTestObject('Object Repository/OnboardingObjects/Page_UAT (Countable)/Please Specify_checkbox'))

WebUI.click(findTestObject('Object Repository/OnboardingObjects/Page_UAT (Countable)/Create your accountSelect a countryCan'))

WebUI.click(findTestObject('Object Repository/OnboardingObjects/Page_UAT (Countable)/Sign_Up_Now'))

JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

js.executeScript('window.open()')

WebUI.switchToWindowIndex(1)

WebUI.navigateToUrl('https://yopmail.com/')

WebUI.setText(findTestObject('Object Repository/OnboardingObjects/Page_YOPmail - Disposable Email Address - A_32619f/input_Type the Email name of your choice_login'), 
    yopmail)

WebUI.click(findTestObject('Object Repository/OnboardingObjects/Page_YOPmail - Disposable Email Address - A_32619f/i_'))

try {
    WebUI.click(findTestObject('Page_Inbox/a_Verify'))
}
catch (Exception e) {
    WebUI.click(findTestObject('Page_Inbox/button_2023adminadinovis'))

    WebUI.click(findTestObject('Page_Inbox/a_Verify'))
} 

WebUI.switchToWindowIndex(2)

WebUI.setEncryptedText(findTestObject('Object Repository/OnboardingObjects/Page_UAT (Countable)/New_Password'), 
    '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.setEncryptedText(findTestObject('Object Repository/OnboardingObjects/Page_UAT (Countable)/Re-Enter_Password'), 
    '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Object Repository/OnboardingObjects/Page_UAT (Countable)/Please Specify_checkbox'))

WebUI.click(findTestObject('Object Repository/OnboardingObjects/Page_UAT (Countable)/span_Set Password'))

WebUI.click(findTestObject('Object Repository/OnboardingObjects/Page_UAT (Countable)/span_Login Now'))

WebUI.setText(findTestObject('Object Repository/OnboardingObjects/Page_UAT (Countable)/input_Email_mat-input-3'), emailSignup)

WebUI.setEncryptedText(findTestObject('Object Repository/OnboardingObjects/Page_UAT (Countable)/input_Password_mat-input-4'), 
    '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Object Repository/OnboardingObjects/Page_UAT (Countable)/span_Login_mat-mdc-button-touch-target'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Login/Close_Welcome_toaster'))

WebUI.click(findTestObject('Page_Login/User_profile'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OnboardingObjects/Page_UAT (Countable)/span_Log out'))

WebUI.closeBrowser()

