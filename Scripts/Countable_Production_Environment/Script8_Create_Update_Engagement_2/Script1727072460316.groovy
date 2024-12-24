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

'This Script is designed to check validate content under engagement, text and checklist etc.\r\nIt have validation related to calculation and error checks.'
WebUI.navigateToUrl('https://platform.countable.co/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_UAT (Countable)/EmailElement'), EmailLogin)

WebUI.setEncryptedText(findTestObject('Page_UAT (Countable)/Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Page_UAT (Countable)/span_Login'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('EngagementDashboard_Page')

WebUI.click(findTestObject('Create Engagement_Objects/Engagement_Section_Icon'))

WebUI.click(findTestObject('Create Engagement_Objects/CreateEngagement_BTN_Eng_Sec'))

WebUI.delay(3)

WebUI.click(findTestObject('Create Engagement_Objects/ClientSelection_Drp_Dwn_Create_Engmnt'))

WebUI.click(findTestObject('Create Engagement_Objects/Select_First_Client_Frm_List'))

WebUI.click(findTestObject('Create Engagement_Objects/Engagement_Type_List_Selection_DRP_DWN'))

WebUI.click(findTestObject('Create Engagement_Objects/Engagement_Type_Selection_Compilation'))

WebUI.click(findTestObject('Create Engagement_Objects/Proceed_BtN_Eng_Creation'))

String fontWeight = WebUI.getCSSValue(findTestObject('Create Engagement_Objects/Cimpilation_Type_AdditinalInfo_Text_Verification'), 
    'font-weight')

String fontSizeBal_Sheet = WebUI.getCSSValue(findTestObject('Create Engagement_Objects/Compilation_TypeTextVerification_BalSheet'), 
    'font-size')

println('BalFontSize:' + fontSizeBal_Sheet)

WebUI.verifyEqual(fontSizeBal_Sheet, '14px')

println('Font Weight: ' + fontWeight)

WebUI.verifyEqual(fontWeight, '600')

String ElementText1 = WebUI.getText(findTestObject('Create Engagement_Objects/Cimpilation_Type_AdditinalInfo_Text_Verification'))

println('ElementText: ' + ElementText1)

WebUI.verifyElementText(findTestObject('Create Engagement_Objects/Cimpilation_Type_AdditinalInfo_Text_Verification'), 'Balance Sheet')

WebUI.verifyElementText(findTestObject('Create Engagement_Objects/Information_CompilationType'), 'Statement of Income (Loss)')

WebUI.verifyElementText(findTestObject('Create Engagement_Objects/Information_CompilationType_1'), 'Statement of Retained Earnings (Deficit)')

WebUI.verifyElementText(findTestObject('Create Engagement_Objects/information_Compilation_Type2'), 'Notes to Financial Information')

WebUI.verifyElementText(findTestObject('Create Engagement_Objects/Information_Compilation_Type_Standard'), 'Statement of Income (Loss)')

WebUI.verifyElementText(findTestObject('Create Engagement_Objects/Information_Compilation_Type_Standard1'), 'Statement of Retained Earnings (Deficit)')

WebUI.click(findTestObject('Create Engagement_Objects/Compilation_Type_Drp_Dwn_Stnd_Advnc'))

WebUI.delay(1)

WebUI.click(findTestObject('Create Engagement_Objects/Comlation_Type_Standard'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('VerifyInformation_Selected_Standard_Type')

WebUI.click(findTestObject('Create Engagement_Objects/Compilation_Type_Drp_Dwn_Stnd_Advnc'))

WebUI.delay(2)

WebUI.click(findTestObject('Create Engagement_Objects/Compilation_Type_Advanced'))

WebUI.click(findTestObject('Create Engagement_Objects/template_Selection_BTN_Compliation_Engmnt'))

WebUI.click(findTestObject('Create Engagement_Objects/Firm_Teamplate_Create_Engagement'))

WebUI.delay(2)

WebUI.click(findTestObject('Create Engagement_Objects/Compilation_Firm_Template_Created'))

WebUI.click(findTestObject('Create Engagement_Objects/CompTemplate_SRS_4200'))

WebUI.delay(4)

WebUI.click(findTestObject('Create Engagement_Objects/Eng_End_Date_Period_Calander'))

WebUI.verifyElementNotClickable(findTestObject('Create Engagement_Objects/IsFuture_Date_Disabled_Com_Engmnt'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Create Engagement_Objects/Eng_Period_Year_End_Date'))

WebUI.click(findTestObject('Create Engagement_Objects/Eng_DATE_End_Year_Apply_Button'))

WebUI.setText(findTestObject('Create Engagement_Objects/Set_Budget_Amount_Engagemnt'), '10000')

WebUI.click(findTestObject('Create Engagement_Objects/Add_Member_To_Engaemnt'))

WebUI.click(findTestObject('Create Engagement_Objects/Team_Meber_Selection_Drop_Down'))

WebUI.click(findTestObject('Create Engagement_Objects/Select_Firm_User_Eng_Team_Member'))

WebUI.setText(findTestObject('Create Engagement_Objects/Set_Engagement_Hourly_Rate'), '100')

WebUI.setText(findTestObject('Create Engagement_Objects/Set_Time_Allocation_Cr_Engagement'), '80')

WebUI.click(findTestObject('Create Engagement_Objects/Done_Button_Create_Engagement'))

WebUI.click(findTestObject('Create Engagement_Objects/Add_Member_To_Engaemnt'))

WebUI.click(findTestObject('Create Engagement_Objects/Add_Team_member_role_drpdwn_list'))

WebUI.delay(1)

WebUI.click(findTestObject('Create Engagement_Objects/Select_Team_Mem_Role_1st_Reviwer'))

WebUI.click(findTestObject('Create Engagement_Objects/Team_Member_Selection_Drp_dwn_2ndRow'))

WebUI.click(findTestObject('Create Engagement_Objects/Select_Firm_User_Eng_Team_Member'))

WebUI.setText(findTestObject('Create Engagement_Objects/Set_Text_Hourly_rate_Second_Row'), '100')

WebUI.setText(findTestObject('Create Engagement_Objects/Set_TimeAllocation_secnd_Row'), '80')

WebUI.click(findTestObject('Create Engagement_Objects/Done_Button_Create_Engagement'))

WebUI.scrollToElement(findTestObject('Create Engagement_Objects/Scroll_to_Allocation_Increased_Elemnt'), 10)

WebUI.verifyElementClickable(findTestObject('Create Engagement_Objects/Create_Engagement_Not_Clickable'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeElementScreenshotAsCheckpoint('Create Engagement Disabled in Case Allocation is more than 100', findTestObject(
        'Create Engagement_Objects/Create_Engagement_Not_Clickable'))

WebUI.takeScreenshotAsCheckpoint('Time allocation Validation ')

WebUI.click(findTestObject('Create Engagement_Objects/Delete_Team_Member_Button'))

WebUI.click(findTestObject('Create Engagement_Objects/Add_Member_To_Engaemnt'))

WebUI.click(findTestObject('Create Engagement_Objects/Add_Team_member_role_drpdwn_list'))

WebUI.delay(1)

WebUI.click(findTestObject('Create Engagement_Objects/Select_Team_Mem_Role_1st_Reviwer'))

WebUI.click(findTestObject('Create Engagement_Objects/Team_Member_Selection_Drp_dwn_2ndRow'))

WebUI.delay(1)

WebUI.click(findTestObject('Create Engagement_Objects/Select_Othr_Team_Membr_Cr_Engagement'))

WebUI.setText(findTestObject('Create Engagement_Objects/Set_Text_Hourly_rate_Second_Row'), '100')

WebUI.setText(findTestObject('Create Engagement_Objects/Set_TimeAllocation_secnd_Row'), '80')

WebUI.click(findTestObject('Create Engagement_Objects/Done_Button_Create_Engagement'))

WebUI.delay(2)

WebUI.click(findTestObject('Create Engagement_Objects/Edit_Button_Team_Member_Eng_Creation'))

WebUI.setText(findTestObject('Create Engagement_Objects/Set_TimeAllocation_secnd_Row'), '20')

WebUI.click(findTestObject('Create Engagement_Objects/Done_Button_Create_Engagement'))

WebUI.click(findTestObject('Create Engagement_Objects/Final_Create_Engagement_Button'))

WebUI.delay(10)

WebUI.click(findTestObject('Create Engagement_Objects/CreateEngagement_BTN_Eng_Sec'))

WebUI.delay(3)

WebUI.click(findTestObject('Create Engagement_Objects/ClientSelection_Drp_Dwn_Create_Engmnt'))

WebUI.click(findTestObject('Create Engagement_Objects/Select_First_Client_Frm_List'))

WebUI.click(findTestObject('Create Engagement_Objects/Engagement_Type_List_Selection_DRP_DWN'))

WebUI.click(findTestObject('Create Engagement_Objects/Engagement_Type_Selection_Review'))

WebUI.click(findTestObject('Create Engagement_Objects/Proceed_BtN_Eng_Creation'))

WebUI.click(findTestObject('Create Engagement_Objects/template_Selection_BTN_Compliation_Engmnt'))

WebUI.click(findTestObject('Create Engagement_Objects/Firm_Teamplate_Create_Engagement'))

WebUI.click(findTestObject('Create Engagement_Objects/Firm_Template_Created_Review_Engagement'))

WebUI.click(findTestObject('Create Engagement_Objects/Review_Template'))

WebUI.delay(4)

WebUI.click(findTestObject('Create Engagement_Objects/Eng_End_Date_Period_Calander'))

WebUI.click(findTestObject('Create Engagement_Objects/Eng_Period_Year_End_Date'))

WebUI.click(findTestObject('Create Engagement_Objects/Eng_DATE_End_Year_Apply_Button'))

WebUI.setText(findTestObject('Create Engagement_Objects/Set_Budget_Amount_Engagemnt'), '10000')

WebUI.click(findTestObject('Create Engagement_Objects/Add_Member_To_Engaemnt'))

WebUI.click(findTestObject('Create Engagement_Objects/Team_Meber_Selection_Drop_Down'))

WebUI.click(findTestObject('Create Engagement_Objects/Select_Firm_User_Eng_Team_Member'))

WebUI.setText(findTestObject('Create Engagement_Objects/Set_Engagement_Hourly_Rate'), '100')

WebUI.setText(findTestObject('Create Engagement_Objects/Set_Time_Allocation_Cr_Engagement'), '80')

WebUI.click(findTestObject('Create Engagement_Objects/Done_Button_Create_Engagement'))

WebUI.click(findTestObject('Create Engagement_Objects/Final_Create_Engagement_Button'))

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Create Engagement_Objects/CreateEngagement_BTN_Eng_Sec'), 40)

WebUI.click(findTestObject('Create Engagement_Objects/CreateEngagement_BTN_Eng_Sec'))

WebUI.delay(3)

WebUI.click(findTestObject('Create Engagement_Objects/ClientSelection_Drp_Dwn_Create_Engmnt'))

WebUI.click(findTestObject('Create Engagement_Objects/Select_First_Client_Frm_List'))

WebUI.click(findTestObject('Create Engagement_Objects/Engagement_Type_List_Selection_DRP_DWN'))

WebUI.click(findTestObject('Create Engagement_Objects/Engagement_Type_Selection_Tax_T2_corporation'))

WebUI.click(findTestObject('Create Engagement_Objects/Proceed_BtN_Eng_Creation'))

WebUI.click(findTestObject('Create Engagement_Objects/template_Selection_BTN_Compliation_Engmnt'))

WebUI.click(findTestObject('Create Engagement_Objects/Firm_Teamplate_Create_Engagement'))

WebUI.click(findTestObject('Create Engagement_Objects/Firm_Template_Created_Tax_Dropdwn'))

WebUI.click(findTestObject('Create Engagement_Objects/tax_Template_t2_corporation'))

WebUI.delay(4)

WebUI.click(findTestObject('Create Engagement_Objects/Eng_End_Date_Period_Calander'))

WebUI.click(findTestObject('Create Engagement_Objects/Eng_Period_Year_End_Date'))

WebUI.click(findTestObject('Create Engagement_Objects/Eng_DATE_End_Year_Apply_Button'))

WebUI.setText(findTestObject('Create Engagement_Objects/Set_Budget_Amount_Engagemnt'), '10000')

WebUI.click(findTestObject('Create Engagement_Objects/Add_Member_To_Engaemnt'))

WebUI.click(findTestObject('Create Engagement_Objects/Team_Meber_Selection_Drop_Down'))

WebUI.click(findTestObject('Create Engagement_Objects/Select_Firm_User_Eng_Team_Member'))

WebUI.setText(findTestObject('Create Engagement_Objects/Set_Engagement_Hourly_Rate'), '100')

WebUI.setText(findTestObject('Create Engagement_Objects/Set_Time_Allocation_Cr_Engagement'), '80')

WebUI.click(findTestObject('Create Engagement_Objects/Done_Button_Create_Engagement'))

WebUI.click(findTestObject('Create Engagement_Objects/Final_Create_Engagement_Button'))

WebUI.delay(6)

WebUI.closeBrowser()

