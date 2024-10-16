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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.NoSuchElementException as NoSuchElementException
import com.kms.katalon.core.exception.StepFailedException as StepFailedException

WebUI.openBrowser('')

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

WebUI.click(findTestObject('Reorder_Renumber/Co_Onboarding_Section_Drp_Dwn'))

WebUI.delay(3)

WebUI.click(findTestObject('Reorder_Renumber/Client_Accepatance_Sec'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Reorder_Renumber/Client_Accepatance_Sec'))

WebUI.click(findTestObject('Reorder_Renumber/Menu_Option_Client_Onboarding'))

WebUI.delay(2)

WebUI.click(findTestObject('Reorder_Renumber/Add_Document_Option'))

WebUI.delay(2)

WebUI.uploadFile(findTestObject('Reorder_Renumber/File_Upload_Btn'), 'C:\\Users\\Admin\\Desktop\\Countable_Data_Upload\\File1.csv')

WebUI.delay(3)

WebUI.click(findTestObject('Reorder_Renumber/Add_Button'))

WebUI.delay(2)

WebUI.click(findTestObject('Reorder_Renumber/Drop_Dwn_Added_File_Client_Acceptnc_Sec'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Reorder_Renumber/Client_Accepatance_Sec'))

WebUI.click(findTestObject('Reorder_Renumber/Menu_Option_Client_Onboarding'))

WebUI.delay(2)

WebUI.click(findTestObject('Reorder_Renumber/Add_Document_Option'))

WebUI.delay(2)

WebUI.uploadFile(findTestObject('Reorder_Renumber/File_Upload_Btn'), 'C:\\Users\\Admin\\Desktop\\Countable_Data_Upload\\File2.csv')

WebUI.delay(3)

WebUI.click(findTestObject('Reorder_Renumber/Add_Button'))

WebUI.delay(2)

WebUI.click(findTestObject('Reorder_Renumber/Drop_Dwn_Added_File_Client_Acceptnc_Sec'))

WebUI.delay(3)

WebUI.mouseOver(findTestObject('Reorder_Renumber/Client_Accepatance_Sec'))

WebUI.click(findTestObject('Reorder_Renumber/Menu_Option_Client_Onboarding'))

WebUI.delay(2)

WebUI.click(findTestObject('Reorder_Renumber/Add_Document_Option'))

WebUI.delay(2)

WebUI.uploadFile(findTestObject('Reorder_Renumber/File_Upload_Btn'), 'C:\\Users\\Admin\\Desktop\\Countable_Data_Upload\\File3.csv')

WebUI.delay(3)

WebUI.click(findTestObject('Reorder_Renumber/Add_Button'))

WebUI.delay(2)

WebUI.click(findTestObject('Reorder_Renumber/Drop_Dwn_Added_File_Client_Acceptnc_Sec'))

WebUI.delay(3)

WebUI.mouseOver(findTestObject('Reorder_Renumber/Client_Accepatance_Sec'))

WebUI.click(findTestObject('Reorder_Renumber/Menu_Option_Client_Onboarding'))

WebUI.delay(2)

WebUI.click(findTestObject('Reorder_Renumber/Add_Document_Option'))

WebUI.delay(2)

WebUI.uploadFile(findTestObject('Reorder_Renumber/File_Upload_Btn'), 'C:\\Users\\Admin\\Desktop\\Countable_Data_Upload\\File4.csv')

WebUI.delay(3)

WebUI.click(findTestObject('Reorder_Renumber/Add_Button'))

WebUI.delay(3)

WebUI.click(findTestObject('Reorder_Renumber/Drop_Dwn_Added_File_Client_Acceptnc_Sec'))

WebUI.delay(2)

WebUI.click(findTestObject('Reorder_Renumber/Drop_Dwn_Added_File_Client_Acceptnc_Sec'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Reorder_Renumber/Client_Accepatance_Sec'))

WebUI.click(findTestObject('Reorder_Renumber/Menu_Option_Client_Onboarding'))

WebUI.delay(2)

WebUI.click(findTestObject('Reorder_Renumber/Reorder_BTN'))

WebUI.delay(2)

WebUI.click(findTestObject('Reorder_Renumber/File_Select_To_Reorder'))

WebUI.delay(2)

WebUI.click(findTestObject('Reorder_Renumber/Reorder_Up_Btn'))

WebUI.delay(2)

WebUI.click(findTestObject('Reorder_Renumber/Save_Btn_Reorder'))

WebUI.delay(3)

WebUI.mouseOver(findTestObject('Reorder_Renumber/Client_Accepatance_Sec'))

WebUI.click(findTestObject('Reorder_Renumber/Menu_Option_Client_Onboarding'))

WebUI.delay(2)

WebUI.click(findTestObject('Reorder_Renumber/Renumber_Btn'))

WebUI.delay(2)

WebUI.click(findTestObject('Reorder_Renumber/Renumber_Btn_Pop_up'))

WebUI.delay(3)

WebUI.mouseOver(findTestObject('Reorder_Renumber/Independence_Section'))

WebUI.mouseOver(findTestObject('Reorder_Renumber/Independence_Section'))

WebUI.waitForElementPresent(findTestObject('Reorder_Renumber/Menu_Option_Independence'), 10)

WebUI.click(findTestObject('Reorder_Renumber/Menu_Option_Independence'))

WebUI.delay(2)

WebUI.click(findTestObject('Reorder_Renumber/Add_Document_Option'))

WebUI.delay(2)

WebUI.uploadFile(findTestObject('Reorder_Renumber/File_Upload_Btn'), 'C:\\Users\\Admin\\Desktop\\Countable_Data_Upload\\File1 - Copy.csv')

WebUI.delay(3)

WebUI.click(findTestObject('Reorder_Renumber/Add_Button'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Reorder_Renumber/Independence_Section_drp_dwn'), 0)

WebUI.click(findTestObject('Reorder_Renumber/Independence_Section_drp_dwn'))

WebUI.waitForElementPresent(findTestObject('Reorder_Renumber/Menu_Option_Independence'), 10)

WebUI.click(findTestObject('Reorder_Renumber/Menu_Option_Independence'))

WebUI.delay(2)

WebUI.click(findTestObject('Reorder_Renumber/Add_Document_Option'))

WebUI.delay(2)

WebUI.uploadFile(findTestObject('Reorder_Renumber/File_Upload_Btn'), 'C:\\Users\\Admin\\Desktop\\Countable_Data_Upload\\File2 - Copy.csv')

WebUI.delay(3)

WebUI.click(findTestObject('Reorder_Renumber/Add_Button'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Reorder_Renumber/Independence_Section'))

WebUI.waitForElementPresent(findTestObject('Reorder_Renumber/Menu_Option_Independence'), 10)

WebUI.click(findTestObject('Reorder_Renumber/Menu_Option_Independence'))

WebUI.delay(2)

WebUI.click(findTestObject('Reorder_Renumber/Add_Document_Option'))

WebUI.delay(2)

WebUI.uploadFile(findTestObject('Reorder_Renumber/File_Upload_Btn'), 'C:\\Users\\Admin\\Desktop\\Countable_Data_Upload\\File3 - Copy.csv')

WebUI.delay(3)

WebUI.click(findTestObject('Reorder_Renumber/Add_Button'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Reorder_Renumber/Independence_Section'))

WebUI.waitForElementPresent(findTestObject('Reorder_Renumber/Menu_Option_Independence'), 10)

WebUI.click(findTestObject('Reorder_Renumber/Menu_Option_Independence'))

WebUI.delay(2)

WebUI.click(findTestObject('Reorder_Renumber/Add_Document_Option'))

WebUI.delay(2)

WebUI.uploadFile(findTestObject('Reorder_Renumber/File_Upload_Btn'), 'C:\\Users\\Admin\\Desktop\\Countable_Data_Upload\\File4 - Copy.csv')

WebUI.delay(3)

WebUI.click(findTestObject('Reorder_Renumber/Add_Button'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Reorder_Renumber/Independence_Section'))

WebUI.click(findTestObject('Reorder_Renumber/Menu_Option_Independence'))

WebUI.delay(2)

WebUI.click(findTestObject('Reorder_Renumber/Reorder_BTN'))

WebUI.delay(2)

WebUI.click(findTestObject('Reorder_Renumber/File_Select_To_Reorder'))

WebUI.delay(2)

WebUI.click(findTestObject('Reorder_Renumber/Reorder_Up_Btn'))

WebUI.delay(2)

WebUI.click(findTestObject('Reorder_Renumber/Save_Btn_Reorder'))

WebUI.delay(3)

WebUI.refresh()

WebUI.waitForElementVisible(findTestObject('Reorder_Renumber/Independence_Section'), 2)

WebUI.mouseOver(findTestObject('Reorder_Renumber/Independence_Section'))

WebUI.waitForElementPresent(findTestObject('Reorder_Renumber/Menu_Option_Independence'), 10)

WebUI.click(findTestObject('Reorder_Renumber/Menu_Option_Independence'))

WebUI.delay(2)

WebUI.click(findTestObject('Reorder_Renumber/Reorder_Section_Option'))

WebUI.delay(2)

WebUI.click(findTestObject('Reorder_Renumber/Engagement_Option_Pop_up_Re_Sec'))

WebUI.delay(4)

WebUI.click(findTestObject('Reorder_Renumber/Reorder_Up_Btn'))

WebUI.delay(2)

WebUI.click(findTestObject('Reorder_Renumber/Save_Btn_Reorder'))

WebUI.delay(4)

WebUI.click(findTestObject('Reorder_Renumber/Co_Onboarding_Section_Drp_Dwn'))

WebUI.delay(2)

WebUI.click(findTestObject('Reorder_Renumber/Document_Section_Drp_Dwn'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Reorder_Renumber/Document_Shareholder_Agreement'))

WebUI.waitForElementPresent(findTestObject('Reorder_Renumber/Document_Shareholder_Agreement_Menu'), 10)

WebUI.click(findTestObject('Reorder_Renumber/Document_Shareholder_Agreement_Menu'))

WebUI.delay(2)

WebUI.click(findTestObject('Reorder_Renumber/Reorder_Section_Option'))

WebUI.delay(2)

WebUI.click(findTestObject('Reorder_Renumber/Doc_Banking_Agreement'))

WebUI.delay(3)

WebUI.click(findTestObject('Reorder_Renumber/Reorder_Up_Btn'))

WebUI.delay(1)

WebUI.click(findTestObject('Reorder_Renumber/Reorder_Up_Btn'))

WebUI.delay(1)

WebUI.click(findTestObject('Reorder_Renumber/Save_Btn_Reorder'))

WebUI.delay(3)

WebUI.mouseOver(findTestObject('Reorder_Renumber/Document_Shareholder_Agreement'))

WebUI.waitForElementPresent(findTestObject('Reorder_Renumber/Document_Shareholder_Agreement_Menu'), 10)

WebUI.click(findTestObject('Reorder_Renumber/Document_Shareholder_Agreement_Menu'))

WebUI.delay(2)

WebUI.click(findTestObject('Reorder_Renumber/Add_Document_Option'))

WebUI.delay(2)

WebUI.uploadFile(findTestObject('Reorder_Renumber/File_Upload_Btn'), 'C:\\Users\\Admin\\Desktop\\Countable_Data_Upload\\DocFile1.csv')

WebUI.delay(3)

WebUI.click(findTestObject('Reorder_Renumber/Add_Button'))

WebUI.delay(3)

WebUI.click(findTestObject('Reorder_Renumber/ShareHolder_Agreement_Drp_Dwn'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Reorder_Renumber/Document_Shareholder_Agreement'))

WebUI.waitForElementPresent(findTestObject('Reorder_Renumber/Document_Shareholder_Agreement_Menu'), 10)

WebUI.click(findTestObject('Reorder_Renumber/Document_Shareholder_Agreement_Menu'))

WebUI.delay(2)

WebUI.click(findTestObject('Reorder_Renumber/Add_Document_Option'))

WebUI.delay(2)

WebUI.uploadFile(findTestObject('Reorder_Renumber/File_Upload_Btn'), 'C:\\Users\\Admin\\Desktop\\Countable_Data_Upload\\DocFile2.csv')

WebUI.delay(3)

WebUI.click(findTestObject('Reorder_Renumber/Add_Button'))

WebUI.delay(3)

WebUI.mouseOver(findTestObject('Reorder_Renumber/Document_Shareholder_Agreement'))

WebUI.waitForElementPresent(findTestObject('Reorder_Renumber/Document_Shareholder_Agreement_Menu'), 10)

WebUI.click(findTestObject('Reorder_Renumber/Document_Shareholder_Agreement_Menu'))

WebUI.delay(2)

WebUI.click(findTestObject('Reorder_Renumber/Add_Document_Option'))

WebUI.delay(2)

WebUI.uploadFile(findTestObject('Reorder_Renumber/File_Upload_Btn'), 'C:\\Users\\Admin\\Desktop\\Countable_Data_Upload\\DocFile3.csv')

WebUI.delay(3)

WebUI.click(findTestObject('Reorder_Renumber/Add_Button'))

WebUI.delay(3)

WebUI.mouseOver(findTestObject('Reorder_Renumber/Document_Shareholder_Agreement'))

WebUI.click(findTestObject('Reorder_Renumber/Document_Shareholder_Agreement_Menu'))

WebUI.delay(2)

WebUI.click(findTestObject('Reorder_Renumber/Reorder_BTN'))

WebUI.delay(2)

WebUI.click(findTestObject('Reorder_Renumber/File_Select_To_Reorder'))

WebUI.delay(2)

WebUI.click(findTestObject('Reorder_Renumber/Reorder_Up_Btn'))

WebUI.delay(2)

WebUI.click(findTestObject('Reorder_Renumber/Save_Btn_Reorder'))

