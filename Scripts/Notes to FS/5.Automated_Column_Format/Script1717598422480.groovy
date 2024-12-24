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

//Need to modify the test cases as per notes to fs Table variations
WebUI.callTestCase(findTestCase('Login_TC/Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Notes_Firm/Template'))

WebUI.click(findTestObject('Notes_Firm/div_Engagements'))

WebUI.click(findTestObject('Notes_Firm/div_Notes to Financial Statements'))

WebUI.click(findTestObject('Notes_Firm/CreateFolder'))

WebUI.setText(findTestObject('Notes_Firm/FolderName'), 'Table Variations')

WebUI.click(findTestObject('Notes_Firm/ConfirmFolderName'))

WebUI.click(findTestObject('Notes_Firm/Kebab/KebabOfFolder'))

WebUI.click(findTestObject('Notes_Firm/Create_Note'))

WebUI.setText(findTestObject('Notes_Firm/Note_Name'), 'Automated Column')

WebUI.click(findTestObject('Notes_Firm/Add_Note'))

WebUI.click(findTestObject('Notes_Firm/Add_Type'))

WebUI.click(findTestObject('Notes_Firm/Select_Table'))

WebUI.click(findTestObject('Notes_Firm/Add_Column'))

WebUI.click(findTestObject('Notes_Firm/Current_Year_Column'))

WebUI.click(findTestObject('Notes_Firm/Add_Column'))

WebUI.click(findTestObject('Notes_Firm/Prior_Year_Column'))

WebUI.click(findTestObject('Notes_Firm/Add_Column'))

WebUI.click(findTestObject('Notes_Firm/Total_Column'))

WebUI.verifyTextPresent('Month DD, 20XX', false)

WebUI.mouseOver(findTestObject('Notes_Firm/Table_Header'))

WebUI.click(findTestObject('Notes_Firm/Kebab/Current_Year_Kebab'))

WebUI.mouseOver(findTestObject('Notes_Firm/Month_And_Year'))

WebUI.takeScreenshotAsCheckpoint('Long format disable by default')

WebUI.click(findTestObject('Notes_Firm/Short_Format(MON DD 20XX)'))

WebUI.verifyTextPresent('Column(s) updated successfully', false)

WebUI.click(findTestObject('Notes_Firm/Toast_Container'))

WebUI.verifyTextPresent('MON DD, 20XX', false)

WebUI.mouseOver(findTestObject('Notes_Firm/Table_Header'))

WebUI.click(findTestObject('Notes_Firm/Kebab/Current_Year_Kebab'))

WebUI.click(findTestObject('Notes_Firm/Format/Format_Column'))

WebUI.click(findTestObject('Notes_Firm/Format/Italic_Format'))

WebUI.click(findTestObject('Notes_Firm/Format/Apply_Format'))

WebUI.click(findTestObject('Notes_Firm/Toast_Container'))

WebUI.click(findTestObject('Notes_Firm/Save_Table'))

WebUI.click(findTestObject('Notes_Firm/Toast_Container'))

WebUI.click(findTestObject('Notes_Firm/Table_Header'))

WebUI.mouseOver(findTestObject('Notes_Firm/Table_Header'))

WebUI.click(findTestObject('Notes_Firm/Kebab/Prior_Year_Kebab'))

WebUI.mouseOver(findTestObject('Notes_Firm/Month_And_Year'))

WebUI.click(findTestObject('Notes_Firm/Long_Format(Month DD, 20XX)'))

WebUI.verifyTextPresent('Column(s) updated successfully', false)

WebUI.click(findTestObject('Notes_Firm/Toast_Container'))

WebUI.mouseOver(findTestObject('Notes_Firm/Table_Header'))

WebUI.click(findTestObject('Notes_Firm/Kebab/Prior_Year_Kebab'))

WebUI.click(findTestObject('Notes_Firm/Format/Format_Column'))

WebUI.click(findTestObject('Notes_Firm/Format/Bold_Format'))

WebUI.click(findTestObject('Notes_Firm/Format/Italic_Format'))

WebUI.click(findTestObject('Notes_Firm/Format/Apply_Format'))

WebUI.verifyTextPresent('Column(s) updated successfully', false)

WebUI.click(findTestObject('Notes_Firm/Toast_Container'))

WebUI.click(findTestObject('Notes_Firm/Save_Table'))

WebUI.click(findTestObject('Notes_Firm/Toast_Container'))

WebUI.click(findTestObject('Notes_Firm/Table_Header'))

WebUI.mouseOver(findTestObject('Notes_Firm/Table_Header'))

WebUI.click(findTestObject('Notes_Firm/Kebab/Total_Column_Kebab'))

WebUI.click(findTestObject('Notes_Firm/Kebab/Kebab_Rename'))

WebUI.verifyTextPresent('Rename Column Name', false)

WebUI.clearText(findTestObject('Notes_Firm/Rename/Rename_on_popup'))

WebUI.setText(findTestObject('Notes_Firm/Rename/Rename_on_popup'), 'Total Assets')

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

WebUI.click(findTestObject('Notes_Firm/Kebab/Total_Column_Kebab'))

WebUI.click(findTestObject('Notes_Firm/Format/Format_Column'))

WebUI.click(findTestObject('Notes_Firm/Format/Bold_Format'))

WebUI.click(findTestObject('Notes_Firm/Format/Italic_Format'))

WebUI.click(findTestObject('Notes_Firm/Format/Apply_Format'))

WebUI.verifyTextPresent('Column(s) updated successfully', false)

WebUI.click(findTestObject('Notes_Firm/Toast_Container'))

WebUI.click(findTestObject('Notes_Firm/Save_Table'))

