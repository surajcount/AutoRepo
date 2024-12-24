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

WebUI.setText(findTestObject('Object Repository/Record and Play/Page_UAT (Countable)/input_Email_mat-input-0'), 'hardayals@yopmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Record and Play/Page_UAT (Countable)/input_Password_mat-input-1'), 
    '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Object Repository/Record and Play/Page_UAT (Countable)/span_Login_mat-mdc-button-touch-target'))

WebUI.click(findTestObject('Object Repository/Record and Play/Page_UAT (Countable)/a_Engagements'))

WebUI.setText(findTestObject('Object Repository/Record and Play/Page_UAT (Countable)/input_Search_mat-input-3'), 'COM-AUT-Dec312023')

WebUI.click(findTestObject('Object Repository/Record and Play/Page_UAT (Countable)/span_COM-AUT-Dec312023'))

WebUI.click(findTestObject('Object Repository/Record and Play/Page_UAT (Countable)/span_Trial Balance  Adj. Entries'))

WebUI.click(findTestObject('Object Repository/Record and Play/Page_UAT (Countable)/span_Workbook'))

WebUI.switchToWindowTitle('UAT (Countable)')

WebUI.click(findTestObject('Object Repository/Record and Play/Page_UAT (Countable)/span_Notes to Financial Information'))

WebUI.click(findTestObject('Object Repository/Record and Play/Page_UAT (Countable)/img'))

WebUI.click(findTestObject('Object Repository/Record and Play/Page_UAT (Countable)/span_Delete'))

WebUI.click(findTestObject('Object Repository/Record and Play/Page_UAT (Countable)/span_Add noteskeyboard_arrow_down'))

WebUI.click(findTestObject('Object Repository/Record and Play/Page_UAT (Countable)/span_Create new category'))

WebUI.setText(findTestObject('Object Repository/Record and Play/Page_UAT (Countable)/input_Category title_mat-input-2'), 
    'Notes_Test')

WebUI.click(findTestObject('Object Repository/Record and Play/Page_UAT (Countable)/span_Create_mat-mdc-button-touch-target'))

WebUI.click(findTestObject('Object Repository/Record and Play/Page_UAT (Countable)/img_1'))

WebUI.click(findTestObject('Object Repository/Record and Play/Page_UAT (Countable)/span_Create empty note'))

WebUI.setText(findTestObject('Object Repository/Record and Play/Page_UAT (Countable)/input_Note Title_name'), 'Test1')

WebUI.click(findTestObject('Object Repository/Record and Play/Page_UAT (Countable)/span_Create_mat-mdc-button-touch-target_1'))

WebUI.click(findTestObject('Object Repository/Record and Play/Page_UAT (Countable)/span_5.1.Test1'))

WebUI.click(findTestObject('Object Repository/Record and Play/Page_UAT (Countable)/span_Add Type'))

WebUI.click(findTestObject('Object Repository/Record and Play/Page_UAT (Countable)/span_Table'))

WebUI.setText(findTestObject('Object Repository/Record and Play/Page_UAT (Countable)/input_Description_BPlBNFS'), 'Qa1')

WebUI.click(findTestObject('Object Repository/Record and Play/Page_UAT (Countable)/span_Add Column'))

WebUI.click(findTestObject('Object Repository/Record and Play/Page_UAT (Countable)/span_Prior Year'))

WebUI.click(findTestObject('Object Repository/Record and Play/Page_UAT (Countable)/span_keyboard_arrow_down_mat-mdc-button-tou_3e6c77'))

WebUI.click(findTestObject('Object Repository/Record and Play/Page_UAT (Countable)/span_Current Year'))

WebUI.click(findTestObject('Object Repository/Record and Play/Page_UAT (Countable)/span_Add Column'))

WebUI.click(findTestObject('Object Repository/Record and Play/Page_UAT (Countable)/span_Total'))

WebUI.click(findTestObject('Object Repository/Record and Play/Page_UAT (Countable)/span_Save Changes'))

WebUI.click(findTestObject('Object Repository/Record and Play/Page_UAT (Countable)/div_Notes updated successfully'))

WebUI.click(findTestObject('Object Repository/Record and Play/Page_UAT (Countable)/img_1'))

WebUI.click(findTestObject('Object Repository/Record and Play/Page_UAT (Countable)/span_From Firm template'))

WebUI.click(findTestObject('Object Repository/Record and Play/Page_UAT (Countable)/span_Property, Plant  Equipment_togglable-icon'))

WebUI.click(findTestObject('Object Repository/Record and Play/Page_UAT (Countable)/input_Manual Column_mat-mdc-checkbox-490-input'))

WebUI.click(findTestObject('Object Repository/Record and Play/Page_UAT (Countable)/span_Add notes (1)'))

WebUI.click(findTestObject('Object Repository/Record and Play/Page_UAT (Countable)/img_1_2'))

WebUI.click(findTestObject('Object Repository/Record and Play/Page_UAT (Countable)/span_5.1.Test1'))

WebUI.click(findTestObject('Object Repository/Record and Play/Page_UAT (Countable)/img_1'))

WebUI.click(findTestObject('Object Repository/Record and Play/Page_UAT (Countable)/span_From Master library'))

WebUI.click(findTestObject('Object Repository/Record and Play/Page_UAT (Countable)/img_1_2'))

WebUI.click(findTestObject('Object Repository/Record and Play/Page_UAT (Countable)/input_Capital Assets_mat-mdc-checkbox-597-input'))

WebUI.click(findTestObject('Object Repository/Record and Play/Page_UAT (Countable)/span_Add notes (1)'))

WebUI.click(findTestObject('Object Repository/Record and Play/Page_UAT (Countable)/div_Notes added successfully'))

