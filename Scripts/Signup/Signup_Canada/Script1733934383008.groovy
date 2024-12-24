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

WebUI.navigateToUrl('https://uat.adinovis.com/login')

WebUI.click(findTestObject('Object Repository/Test/111224/Page_UAT (Countable)/a_Sign Up'))

WebUI.click(findTestObject('Object Repository/Test/111224/Page_UAT (Countable)/div_Select a country'))

WebUI.click(findTestObject('Object Repository/Test/111224/Page_UAT (Countable)/div_Select a country_1'))

WebUI.click(findTestObject('Object Repository/Test/111224/Page_UAT (Countable)/mat-option_Canada'))

WebUI.setText(findTestObject('Object Repository/Test/111224/Page_UAT (Countable)/input_First Name_mat-input-2'), 'QA')

WebUI.setText(findTestObject('Object Repository/Test/111224/Page_UAT (Countable)/input_Last Name_mat-input-3'), 'Automation')

WebUI.click(findTestObject('Object Repository/Test/111224/Page_UAT (Countable)/input_Last Name_mat-input-3'))

WebUI.setText(findTestObject('Object Repository/Test/111224/Page_UAT (Countable)/input_Firm Name_mat-input-4'), 'QA Firm 01')

WebUI.click(findTestObject('Object Repository/Test/111224/Page_UAT (Countable)/input_Firm Name_mat-input-4'))

WebUI.setText(findTestObject('Object Repository/Test/111224/Page_UAT (Countable)/input_Firm size (No. of users)_mat-input-5'), 
    '4')

WebUI.setText(findTestObject('Object Repository/Test/111224/Page_UAT (Countable)/input_E-mail_mat-input-6'), 'qaauto02@yopmail.com')

WebUI.setText(findTestObject('Object Repository/Test/111224/Page_UAT (Countable)/input_Phone number_mat-input-7'), '(976) 413-1648')

WebUI.click(findTestObject('Object Repository/Test/111224/Page_UAT (Countable)/span_How did you hear about us_ng-arrow-wrapper'))

WebUI.click(findTestObject('Object Repository/Test/111224/Page_UAT (Countable)/span_Social'))

WebUI.click(findTestObject('Object Repository/Test/111224/Page_UAT (Countable)/span_Select from Social_ng-arrow-wrapper'))

WebUI.click(findTestObject('Object Repository/Test/111224/Page_UAT (Countable)/span_Search Engine'))

WebUI.click(findTestObject('Object Repository/Test/111224/Page_UAT (Countable)/span_Select from Social_ng-arrow-wrapper'))

WebUI.click(findTestObject('Object Repository/Test/111224/Page_UAT (Countable)/span_Google'))

WebUI.click(findTestObject('Object Repository/Test/111224/Page_UAT (Countable)/div_I agree to the Terms of Use  Privacy Policy'))

WebUI.click(findTestObject('Object Repository/Test/111224/Page_UAT (Countable)/input_Google_mat-mdc-checkbox-2-input'))

WebUI.click(findTestObject('Object Repository/Test/111224/Page_UAT (Countable)/span_Sign Up Now_mat-mdc-button-touch-target'))

WebUI.doubleClick(findTestObject('Object Repository/Test/111224/Page_UAT (Countable)/h5_qaauto01yopmail.com'))

WebUI.click(findTestObject('Object Repository/Test/111224/Page_UAT (Countable)/body_homeBack To Websitesupportcountable.co_85e23d'))

WebUI.switchToWindowTitle('YOPmail - Disposable Email Address - Anonymous and temporary inbox')

WebUI.setText(findTestObject('Object Repository/Test/111224/Page_YOPmail - Disposable Email Address - A_32619f/input_Type the Email name of your choice_login'), 
    'qaauto02@yopmail.com')

WebUI.sendKeys(findTestObject('Object Repository/Test/111224/Page_YOPmail - Disposable Email Address - A_32619f/input_Type the Email name of your choice_login'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Test/111224/Page_Inbox/a_Verify                                    Email'))

WebUI.switchToWindowTitle('UAT (Countable)')

WebUI.setEncryptedText(findTestObject('Object Repository/Test/111224/Page_UAT (Countable)/input_Password_password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Test/111224/Page_UAT (Countable)/input_Re-enter Password_confirmPassword'), 
    '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Object Repository/Test/111224/Page_UAT (Countable)/input_Re-enter Password_mat-mdc-checkbox-1-input'))

WebUI.click(findTestObject('Object Repository/Test/111224/Page_UAT (Countable)/span_Set Password_mat-mdc-button-touch-target'))

WebUI.click(findTestObject('Object Repository/Test/111224/Page_UAT (Countable)/span_Login Now'))

WebUI.setText(findTestObject('Object Repository/Test/111224/Page_UAT (Countable)/input_Email_mat-input-3'), 'qaauto01@yopmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Test/111224/Page_UAT (Countable)/input_Password_mat-input-4'), 
    '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Object Repository/Test/111224/Page_UAT (Countable)/span_Login_mat-mdc-button-touch-target'))

WebUI.click(findTestObject('Object Repository/Test/111224/Page_UAT (Countable)/span_Dashboard_mat-mdc-button-touch-target'))

WebUI.closeBrowser()

