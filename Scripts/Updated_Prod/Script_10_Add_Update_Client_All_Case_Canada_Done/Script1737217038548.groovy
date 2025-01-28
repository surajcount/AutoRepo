import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as Keys
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

'This Script Covers addition and updating client info for firm user.\r\nThis script have adding client through file upload flow where validation of \r\nduplicate/existing and incoorect file format has done.\r\nEnsure to have the respective data in corresponding uploaded file.\r\nCheck the variable used for adding lient as well.'
WebUI.openBrowser('')

WebUI.navigateToUrl(PROD)

WebUI.findWebElement(findTestObject('Page_UAT (Countable)/EmailElement'), 10)

WebUI.setText(findTestObject('Page_UAT (Countable)/EmailElement'), LoginEmail)

WebUI.findWebElement(findTestObject('Page_UAT (Countable)/Password'), 10)

WebUI.setEncryptedText(findTestObject('Page_UAT (Countable)/Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Page_UAT (Countable)/span_Login'))

WebUI.delay(3)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Client_All_RegressionCase/Dashboard_Client_Option'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('Client Section UI_Ref')

WebUI.click(findTestObject('Client_All_RegressionCase/AddClient_Button'))

WebUI.delay(3)

WebUI.click(findTestObject('Client_All_RegressionCase/AddNewClient_Manually'))

WebUI.setText(findTestObject('Client_All_RegressionCase/AddNewClient_EntityName'), Entity_Name)

