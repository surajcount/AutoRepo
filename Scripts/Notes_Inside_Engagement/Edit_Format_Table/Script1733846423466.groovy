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

WebUI.click(findTestObject('Create_Engagement_Pravin/Engagement_List'))

WebUI.setText(findTestObject('Create_Engagement_Pravin/Search_Engagement'), 'COM-AUT-Dec312023')

WebUI.click(findTestObject('Create_Engagement_Pravin/First_Engagement'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Create_Engagement_Pravin/TB_Adjusting'))

WebUI.delay(10)

WebUI.click(findTestObject('Notes_Inside_Engagement/Workbook_TB_Page'))

WebUI.switchToWindowIndex(1)

WebUI.delay(5)

WebUI.verifyTextPresent('Client Name: Automation Notes', false)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Notes_Inside_Engagement/Notes_to_FS_On_Workbook'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Notes_Inside_Engagement/Add_Notes'))

WebUI.click(findTestObject('Notes_Inside_Engagement/From_Master_Library'))

WebUI.setText(findTestObject('Notes_Inside_Engagement/Search_Note_Master'), 'Trade')

WebUI.delay(5)

WebUI.click(findTestObject('Notes_Inside_Engagement/Select_Searched_Note'))

WebUI.click(findTestObject('Notes_Inside_Engagement/Add_Notes_On_Drawer'))

WebUI.delay(10)

WebUI.click(findTestObject('Notes_Inside_Engagement/Open_Preview'))

WebUI.verifyElementPresent(findTestObject('Notes_Inside_Engagement/Notes_on_Preview'), 0)

WebUI.setText(findTestObject('Notes_Inside_Engagement/Search_Note_WB'), 'Trade')

WebUI.click(findTestObject('Notes_Inside_Engagement/Searched_Note_WB'))

WebUI.click(findTestObject('Notes_Inside_Engagement/Table_Header_WB'))

WebUI.click(findTestObject('Notes_Inside_Engagement/Search_inside_table'))

WebUI.click(findTestObject('Notes_Inside_Engagement/5th_record'))

WebUI.clearText(findTestObject('Notes_Inside_Engagement/Edit_note_description'))

WebUI.setText(findTestObject('Notes_Inside_Engagement/Edit_note_description'), 'Edited record')

WebUI.setText(findTestObject('Notes_Inside_Engagement/Number_type'), '5000')

WebUI.setText(findTestObject('Notes_Inside_Engagement/Number_type_2'), '10000')

WebUI.click(findTestObject('Notes_Firm/Add_Column'))

WebUI.click(findTestObject('Notes_Firm/Total_Column'))

WebUI.mouseOver(findTestObject('Notes_Inside_Engagement/Table_Header_WB'))

WebUI.click(findTestObject('Notes_Firm/Kebab/Current_Year_Kebab'))

WebUI.mouseOver(findTestObject('Notes_Firm/Month_And_Year'))

WebUI.takeScreenshotAsCheckpoint('Long format disable by default')

WebUI.click(findTestObject('Notes_Firm/Short_Format(MON DD 20XX)'))

WebUI.click(findTestObject('Notes_Inside_Engagement/Apply_to_note'))

WebUI.verifyTextPresent('Column(s) updated successfully', false)

WebUI.click(findTestObject('Notes_Firm/Toast_Container'))

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Notes_Inside_Engagement/Table_Header_WB'))

WebUI.click(findTestObject('Notes_Inside_Engagement/Table_header_format'))

WebUI.click(findTestObject('Notes_Inside_Engagement/Header_format'))

WebUI.click(findTestObject('Notes_Inside_Engagement/Border_bottom'))

WebUI.click(findTestObject('Notes_Inside_Engagement/Apply_format'))

WebUI.verifyTextPresent('Header(s) updated successfully', false)

WebUI.click(findTestObject('Notes_Firm/Save_Table'))

WebUI.scrollToElement(findTestObject('Notes_Firm/Add_Type'), 0)

WebUI.click(findTestObject('Notes_Firm/Add_Type'))

WebUI.click(findTestObject('Notes_Firm/Select_Table'))

WebUI.click(findTestObject('Notes_Firm/Add_Column'))

WebUI.click(findTestObject('Notes_Firm/Current_Year_Column'))

WebUI.click(findTestObject('Notes_Firm/Add_Column'))

WebUI.click(findTestObject('Notes_Firm/Prior_Year_Column'))

WebUI.click(findTestObject('Notes_Firm/Add_Column'))

WebUI.click(findTestObject('Notes_Firm/Total_Column'))

WebUI.click(findTestObject('Notes_Firm/Save_Table'))

