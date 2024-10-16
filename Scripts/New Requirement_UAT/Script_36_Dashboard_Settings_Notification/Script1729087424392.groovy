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

WebUI.waitForElementPresent(findTestObject('Page_UAT (Countable)/EmailElement'), 5)

WebUI.setText(findTestObject('Page_UAT (Countable)/EmailElement'), EmailLogin)

WebUI.setEncryptedText(findTestObject('Page_UAT (Countable)/Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Page_UAT (Countable)/span_Login'))

WebUI.delay(3)

WebUI.click(findTestObject('Dashboard_Settings/Dashboard_Section_BTN'))

WebUI.delay(2)

try {
    WebUI.click(findTestObject('Dashboard_Settings/Upload_Btn_Header_Footer_Signature_From_Dashboard_notification'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Engagement_Section_LHS/Signature_Sec'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Engagement_Section_LHS/Add_Signature_Buttn'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Engagement_Section_LHS/Upload_Signature_Sec'))

    WebUI.delay(2)

    WebUI.uploadFile(findTestObject('Engagement_Section_LHS/Upload_Signature_Btn'), 'C:\\Users\\Admin\\Desktop\\Countable_Data_Upload\\Signature_1.jpg')

    WebUI.delay(1)

    WebUI.setText(findTestObject('Engagement_Section_LHS/Signature_Name'), 'MySignature2')

    WebUI.delay(2)

    WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/SaveButton_Edit_Details'))
}
catch (Exception e) {
    println('No Such notification Found')
} 

WebUI.click(findTestObject('Dashboard_Settings/Dashboard_Section_BTN'))

WebUI.delay(2)

try {
    WebUI.click(findTestObject('Dashboard_Settings/Activate_Flex_Notification_Dashboard'))

    WebUI.delay(3)
}
catch (Exception e) {
    println('No Such notification Found')
} 

WebUI.click(findTestObject('Dashboard_Settings/Dashboard_Section_BTN'))

WebUI.delay(2)

try {
    WebUI.click(findTestObject('Dashboard_Settings/Whats_New_Notification_Close'), FailureHandling.CONTINUE_ON_FAILURE)
}
catch (Exception e) {
    println('No Such notification Found')
} 

WebUI.click(findTestObject('Dashboard_Settings/Dashboard_Section_BTN'))

WebUI.delay(3)

WebUI.click(findTestObject('Dashboard_Settings/View_Team_Memeber_From_Dashboard'))

WebUI.delay(4)

WebUI.click(findTestObject('Dashboard_Settings/View_Clients_From_Dashboard'))

WebUI.delay(3)

WebUI.click(findTestObject('Dashboard_Settings/Dashboard_Section_BTN'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Dashboard_Settings/Verify_TeamMember_Heading'), 10)

WebUI.verifyElementText(findTestObject('Dashboard_Settings/Verify_TeamMember_Heading'), 'Team Members')

WebUI.delay(3)

WebUI.click(findTestObject('Dashboard_Settings/Dashboard_Section_BTN'))

WebUI.delay(3)

WebUI.click(findTestObject('Dashboard_Settings/Notification_Item_Dashboard_Menu'))

WebUI.delay(3)

WebUI.click(findTestObject('Dashboard_Settings/Dashboard_Section_BTN'))

WebUI.click(findTestObject('Object Repository/OnboardingObjects/Page_UAT (Countable)/div_SA'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OnboardingObjects/Page_UAT (Countable)/span_Log out'))

WebUI.closeBrowser()
