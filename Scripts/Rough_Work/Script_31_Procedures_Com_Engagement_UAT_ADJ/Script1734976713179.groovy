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

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_UAT (Countable)/EmailElement'), EmailLogin)

WebUI.setEncryptedText(findTestObject('Page_UAT (Countable)/Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Page_UAT (Countable)/span_Login'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Create Engagement_Objects/Dashboard_Button'), 40)

WebUI.click(findTestObject('Create Engagement_Objects/Dashboard_Button'))

WebUI.waitForElementPresent(findTestObject('Create Engagement_Objects/SearchBox_Dashboard'), 0)

WebUI.setText(findTestObject('Create Engagement_Objects/SearchBox_Dashboard'), Search_Engagement)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Create Engagement_Objects/Comp_Engmnt_GoInside'))

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Procedures_Object/Procedure_Section'), 10)

WebUI.click(findTestObject('Procedures_Object/Procedure_Section'))

WebUI.delay(2)

WebUI.click(findTestObject('Procedures_Object/Asset_Sec_Toogle'))

WebUI.delay(2)

WebUI.click(findTestObject('Procedures_Object/Current_Assest_Sub_Sec'))

WebUI.delay(2)

WebUI.click(findTestObject('Procedures_Object/Cash_n_Cash_Equivalent_Prscdr'))

WebUI.delay(5)

WebUI.click(findTestObject('Procedures_Object/Adj_1st_Procedures'))

WebUI.switchToWindowIndex(1)

WebUI.delay(3)

WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.setText(findTestObject('Procedures_Object/1st_Debit_box_ADJ'), '500')

WebUI.delay(3)

WebUI.click(findTestObject('Procedures_Object/Select_Adj_Account'))

WebUI.click(findTestObject('Procedures_Object/Select_1st_Account_ADJ'))

WebUI.delay(3)

WebUI.setText(findTestObject('Procedures_Object/2nd_Credit_Boc_ADJ'), '500')

WebUI.setText(findTestObject('Procedures_Object/Notes_Adjusting_Entry'), 'Adjusting entry created from procedure section')

WebUI.delay(3)

WebUI.click(findTestObject('Notes_Firm/Save_Table'))

WebUI.delay(5)

