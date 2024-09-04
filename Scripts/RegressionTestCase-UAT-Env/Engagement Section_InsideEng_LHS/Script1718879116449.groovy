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

WebUI.navigateToUrl('https://uat.adinovis.com/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_UAT (Countable)/EmailElement'), 'testreg11811@yopmail.com')

WebUI.findWebElement(findTestObject('Page_UAT (Countable)/Password'), 5)

WebUI.setEncryptedText(findTestObject('Page_UAT (Countable)/Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Page_UAT (Countable)/span_Login'))

WebUI.delay(5)

WebUI.takeScreenshotAsCheckpoint('EngagementDashboard_Page')

WebUI.click(findTestObject('Engagement_Section_LHS/SelectEnagement_frm_Dashboard'))

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

WebUI.click(findTestObject('Engagement_Section_LHS/Reorder_MoveUp_BTN'))

WebUI.click(findTestObject('Engagement_Section_LHS/Reorder_MoveUp_BTN'))

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

WebUI.uploadFile(findTestObject('Engagement_Section_LHS/Add_Doc_FileUpload_BTN'), 'C:\\Users\\Admin\\Desktop\\Countable_Data_Upload\\TestData_Excl.xlsx')

WebUI.delay(1)

WebUI.click(findTestObject('Engagement_Section_LHS/Add_Button_Document_Upld'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Engagement_Section_LHS/Add_Document_Menu_Close_BTN'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Engagement_Section_LHS/ClientAcceptanceandContinuance_ExpandList'))

WebUI.mouseOver(findTestObject('Engagement_Section_LHS/Uploaded_File_Client_Accep_Continuance'))

WebUI.click(findTestObject('Engagement_Section_LHS/File_Menu_Client_Acceptance_Continuance'))

WebUI.click(findTestObject('Engagement_Section_LHS/Rename_Uploaded_File_Cli_Acc_Contince'))

WebUI.click(findTestObject('Engagement_Section_LHS/FileRename_Text_Box_Cli_Accptnc_Continuance'))

WebUI.setText(findTestObject('Engagement_Section_LHS/FileRename_Text_Box_Cli_Accptnc_Continuance'), 'EditFilenme')

WebUI.click(findTestObject('Engagement_Section_LHS/FileRename_YesBTN'))

