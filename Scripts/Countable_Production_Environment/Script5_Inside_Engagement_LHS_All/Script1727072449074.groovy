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

'This Script cover basic features of LHS section like document request/Raise an Issue/\r\nAdding Comments. It also covers the ClientOnboardSection content verification etc.\r\nIt Cover\'s reorder of section item, addition/deletion/renaming of document.\r\n'
WebUI.openBrowser('')

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

WebUI.click(findTestObject('Create Engagement_Objects/template_Selection_BTN_Compliation_Engmnt'))

WebUI.click(findTestObject('Create Engagement_Objects/Template_Selection_MSTR_LIB_COMPLIATION'))

WebUI.delay(3)

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

WebUI.waitForElementPresent(findTestObject('Create Engagement_Objects/Done_Button_Create_Engagement'), 5)

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

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Create Engagement_Objects/Review_TEMPLATE_Eng_Creation'), 5)

WebUI.delay(2)

WebUI.click(findTestObject('Create Engagement_Objects/Review_TEMPLATE_Eng_Creation'))

WebUI.delay(2)

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

WebUI.waitForElementPresent(findTestObject('Create Engagement_Objects/Done_Button_Create_Engagement'), 5)

WebUI.click(findTestObject('Create Engagement_Objects/Done_Button_Create_Engagement'))

WebUI.click(findTestObject('Create Engagement_Objects/Final_Create_Engagement_Button'))

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Create Engagement_Objects/Client_Section_Icon'), 40)

WebUI.waitForElementPresent(findTestObject('Create Engagement_Objects/CreateEngagement_BTN_Eng_Sec'), 60)

WebUI.click(findTestObject('Create Engagement_Objects/CreateEngagement_BTN_Eng_Sec'))

WebUI.delay(3)

WebUI.click(findTestObject('Create Engagement_Objects/ClientSelection_Drp_Dwn_Create_Engmnt'))

WebUI.click(findTestObject('Create Engagement_Objects/Select_First_Client_Frm_List'))

WebUI.click(findTestObject('Create Engagement_Objects/Engagement_Type_List_Selection_DRP_DWN'))

WebUI.click(findTestObject('Create Engagement_Objects/Engagement_Type_Selection_Tax_T2_corporation'))

WebUI.click(findTestObject('Create Engagement_Objects/Proceed_BtN_Eng_Creation'))

WebUI.click(findTestObject('Create Engagement_Objects/template_Selection_BTN_Compliation_Engmnt'))

WebUI.delay(3)

WebUI.click(findTestObject('Create Engagement_Objects/Template_Selection_MSTR_LIB_COMPLIATION'))

WebUI.delay(3)

WebUI.click(findTestObject('Create Engagement_Objects/Tax_TEMPLATE_Eng_Creation'))

WebUI.delay(3)

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

WebUI.waitForElementPresent(findTestObject('Create Engagement_Objects/Done_Button_Create_Engagement'), 5)

WebUI.click(findTestObject('Create Engagement_Objects/Done_Button_Create_Engagement'))

WebUI.click(findTestObject('Create Engagement_Objects/Final_Create_Engagement_Button'))

WebUI.waitForElementPresent(findTestObject('Create Engagement_Objects/Dashboard_Button'), 40)

