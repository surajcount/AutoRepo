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

'This script is designed as a Data cretion for Reoprt functionality. User must have Peg Pact updated by running this script. Prior proceeding to run other report scripts.'
WebUI.navigateToUrl('https://uat.adinovis.com/login')

WebUI.maximizeWindow()

WebUI.waitForElementPresent(findTestObject('Page_UAT (Countable)/EmailElement'), 5)

WebUI.setText(findTestObject('Page_UAT (Countable)/EmailElement'), EmailLogin)

WebUI.setEncryptedText(findTestObject('Page_UAT (Countable)/Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Page_UAT (Countable)/span_Login'))

WebUI.delay(3)

WebUI.waitForElementClickable(findTestObject('Add_Firm_Template/Template_Button_Dashboard'), 10)

WebUI.click(findTestObject('Add_Firm_Template/Template_Button_Dashboard'))

WebUI.waitForElementPresent(findTestObject('Report_Master_Firm_Inside_Engagement/Firm_Template_Drop_Dwn'), 10)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Firm_Template_Drop_Dwn'))

WebUI.waitForElementPresent(findTestObject('Report_Master_Firm_Inside_Engagement/Report_Section_Firm_Temp'), 10)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Report_Section_Firm_Temp'))

WebUI.waitForElementClickable(findTestObject('Report_Master_Firm_Inside_Engagement/Report_Section_Master_Lib'), 10)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Report_Section_Master_Lib'))

WebUI.waitForElementClickable(findTestObject('Report_Master_Firm_Inside_Engagement/Update_Peg_Pact_Licence'), 10)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Update_Peg_Pact_Licence'))

WebUI.delay(4)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Edit_Button_Peg_Pact_Licence'))

WebUI.delay(3)

WebUI.setText(findTestObject('Report_Master_Firm_Inside_Engagement/Set_Postal_Code'), 'Y1A 9Z9')

WebUI.delay(2)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Peg_Pact_Sub_Drp_Dwn'))

WebUI.delay(2)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Peg_Pact_Yes_Option'))

WebUI.delay(2)

WebUI.setText(findTestObject('Report_Master_Firm_Inside_Engagement/Set_Peg_Pact_Inv_Numb'), '110110')

WebUI.delay(2)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Open_Calander_Peg_Expiry_Date'))

WebUI.delay(2)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Calander_Next_Month'))

WebUI.delay(1)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Calander_Next_Month'))

WebUI.delay(1)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Set_Expiry_Date'))

WebUI.delay(1)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Apply_BTN_Expiry_Date'))

WebUI.delay(2)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Peg_Pact_Update_BTN'))

WebUI.delay(2)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Confirm_Button_Peg_Update'))

