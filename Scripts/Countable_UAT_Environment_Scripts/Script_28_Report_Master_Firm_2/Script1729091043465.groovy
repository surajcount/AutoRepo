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

'This Script covers reating template report from master library.'
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

WebUI.delay(2)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Firm_Template_Section'))

WebUI.waitForElementPresent(findTestObject('Report_Master_Firm_Inside_Engagement/Create_Firm_Template_Plus_Btn'), 5)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Create_Firm_Template_Plus_Btn'))

WebUI.delay(2)

WebUI.setText(findTestObject('Report_Master_Firm_Inside_Engagement/Set_Report_Name'), 'TestReport_FirmTemp')

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Create_New_Folder_CB'))

WebUI.setText(findTestObject('Report_Master_Firm_Inside_Engagement/Set_New_Folder_Name'), 'TestReport1')

WebUI.delay(2)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Create_Button'))

WebUI.delay(3)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Created_Report_Toogle_Drp_Dwn'))

WebUI.delay(2)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Open_Firm_Report_Created'))

WebUI.delay(2)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Edit_Button'))

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Section_Section_Created_Reprt'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Report_Master_Firm_Inside_Engagement/Verify_Element_Addressee'), 10)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Uncheck_Addressee_Section_CB'))

WebUI.delay(5)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Uncheck_Addressee_Section_CB'))

WebUI.verifyElementText(findTestObject('Report_Master_Firm_Inside_Engagement/Verify_Report_Element'), 'Addressee - Management')

WebUI.verifyElementPresent(findTestObject('Report_Master_Firm_Inside_Engagement/Verify_Section_Subject_Prsent'), 10)

WebUI.verifyElementPresent(findTestObject('Report_Master_Firm_Inside_Engagement/Verify_Section_Present'), 10)

WebUI.verifyElementPresent(findTestObject('Report_Master_Firm_Inside_Engagement/Verify_Section_Signature_Present'), 10)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/AddNew_Section'))

WebUI.setText(findTestObject('Report_Master_Firm_Inside_Engagement/SetName_Newly_Added_Section'), 'NewSectionTest')

WebUI.delay(2)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Right_Mark_CreateNewSection'))

WebUI.verifyElementPresent(findTestObject('Report_Master_Firm_Inside_Engagement/Verify_Newly_Added_Section'), 10)

WebUI.verifyElementPresent(findTestObject('Report_Master_Firm_Inside_Engagement/Verify_New_Addedd_Section_INReport'), 10)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Save_Added_Section'))

WebUI.waitForElementVisible(findTestObject('Report_Master_Firm_Inside_Engagement/Verify_Toaster_Message_SaveReport'), 10)

WebUI.verifyElementText(findTestObject('Report_Master_Firm_Inside_Engagement/Verify_Toaster_Message_SaveReport'), 'Report saved successfully')

WebUI.delay(4)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ESCAPE))

WebUI.verifyElementPresent(findTestObject('Report_Master_Firm_Inside_Engagement/Verify_New_Addedd_Section_INReport'), 10)

WebUI.mouseOver(findTestObject('Report_Master_Firm_Inside_Engagement/Verify_New_Addedd_Section_INReport'), FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOverOffset(findTestObject('Report_Master_Firm_Inside_Engagement/Verify_New_Addedd_Section_INReport'), 10, 10)

WebUI.waitForElementClickable(findTestObject('Report_Master_Firm_Inside_Engagement/Edit_Button'), 80)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Edit_Button'))

WebUI.delay(3)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Delete_Newly_Added_Section'))

WebUI.delay(2)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Delete_Confirmation_Popup'))

WebUI.delay(3)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Save_Added_Section'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ESCAPE))

WebUI.mouseOver(findTestObject('Report_Master_Firm_Inside_Engagement/Create_Duplicate_Report_Firm_Temp'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Report_Master_Firm_Inside_Engagement/Create_Duplicate_Report_Firm_Temp'), 80)

WebUI.mouseOver(findTestObject('Report_Master_Firm_Inside_Engagement/Create_Duplicate_Report_Firm_Temp'), FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOverOffset(findTestObject('Report_Master_Firm_Inside_Engagement/Create_Duplicate_Report_Firm_Temp'), 10, 10)

WebUI.mouseOver(findTestObject('Report_Master_Firm_Inside_Engagement/Firm_Template_Section'))

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Create_Duplicate_Report_Firm_Temp'))

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Create_New_Folder_CB'))

WebUI.setText(findTestObject('Report_Master_Firm_Inside_Engagement/Set_New_Folder_Name'), 'TestReport_Copy')

WebUI.delay(2)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Dupplicate_BTN_Create_Repo'))

WebUI.delay(3)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Duplicate_Copy_Report_Drop_Down_Firm_Temp'))

WebUI.delay(4)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ESCAPE))

WebUI.waitForElementClickable(findTestObject('Report_Master_Firm_Inside_Engagement/Duplicate_Report_Created'), 60)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Duplicate_Report_Created'))