WebUI.click(findTestObject('Create Engagement_Objects/Dashboard_Button'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Create Engagement_Objects/Dashboard_Button'), 40)

WebUI.click(findTestObject('Create Engagement_Objects/Dashboard_Button'))

WebUI.waitForElementPresent(findTestObject('Create Engagement_Objects/SearchBox_Dashboard'), 0)

WebUI.setText(findTestObject('Create Engagement_Objects/SearchBox_Dashboard'), 'COM')

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Create Engagement_Objects/Comp_Engmnt_GoInside'))

WebUI.click(findTestObject('Engagement_Section_LHS/ExpandAllButton'))

WebUI.delay(2)

WebUI.click(findTestObject('Engagement_Section_LHS/CollapseEngagement'))

WebUI.click(findTestObject('Engagement_Section_LHS/ClientOnbrding_Chk_List'))

WebUI.click(findTestObject('Engagement_Section_LHS/ClientAcceptanceandContinuance'))

WebUI.click(findTestObject('Engagement_Section_LHS/CliAceptnceCont_Objective'))

WebUI.delay(2)

WebUI.takeScreenshotAsCheckpoint('ClientAcceptanceContinuanceObjective', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Engagement_Section_LHS/CliAceptnceCont_Objective'))

WebUI.verifyTextPresent('Client acceptance and continuance', false)

WebUI.scrollToElement(findTestObject('Engagement_Section_LHS/scroll_chklist_cliacptcont'), 5)

WebUI.mouseOver(findTestObject('Engagement_Section_LHS/ClientAcceptanceandContinuance'))

WebUI.click(findTestObject('Engagement_Section_LHS/kebabMenu_CA'))

WebUI.click(findTestObject('Engagement_Section_LHS/Reorder_Section'))

WebUI.click(findTestObject('Engagement_Section_LHS/PlanningSec_Reorderabv'))

WebUI.delay(2)

WebUI.click(findTestObject('Engagement_Section_LHS/Reorder_MoveUp_BTN'))

WebUI.delay(2)

WebUI.click(findTestObject('Engagement_Section_LHS/Reorder_MoveUp_BTN'))

WebUI.delay(2)

WebUI.click(findTestObject('Engagement_Section_LHS/Reorder_MoveDown_BTN'))

WebUI.click(findTestObject('Engagement_Section_LHS/Reorder_MoveDown_BTN'))

WebUI.click(findTestObject('Engagement_Section_LHS/Reorder_MoveDown_BTN'))

WebUI.click(findTestObject('Engagement_Section_LHS/ReOrderSave_BTN'))

WebUI.mouseOver(findTestObject('Engagement_Section_LHS/ClientAcceptanceandContinuance'))

WebUI.click(findTestObject('Engagement_Section_LHS/kebabMenu_CA'))

WebUI.click(findTestObject('Engagement_Section_LHS/Reorder_Section'))

WebUI.delay(1)

WebUI.click(findTestObject('Engagement_Section_LHS/ReorderSecContainer'))

WebUI.click(findTestObject('Engagement_Section_LHS/Reorder_Menu_Close_BTN'))

WebUI.mouseOver(findTestObject('Engagement_Section_LHS/ClientAcceptanceandContinuance'))

WebUI.click(findTestObject('Engagement_Section_LHS/kebabMenu_CA'))

WebUI.click(findTestObject('Engagement_Section_LHS/Raise a Request_BTN'))

WebUI.setText(findTestObject('Engagement_Section_LHS/Raise_Req_Doc_Name'), 'TestFile')

WebUI.setText(findTestObject('Engagement_Section_LHS/Raise_Req_Doc_Desc_Notes'), 'TestNotes')

WebUI.click(findTestObject('Engagement_Section_LHS/Raise_Req_OpenCalander'))

WebUI.click(findTestObject('Engagement_Section_LHS/Calander_Next_Mnth_BTN'))

WebUI.click(findTestObject('Engagement_Section_LHS/Calander_Next_Mnth_BTN'))

WebUI.delay(1)

WebUI.click(findTestObject('Engagement_Section_LHS/Select_Date_FRM_Clnd'))

WebUI.click(findTestObject('Engagement_Section_LHS/SendBTN_Raise_Req'))

WebUI.click(findTestObject('Engagement_Section_LHS/SendNow_RaiseReq_BTN'))

WebUI.mouseOver(findTestObject('Engagement_Section_LHS/ClientAcceptanceandContinuance'))

WebUI.click(findTestObject('Engagement_Section_LHS/kebabMenu_CA'))

WebUI.click(findTestObject('Engagement_Section_LHS/Raise_Issue_BTN'))

WebUI.setText(findTestObject('Engagement_Section_LHS/Raise_Issue_Title_Field'), 'Test Issue Title')

WebUI.setText(findTestObject('Engagement_Section_LHS/Description_Raise_Issue'), 'Description Test for Raise Issue')

WebUI.click(findTestObject('Engagement_Section_LHS/Assigne_Issue_to_Drp_Dwn'))

WebUI.click(findTestObject('Engagement_Section_LHS/Assign_Issue_to_All'))

WebUI.click(findTestObject('Engagement_Section_LHS/Raise_Req_OpenCalander'))

WebUI.click(findTestObject('Engagement_Section_LHS/Calander_Next_Mnth_BTN'))

WebUI.click(findTestObject('Engagement_Section_LHS/Calander_Next_Mnth_BTN'))

WebUI.delay(1)

WebUI.click(findTestObject('Engagement_Section_LHS/Select_Date_FRM_Clnd'))

WebUI.click(findTestObject('Engagement_Section_LHS/ApplyDate_BTN_Clndr_Raise_Iss'))

WebUI.click(findTestObject('Engagement_Section_LHS/Submit_BTN_Raise_Issue'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Engagement_Section_LHS/ClientAcceptanceandContinuance'))

WebUI.click(findTestObject('Engagement_Section_LHS/kebabMenu_CA'))

WebUI.click(findTestObject('Engagement_Section_LHS/Add_Comment_Eng_Cli_Acpt_Continuce'))

WebUI.click(findTestObject('Engagement_Section_LHS/Assigne_Issue_to_Drp_Dwn'))

WebUI.delay(1)

WebUI.click(findTestObject('Engagement_Section_LHS/Assign_comment_to_All'))

WebUI.setText(findTestObject('Engagement_Section_LHS/Comment_form_add_cmnt'), 'Test add comment.')

WebUI.click(findTestObject('Engagement_Section_LHS/Submit_BTN_Raise_Issue'))

WebUI.delay(2)

WebUI.click(findTestObject('Engagement_Section_LHS/See_Assign_to_me_Comment'))

WebUI.click(findTestObject('Engagement_Section_LHS/See_Assign_to_All_Comment'))

WebUI.takeScreenshotAsCheckpoint('Comment Verification_Successfull')

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Engagement_Section_LHS/ClientAcceptanceandContinuance'))

WebUI.click(findTestObject('Engagement_Section_LHS/kebabMenu_CA'))

WebUI.click(findTestObject('Engagement_Section_LHS/Add_Document_BTN_Cli_Acptnc_Contuance'))

WebUI.delay(1)

WebUI.uploadFile(findTestObject('Engagement_Section_LHS/Add_Doc_FileUpload_BTN'), 'C:\\Users\\Admin\\Desktop\\Countable_Data_Upload\\CorrectFile.csv')

WebUI.delay(1)

WebUI.click(findTestObject('Engagement_Section_LHS/Add_Button_Document_Upld'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Engagement_Section_LHS/ClientAcceptanceandContinuance_ExpandList'))

WebUI.takeScreenshotAsCheckpoint('VerifyUploadedFile')

WebUI.delay(2)

WebUI.click(findTestObject('Engagement_Section_LHS/DeExpandClientAcceptanceSec'))

WebUI.click(findTestObject('Engagement_Section_LHS/Independence_Section_Engagement'))

WebUI.delay(2)

WebUI.takeScreenshotAsCheckpoint('Independence Checklist')

WebUI.scrollToElement(findTestObject('Engagement_Section_LHS/Object_To_Scroll_Independence_ChkList'), 60)

WebUI.takeScreenshotAsCheckpoint('IndependnceChecklist')

WebUI.click(findTestObject('Engagement_Section_LHS/Knowledge_Of_Client_Business_Sec'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Engagement_Section_LHS/Scroll_Client_Knowledge_CHk_List1'), 10)

WebUI.takeScreenshotAsCheckpoint('ClientKnowledegeChecklist')

WebUI.scrollToElement(findTestObject('Engagement_Section_LHS/Scroll_Client_Knowledge_CHk_List2'), 10)

WebUI.takeScreenshotAsCheckpoint('ClientKnowledegeChecklist')

WebUI.scrollToElement(findTestObject('Engagement_Section_LHS/Scroll_Client_Knowledge_CHk_List3'), 10)

WebUI.takeScreenshotAsCheckpoint('ClientKnowledegeChecklist')

WebUI.scrollToElement(findTestObject('Engagement_Section_LHS/Scroll_Client_Knowledge_CHk_List4'), 10)

WebUI.scrollToElement(findTestObject('Engagement_Section_LHS/Scroll_Client_Knowledge_CHk_List5'), 10)

WebUI.takeScreenshotAsCheckpoint('ClientKnowledegeChecklist')

WebUI.click(findTestObject('Engagement_Section_LHS/ClientAcceptanceandContinuance'))

WebUI.click(findTestObject('Engagement_Section_LHS/CliAceptnceCont_Objective'))

WebUI.click(findTestObject('Engagement_Section_LHS/ExpandClientAcceptanceSec'))

WebUI.delay(3)

WebUI.mouseOver(findTestObject('Engagement_Section_LHS/UploadedFile_Test1Excl'))

WebUI.click(findTestObject('Engagement_Section_LHS/UploadedFile_Kebab_Menu'))

WebUI.delay(2)

WebUI.click(findTestObject('Engagement_Section_LHS/DownloadFile_Uploaded'))

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Engagement_Section_LHS/UploadedFile_Test1Excl'))

WebUI.click(findTestObject('Engagement_Section_LHS/UploadedFile_Kebab_Menu'))

WebUI.delay(2)

WebUI.click(findTestObject('Engagement_Section_LHS/DeleteFile_Button_Uploaded_File'))

WebUI.delay(3)

WebUI.click(findTestObject('Engagement_Section_LHS/DeleteButtonConfirmation'))

WebUI.mouseOver(findTestObject('Engagement_Section_LHS/ClientAcceptanceandContinuance'))

WebUI.click(findTestObject('Engagement_Section_LHS/kebabMenu_CA'))

WebUI.click(findTestObject('Engagement_Section_LHS/Add_Document_BTN_Cli_Acptnc_Contuance'))

WebUI.delay(1)

WebUI.uploadFile(findTestObject('Engagement_Section_LHS/Add_Doc_FileUpload_BTN'), 'C:\\Users\\Admin\\Desktop\\Countable_Data_Upload\\CorrectFile.csv')

WebUI.delay(1)

WebUI.click(findTestObject('Engagement_Section_LHS/Add_Button_Document_Upld'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.mouseOver(findTestObject('Engagement_Section_LHS/UploadedFile_Test1Excl'))

WebUI.click(findTestObject('Engagement_Section_LHS/UploadedFile_Kebab_Menu'))

WebUI.click(findTestObject('Engagement_Section_LHS/Rename_Uploaded_ExcelFile'))

WebUI.delay(4)

WebUI.setText(findTestObject('Engagement_Section_LHS/RenamedFileName'), 'CorrectNew', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Engagement_Section_LHS/RenameYesButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Engagement_Section_LHS/UploadedRenamedFile'))

WebUI.click(findTestObject('Engagement_Section_LHS/RenamedFileKebabMenu'))

WebUI.delay(2)

WebUI.click(findTestObject('Engagement_Section_LHS/DeleteFile_Button_Uploaded_File'))

WebUI.delay(2)

WebUI.click(findTestObject('Engagement_Section_LHS/DeleteButtonConfirmation'))

WebUI.delay(3)

WebUI.closeBrowser()

