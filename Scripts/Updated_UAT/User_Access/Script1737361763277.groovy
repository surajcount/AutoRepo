import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import javax.xml.crypto.dsig.keyinfo.KeyValue

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.builtin.FindWebElementKeyword
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

WebUI.click(findTestObject('User_Access/Team_Page'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Add_Team_Dropdown'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Add New Member'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Choose Category_Object1st'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Category_Partner_M'))

WebUI.setText(findTestObject('AddTeam_AllRegression_Dashboard/First Name_Team'), 'Narayan')

WebUI.setText(findTestObject('AddTeam_AllRegression_Dashboard/Last Name_Team'), 'Singh')

WebUI.setText(findTestObject('AddTeam_AllRegression_Dashboard/input_Email_M'), TeamMemberEmail)

WebUI.setText(findTestObject('AddTeam_AllRegression_Dashboard/Title_Team'), 'Mr')

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/AccessType_Dropdwon'))


WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/span_Admin'))

//WebUI.selectOptionByLabel(findTestObject('AddTeam_AllRegression_Dashboard/AccessType_Dropdwon'), 'Admin', false)
WebUI.delay(1)


//General User
List<Map<String, Object>> expectedPermissions = [
	[name: 'Access to dashboard', type: 'checkbox', value: true],
	[name: 'Edit firm information', type: 'checkbox', value: true],
	[name: 'Access to Billing', type: 'checkbox', value: false],
	[name: 'Ability to export platform data', type: 'checkbox', value: true],
	[name: 'Can add team members', type: 'checkbox', value: false],
	[name: 'Can edit team members', type: 'checkbox', value: false],
	[name: 'Can delete team members', type: 'checkbox', value: false],
	[name: 'Can add clients', type: 'checkbox', value: true],
	[name: 'Can view clients', type: 'dropdown', value: 'All'], // Dropdown example
	[name: 'Can edit clients', type: 'dropdown', value: 'All'],
	[name: 'Can delete clients', type: 'checkbox', value: true],
	[name: 'Can create engagements', type: 'checkbox', value: true],
	[name: 'Can view engagements', type: 'dropdown', value: 'All'], // Dropdown example
	[name: 'Can edit engagements', type: 'dropdown', value: 'All'],
	[name: 'Can delete engagements', type: 'checkbox', value: true],
	[name: 'Can create templates', type: 'checkbox', value: true],
	[name: 'Can view templates', type: 'checkbox', value: true], // Dropdown example
	[name: 'Can edit templates', type: 'dropdown', value: 'All'],
	[name: 'Can delete templates', type: 'dropdown', value: 'All'] // Dropdown example
]
// Iterate through each permission and verify its state

expectedPermissions.each { permission ->
    if (permission.type == 'checkbox') {
        // Handle checkbox verification
        TestObject checkbox = findTestObject('User_Access/Access_Checkboxes', [('permissionName') : permission.name])	
        boolean isChecked = WebUI.verifyElementChecked(checkbox, 5, FailureHandling.CONTINUE_ON_FAILURE)
		
        WebUI.comment("Permission: ${permission.name} - Expected: ${permission.value}, Actual: ${isChecked}")
    } else if (permission.type == 'dropdown') {
        // Handle dropdown verification
        TestObject dropdown = findTestObject('User_Access/View_Permissions', [('permissionName') : permission.name])
        
        // Retrieve displayed value for custom dropdowns
        String actualValue = WebUI.getText(findTestObject('User_Access/View_Permissions', [('permissionName') : permission.name]))
        WebUI.verifyMatch(actualValue, permission.value, false, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.comment("Permission: ${permission.name} - Expected: ${permission.value}, Actual: ${actualValue}")
    }
}


WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Add_button_Team'))

//boolean pop = WebUI.verifyElementVisible(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Add_Team_Popup'))

try {
	WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/span_Confirm'), FailureHandling.CONTINUE_ON_FAILURE)
}
catch(NoSuchElementException e)
{
	System.out.println("Free trial user.");
}
//System.out.print('Popup not displayed for free trial users')
WebUI.delay(2)

WebUI.verifyTextPresent('Team member record added successfully', false)

WebUI.delay(2)

