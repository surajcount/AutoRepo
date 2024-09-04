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

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_UAT (Countable)/EmailElement'), EmailLogin)

WebUI.setEncryptedText(findTestObject('Page_UAT (Countable)/Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Page_UAT (Countable)/span_Login'))

WebUI.delay(3)

WebUI.click(findTestObject('Engagement_Section_LHS/Account_Menu_Button'))

WebUI.delay(2)

WebUI.click(findTestObject('Engagement_Section_LHS/My_Account_Option'))

WebUI.delay(2)

WebUI.click(findTestObject('Engagement_Section_LHS/Component_Sec_My_Acc'))

WebUI.delay(1)

WebUI.click(findTestObject('Engagement_Section_LHS/Signature_Sec'))

WebUI.delay(2)

WebUI.click(findTestObject('Engagement_Section_LHS/Add_Signature_Buttn'))

WebUI.delay(1)

WebUI.click(findTestObject('Engagement_Section_LHS/Upload_Signature_Sec'))

WebUI.delay(2)

WebUI.uploadFile(findTestObject('Engagement_Section_LHS/Upload_Signature_Btn'), 'C:\\Users\\Admin\\Desktop\\Countable_Data_Upload\\Signature.jpg')

WebUI.delay(1)

WebUI.setText(findTestObject('Engagement_Section_LHS/Signature_Name'), 'MySignature1')

WebUI.delay(2)

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/SaveButton_Edit_Details'))

