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

'This is Script is designed to Create Compolation/Review and Tax Engagement.\r\nPlease note as we are creating around 9 Engagement of all types in this script so,\r\nUser mush have Acelarate plan Purchased prior running this script completely. '
WebUI.navigateToUrl(UAT)

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

WebUI.click(findTestObject('Create Engagement_Objects/template_Selection_BTN_Compliation_Engmnt'))

WebUI.click(findTestObject('Create Engagement_Objects/Template_Selection_MSTR_LIB_COMPLIATION'))

WebUI.delay(2)

WebUI.click(findTestObject('Create Engagement_Objects/Compilation_TEMPLATE_Eng_Creation'))

WebUI.click(findTestObject('Create Engagement_Objects/CompTemplate_SRS_4200'))

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

WebUI.delay(20)

WebUI.click(findTestObject('Create Engagement_Objects/CreateEngagement_BTN_Eng_Sec'))

WebUI.delay(3)

WebUI.click(findTestObject('Create Engagement_Objects/ClientSelection_Drp_Dwn_Create_Engmnt'))

WebUI.click(findTestObject('Create Engagement_Objects/Select_First_Client_Frm_List'))

WebUI.click(findTestObject('Create Engagement_Objects/Engagement_Type_List_Selection_DRP_DWN'))

WebUI.click(findTestObject('Create Engagement_Objects/Engagement_Type_Selection_Review'))

WebUI.click(findTestObject('Create Engagement_Objects/Proceed_BtN_Eng_Creation'))

WebUI.click(findTestObject('Create Engagement_Objects/template_Selection_BTN_Compliation_Engmnt'))

