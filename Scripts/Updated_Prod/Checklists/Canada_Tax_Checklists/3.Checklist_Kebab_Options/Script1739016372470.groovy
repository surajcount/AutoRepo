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

WebUI.navigateToUrl(PROD)

WebUI.setText(findTestObject('LoginPage/User_Email'), LoginEmail)

WebUI.setEncryptedText(findTestObject('LoginPage/User_Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('LoginPage/LoginButton'))

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.click(findTestObject('Notes_Firm/Template'))

WebUI.click(findTestObject('Notes_Firm/div_Engagements'))

WebUI.click(findTestObject('Checklist_Objects/Checklist_Dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/Expand_Last_Folder'))

WebUI.click(findTestObject('Checklist_Objects/Completion_Checklist_In_Firm'))

WebUI.mouseOver(findTestObject('Checklist_Objects/Completion_Checklist_In_Firm'))

WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/Kebab_Hieghlighted_Checklist'))

WebUI.click(findTestObject('Checklist_Objects/Duplicate_Checklist_Kebab'))

WebUI.click(findTestObject('Checklist_Objects/Tax_Folder_Firm'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Checklist_Objects/Duplicate_Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Checklist template duplicated successfully', false)

WebUI.delay(1)

WebUI.click(findTestObject('Checklist_Objects/Completion_Checklist_In_Firm'))

WebUI.mouseOver(findTestObject('Checklist_Objects/Completion_Checklist_In_Firm'))

WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/Kebab_Hieghlighted_Checklist'))

WebUI.click(findTestObject('Checklist_Objects/Move_To_Different_Folder'))

WebUI.click(findTestObject('Checklist_Objects/Create_New_Folder'))

WebUI.setText(findTestObject('Notes_Firm/FolderName'), 'Release Move Tax')

WebUI.click(findTestObject('Checklist_Objects/Move_to_Folder_button'))

WebUI.verifyTextPresent('Checklist successfully moved to firm templates', false)

WebUI.click(findTestObject('Checklist_Objects/Checklist_Container'))

WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/Completion_Checklist_In_Firm'))

WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/Kebab_Hieghlighted_Checklist'))

WebUI.click(findTestObject('Checklist_Objects/Move_To_Different_Folder'))

WebUI.click(findTestObject('Checklist_Objects/Tax_Folder_Firm'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Checklist_Objects/Move_to_Folder_button'))

WebUI.verifyTextPresent('Checklist successfully moved to firm templates', false)

WebUI.click(findTestObject('Checklist_Objects/Checklist_Container'))

WebUI.click(findTestObject('Checklist_Objects/Last_Folder_kebab'))

WebUI.click(findTestObject('Checklist_Objects/Delete_Checklist_popup'))

WebUI.click(findTestObject('Checklist_Objects/Delete_Checklist_popup'))

WebUI.verifyTextPresent('Checklist folder deleted successfully', false)

WebUI.delay(3)

WebUI.click(findTestObject('Checklist_Objects/Completion_Checklist_In_Firm'))

WebUI.mouseOver(findTestObject('Checklist_Objects/Completion_Checklist_In_Firm'))

WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/Kebab_Hieghlighted_Checklist'))

WebUI.click(findTestObject('Checklist_Objects/Rename_Checklist'))

WebUI.clearText(findTestObject('Checklist_Objects/Rename_Text'))

WebUI.setText(findTestObject('Checklist_Objects/Rename_Text'), 'Tax Completion renamed')

WebUI.click(findTestObject('Checklist_Objects/Rename_Check'))

WebUI.verifyTextPresent('Checklist successfully renamed', false)

WebUI.delay(5)

WebUI.click(findTestObject('Checklist_Objects/CA_Duplicated_Tax_Checklist'))

WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/Kebab_Hieghlighted_Checklist'))

WebUI.click(findTestObject('Checklist_Objects/Delete_Checklist_popup'))

WebUI.click(findTestObject('Checklist_Objects/Delete_Checklist_popup'))

WebUI.verifyTextPresent('Template checklist successfully deleted', false)

WebUI.click(findTestObject('Checklist_Objects/Checklist_Container'))

WebUI.closeBrowser()

