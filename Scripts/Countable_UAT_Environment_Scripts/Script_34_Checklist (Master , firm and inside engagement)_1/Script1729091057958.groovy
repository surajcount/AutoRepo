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

'This Script and following script covers hecklist fature for normal, review and tax engement checklist.\r\nNothing additional required to run these scripts except valid login credential. Designed for \r\none time use, if need to rerun, delete the added checklist first.'
WebUI.openBrowser('')

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

WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/Checklist_Section'))

WebUI.delay(2)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Report_Section_Master_Lib'))

WebUI.delay(2)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Firm_Template_Section'))

WebUI.delay(2)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Report_Section_Master_Lib'))

WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/Expand_All_Button'))

WebUI.delay(3)

WebUI.click(findTestObject('Checklist_Objects/Client_Acceptance_Continuance'))

WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/Firm_Template_Addition_Button'))

WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/Create_New_Folder_Checklist_Template'))

WebUI.delay(2)

WebUI.setText(findTestObject('Checklist_Objects/Folder_Name'), 'New_Cheklist')

WebUI.delay(1)

WebUI.click(findTestObject('Add_Firm_Template/Add_Button'))

WebUI.delay(3)

WebUI.mouseOver(findTestObject('Report_Master_Firm_Inside_Engagement/Firm_Template_Section'))

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Firm_Template_Section'))

WebUI.verifyElementPresent(findTestObject('Checklist_Objects/Verify_New_Checklist'), 3)

WebUI.click(findTestObject('Checklist_Objects/Verify_New_Checklist'))

WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/Client_Acceptance_Continuance'))

WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/Edit_Button'))

Headline_Objects = WebUI.getText(findTestObject('Checklist_Objects/Objective_Text_Headline'))

println(Headline_Objects)

WebUI.delay(4)

WebUI.click(findTestObject('Client_Section_Object/Save_Button_Edit_Client'))

WebUI.mouseOver(findTestObject('Checklist_Objects/Verify_New_Checklist'))

WebUI.delay(3)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Create_Duplicate_Report_Firm_Temp'))

WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/Create_New_Folder_Checklist_Template'))

WebUI.delay(2)

WebUI.setText(findTestObject('Checklist_Objects/Folder_Name'), 'Duplicate_Checlist')

WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/Duplicate_Button'))

WebUI.waitForElementPresent(findTestObject('Checklist_Objects/Verify_Duplicate_Checklist_Created'), 10)

WebUI.click(findTestObject('Checklist_Objects/Verify_Duplicate_Checklist_Created'))

WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/Verify_Duplicate_Checklist_Created'))

WebUI.mouseOver(findTestObject('Checklist_Objects/Verify_Duplicate_Checklist_Created'))

WebUI.click(findTestObject('Checklist_Objects/New_Checlist_CB'))

WebUI.delay(3)

WebUI.click(findTestObject('Checklist_Objects/Delete_Icon_Btn'))

WebUI.delay(2)

WebUI.click(findTestObject('Client_All_RegressionCase/UploadCSV_Client/Cancel_Import_Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

