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

WebUI.callTestCase(findTestCase('Notes_Inside_Engagement/Create_Engagement_Compilation'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Create_Engagement_Pravin/Search_Engagement'), 'COM-AUT-Dec312023')

WebUI.click(findTestObject('Create_Engagement_Pravin/First_Engagement'))

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('Create_Engagement_Pravin/TB_Adjusting'))

WebUI.delay(90)

WebUI.verifyTextPresent('If you choose to ignore, then you will not see the suggestions for this engagement. You can always manually add your notes via workbook.', 
    false)

WebUI.click(findTestObject('Notes_Inside_Engagement/Close_Automation_Popup'))

WebUI.click(findTestObject('Notes_Inside_Engagement/Client_Onboarding'))

WebUI.click(findTestObject('Notes_Inside_Engagement/Navigate_Checklist'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Create_Engagement_Pravin/TB_Adjusting'))

WebUI.delay(3)

WebUI.verifyTextPresent('Automations available!', false)

WebUI.waitForElementClickable(findTestObject('Notes_Inside_Engagement/Select_All_Notes_Popup'), 2)

WebUI.click(findTestObject('Notes_Inside_Engagement/Select_All_Notes_Popup'))

WebUI.click(findTestObject('Notes_Inside_Engagement/Add_Notes_On_Popup'))

WebUI.delay(2)

WebUI.verifyTextPresent('Notes Added to Engagement successfully!', false)

WebUI.click(findTestObject('Notes_Inside_Engagement/Notes_View_In_Workbook'))

WebUI.switchToWindowIndex(1)

WebUI.delay(10)

WebUI.verifyTextPresent('Notes to Financial Information', false)

WebUI.maximizeWindow()

