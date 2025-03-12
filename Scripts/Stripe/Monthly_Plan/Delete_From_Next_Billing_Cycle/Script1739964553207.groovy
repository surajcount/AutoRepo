import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(UAT)

WebUI.setText(findTestObject('LoginPage/User_Email'), LoginEmail)

WebUI.setEncryptedText(findTestObject('LoginPage/User_Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('LoginPage/LoginButton'))

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.click(findTestObject('Stripe/User_Profile'))

WebUI.click(findTestObject('Stripe/Billing'))

WebUI.delay(3)

String CurrentPlan = WebUI.getText(findTestObject('Stripe/Plan_Name'))

WebUI.comment(('Current plan is ' + CurrentPlan) + ' ')

String ADButton = WebUI.getText(findTestObject('Stripe/Actiate_OR_Deactivate_Button'))

WebUI.comment(('Flex plan button is ' + ADButton) + ' ')

/*
 * String Flex_History
 * 
 * boolean
 * hist=WebUI.findWebElement(findTestObject('Stripe/Flex_History')).displayed
 * if(hist) { Flex_History =
 * WebUI.getText(findTestObject('Stripe/Flex_History'))
 * 
 * }
 */
if (CurrentPlan.contains('Monthly') && ADButton.contains('Deactivate')) {
    WebUI.click(findTestObject('Stripe/Account_Options'))

    WebUI.click(findTestObject('Stripe/Delete_Firm'))

    WebUI.delay(3)

    WebUI.verifyTextPresent('Account Policy', false)

    WebUI.verifyTextPresent('You cannot deactivate Countable Flex or delete/pause your account because there are active engagements with CMS staff.', 
        false)

    WebUI.verifyTextPresent('Remove or reassign CMS staff from active engagements', false)

    WebUI.verifyTextPresent('Complete all active engagements with CMS staff', false)

    WebUI.click(findTestObject('Stripe/Contact_Us'))

    WebUI.delay(3)

    WebUI.verifyTextPresent('Contact Support', false)
} else if (CurrentPlan.contains('Monthly') && ADButton.contains('Activate')) {
    WebUI.click(findTestObject('Stripe/Account_Options'))

    WebUI.click(findTestObject('Stripe/Delete_Firm'))

    WebUI.delay(3)

    WebUI.verifyTextPresent('Deleting your account means losing access to all your engagements, templates, documents and all user accounts', 
        false)

    WebUI.click(findTestObject('Stripe/Delete_Immediately'))

    WebUI.verifyTextPresent('Give Us A Call', false)

    WebUI.click(findTestObject('Stripe/Cross_Delete_Immediately'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Stripe/Delete_End_of_Billing_Cycle'))

    WebUI.click(findTestObject('Stripe/Rating_While_Delete'))

    WebUI.delay(1)

    WebUI.verifyTextPresent('Not a right fit for me.', false)

    WebUI.setText(findTestObject('Stripe/Comment_While_Delete'), 'Good, but need lots of improvements.')

    WebUI.click(findTestObject('Stripe/Delete_Firm'))

    WebUI.verifyTextPresent('Thank you for sharing your', false)

    WebUI.verifyTextPresent('valuable feedback with us!', false)

    WebUI.verifyTextPresent('Keep in mind that you will not be able to reactivate your account or retrieve any of the information you have added after the end of', 
        false)

    WebUI.verifyTextPresent('Create or edit engagements', false)

    WebUI.verifyTextPresent('New team members or clients', false)

    WebUI.verifyTextPresent('Client Integrations', false)

    WebUI.verifyTextPresent('Client Portal', false)

    WebUI.verifyTextPresent('Would you still like to Delete your account at end of billing cycle or Pause your Account instead?', 
        false)

    WebUI.click(findTestObject('Stripe/Delete_End_of_cycle_button_popup'))

    WebUI.verifyTextPresent('Deletion Request Successful', false)

    WebUI.verifyTextPresent('Your account is scheduled to be deleted from the next billing cycle', false)

    WebUI.click(findTestObject('Stripe/Ok_Button'))

    WebUI.delay(1)

    WebUI.verifyTextPresent('Account to be deleted from the next billing cycle', false)
} else if (CurrentPlan.contains('Annual')) {
    WebUI.click(findTestObject('Stripe/Account_Options'))

    WebUI.click(findTestObject('Stripe/Delete_Firm'))

    WebUI.delay(3)

    WebUI.verifyTextPresent('Account Deletion Policy', false)

    WebUI.verifyTextPresent('You are currently on an annual pre-commitment subscription plan', false)

    WebUI.verifyTextPresent('Note: You can only delete your account during the last month of your subscription period', 
        false)

    WebUI.verifyTextPresent('Please try again in the last month in your plan', false)

    WebUI.click(findTestObject('Stripe/Contact_Us'))

    WebUI.delay(3)

    WebUI.verifyTextPresent('Contact Support', false)
}

