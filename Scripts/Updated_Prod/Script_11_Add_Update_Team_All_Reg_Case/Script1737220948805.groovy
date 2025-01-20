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

'This Script Covers addition and updating team member info for firm user.\r\nThis script have adding client through file upload flow where validation of \r\nduplicate/existing and incoorect file format has done.\r\nEnsure to have the respective data in corresponding uploaded file.\r\nUpdate the variable used for adding team member.'
WebUI.navigateToUrl(UAT)

WebUI.findWebElement(findTestObject('Page_UAT (Countable)/EmailElement'), 0)

WebUI.setText(findTestObject('Page_UAT (Countable)/EmailElement'), LoginEmail)

WebUI.findWebElement(findTestObject('Page_UAT (Countable)/Password'), 5)

WebUI.setEncryptedText(findTestObject('Page_UAT (Countable)/Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Page_UAT (Countable)/span_Login'))

WebUI.delay(2)

WebUI.maximizeWindow()

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/DashBoard_Team_Icon'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Add_Team_Dropdown'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Add New Member'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Choose Category_Object1st'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Category_Partner_M'))

WebUI.setText(findTestObject('AddTeam_AllRegression_Dashboard/First Name_Team'), 'Narayan')

WebUI.setText(findTestObject('AddTeam_AllRegression_Dashboard/Last Name_Team'), 'Singh')

WebUI.setText(findTestObject('AddTeam_AllRegression_Dashboard/Title_Team'), 'Mr')

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/AccessType_Dropdwon'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/span_Admin'))

WebUI.setText(findTestObject('AddTeam_AllRegression_Dashboard/input_Email_M'), TeamMemberEmail)

try {
    WebUI.check(findTestObject('AddTeam_AllRegression_Dashboard/Access_EditInformation'))
}
catch (Exception e) {
    WebUI.uncheck(findTestObject('AddTeam_AllRegression_Dashboard/Access_EditInformation'))
} 

WebUI.delay(1)

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Add_button_Team'))

//boolean pop = WebUI.verifyElementVisible(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Add_Team_Popup'))
WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/span_Confirm'), FailureHandling.CONTINUE_ON_FAILURE)

//System.out.print('Popup not displayed for free trial users')
WebUI.delay(2)

WebUI.verifyTextPresent('Team member record added successfully', false)

WebUI.delay(2)

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Add_Team_Dropdown'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Upload Existing Member'))

WebUI.uploadFile(findTestObject('AddTeam_AllRegression_Dashboard/Upload_inputdata_file'), IncorrectFormat)

WebUI.delay(3)

WebUI.click(findTestObject('Notes_Firm/Toast_Container'))

WebUI.uploadFile(findTestObject('AddTeam_AllRegression_Dashboard/Upload_inputdata_file'), ExistingTeam)

WebUI.verifyElementText(findTestObject('AddTeam_AllRegression_Dashboard/p_Email already exist. Please re-check the record information'), 
    'Email already exist. Please re-check the record information', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/DataUpload_Cancel_Button'))

WebUI.uploadFile(findTestObject('AddTeam_AllRegression_Dashboard/Upload_inputdata_file'), CorrectDataFile)

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Data_Upload_Btn'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/span_Confirm'))

WebUI.verifyTextPresent('Team uploaded successfully', false)

WebUI.delay(3)

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/DashBoard_Team_Icon'))

WebUI.setText(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Search Button_Team'), 'Narayan')

WebUI.clearText(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Search Button_Team'))

WebUI.setText(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Search Button_Team'), 'mrs')

WebUI.clearText(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Search Button_Team'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Search Button_Team'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/All_Team_Tab'))

WebUI.delay(4)

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Partner_Tab'))

WebUI.delay(3)

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Staff_Tab'))

WebUI.delay(2)

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/All_Team_Tab'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/InviteButton_Single_Allteam'))

WebUI.delay(4)

WebUI.verifyElementText(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Verify Invite_Status'), 'Invite Sent')

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Staff_Tab'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/SelectAllTeam_Staff'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/DropDownArrow_BTN_Asgn_Partner'))

WebUI.setText(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Search_ListAssign_Partner_StaffTab'), 
    'Reha')

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Select_Partner_To_Assign'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Search_ListAssign_Partner_StaffTab'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Search_ListAssign_Partner_StaffTab'), 
    Keys.chord(Keys.ESCAPE))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/SelectAllTeam_Staff'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/DropDownArrow_BTN_Asgn_Partner'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Unassigned_BTN_Staff_Section'))

WebUI.delay(3)

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Search_ListAssign_Partner_StaffTab'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Search_ListAssign_Partner_StaffTab'), 
    Keys.chord(Keys.ESCAPE), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/First_Checkbox'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Second_Checkbox'))

WebUI.delay(3)

//boolean invite = WebUI.verifyElementClickable(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/InviteAll_Staff_Team'))
WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/InviteAll_Staff_Team'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/InviteAll_No_Button'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/InviteAll_Staff_Team'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/InviteAll_Yes_Button'))

WebUI.delay(2)

WebUI.verifyTextPresent('Team members invited successfully', false)

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/All_Team_Tab'))

WebUI.delay(2)

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Staff_Tab'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Edit_Button_Team_Staff_Sec'))

WebUI.setText(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Edit_Detail_LastName'), 'Agni')

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/SaveButton_Edit_Details'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Confirmation_SaveButton_Edit_Details'))

WebUI.delay(4)

WebUI.setText(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Search Button_Team'), 'Narayan')

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Delete_Button_AllTeam_Sec'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Confirmation_DeleteTeam_Mem_BTN_AllClient'))

WebUI.delay(3)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

