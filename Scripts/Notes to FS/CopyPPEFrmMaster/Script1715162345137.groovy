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

WebUI.click(findTestObject('Object Repository/Notes_Firm/div_Engagements'))

WebUI.click(findTestObject('Object Repository/Notes_Firm/div_Notes to Financial Statements'))

WebUI.click(findTestObject('Notes_Firm/span_Master Library'))

WebUI.click(findTestObject('Object Repository/Notes_Firm/img_1'))

WebUI.click(findTestObject('Object Repository/Notes_Firm/span_Property, Plant  Equipment'))

WebUI.click(findTestObject('Object Repository/Notes_Firm/span_add Firm templates'))

WebUI.click(findTestObject('Notes_Firm/New_Folder'))

WebUI.setText(findTestObject('Object Repository/Notes_Firm/Folder_name'), 'PSP_Katalon')

WebUI.click(findTestObject('Object Repository/Notes_Firm/Add_Button'))

WebUI.click(findTestObject('Object Repository/Notes_Firm/div_PSP_Katalon folder successfully created_974a16'))

WebUI.click(findTestObject('Object Repository/Notes_Firm/div_Note(s) successfully added to firm temp_368d78'))

WebUI.click(findTestObject('Object Repository/Notes_Firm/span_add Firm templates'))

WebUI.verifyTextPresent('Note(s) already exists in the Firm Templates.', false)

WebUI.click(findTestObject('Object Repository/Notes_Firm/div_Automated notes can only be copied once'))

