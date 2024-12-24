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

WebUI.navigateToUrl(GlobalVariable.UAT)

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

WebUI.delay(3)

WebUI.click(findTestObject('Client_Section_Object/Unassigned_Tab'))

WebUI.delay(2)

//TestObject tableObject = findTestObject('Client_All_RegressionCase/No._of_rows_Unassigned')

List<WebElement> tableRows = WebUI.findWebElements('Client_All_RegressionCase/No._of_rows_Unassigned', 30)

System.out.print('No of rows' + tableRows.size())

//WebUI.click(findTestObject('Client_All_RegressionCase/No._of_rows_Unassigned'))

WebUI.click(findTestObject('Client_Section_Object/SelectAllClientChck_MyClients'))

WebUI.click(findTestObject('Client_Section_Object/InviteAllBtn_MyClient'))

WebUI.delay(2)

WebUI.click(findTestObject('Client_Section_Object/Ok_Btn_Post_InviteAll_oprtion'))

WebUI.delay(2)

WebUI.click(findTestObject('Client_Section_Object/Unassigned_Tab'))

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

WebUI.click(findTestObject('Client_Section_Object/Unassigned_Tab'))

WebUI.click(findTestObject('Client_Section_Object/SelectAllClientChck_MyClients'))

WebUI.delay(3)

WebUI.click(findTestObject('Client_Section_Object/UnassignTab_Assign_Partner_drp_dwn'))

WebUI.delay(2)

WebUI.click(findTestObject('Client_Section_Object/SearchBox_Assgn_Prtnr_All_Client'))

WebUI.setText(findTestObject('Client_Section_Object/SearchBox_Assgn_Prtnr_All_Client'), 'pravin')

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

WebUI.verifyTextPresent('Partner unassigned successfully', false)

WebUI.click(findTestObject('Client_Section_Object/Unassigned_Tab'))

WebUI.click(findTestObject('Client_Section_Object/DeleteClient_UnassignedTab'))

WebUI.click(findTestObject('Client_Section_Object/Delete_Cnf_BTN'))

WebUI.verifyTextPresent('Client record deleted successfully', false)

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('ClientDelete_Message_Status_Cli_Sec')

WebUI.click(findTestObject('Client_Section_Object/Tab_All Clients'))

WebUI.click(findTestObject('Client_Section_Object/Export_Clients'))

WebUI.delay(4)

WebUI.click(findTestObject('Client_Section_Object/Connect_Button_Client1'))

WebUI.delay(5)

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Client_Section_Object/Xero_Connect'))

WebUI.setText(findTestObject('Client_Section_Object/Xero_Email'), 'pravinpatil@zoof.co.in')

WebUI.setEncryptedText(findTestObject('Client_Section_Object/Xero_Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Client_Section_Object/Xero_Login_button'))

WebUI.delay(10)

WebUI.switchToWindowIndex(0)

WebUI.closeBrowser()

