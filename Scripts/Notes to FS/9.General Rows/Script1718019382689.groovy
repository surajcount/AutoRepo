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

WebUI.setText(findTestObject('Notes_Firm/Note_Name'), 'Row Testing')

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

WebUI.setText(findTestObject('Notes_Firm/Rows/General_Row1_Rename'), 'General row 1 ')

WebUI.click(findTestObject('Notes_Firm/Rows/Add_Row'))

WebUI.mouseOver(findTestObject('Notes_Firm/Rows/General_Row_Expand'))

WebUI.click(findTestObject('Notes_Firm/Rows/2General_Rows_Add'))

WebUI.setText(findTestObject('Notes_Firm/Rows/General_Row2_Rename'), 'General row 2 ')

WebUI.setText(findTestObject('Notes_Firm/Rows/General_Row3_Rename'), 'General row 3 ')

WebUI.click(findTestObject('Notes_Firm/Save_Table'))

WebUI.click(findTestObject('Notes_Firm/Toast_Container'))

WebUI.click(findTestObject('Notes_Firm/Table_Header'))

WebUI.mouseOver(findTestObject('Notes_Firm/Rows/1st General row'))

WebUI.click(findTestObject('Notes_Firm/Rows/General_Row1_Kebab'))

WebUI.click(findTestObject('Notes_Firm/Format/Row_Format'))

WebUI.click(findTestObject('Notes_Firm/Format/Italic_Format'))

WebUI.click(findTestObject('Notes_Firm/Format/Bold_Format'))

WebUI.click(findTestObject('Notes_Firm/Format/Underline_Format'))

WebUI.click(findTestObject('Notes_Firm/Format/Apply_Format'))

WebUI.verifyTextPresent('Row(s) updated successfully', false)

WebUI.click(findTestObject('Notes_Firm/Toast_Container'))

WebUI.click(findTestObject('Notes_Firm/Save_Table'))

WebUI.click(findTestObject('Notes_Firm/Table_Header'))

WebUI.mouseOver(findTestObject('Notes_Firm/Rows/2nd General row'))

WebUI.click(findTestObject('Notes_Firm/Rows/General_Row2_Kebab'))

WebUI.click(findTestObject('Notes_Firm/Rows/Delete_Subheader'))

WebUI.click(findTestObject('Notes_Firm/Delete_on_popup'))

WebUI.click(findTestObject('Notes_Firm/Rows/Add_Row'))

WebUI.mouseOver(findTestObject('Notes_Firm/Rows/General_Row_Expand'))

WebUI.click(findTestObject('Notes_Firm/Rows/3General_Rows_Add'))

WebUI.click(findTestObject('Notes_Firm/Rows/Add_Row'))

WebUI.click(findTestObject('Notes_Firm/Rows/Subheader_row'))

WebUI.click(findTestObject('Notes_Firm/Rows/Add_Row'))

WebUI.click(findTestObject('Notes_Firm/Rows/Subheader_row'))

WebUI.click(findTestObject('Notes_Firm/Rows/Add_Row'))

WebUI.click(findTestObject('Notes_Firm/Rows/Subheader_row'))

//WebUI.click(findTestObject('Notes_Firm/Rows/Add_Row'))
//
//WebUI.takeScreenshotAsCheckpoint('Subheader Is disabled')
//
//WebUI.click(findTestObject('Notes_Firm/Table_Header'))
WebUI.mouseOver(findTestObject('Notes_Firm/Rows/Subheader1'))

WebUI.click(findTestObject('Notes_Firm/Rows/Subheader1_column1_Kebab'))

WebUI.click(findTestObject('Notes_Firm/Kebab/Kebab_Rename'))

WebUI.verifyTextPresent('Rename Subheader', false)

WebUI.setText(findTestObject('Notes_Firm/Rename/Rename_on_popup'), 'Assets')

WebUI.verifyTextPresent('Note: Press Shift+Enter to transition text to a new line or utilize the final arrow icon to create a breakpoint within text.', 
    false)

WebUI.click(findTestObject('Notes_Firm/Format/Apply_on_popup'))

WebUI.verifyTextPresent('Subheader(s) updated successfully', false)

WebUI.mouseOver(findTestObject('Notes_Firm/Rows/Subheader1'))

WebUI.click(findTestObject('Notes_Firm/Rows/Subheader1_column2_Kebab'))

WebUI.click(findTestObject('Notes_Firm/Kebab/Kebab_Rename'))

WebUI.verifyTextPresent('Rename Subheader', false)

WebUI.setText(findTestObject('Notes_Firm/Rename/Rename_on_popup'), 'Revenue')

WebUI.verifyTextPresent('Note: Press Shift+Enter to transition text to a new line or utilize the final arrow icon to create a breakpoint within text.', 
    false)

WebUI.click(findTestObject('Notes_Firm/Format/Apply_on_popup'))

WebUI.verifyTextPresent('Subheader(s) updated successfully', false)

WebUI.mouseOver(findTestObject('Notes_Firm/Rows/Subheader1'))

WebUI.click(findTestObject('Notes_Firm/Rows/Subheader1_column3_Kebab'))

WebUI.click(findTestObject('Notes_Firm/Kebab/Kebab_Rename'))

WebUI.verifyTextPresent('Rename Subheader', false)

WebUI.setText(findTestObject('Notes_Firm/Rename/Rename_on_popup'), 'Cost')

WebUI.verifyTextPresent('Note: Press Shift+Enter to transition text to a new line or utilize the final arrow icon to create a breakpoint within text.', 
    false)

