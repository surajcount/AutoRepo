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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
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

WebUI.delay(10)

WebUI.verifyTextPresent('Client Name: Automation Notes', false)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Notes_Inside_Engagement/Notes_to_FS_On_Workbook'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Notes_Inside_Engagement/Add_Notes'))

WebUI.click(findTestObject('Notes_Inside_Engagement/From_Firm_Template'))

WebUI.click(findTestObject('Notes_Inside_Engagement/Test_Select_All'))

WebUI.click(findTestObject('Notes_Inside_Engagement/Add_Notes_On_Drawer'))

WebUI.click(findTestObject('Notes_Inside_Engagement/Open_Preview'))

WebUI.verifyElementPresent(findTestObject('Notes_Inside_Engagement/Notes_on_Preview'), 0)

WebUI.click(findTestObject('Notes_Inside_Engagement/Add_Notes'))

WebUI.click(findTestObject('Notes_Inside_Engagement/From_Master_Library'))

WebUI.click(findTestObject('Notes_Inside_Engagement/Automated_Notes_Folder'))

WebUI.click(findTestObject('Notes_Inside_Engagement/PPE_Inside_Engagement'))

WebUI.click(findTestObject('Notes_Inside_Engagement/General_Folder'))

WebUI.click(findTestObject('Notes_Inside_Engagement/Note1_GeneralFolder'))

WebUI.click(findTestObject('Notes_Inside_Engagement/Note2_GeneralFolder'))

WebUI.click(findTestObject('Notes_Inside_Engagement/Add_Notes_On_Drawer'))

WebUI.delay(3)

WebUI.mouseOver(findTestObject('Notes_Inside_Engagement/1st_Note_WB'))

'Delete individual note from WB'
WebUI.click(findTestObject('Notes_Inside_Engagement/Delete_Individual_Note_WB'))

WebUI.verifyTextPresent('Delete note', false)

