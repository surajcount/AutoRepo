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

'This Script Covers addition and updating client info for firm user.\r\nThis script have adding client through file upload flow where validation of \r\nduplicate/existing and incoorect file format has done.\r\nEnsure to have the respective data in corresponding uploaded file.\r\nCheck the variable used for adding lient as well.'
WebUI.openBrowser('')

WebUI.navigateToUrl('https://uat.adinovis.com/login')

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

WebUI.setText(findTestObject('Client_All_RegressionCase/AddNewClient_EntityName'), 'ReshamPal')

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

WebUI.verifyElementText(findTestObject('Client_All_RegressionCase/UploadCSV_Client/VerifyTotalCount_AddNewClient'), '4', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Client_All_RegressionCase/AddClient_Button'))

WebUI.click(findTestObject('Client_All_RegressionCase/UploadCSV_Client/UploadExistingMember_Optn'))

WebUI.uploadFile(findTestObject('Client_All_RegressionCase/UploadCSV_Client/CsvUpld_Client_ClickUpload'), 'C:\\Users\\Admin\\Desktop\\UploadClient_Data\\SalesInvoiceTemplate.csv')

WebUI.delay(2)

WebUI.uploadFile(findTestObject('Client_All_RegressionCase/UploadCSV_Client/CsvUpld_Client_ClickUpload'), 'C:\\Users\\Admin\\Desktop\\UploadClient_Data\\DataAlreadyExist.csv')

WebUI.delay(2)

WebUI.click(findTestObject('Client_All_RegressionCase/UploadCSV_Client/Cancel_Import_Button'))

WebUI.uploadFile(findTestObject('Client_All_RegressionCase/UploadCSV_Client/CsvUpld_Client_ClickUpload'), 'C:\\Users\\Admin\\Desktop\\UploadClient_Data\\DuplicateData.csv')

WebUI.delay(5)

WebUI.click(findTestObject('Client_All_RegressionCase/UploadCSV_Client/Cancel_Import_Button'))

WebUI.uploadFile(findTestObject('Client_All_RegressionCase/UploadCSV_Client/CsvUpld_Client_ClickUpload'), 'C:\\Users\\Admin\\Desktop\\UploadClient_Data\\CorrectFile.csv')

WebUI.delay(1)

WebUI.click(findTestObject('Client_All_RegressionCase/UploadCSV_Client/Save_Upload_Final'))

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('Client_All_RegressionCase/UploadCSV_Client/VerifyTC_AddNewCli_Pst_upld'), '6', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Client_Section_Object/Tab_All Clients'))

WebUI.click(findTestObject('Client_Section_Object/Tab_My_Clients'))

WebUI.click(findTestObject('Client_Section_Object/SentInvite_MyClient_1st'))

WebUI.verifyElementText(findTestObject('Client_Section_Object/InviteSent_VerifyStatus_MyClient'), 'Invite Sent', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Client_Section_Object/SearchBox_Client'), 'Res')

WebUI.verifyElementText(findTestObject('Client_Section_Object/VerifySearchText'), 'ReshamPal')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Client_Section_Object/SearchBox_Client'), Keys.chord(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE))

WebUI.click(findTestObject('Client_Section_Object/SelectAllClientChck_MyClients'))

WebUI.delay(2)

WebUI.click(findTestObject('Client_Section_Object/Unassigned_Tab'))

WebUI.delay(2)

WebUI.click(findTestObject('Client_Section_Object/SelectAllClientChck_MyClients'))

WebUI.delay(2)

WebUI.click(findTestObject('Client_Section_Object/InviteAllBtn_MyClient'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Client_Section_Object/VerifyInviteAllSucess_2Invites'), '4 invites sent successfully.', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Client_Section_Object/Ok_Btn_Post_InviteAll_oprtion'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Client_Section_Object/Unassigned_Tab'))

WebUI.delay(3)

WebUI.click(findTestObject('Client_Section_Object/Tab_All Clients'))

WebUI.setText(findTestObject('Client_Section_Object/SearchBox_Client'), 'Res')

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

WebUI.click(findTestObject('Client_Section_Object/Unassigned_Tab'))

WebUI.click(findTestObject('Client_Section_Object/SelectAllClientChck_MyClients'))

WebUI.delay(3)

WebUI.click(findTestObject('Client_Section_Object/UnassignTab_Assign_Partner_drp_dwn'))

WebUI.delay(2)

WebUI.click(findTestObject('Client_Section_Object/SearchBox_Assgn_Prtnr_All_Client'))

WebUI.setText(findTestObject('Client_Section_Object/SearchBox_Assgn_Prtnr_All_Client'), 'reg')

WebUI.click(findTestObject('Client_Section_Object/Select_Asgn_Partner_FrmList_All_Client'))

WebUI.delay(2)

WebUI.click(findTestObject('Client_Section_Object/Tab_All Clients'))

WebUI.click(findTestObject('Client_Section_Object/SelectAllClientChck_MyClients'))

WebUI.click(findTestObject('Client_Section_Object/SelectAllClientChck_MyClients'))

WebUI.delay(4)

WebUI.click(findTestObject('Client_Section_Object/SelectCLIonetoUnassign'))

WebUI.click(findTestObject('Client_Section_Object/SelectCLITWOtoUnassign'))

WebUI.click(findTestObject('Client_Section_Object/SelectDropDwn_AsignPartner_AllClient'))

WebUI.click(findTestObject('Client_Section_Object/Unassign_Team_Manger'))

WebUI.click(findTestObject('Client_Section_Object/Unassigned_Tab'))

WebUI.click(findTestObject('Client_Section_Object/DeleteClient_UnassignedTab'))

WebUI.click(findTestObject('Client_Section_Object/Delete_Cnf_BTN'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('ClientDelete_Message_Status_Cli_Sec')

WebUI.closeBrowser()