WebUI.click(findTestObject('Client_All_RegressionCase/AddNewClient_EntityType_DropDwn'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Client_All_RegressionCase/AddClient_Entity_Selection_Corp'))

WebUI.setText(findTestObject('Client_All_RegressionCase/AddNewClient_IncopDate'), '05/22/2024')

WebUI.setText(findTestObject('Client_All_RegressionCase/AddNewClient_FirstName'), 'HinaInfotech')

WebUI.setText(findTestObject('Client_All_RegressionCase/AddNewClient_LastName'), 'India')

WebUI.setText(findTestObject('Client_All_RegressionCase/AddNewClient_Email'), NewClientEmail)

WebUI.setText(findTestObject('Client_All_RegressionCase/AddNewClient_Address'), 'Taber')

WebUI.setText(findTestObject('Client_All_RegressionCase/AddNewClient_City'), 'Taber')

WebUI.setText(findTestObject('Client_All_RegressionCase/AddNewClient_Province_State'), 'BC')

WebUI.setText(findTestObject('Client_All_RegressionCase/AddNewClient_Country'), 'Canada')

WebUI.setText(findTestObject('Client_All_RegressionCase/AddNewClient_PinCode'), 'Y1A 9Z9')

WebUI.click(findTestObject('Client_All_RegressionCase/AddNewClient_Eng_Partnr_Dropdwn'))

WebUI.click(findTestObject('Client_All_RegressionCase/AddNewClient_EngParner_Selection'))

WebUI.click(findTestObject('Client_All_RegressionCase/AddNewClient_FinalAdd_Button'))

WebUI.click(findTestObject('Notes_Firm/Toast_Container'))

WebUI.delay(2)

WebUI.click(findTestObject('Client_All_RegressionCase/AddClient_Button'))

WebUI.delay(2)

WebUI.click(findTestObject('Client_All_RegressionCase/UploadCSV_Client/UploadExistingMember_Optn'))

WebUI.delay(5)

WebUI.click(findTestObject('Client_All_RegressionCase/Download_Client_Template'))

WebUI.delay(2)

WebUI.click(findTestObject('Client_All_RegressionCase/How_to_create_template'))

WebUI.click(findTestObject('OnboardingObjects/Page_UAT (Countable)/Downld_PDF_Guide_Ad_Team'))

WebUI.delay(2)

WebUI.switchToWindowIndex(1)

WebUI.delay(2)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

'Wrong column file'
WebUI.uploadFile(findTestObject('Client_All_RegressionCase/UploadCSV_Client/CsvUpld_Client_ClickUpload'), IncorrectClientFormat)

WebUI.click(findTestObject('Notes_Firm/Toast_Container'))

WebUI.delay(2)

'Existing client file'
WebUI.uploadFile(findTestObject('Client_All_RegressionCase/UploadCSV_Client/CsvUpld_Client_ClickUpload'), AlreadyExistsClients)

WebUI.delay(2)

WebUI.click(findTestObject('Client_All_RegressionCase/UploadCSV_Client/Cancel_Import_Button'))

'Duplicate client data'
WebUI.uploadFile(findTestObject('Client_All_RegressionCase/UploadCSV_Client/CsvUpld_Client_ClickUpload'), DuplicateClient)

WebUI.delay(5)

WebUI.click(findTestObject('Client_All_RegressionCase/UploadCSV_Client/Cancel_Import_Button'))

'Correct client data'
WebUI.uploadFile(findTestObject('Client_All_RegressionCase/UploadCSV_Client/CsvUpld_Client_ClickUpload'), Correct_Client_Format)

WebUI.delay(1)

WebUI.click(findTestObject('Client_All_RegressionCase/UploadCSV_Client/Save_Upload_Final'))

WebUI.delay(1)

String totClient = WebUI.getText(findTestObject('Client_Section_Object/Total_Clients'))

try {
    String numericPart = totClient.replaceAll('[^0-9]', '')

    int integerpart = Integer.parseInt(numericPart)

    int TotalClients = integerpart / 100

    System.out.print('Total no of client : ' + TotalClients)
}
catch (NumberFormatException e) {
    println('Invalid number format: ' + e.message)

    WebUI.delay(5)
} 

WebUI.click(findTestObject('Client_Section_Object/Tab_All Clients'))

WebUI.delay(3)

WebUI.click(findTestObject('Client_Section_Object/Tab_My_Clients'))

WebUI.delay(2)

WebUI.click(findTestObject('Client_Section_Object/SentInvite_MyClient_1st'))

WebUI.verifyTextPresent('Client invited successfully', false)

WebUI.setText(findTestObject('Client_Section_Object/SearchBox_Client'), ClientSearch)

WebUI.delay(3)

WebUI.clearText(findTestObject('Client_Section_Object/SearchBox_Client'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('Client_Section_Object/Unassigned_Tab'))

WebUI.delay(2)

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/First_Checkbox'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Second_Checkbox'))

WebUI.click(findTestObject('Client_Section_Object/InviteAllBtn_MyClient'))

WebUI.click(findTestObject('Client_Section_Object/Ok_Btn_Post_InviteAll_oprtion'))

WebUI.delay(3)

WebUI.click(findTestObject('Client_Section_Object/Tab_All Clients'))

WebUI.delay(3)

WebUI.setText(findTestObject('Client_Section_Object/SearchBox_Client'), ClientSearch)

WebUI.click(findTestObject('Client_Section_Object/EditClientInfo_All_Client'))

WebUI.setText(findTestObject('Client_Section_Object/EditLastName_AllClient_Edit'), 'Agnihotry')

WebUI.click(findTestObject('Client_Section_Object/Eng_PartnerSelection_EditClient'))

WebUI.click(findTestObject('Client_Section_Object/Save_Button_Edit_Client'))

WebUI.delay(3)

WebUI.click(findTestObject('Client_Section_Object/Tab_My_Clients'))

WebUI.click(findTestObject('Client_Section_Object/Assign_Team_Manager_Drp_Down_Img'))

WebUI.delay(2)

WebUI.click(findTestObject('Client_Section_Object/Select_Assign_Team_Manager'))

WebUI.click(findTestObject('Client_Section_Object/Assign_Team_Manager_Drp_Down_Img'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Client_Section_Object/Select_Assign_Team_Manager'))

WebUI.delay(2)

WebUI.click(findTestObject('Client_Section_Object/Assign_Unassign_Team_Manager_Drp_Down_Img - Copy'))

WebUI.click(findTestObject('Client_Section_Object/Unassign_Team_Manger'))

WebUI.delay(2)

WebUI.click(findTestObject('Client_Section_Object/Assign_Team_Manager_Drp_Down_Img'))

WebUI.click(findTestObject('Client_Section_Object/Select_Assign_Team_Manager'))

WebUI.delay(2)

WebUI.click(findTestObject('Client_Section_Object/Assign_Unassign_Team_Manager_Drp_Down_Img - Copy'))

WebUI.click(findTestObject('Client_Section_Object/Reassign_TeamManager'))

WebUI.click(findTestObject('Client_Section_Object/SelectSecondengPartner_EditClient'))

WebUI.delay(3)

WebUI.click(findTestObject('Client_Section_Object/Tab_All Clients'))

WebUI.delay(3)

WebUI.click(findTestObject('Client_Section_Object/SelectAllClientChck_MyClients'))

WebUI.delay(3)

WebUI.click(findTestObject('Client_Section_Object/UnassignTab_Assign_Partner_drp_dwn'))

WebUI.delay(2)

WebUI.click(findTestObject('Client_Section_Object/SearchBox_Assgn_Prtnr_All_Client'))

WebUI.setText(findTestObject('Client_Section_Object/SearchBox_Assgn_Prtnr_All_Client'), 'Canada')

WebUI.click(findTestObject('Client_Section_Object/Select_Asgn_Partner_FrmList_All_Client'))

WebUI.delay(4)

WebUI.click(findTestObject('Client_Section_Object/Tab_My_Clients'))

WebUI.click(findTestObject('Client_Section_Object/SelectCLIonetoUnassign'))

WebUI.click(findTestObject('Client_Section_Object/SelectCLITWOtoUnassign'))

WebUI.click(findTestObject('Client_Section_Object/SelectDropDwn_AsignPartner_AllClient'))

WebUI.click(findTestObject('Client_Section_Object/Unassign_Team_Manger'))

WebUI.verifyTextPresent('Partner unassigned successfully', false)

WebUI.click(findTestObject('Client_Section_Object/Tab_All Clients'))

WebUI.click(findTestObject('Client_Section_Object/DeleteClient_UnassignedTab'))

WebUI.click(findTestObject('Client_Section_Object/Delete_Cnf_BTN'))

WebUI.verifyTextPresent('Client record deleted successfully', false)

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('ClientDelete_Message_Status_Cli_Sec')

WebUI.delay(4)

WebUI.click(findTestObject('Client_Section_Object/Tab_All Clients'))

WebUI.click(findTestObject('Client_Section_Object/Export_Clients'))

WebUI.delay(4)

WebUI.click(findTestObject('Client_All_RegressionCase/Repository_Client1'))

WebUI.click(findTestObject('Client_All_RegressionCase/Add_Folder_Repository'))

WebUI.setText(findTestObject('Client_All_RegressionCase/Repository_Folder_Name'), 'Repo Dec 2024')

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Create_Button'))

WebUI.verifyTextPresent('Folder created successfully', false)

WebUI.click(findTestObject('Notes_Firm/Toast_Container'))

WebUI.click(findTestObject('Client_All_RegressionCase/Expand_Folder_Repository'))

WebUI.uploadFile(findTestObject('Client_All_RegressionCase/UploadCSV_Client/CsvUpld_Client_ClickUpload'), 'C:\\Users\\Admin\\Desktop\\Upload_Functions_Test\\pdfdocrepo.pdf')

WebUI.verifyTextPresent('Files uploaded successfully', false)

WebUI.click(findTestObject('Notes_Firm/Toast_Container'))

WebUI.delay(5)

WebUI.click(findTestObject('Client_All_RegressionCase/Expand_Folder_Repository'))

WebUI.mouseOver(findTestObject('Client_All_RegressionCase/Docs_Repository'))

WebUI.click(findTestObject('Client_All_RegressionCase/Kebab_1st_Document'))

WebUI.click(findTestObject('Client_All_RegressionCase/Download_Doc_From_Repo'))

WebUI.click(findTestObject('Notes_Firm/Kebab/Kebab_Rename'))

WebUI.setText(findTestObject('Client_All_RegressionCase/Rename_DocName'), 'renamedpdf')

WebUI.click(findTestObject('Notes_Firm/Rename_Tick'))

WebUI.verifyTextPresent('File renamed successfully', false)

WebUI.click(findTestObject('Client_All_RegressionCase/Expand_Folder_Repository'))

WebUI.click(findTestObject('Client_All_RegressionCase/Open_Doc_Repo'))

WebUI.delay(5)

WebUI.switchToWindowIndex(1)

WebUI.delay(3)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Client_Section_Object/Connect_Button_Client1'))

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Client_Section_Object/Xero_Connect'))

WebUI.setText(findTestObject('Client_Section_Object/Xero_Email'), 'pravinpatil@zoof.co.in')

WebUI.setEncryptedText(findTestObject('Client_Section_Object/Xero_Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Client_Section_Object/Xero_Login_button'))

WebUI.delay(20)

WebUI.switchToWindowIndex(0)