WebUI.click(findTestObject('Notes_Inside_Engagement/Delete_on_Popup_WB'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Notes_Inside_Engagement/Select_All_Notes_WB'))

WebUI.click(findTestObject('Notes_Inside_Engagement/Delete_All_Notes'))

WebUI.verifyTextPresent('Delete multiple', false)

WebUI.click(findTestObject('Notes_Inside_Engagement/Delete_on_Popup_WB'))

WebUI.verifyTextPresent('No notes added yet', false)

WebUI.click(findTestObject('Notes_Inside_Engagement/Add_Notes'))

WebUI.click(findTestObject('Notes_Inside_Engagement/From_Firm_Template'))

WebUI.click(findTestObject('Notes_Inside_Engagement/Test_Select_All'))

WebUI.click(findTestObject('Notes_Inside_Engagement/Add_Notes_On_Drawer'))

WebUI.verifyElementPresent(findTestObject('Notes_Inside_Engagement/PPE Note on Preview'), 0)

WebUI.setText(findTestObject('Notes_Inside_Engagement/Search_Note_WB'), 'Property')

WebUI.click(findTestObject('Notes_Inside_Engagement/Searched_Note_WB'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Notes_Inside_Engagement/Table_Header_WB'))

WebUI.mouseOver(findTestObject('Notes_Inside_Engagement/Table_Header_WB'))

WebUI.click(findTestObject('Notes_Firm/Kebab/Current_Year_Kebab'))

WebUI.click(findTestObject('Notes_Firm/Format/Format_Column'))

WebUI.click(findTestObject('Notes_Firm/Format/Bold_Format'))

WebUI.click(findTestObject('Notes_Firm/Format/Italic_Format'))

WebUI.click(findTestObject('Notes_Firm/Format/Apply_Format'))

WebUI.clearText(findTestObject('Notes_Inside_Engagement/Edit_1st_row_PPE'))

WebUI.setText(findTestObject('Notes_Inside_Engagement/Edit_1st_row_PPE'), ' Car Renamed')

WebUI.delay(1)

WebUI.click(findTestObject('Notes_Firm/Rows/Add_Row'))

WebUI.click(findTestObject('Notes_Firm/Rows/Add_Row'))

WebUI.mouseOver(findTestObject('Notes_Firm/Rows/General_Row_Expand'))

WebUI.click(findTestObject('Notes_Firm/Rows/2General_Rows_Add'))

WebUI.setText(findTestObject('Notes_Inside_Engagement/Edit_2nd_Row_PPE'), 'Gen Row')

WebUI.setText(findTestObject('Notes_Inside_Engagement/Cost_2nd_Row'), '500')

WebUI.setText(findTestObject('Notes_Inside_Engagement/Amortization_2nd_Row'), '300')

WebUI.setText(findTestObject('Notes_Inside_Engagement/Edit_3rd_Row_PPE'), 'Asset row')

WebUI.click(findTestObject('Notes_Firm/Rows/Add_Row'))

WebUI.click(findTestObject('Notes_Firm/Rows/Add_Row'))

WebUI.click(findTestObject('Notes_Firm/Rows/Subheader_row'))

WebUI.mouseOver(findTestObject('Notes_Inside_Engagement/Subheader1_WB'))

WebUI.click(findTestObject('Notes_Firm/Rows/Subheader1_column1_Kebab'))

WebUI.click(findTestObject('Notes_Firm/Kebab/Kebab_Rename'))

WebUI.verifyTextPresent('Rename Subheader', false)

WebUI.setText(findTestObject('Notes_Firm/Rename/Rename_on_popup'), '$CAN')

WebUI.click(findTestObject('Notes_Firm/Format/Apply_on_popup'))

WebUI.click(findTestObject('Notes_Firm/Save_Table'))

WebUI.click(findTestObject('Notes_Inside_Engagement/Expanded_PPE'))

WebUI.scrollToElement(findTestObject('Notes_Inside_Engagement/AutoPPE_Preview_Scroll'), 0)

WebUI.click(findTestObject('Notes_Inside_Engagement/Add_Notes'))

WebUI.click(findTestObject('Notes_Inside_Engagement/Create_New_Category'))

WebUI.setText(findTestObject('Notes_Inside_Engagement/Category_Name'), 'Notes Automation Testing')

WebUI.click(findTestObject('Notes_Inside_Engagement/Create_Category_Button'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Notes_Inside_Engagement/Created_Category'), 0)

WebUI.mouseOver(findTestObject('Notes_Inside_Engagement/Created_Category'))

WebUI.click(findTestObject('Notes_Inside_Engagement/Add icon_create_category'))

WebUI.click(findTestObject('Notes_Inside_Engagement/Empty_Note'))

WebUI.setText(findTestObject('Notes_Inside_Engagement/Note_Title'), 'Notes under category')

WebUI.click(findTestObject('Notes_Inside_Engagement/Create_Category_Button'))

WebUI.click(findTestObject('Notes_Inside_Engagement/Empty_Note_Under_Category'))

WebUI.click(findTestObject('Notes_Firm/Add_Type'))

WebUI.click(findTestObject('Notes_Firm/Select_Table'))

WebUI.click(findTestObject('Notes_Firm/Add_Column'))

WebUI.click(findTestObject('Notes_Firm/Current_Year_Column'))

WebUI.click(findTestObject('Notes_Firm/Add_Column'))

WebUI.click(findTestObject('Notes_Firm/Prior_Year_Column'))

WebUI.click(findTestObject('Notes_Firm/Add_Column'))

WebUI.click(findTestObject('Notes_Firm/Total_Column'))

WebUI.click(findTestObject('Notes_Firm/Save_Table'))

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Notes_Inside_Engagement/Created_Category'))

WebUI.click(findTestObject('Notes_Inside_Engagement/Add icon_create_category'))

WebUI.delay(5)

WebUI.click(findTestObject('Notes_Inside_Engagement/From_Firm_Template'))

WebUI.click(findTestObject('Notes_Inside_Engagement/Test_Select_All'))

WebUI.click(findTestObject('Notes_Inside_Engagement/Add_Notes_On_Drawer'))

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Notes_Inside_Engagement/Created_Category'))

WebUI.click(findTestObject('Notes_Inside_Engagement/Add icon_create_category'))

WebUI.click(findTestObject('Notes_Inside_Engagement/From_Master_Library'))

WebUI.click(findTestObject('Notes_Inside_Engagement/Automated_Notes_Folder'))

WebUI.click(findTestObject('Notes_Inside_Engagement/PPE_Inside_Engagement'))

WebUI.click(findTestObject('Notes_Inside_Engagement/General_Folder'))

WebUI.click(findTestObject('Notes_Inside_Engagement/Note1_GeneralFolder'))

WebUI.click(findTestObject('Notes_Inside_Engagement/Note2_GeneralFolder'))

WebUI.click(findTestObject('Notes_Inside_Engagement/Add_Notes_On_Drawer'))

