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

'This Script is used to add firm template for Compilation/Review/Tax Template.\r\nRecomended to run before running create and update engagement script.\r\nThis Script is for Single Time Use, Should run only once for a firm.'
WebUI.navigateToUrl('https://qa1.adinovis.com/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_UAT (Countable)/EmailElement'), EmailLogin)

WebUI.setEncryptedText(findTestObject('Page_UAT (Countable)/Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Page_UAT (Countable)/span_Login'))

WebUI.delay(3)

WebUI.waitForElementClickable(findTestObject('Add_Firm_Template/Template_Button_Dashboard'), 10)

WebUI.click(findTestObject('Add_Firm_Template/Template_Button_Dashboard'))

WebUI.waitForElementPresent(findTestObject('Add_Firm_Template/Firm_temp_Master_Lib'), 10)

WebUI.click(findTestObject('Add_Firm_Template/Firm_temp_Master_Lib'))

WebUI.waitForElementPresent(findTestObject('Add_Firm_Template/Compilaation_Temp_Mast_Lib_Arr_BTN'), 10)

WebUI.click(findTestObject('Add_Firm_Template/Compilaation_Temp_Mast_Lib_Arr_BTN'))

WebUI.delay(2)

WebUI.click(findTestObject('Add_Firm_Template/Compilation_Tamplate_Master_Lib_CSRS'))

WebUI.delay(5)

WebUI.click(findTestObject('Add_Firm_Template/Add_btn_Frm_Temp'))

WebUI.delay(3)

WebUI.click(findTestObject('Add_Firm_Template/Radio_Btn_Create_New_Folder'))

WebUI.waitForElementPresent(findTestObject('Add_Firm_Template/Comp_Firm_Temp_Folder_Name'), 10)

WebUI.setText(findTestObject('Add_Firm_Template/Comp_Firm_Temp_Folder_Name'), 'FirmTemplate_Compilation')

WebUI.waitForElementPresent(findTestObject('Add_Firm_Template/Add_Button'), 10)

WebUI.click(findTestObject('Add_Firm_Template/Add_Button'))

WebUI.waitForElementPresent(findTestObject('Add_Firm_Template/Firm_temp_Master_Lib'), 10)

WebUI.click(findTestObject('Add_Firm_Template/Firm_temp_Master_Lib'))

WebUI.waitForElementClickable(findTestObject('Add_Firm_Template/Review_Temp_Toogle'), 10)

WebUI.click(findTestObject('Add_Firm_Template/Review_Temp_Toogle'))

WebUI.waitForElementPresent(findTestObject('Add_Firm_Template/Review_Temp_Section_2400'), 5)

WebUI.click(findTestObject('Add_Firm_Template/Review_Temp_Section_2400'))

WebUI.waitForElementClickable(findTestObject('Add_Firm_Template/Add_btn_Frm_Temp'), 10)

WebUI.click(findTestObject('Add_Firm_Template/Add_btn_Frm_Temp'))

WebUI.delay(3)

WebUI.click(findTestObject('Add_Firm_Template/Radio_Btn_Create_New_Folder'))

WebUI.waitForElementPresent(findTestObject('Add_Firm_Template/Comp_Firm_Temp_Folder_Name'), 10)

WebUI.setText(findTestObject('Add_Firm_Template/Comp_Firm_Temp_Folder_Name'), 'Review_Firm_Template_Engagement')

WebUI.waitForElementPresent(findTestObject('Add_Firm_Template/Add_Button'), 10)

WebUI.click(findTestObject('Add_Firm_Template/Add_Button'))

WebUI.waitForElementPresent(findTestObject('Add_Firm_Template/Firm_temp_Master_Lib'), 10)

WebUI.click(findTestObject('Add_Firm_Template/Firm_temp_Master_Lib'))

WebUI.waitForElementClickable(findTestObject('Add_Firm_Template/Tax_Toogle_Btn'), 5)

WebUI.click(findTestObject('Add_Firm_Template/Tax_Toogle_Btn'))

WebUI.waitForElementPresent(findTestObject('Add_Firm_Template/Mastr_Temp_Tax'), 5)

WebUI.click(findTestObject('Add_Firm_Template/Mastr_Temp_Tax'))

WebUI.waitForElementClickable(findTestObject('Add_Firm_Template/Add_btn_Frm_Temp'), 10)

WebUI.click(findTestObject('Add_Firm_Template/Add_btn_Frm_Temp'))

WebUI.delay(3)

WebUI.click(findTestObject('Add_Firm_Template/Radio_Btn_Create_New_Folder'))

WebUI.waitForElementPresent(findTestObject('Add_Firm_Template/Comp_Firm_Temp_Folder_Name'), 10)

WebUI.setText(findTestObject('Add_Firm_Template/Comp_Firm_Temp_Folder_Name'), 'FirmTemplate_Tax')

WebUI.waitForElementPresent(findTestObject('Add_Firm_Template/Add_Button'), 10)

WebUI.click(findTestObject('Add_Firm_Template/Add_Button'))

WebUI.delay(2)

WebUI.closeBrowser()

