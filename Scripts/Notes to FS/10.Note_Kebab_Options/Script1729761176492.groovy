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

WebUI.callTestCase(findTestCase('Login_TC/Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Notes_Firm/Template'))

WebUI.click(findTestObject('Notes_Firm/div_Engagements'))

WebUI.click(findTestObject('Notes_Firm/div_Notes to Financial Statements'))

WebUI.click(findTestObject('Notes_Firm/span_Master Library'))

WebUI.setText(findTestObject('Notes_Firm/SearchInMaster'), 'Trade')

WebUI.click(findTestObject('Notes_Firm/Trade Note'))

WebUI.click(findTestObject('Object Repository/Notes_Firm/span_add Firm templates'))

WebUI.click(findTestObject('Notes_Firm/New_Folder'))

WebUI.setText(findTestObject('Object Repository/Notes_Firm/Folder_name'), 'Note_Kebab')

WebUI.click(findTestObject('Object Repository/Notes_Firm/Add_Button'))

WebUI.click(findTestObject('Notes_Firm/Toast_Container'))

WebUI.click(findTestObject('Notes_Firm/Navigate toFirm Template'))

WebUI.setText(findTestObject('Notes_Firm/SearchInMaster'), 'Trade')

WebUI.click(findTestObject('Notes_Firm/Trade Note'))

WebUI.click(findTestObject('Notes_Firm/Kebab/Trade_Kebab_Firm_2'))

WebUI.click(findTestObject('Notes_Firm/Edit_Option'))

WebUI.click(findTestObject('Notes_Firm/Add_Column'))

WebUI.click(findTestObject('Notes_Firm/Total_Column'))

WebUI.click(findTestObject('Notes_Firm/Save_Table'))

WebUI.click(findTestObject('Notes_Firm/div_Saved Trade and other accounts receivab_314fa4'))

WebUI.click(findTestObject('Notes_Firm/Kebab/Trade_Kebab_Firm_2'))

WebUI.click(findTestObject('Notes_Firm/Kebab/Duplicate_Kebab'))

WebUI.click(findTestObject('Notes_Firm/New_Folder'))

WebUI.setText(findTestObject('Object Repository/Notes_Firm/Folder_name'), 'Duplicate_Note')

WebUI.click(findTestObject('Object Repository/Notes_Firm/Add_Button'))

WebUI.click(findTestObject('Notes_Firm/Toast_Container'))

WebUI.click(findTestObject('Notes_Firm/Kebab/Trade_Kebab_Firm_2'))

WebUI.click(findTestObject('Notes_Firm/Kebab/Kebab_Move'))

WebUI.click(findTestObject('Notes_Firm/New_Folder'))

WebUI.setText(findTestObject('Object Repository/Notes_Firm/Folder_name'), 'Move_Note')

WebUI.click(findTestObject('Object Repository/Notes_Firm/Add_Button'))

