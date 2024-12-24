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

WebUI.callTestCase(findTestCase('Notes to FS/Navigate to Notes to FS Firm template'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Notes_Firm/Kebab/KebabOfFolder'))

WebUI.click(findTestObject('Notes_Firm/Create_Note'))

WebUI.setText(findTestObject('Notes_Firm/Note_Name'), 'Manual Column')

WebUI.click(findTestObject('Notes_Firm/Add_Note'))

WebUI.verifyTextPresent('Successfully created new Note', false)

WebUI.click(findTestObject('Notes_Firm/Toast_Container'))

WebUI.click(findTestObject('Notes_Firm/Add_Type'))

WebUI.click(findTestObject('Notes_Firm/Select_Table'))

WebUI.click(findTestObject('Notes_Firm/Add_Column'))

WebUI.mouseOver(findTestObject('Notes_Firm/Manual_Column_Data/Manual_Column'))

WebUI.click(findTestObject('Notes_Firm/Manual_Column_Data/2 Columns'))

WebUI.takeScreenshotAsCheckpoint('2 Manual Columns')

WebUI.mouseOver(findTestObject('Notes_Firm/Table_Header'))

WebUI.click(findTestObject('Notes_Firm/Manual_Column_Data/Manual_Colm1_Kebab'))

WebUI.click(findTestObject('Notes_Firm/Manual_Column_Data/Man_Col_Rename'))

WebUI.verifyTextPresent('Rename Column Name', false)

WebUI.clearText(findTestObject('Notes_Firm/Rename/Rename_on_popup'))

WebUI.setText(findTestObject('Notes_Firm/Rename/Rename_on_popup'), 'Retained')

//WebUI.click(findTestObject('Notes_Firm/Rename/Rename_on_popup'))
//
//WebUI.click(findTestObject('Notes_Firm/Format/BreakPoints_on_popup'))
//
//WebUI.setText(findTestObject('Notes_Firm/Rename/Rename_on_popup'), 'Total Revenue')
//
//WebUI.click(findTestObject('Notes_Firm/Format/BreakPoints_on_popup'))
//
//WebUI.setText(findTestObject('Notes_Firm/Rename/Rename_on_popup'), 'Total Cost of')
//
//WebUI.click(findTestObject('Notes_Firm/Format/BreakPoints_on_popup'))
//
//WebUI.setText(findTestObject('Notes_Firm/Rename/Rename_on_popup'), 'Liabilities')
WebUI.click(findTestObject('Notes_Firm/Format/Bold_on_popup'))

WebUI.verifyTextPresent('Note: Press Shift+Enter to transition text to a new line or utilize the final arrow icon to create a breakpoint within text.', 
    false)

WebUI.click(findTestObject('Notes_Firm/Format/Apply_on_popup'))

WebUI.verifyTextPresent('Column(s) updated successfully', false)

WebUI.click(findTestObject('Notes_Firm/Toast_Container'))

WebUI.mouseOver(findTestObject('Notes_Firm/Table_Header'))

WebUI.click(findTestObject('Notes_Firm/Manual_Column_Data/Manual_Colm1_Kebab'))

WebUI.click(findTestObject('Notes_Firm/Format/Format_Column'))

WebUI.click(findTestObject('Notes_Firm/Format/Italic_Format'))

WebUI.click(findTestObject('Notes_Firm/Format/Apply_Format'))

WebUI.click(findTestObject('Notes_Firm/Manual_Column_Data/Apply_To_All'))

WebUI.verifyTextPresent('Column(s) updated successfully', false)

WebUI.mouseOver(findTestObject('Notes_Firm/Table_Header'))

WebUI.click(findTestObject('Notes_Firm/Manual_Column_Data/Manual_Colm2_Kebab'))

WebUI.click(findTestObject('Notes_Firm/Manual_Column_Data/Man_Col_Rename'))

WebUI.verifyTextPresent('Rename Column Name', false)

WebUI.clearText(findTestObject('Notes_Firm/Rename/Rename_on_popup'))

WebUI.setText(findTestObject('Notes_Firm/Rename/Rename_on_popup'), 'Statement')

WebUI.verifyTextPresent('Note: Press Shift+Enter to transition text to a new line or utilize the final arrow icon to create a breakpoint within text.', 
    false)

WebUI.click(findTestObject('Notes_Firm/Format/Apply_on_popup'))

WebUI.verifyTextPresent('Column(s) updated successfully', false)

WebUI.mouseOver(findTestObject('Notes_Firm/Table_Header'))

WebUI.click(findTestObject('Notes_Firm/Manual_Column_Data/Manual_Colm2_Kebab'))

WebUI.click(findTestObject('Notes_Firm/Format/Format_Column'))

WebUI.click(findTestObject('Notes_Firm/Format/Bold_Format'))

WebUI.click(findTestObject('Notes_Firm/Format/Apply_Format'))

WebUI.click(findTestObject('Notes_Firm/Manual_Column_Data/Apply_To_Column'))

WebUI.verifyTextPresent('Column(s) updated successfully', false)

WebUI.click(findTestObject('Notes_Firm/Add_Column'))

WebUI.click(findTestObject('Notes_Firm/Total_Column'))

WebUI.click(findTestObject('Notes_Firm/Add_Column'))

WebUI.mouseOver(findTestObject('Notes_Firm/Manual_Column_Data/Manual_Column'))

WebUI.click(findTestObject('Notes_Firm/Manual_Column_Data/1 Column'))

WebUI.click(findTestObject('Notes_Firm/Save_Table'))