WebUI.click(findTestObject('Create Engagement_Objects/Template_Selection_MSTR_LIB_COMPLIATION'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Create Engagement_Objects/Review_TEMPLATE_Eng_Creation'), 5)

WebUI.click(findTestObject('Create Engagement_Objects/Review_TEMPLATE_Eng_Creation'))

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

WebUI.waitForElementPresent(findTestObject('Create Engagement_Objects/Client_Section_Icon'), 40)

WebUI.click(findTestObject('Create Engagement_Objects/CreateEngagement_BTN_Eng_Sec'))

WebUI.delay(3)

WebUI.click(findTestObject('Create Engagement_Objects/ClientSelection_Drp_Dwn_Create_Engmnt'))

WebUI.click(findTestObject('Create Engagement_Objects/Select_First_Client_Frm_List'))

WebUI.click(findTestObject('Create Engagement_Objects/Engagement_Type_List_Selection_DRP_DWN'))

WebUI.click(findTestObject('Create Engagement_Objects/Engagement_Type_Selection_Tax_T2_corporation'))

WebUI.click(findTestObject('Create Engagement_Objects/Proceed_BtN_Eng_Creation'))

WebUI.click(findTestObject('Create Engagement_Objects/template_Selection_BTN_Compliation_Engmnt'))

WebUI.click(findTestObject('Create Engagement_Objects/Template_Selection_MSTR_LIB_COMPLIATION'))

WebUI.click(findTestObject('Create Engagement_Objects/Tax_TEMPLATE_Eng_Creation'))

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

WebUI.delay(5)

WebUI.click(findTestObject('Create Engagement_Objects/Client_Section_Icon'))

WebUI.delay(3)

WebUI.click(findTestObject('Client_Section_Object/Tab_All Clients'))

WebUI.delay(4)

WebUI.click(findTestObject('Create Engagement_Objects/Create_Engagement_From_Clients'))

WebUI.delay(2)

WebUI.click(findTestObject('Create Engagement_Objects/Engagement_Type_List_Selection_DRP_DWN'))

WebUI.click(findTestObject('Create Engagement_Objects/Engagement_Type_Selection_Compilation'))

WebUI.click(findTestObject('Create Engagement_Objects/Proceed_BtN_Eng_Creation'))

WebUI.click(findTestObject('Create Engagement_Objects/template_Selection_BTN_Compliation_Engmnt'))

WebUI.click(findTestObject('Create Engagement_Objects/Template_Selection_MSTR_LIB_COMPLIATION'))

WebUI.delay(2)

WebUI.click(findTestObject('Create Engagement_Objects/Compilation_TEMPLATE_Eng_Creation'))

WebUI.click(findTestObject('Create Engagement_Objects/CompTemplate_SRS_4200'))

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

WebUI.click(findTestObject('Create Engagement_Objects/Client_Section_Icon'))

WebUI.delay(3)

WebUI.click(findTestObject('Client_Section_Object/Tab_All Clients'))

WebUI.delay(3)

WebUI.click(findTestObject('Create Engagement_Objects/Create_Engagement_From_Clients'))

WebUI.click(findTestObject('Create Engagement_Objects/Engagement_Type_List_Selection_DRP_DWN'))

WebUI.click(findTestObject('Create Engagement_Objects/Engagement_Type_Selection_Review'))

WebUI.click(findTestObject('Create Engagement_Objects/Proceed_BtN_Eng_Creation'))

WebUI.click(findTestObject('Create Engagement_Objects/template_Selection_BTN_Compliation_Engmnt'))

WebUI.click(findTestObject('Create Engagement_Objects/Template_Selection_MSTR_LIB_COMPLIATION'))

WebUI.click(findTestObject('Create Engagement_Objects/Review_TEMPLATE_Eng_Creation'))

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

WebUI.waitForElementPresent(findTestObject('Create Engagement_Objects/Client_Section_Icon'), 40)

WebUI.click(findTestObject('Create Engagement_Objects/Client_Section_Icon'))

WebUI.delay(3)

WebUI.click(findTestObject('Client_Section_Object/Tab_All Clients'))

WebUI.delay(3)

WebUI.click(findTestObject('Create Engagement_Objects/Create_Engagement_From_Clients'))

WebUI.click(findTestObject('Create Engagement_Objects/Engagement_Type_List_Selection_DRP_DWN'))

WebUI.click(findTestObject('Create Engagement_Objects/Engagement_Type_Selection_Tax_T2_corporation'))

WebUI.click(findTestObject('Create Engagement_Objects/Proceed_BtN_Eng_Creation'))

WebUI.click(findTestObject('Create Engagement_Objects/template_Selection_BTN_Compliation_Engmnt'))

WebUI.click(findTestObject('Create Engagement_Objects/Template_Selection_MSTR_LIB_COMPLIATION'))

WebUI.click(findTestObject('Create Engagement_Objects/Tax_TEMPLATE_Eng_Creation'))

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

WebUI.click(findTestObject('Create Engagement_Objects/Engagement_Section_Icon'))

WebUI.click(findTestObject('Create Engagement_Objects/CreateEngagement_BTN_Eng_Sec'))

WebUI.delay(3)

WebUI.click(findTestObject('Create Engagement_Objects/ClientSelection_Drp_Dwn_Create_Engmnt'))

WebUI.click(findTestObject('Create Engagement_Objects/Select_First_Client_Frm_List'))

WebUI.click(findTestObject('Create Engagement_Objects/Engagement_Type_List_Selection_DRP_DWN'))

WebUI.click(findTestObject('Create Engagement_Objects/Engagement_Type_Selection_Compilation'))

WebUI.click(findTestObject('Create Engagement_Objects/Proceed_BtN_Eng_Creation'))

WebUI.click(findTestObject('Create Engagement_Objects/template_Selection_BTN_Compliation_Engmnt'))

WebUI.click(findTestObject('Create Engagement_Objects/Firm_Teamplate_Create_Engagement'))

WebUI.delay(2)

WebUI.click(findTestObject('Create Engagement_Objects/Compilation_Firm_Template_Created'))

WebUI.click(findTestObject('Create Engagement_Objects/CompTemplate_SRS_4200'))

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

WebUI.waitForElementPresent(findTestObject('Create Engagement_Objects/Client_Section_Icon'), 55)

WebUI.delay(3)

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

WebUI.delay(2)

WebUI.click(findTestObject('Create Engagement_Objects/Final_Create_Engagement_Button'))

WebUI.delay(8)

WebUI.closeBrowser()

