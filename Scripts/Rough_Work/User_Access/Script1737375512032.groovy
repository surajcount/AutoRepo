import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import javax.xml.crypto.dsig.keyinfo.KeyValue as KeyValue
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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.builtin.FindWebElementKeyword as FindWebElementKeyword
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

'This Script Covers addition and updating team member info for firm user.\r\nThis script have adding client through file upload flow where validation of \r\nduplicate/existing and incoorect file format has done.\r\nEnsure to have the respective data in corresponding uploaded file.\r\nUpdate the variable used for adding team member.'
WebUI.navigateToUrl(PROD)

WebUI.findWebElement(findTestObject('LoginPage/User_Email'), 0)

WebUI.setText(findTestObject('LoginPage/User_Email'), LoginEmail)

WebUI.findWebElement(findTestObject('LoginPage/User_Password'), 5)

WebUI.setEncryptedText(findTestObject('LoginPage/User_Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('LoginPage/LoginButton'))

WebUI.delay(2)

WebUI.maximizeWindow()

WebUI.click(findTestObject('User_Access/Team_Page'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Add_Team_Dropdown'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Add New Member'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Choose Category_Object1st'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Category_Partner_M'))

WebUI.setText(findTestObject('AddTeam_AllRegression_Dashboard/First Name_Team'), 'Narayan')

WebUI.setText(findTestObject('AddTeam_AllRegression_Dashboard/Last Name_Team'), 'Singh')

WebUI.setText(findTestObject('AddTeam_AllRegression_Dashboard/input_Email_M'), General_TeamMember)

WebUI.setText(findTestObject('AddTeam_AllRegression_Dashboard/Title_Team'), 'Mr')

//WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/AccessType_Dropdwon'))
//WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/span_Admin'))
//WebUI.selectOptionByLabel(findTestObject('AddTeam_AllRegression_Dashboard/AccessType_Dropdwon'), 'Admin', false)
WebUI.delay(3)

//General User
List<Map> expectedPermissions = [[('name') : 'Access to dashboard', ('type') : 'checkbox', ('value') : true], [('name') : 'Edit firm information'
        , ('type') : 'checkbox', ('value') : false], [('name') : 'Access to Billing', ('type') : 'checkbox', ('value') : false]
    , [('name') : 'Ability to export platform data', ('type') : 'checkbox', ('value') : false], [('name') : 'Can add team members'
        , ('type') : 'checkbox', ('value') : false], [('name') : 'Can edit team members', ('type') : 'checkbox', ('value') : false]
    , [('name') : 'Can delete team members', ('type') : 'checkbox', ('value') : false], [('name') : 'Can add clients', ('type') : 'checkbox'
        , ('value') : false], [('name') : 'Can view clients', ('type') : 'dropdown', ('value') : 'All' // Dropdown example
    ], [('name') : 'Can edit clients', ('type') : 'dropdown', ('value') : 'All'], [('name') : 'Can delete clients', ('type') : 'checkbox'
        , ('value') : false], [('name') : 'Can create engagements', ('type') : 'checkbox', ('value') : true], [('name') : 'Can view engagements'
        , ('type') : 'dropdown', ('value') : 'All' // Dropdown example
    ], [('name') : 'Can edit engagements', ('type') : 'dropdown', ('value') : 'All'], [('name') : 'Can delete engagements'
        , ('type') : 'checkbox', ('value') : false], [('name') : 'Can create templates', ('type') : 'checkbox', ('value') : true]
    , [('name') : 'Can view templates', ('type') : 'checkbox', ('value') : true // Dropdown example
    ], [('name') : 'Can edit templates', ('type') : 'dropdown', ('value') : 'Own only'], [('name') : 'Can delete templates'
        , ('type') : 'dropdown', ('value') : 'Own only' // Dropdown example
    ]]

expectedPermissions.each({ def permission ->
        if (permission.type == 'checkbox') {
            TestObject checkbox = findTestObject('User_Access/Access_Checkboxes', [('permissionName') : permission.name])

            boolean isChecked = WebUI.verifyElementChecked(checkbox, 10, FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.comment("Permission: $permission.name - Expected: $permission.value, Actual: $isChecked")
        } else if (permission.type == 'dropdown') {
            TestObject dropdown = findTestObject('User_Access/View_Permissions', [('permissionName') : permission.name])

            String actualValue = WebUI.getText(findTestObject('User_Access/View_Permissions', [('permissionName') : permission.name]))

            WebUI.verifyMatch(actualValue, permission.value, false, FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.comment("Permission: $permission.name - Expected: $permission.value, Actual: $actualValue")
        }
    })

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Add_button_Team'))

try {
    WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/span_Confirm'), FailureHandling.CONTINUE_ON_FAILURE)
}
catch (NoSuchElementException e) {
    System.out.println('Free trial user.')
} 

WebUI.delay(2)

WebUI.verifyTextPresent('Team member record added successfully', false)

WebUI.delay(2)

WebUI.click(findTestObject('User_Access/Invite_Team'))

//JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)
//js.executeScript('window.open()')
WebUI.executeJavaScript('window.open();', [])

WebUI.switchToWindowIndex(1)

WebUI.navigateToUrl('https://yopmail.com/')

WebUI.setText(findTestObject('Object Repository/OnboardingObjects/Page_YOPmail - Disposable Email Address - A_32619f/input_Type the Email name of your choice_login'), 
    General_TeamMember)

WebUI.click(findTestObject('Object Repository/OnboardingObjects/Page_YOPmail - Disposable Email Address - A_32619f/i_'))

WebUI.click(findTestObject('Page_Inbox/a_Verify'))

WebUI.switchToWindowIndex(2)

WebUI.setEncryptedText(findTestObject('Object Repository/OnboardingObjects/Page_UAT (Countable)/New_Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.setEncryptedText(findTestObject('Object Repository/OnboardingObjects/Page_UAT (Countable)/Re-Enter_Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Object Repository/OnboardingObjects/Page_UAT (Countable)/Checkbox_Set_Password'))

WebUI.click(findTestObject('Object Repository/OnboardingObjects/Page_UAT (Countable)/span_Set Password'))

WebUI.click(findTestObject('Test/111224/Page_UAT (Countable)/span_Login Now'))

WebUI.setText(findTestObject('LoginPage/User_Email'), General_TeamMember)

WebUI.setEncryptedText(findTestObject('LoginPage/User_Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('LoginPage/LoginButton'))

WebUI.delay(2)

WebUI.click(findTestObject('OnboardingObjects/Page_UAT (Countable)/Keep_Default_timezone'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('OnboardingObjects/Page_UAT (Countable)/TermsAcceptanceBTN_CLI_Obording'), 60, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OnboardingObjects/Page_UAT (Countable)/TermsAcceptanceBTN_CLI_Obording'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.closeBrowser()

WebUI.openBrowser('')

'This Script Covers addition and updating team member info for firm user.\r\nThis script have adding client through file upload flow where validation of \r\nduplicate/existing and incoorect file format has done.\r\nEnsure to have the respective data in corresponding uploaded file.\r\nUpdate the variable used for adding team member.'
WebUI.navigateToUrl(PROD)

WebUI.findWebElement(findTestObject('LoginPage/User_Email'), 0)

WebUI.setText(findTestObject('LoginPage/User_Email'), LoginEmail)

WebUI.findWebElement(findTestObject('LoginPage/User_Password'), 5)

WebUI.setEncryptedText(findTestObject('LoginPage/User_Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Page_UAT (Countable)/span_Login'))

WebUI.delay(2)

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.click(findTestObject('Stripe/User_Profile'))

WebUI.click(findTestObject('Stripe/Billing'))

WebUI.click(findTestObject('User_Access/User_And_Access'))

WebUI.delay(2)

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Edit_Button_Team_Staff_Sec'))

WebUI.delay(2)

WebUI.click(findTestObject('User_Access/Edit firm information'))

WebUI.delay(2)

WebUI.click(findTestObject('User_Access/Access to Billing'))

WebUI.delay(2)

WebUI.click(findTestObject('User_Access/Save_Team_Details'))

WebUI.click(findTestObject('User_Access/Save_Changes_Popup'))

WebUI.verifyTextPresent('Team member record updated successfully', false)

WebUI.delay(2)

WebUI.click(findTestObject('Stripe/User_Profile'))

WebUI.click(findTestObject('OnboardingObjects/Page_UAT (Countable)/span_Log out'))

WebUI.delay(2)

WebUI.setText(findTestObject('LoginPage/User_Email'), General_TeamMember)

WebUI.setEncryptedText(findTestObject('LoginPage/User_Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('LoginPage/LoginButton'))

WebUI.delay(2)

try {
    WebUI.click(findTestObject('User_Access/Luca_AI_Popup'), FailureHandling.CONTINUE_ON_FAILURE)
}
catch (NoSuchElementException e) {
    System.out.println('NO AI Popup')
} 

WebUI.click(findTestObject('Stripe/User_Profile'))

WebUI.click(findTestObject('Stripe/Billing'))

WebUI.verifyTextPresent('Billing', false)

WebUI.delay(2)

WebUI.click(findTestObject('Stripe/User_Profile'))

WebUI.click(findTestObject('User_Access/My_Account_Menu'))

WebUI.delay(2)

WebUI.click(findTestObject('User_Access/Firm_Info_Edit_Button'))

WebUI.clearText(findTestObject('User_Access/Firm_Name'))

WebUI.setText(findTestObject('User_Access/Firm_Name'), 'Edited by general user')

WebUI.click(findTestObject('User_Access/Update_Firm_info'))

WebUI.verifyTextPresent('Firm information updated successfully', false)

WebUI.delay(2)

WebUI.click(findTestObject('Stripe/User_Profile'))

WebUI.click(findTestObject('OnboardingObjects/Page_UAT (Countable)/span_Log out'))

WebUI.findWebElement(findTestObject('LoginPage/User_Email'), 0)

WebUI.setText(findTestObject('LoginPage/User_Email'), LoginEmail)

WebUI.findWebElement(findTestObject('LoginPage/User_Password'), 5)

WebUI.setEncryptedText(findTestObject('LoginPage/User_Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Page_UAT (Countable)/span_Login'))

WebUI.delay(2)

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.click(findTestObject('Stripe/User_Profile'))

WebUI.click(findTestObject('Stripe/Billing'))

WebUI.click(findTestObject('User_Access/User_And_Access'))

WebUI.delay(2)

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Edit_Button_Team_Staff_Sec'))

WebUI.delay(2)

WebUI.click(findTestObject('User_Access/Can add team members'))

WebUI.delay(2)

String Text = WebUI.getText(findTestObject('User_Access/Grant_Permission_popup'))

WebUI.verifyElementText(findTestObject('User_Access/Grant_Permission_popup'), 'Granting this user access could affect your credit card billing, as they will have the ability to add or remove team members.')

WebUI.click(findTestObject('User_Access/Proceed_Grant_Permission'))

WebUI.delay(2)

WebUI.click(findTestObject('User_Access/Can edit team members'))

WebUI.delay(2)

WebUI.click(findTestObject('User_Access/Can delete team members'))

WebUI.delay(2)

WebUI.click(findTestObject('User_Access/Save_Team_Details'))

WebUI.click(findTestObject('User_Access/Save_Changes_Popup'))

WebUI.verifyTextPresent('Team member record updated successfully', false)

WebUI.delay(2)

WebUI.click(findTestObject('Stripe/User_Profile'))

WebUI.click(findTestObject('OnboardingObjects/Page_UAT (Countable)/span_Log out'))

WebUI.delay(2)

WebUI.setText(findTestObject('LoginPage/User_Email'), General_TeamMember)

WebUI.setEncryptedText(findTestObject('LoginPage/User_Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('LoginPage/LoginButton'))

WebUI.delay(2)

WebUI.click(findTestObject('User_Access/Team_Page'))

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('AddTeam_AllRegression_Dashboard/Add_Team_Dropdown'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Add_Team_Dropdown'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Add New Member'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Choose Category_Object1st'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Category_Partner_M'))

WebUI.setText(findTestObject('AddTeam_AllRegression_Dashboard/First Name_Team'), 'Satinder')

WebUI.setText(findTestObject('AddTeam_AllRegression_Dashboard/Last Name_Team'), 'Singh')

WebUI.setText(findTestObject('AddTeam_AllRegression_Dashboard/input_Email_M'), LimitedUserByGen)

WebUI.setText(findTestObject('AddTeam_AllRegression_Dashboard/Title_Team'), 'Sr. Dev')

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/AccessType_Dropdwon'))

WebUI.click(findTestObject('User_Access/Limited_User'))

WebUI.delay(2)

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Add_button_Team'))

try {
    WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/span_Confirm'), FailureHandling.CONTINUE_ON_FAILURE)
}
catch (NoSuchElementException e) {
    System.out.println('Free trial user.')
} 

WebUI.delay(2)

WebUI.verifyTextPresent('Team member record added successfully', false)

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Edit_Button_Team_Staff_Sec'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Edit_Button_Team_Staff_Sec'))

WebUI.setText(findTestObject('User_Access/Cellphone'), '9857458745')

WebUI.click(findTestObject('User_Access/Save_Team_Details'))

WebUI.verifyTextPresent('Team member record updated successfully', false)

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Delete_Button_AllTeam_Sec'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Delete_Button_AllTeam_Sec'))

WebUI.click(findTestObject('Notes_Firm/Delete_on_popup'))

WebUI.verifyTextPresent('Team member deleted successfully', false)

WebUI.delay(2)

WebUI.click(findTestObject('Stripe/User_Profile'))

WebUI.click(findTestObject('OnboardingObjects/Page_UAT (Countable)/span_Log out'))

WebUI.callTestCase(findTestCase('Rough_Work/User_Access_Client_Settings'), [('LoginEmail') : GlobalVariable.EmailLogin_PROD
        , ('IncorrectFormat') : GlobalVariable.Client_Upload_Onboarding, ('CorrectDataFile') : GlobalVariable.CorrectTeam
        , ('General_TeamMember') : 'genteam20@yopmail.com', ('ExistingTeam') : GlobalVariable.ExistingTeam, ('UAT') : GlobalVariable.UAT
        , ('PROD') : GlobalVariable.PROD, ('LimitedUserByGen') : 'limitedbygen@yopmail.com', ('Entity_Name') : 'AddedBy General'
        , ('NewClientEmail') : 'genadd01@yopmail.com'], FailureHandling.CONTINUE_ON_FAILURE)

