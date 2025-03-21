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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

'This Script Covers addition and updating team member info for firm user.\r\nThis script have adding client through file upload flow where validation of \r\nduplicate/existing and incoorect file format has done.\r\nEnsure to have the respective data in corresponding uploaded file.\r\nUpdate the variable used for adding team member.'
WebUI.navigateToUrl(PROD)

WebUI.findWebElement(findTestObject('Page_UAT (Countable)/EmailElement'), 0)

WebUI.setText(findTestObject('Page_UAT (Countable)/EmailElement'), LoginEmail)

WebUI.findWebElement(findTestObject('Page_UAT (Countable)/Password'), 5)

WebUI.setEncryptedText(findTestObject('Page_UAT (Countable)/Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Page_UAT (Countable)/span_Login'))

WebUI.delay(2)

WebUI.maximizeWindow()

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/DashBoard_Team_Icon'))

WebUI.delay(2)

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Staff_Tab'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Edit_Button_Team_Staff_Sec'))

WebUI.delay(2)

// Get the email from the field
String teamEmail = WebUI.getAttribute(findTestObject('User_Access/Team_Email'), 'value')

WebUI.comment('edited team member email is:' + teamEmail)

// Ensure the email is not empty
assert (teamEmail != null) && !(teamEmail.isEmpty()) : 'Team email is empty or null!'

WebUI.click(findTestObject('User_Access/Choose_Category'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Partner_Category'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/SaveButton_Edit_Details'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Confirmation_SaveButton_Edit_Details'))

// Verify success message
WebUI.verifyTextPresent('Team member record updated successfully', false)

WebUI.delay(2)

WebUI.setText(findTestObject('AddTeam_AllRegression_Dashboard/Search_Team'), teamEmail)

WebUI.delay(2)

boolean isNoRecordsFound = WebUI.verifyTextPresent('No records found', false, FailureHandling.OPTIONAL)

if (isNoRecordsFound) {
    KeywordUtil.markFailed('After changing the staff member to partner not showing in team: ' + teamEmail)
} else {
    WebUI.comment('Team member found successfully for email: ' + teamEmail)
}

