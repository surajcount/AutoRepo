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

WebUI.navigateToUrl(UAT)

WebUI.setText(findTestObject('LoginPage/User_Email'), LoginEmail)

WebUI.setEncryptedText(findTestObject('LoginPage/User_Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('LoginPage/LoginButton'))

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.click(findTestObject('Notes_Firm/Template'))

WebUI.click(findTestObject('Notes_Firm/div_Engagements'))

WebUI.click(findTestObject('Materiality/WorkSheet_Dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/Expand_Last_Folder'))

WebUI.click(findTestObject('Materiality/Materiality_in_Firm'))

WebUI.mouseOver(findTestObject('Materiality/Materiality_in_Firm'))

WebUI.delay(2)

WebUI.click(findTestObject('Materiality/Materiality_Kebab_menu'))

WebUI.click(findTestObject('Checklist_Objects/Duplicate_Checklist_Kebab'))

WebUI.delay(2)

WebUI.click(findTestObject('Materiality/Existing_folder'))

WebUI.click(findTestObject('Materiality/Select_Materiality_Folder'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Materiality/Worksheet_Template_Name'), 'Materiality duplicated')

WebUI.click(findTestObject('Checklist_Objects/Duplicate_Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Worksheets copied successfully', false)

WebUI.delay(2)

WebUI.click(findTestObject('Materiality/Materiality_Kebab_menu'))

WebUI.click(findTestObject('Checklist_Objects/Rename_Checklist'))

WebUI.clearText(findTestObject('Checklist_Objects/Rename_Text'))

WebUI.setText(findTestObject('Checklist_Objects/Rename_Text'), 'Materiality renamed')

WebUI.click(findTestObject('Checklist_Objects/Rename_Check'))

WebUI.verifyTextPresent('Worksheet renamed successfully', false)

WebUI.delay(2)

WebUI.click(findTestObject('Materiality/Materiality_Kebab_menu'))

WebUI.click(findTestObject('Checklist_Objects/Move_To_Different_Folder'))

WebUI.click(findTestObject('Checklist_Objects/Create_New_Folder'))

WebUI.setText(findTestObject('Notes_Firm/FolderName'), 'Release Move')

WebUI.click(findTestObject('Checklist_Objects/Move_To_Different_Folder'))

WebUI.verifyTextPresent('Worksheet Moved Successfully', false)

WebUI.click(findTestObject('Checklist_Objects/Checklist_Container'))

WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/Expand_Last_Folder'))

WebUI.mouseOver(findTestObject('Materiality/Materiality_in_Firm'))

WebUI.click(findTestObject('Materiality/Last_Materiality_Folder_kebab'))

WebUI.click(findTestObject('Checklist_Objects/Delete_Checklist_popup'))

WebUI.click(findTestObject('Checklist_Objects/Delete_Checklist_popup'))

WebUI.verifyTextPresent('Worksheets(s) deleted successfully', false)

WebUI.delay(2)

WebUI.click(findTestObject('Materiality/Last_Materiality_Folder_kebab'))

WebUI.click(findTestObject('Checklist_Objects/Delete_Checklist_popup'))

WebUI.delay(1)

WebUI.click(findTestObject('Checklist_Objects/Delete_Checklist_popup'))

WebUI.verifyTextPresent('Worksheets(s) deleted successfully', false)

WebUI.closeBrowser()

