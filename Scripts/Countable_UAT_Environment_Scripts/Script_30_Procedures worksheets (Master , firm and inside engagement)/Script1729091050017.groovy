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

'This Script covers procedures feature, Following to these script it covers for comilation and review engagement. '
WebUI.navigateToUrl('https://uat.adinovis.com/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_UAT (Countable)/EmailElement'), EmailLogin)

WebUI.setEncryptedText(findTestObject('Page_UAT (Countable)/Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Page_UAT (Countable)/span_Login'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Create Engagement_Objects/Dashboard_Button'), 40)

WebUI.click(findTestObject('Create Engagement_Objects/Dashboard_Button'))

WebUI.waitForElementPresent(findTestObject('Create Engagement_Objects/SearchBox_Dashboard'), 0)

WebUI.setText(findTestObject('Create Engagement_Objects/SearchBox_Dashboard'), 'COM')

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Create Engagement_Objects/Comp_Engmnt_GoInside'))

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Engagement_Section_LHS/TrialBalance_LHS'))

WebUI.click(findTestObject('Engagement_Section_LHS/TrialBalance_LHS'))

WebUI.delay(2)

WebUI.click(findTestObject('Engagement_Section_LHS/ImportCSVFile_TrialBalance'))

WebUI.uploadFile(findTestObject('Engagement_Section_LHS/UploadFileButton_TrialBalance'), 'C:\\Users\\Admin\\Desktop\\Trial_Balance_Upload\\TrialBalImport.csv')

WebUI.delay(6)

WebUI.click(findTestObject('Engagement_Section_LHS/ClicktoFocus'))

WebUI.click(findTestObject('Engagement_Section_LHS/Import_Line_Cancel_Button'))

WebUI.delay(4)

WebUI.uploadFile(findTestObject('Engagement_Section_LHS/UploadFileButton_TrialBalance'), 'C:\\Users\\Admin\\Desktop\\Trial_Balance_Upload\\TrialBalImport.csv')

WebUI.delay(4)

WebUI.click(findTestObject('Engagement_Section_LHS/Import_Trial_Bal_uplaod_File_Line'))

WebUI.delay(3)

WebUI.waitForElementClickable(findTestObject('Engagement_Section_LHS/Automap_Btn'), 30)

WebUI.click(findTestObject('Engagement_Section_LHS/Automap_Btn'))

WebUI.delay(15)

WebUI.waitForElementClickable(findTestObject('Engagement_Section_LHS/Select_Notes'), 30)

WebUI.click(findTestObject('Engagement_Section_LHS/Select_Notes'))

WebUI.delay(3)

WebUI.click(findTestObject('Engagement_Section_LHS/Add_Button_Document_Upld'))

WebUI.delay(3)

WebUI.click(findTestObject('Procedures_Object/Procedure_Section'))

WebUI.delay(2)

WebUI.click(findTestObject('Procedures_Object/Asset_Sub_Section'))

WebUI.delay(3)

WebUI.click(findTestObject('Procedures_Object/Liabilities_Sub_Sec'))

WebUI.delay(2)

WebUI.click(findTestObject('Procedures_Object/Equity_Sub_Sec'))

WebUI.delay(2)

WebUI.click(findTestObject('Procedures_Object/Revenue_Sub_Sec'))

WebUI.delay(2)

WebUI.click(findTestObject('Procedures_Object/Expenses_Sub_sec'))

WebUI.delay(3)

WebUI.refresh()

WebUI.waitForElementClickable(findTestObject('Procedures_Object/Procedure_Section'), 10)

WebUI.click(findTestObject('Procedures_Object/Procedure_Section'))

WebUI.delay(2)

WebUI.click(findTestObject('Procedures_Object/Liabilities_Sub_Sec'))

WebUI.delay(2)

WebUI.click(findTestObject('Procedures_Object/Current_Liabilities'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Procedures_Object/Bank_Ovr_Draft_Current_Lib_Sec'))

WebUI.click(findTestObject('Procedures_Object/Menu_Option_Bank_Draft'))

WebUI.delay(2)

WebUI.click(findTestObject('Reorder_Renumber/Add_Document_Option'))

WebUI.delay(2)

WebUI.uploadFile(findTestObject('Reorder_Renumber/File_Upload_Btn'), 'C:\\Users\\Admin\\Desktop\\Countable_Data_Upload\\File1Procedure.csv')

WebUI.delay(3)

WebUI.click(findTestObject('Reorder_Renumber/Add_Button'))

WebUI.delay(2)

