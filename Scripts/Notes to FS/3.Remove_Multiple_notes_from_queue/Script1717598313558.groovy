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

WebUI.callTestCase(findTestCase('Notes to FS/Add_multiple_notestoQueue'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Notes_Firm/Filter_Icon'))

WebUI.click(findTestObject('Notes_Firm/Review_Filter'))

WebUI.click(findTestObject('Notes_Firm/Select_Multiple_Notes'))

WebUI.click(findTestObject('Notes_Firm/Queue/Remove_From_Queue_Icon'))

WebUI.click(findTestObject('Notes_Firm/Remove_Button'))

WebUI.verifyTextPresent('Note(s) removed from queue successfully', false)

WebUI.click(findTestObject('Notes_Firm/Filter_Icon'))

WebUI.click(findTestObject('Notes_Firm/All_Notes'))