WebUI.click(findTestObject('Notes_Firm/Format/Apply_on_popup'))

WebUI.verifyTextPresent('Subheader(s) updated successfully', false)

WebUI.mouseOver(findTestObject('Notes_Firm/Rows/Subheader2'))

WebUI.click(findTestObject('Notes_Firm/Rows/Subheader2_column1_Kebab'))

WebUI.click(findTestObject('Notes_Firm/Kebab/Kebab_Rename'))

WebUI.verifyTextPresent('Rename Subheader', false)

WebUI.setText(findTestObject('Notes_Firm/Rename/Rename_on_popup'), '$CAN')

WebUI.verifyTextPresent('Note: Press Shift+Enter to transition text to a new line or utilize the final arrow icon to create a breakpoint within text.', 
    false)

WebUI.click(findTestObject('Notes_Firm/Format/Apply_on_popup'))

WebUI.verifyTextPresent('Subheader(s) updated successfully', false)

WebUI.mouseOver(findTestObject('Notes_Firm/Rows/Subheader2'))

WebUI.click(findTestObject('Notes_Firm/Rows/Subheader2_column2_Kebab'))

WebUI.click(findTestObject('Notes_Firm/Kebab/Kebab_Rename'))

WebUI.verifyTextPresent('Rename Subheader', false)

WebUI.setText(findTestObject('Notes_Firm/Rename/Rename_on_popup'), '$CAN')

WebUI.verifyTextPresent('Note: Press Shift+Enter to transition text to a new line or utilize the final arrow icon to create a breakpoint within text.', 
    false)

WebUI.click(findTestObject('Notes_Firm/Format/Apply_on_popup'))

WebUI.verifyTextPresent('Subheader(s) updated successfully', false)

WebUI.mouseOver(findTestObject('Notes_Firm/Rows/Subheader2'))

WebUI.click(findTestObject('Notes_Firm/Rows/Subheader2_column3_Kebab'))

WebUI.click(findTestObject('Notes_Firm/Kebab/Kebab_Rename'))

WebUI.verifyTextPresent('Rename Subheader', false)

WebUI.setText(findTestObject('Notes_Firm/Rename/Rename_on_popup'), '$CAN')

WebUI.verifyTextPresent('Note: Press Shift+Enter to transition text to a new line or utilize the final arrow icon to create a breakpoint within text.', 
    false)

WebUI.click(findTestObject('Notes_Firm/Format/Apply_on_popup'))

WebUI.verifyTextPresent('Subheader(s) updated successfully', false)

WebUI.mouseOver(findTestObject('Notes_Firm/Rows/Subheader3'))

WebUI.click(findTestObject('Notes_Firm/Rows/Subheader3_column1_Kebab'))

WebUI.click(findTestObject('Notes_Firm/Rows/Delete_Subheader'))

WebUI.click(findTestObject('Notes_Firm/Cancel_Popup'))

WebUI.mouseOver(findTestObject('Notes_Firm/Rows/Subheader3'))

WebUI.click(findTestObject('Notes_Firm/Rows/Subheader3_column1_Kebab'))

WebUI.click(findTestObject('Notes_Firm/Rows/Delete_Subheader'))

WebUI.click(findTestObject('Notes_Firm/Delete_on_popup'))

WebUI.verifyTextPresent('Subheader(s) deleted successfully', false)

WebUI.delay(2)

WebUI.click(findTestObject('Notes_Firm/Save_Table'))

WebUI.click(findTestObject('Notes_Firm/Toast_Container'))

WebUI.click(findTestObject('Notes_Firm/Table_Header'))

WebUI.mouseOver(findTestObject('Notes_Firm/Total_row'))

WebUI.click(findTestObject('Notes_Firm/Hide_Total'))

WebUI.click(findTestObject('Notes_Firm/Save_Table'))

WebUI.click(findTestObject('Notes_Firm/Toast_Container'))

WebUI.verifyElementNotVisibleInViewport(findTestObject('Notes_Firm/Total_row_check'), 0)

WebUI.click(findTestObject('Notes_Firm/Table_Header'))

WebUI.mouseOver(findTestObject('Notes_Firm/Total_row'))

WebUI.click(findTestObject('Notes_Firm/Hide_Total'))

WebUI.click(findTestObject('Notes_Firm/Save_Table'))

WebUI.click(findTestObject('Notes_Firm/Toast_Container'))

WebUI.verifyElementVisibleInViewport(findTestObject('Notes_Firm/Total_row_check'), 0)

WebUI.click(findTestObject('Notes_Firm/Table_Header'))

WebUI.mouseOver(findTestObject('Notes_Firm/Table_Header'))

WebUI.click(findTestObject('Notes_Firm/Hide_Header'))

WebUI.verifyTextPresent('Header(s) and subheader(s) updated successfully', false)

WebUI.click(findTestObject('Notes_Firm/Toast_Container'))

WebUI.click(findTestObject('Notes_Firm/Save_Table'))

WebUI.verifyTextNotPresent('Current Year', false)

WebUI.click(findTestObject('Notes_Firm/Table_Edit'))

WebUI.mouseOver(findTestObject('Notes_Firm/Table_Header'))

WebUI.click(findTestObject('Notes_Firm/Hide_Header'))

WebUI.verifyTextPresent('Header(s) and subheader(s) updated successfully', false)

WebUI.click(findTestObject('Notes_Firm/Toast_Container'))

WebUI.click(findTestObject('Notes_Firm/Save_Table'))

WebUI.verifyTextPresent('Current Year', false)

