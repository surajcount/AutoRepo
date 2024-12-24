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

WebUI.callTestCase(findTestCase('Login_TC/Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Stripe/Activate_Button'))

WebUI.verifyTextPresent('Free Trial', false)

WebUI.scrollToElement(findTestObject('Stripe/Activate_Button'), 0)

WebUI.click(findTestObject('Stripe/Activate_Button'))

WebUI.verifyTextPresent('FLEXPLAN TERMS', false)

boolean B = WebUI.verifyElementClickable(findTestObject('Stripe/Proceed_Button'))

System.out.print(B)

WebUI.scrollToElement(findTestObject('Stripe/Terms and Condition Checkbox'), 0)

WebUI.click(findTestObject('Stripe/Terms and Condition Checkbox'))

WebUI.verifyElementClickable(findTestObject('Stripe/Proceed_Button'))

WebUI.click(findTestObject('Stripe/Proceed_Button'))

WebUI.verifyTextPresent('Activate Flex Plan Beta', false)

WebUI.click(findTestObject('Stripe/Activate_On_Popup'))

WebUI.verifyTextPresent('Flex plan on your account activated successfully', false)

WebUI.click(findTestObject('Stripe/Flex_History'))

WebUI.click(findTestObject('Stripe/Teams_Menu'))

WebUI.click(findTestObject('Stripe/Add_Team'))

WebUI.click(findTestObject('Stripe/Add_New_Member'))

WebUI.delay(5)

WebUI.click(findTestObject('Stripe/Choose_Category'))

WebUI.click(findTestObject('Stripe/CMS_Team_member'))

WebUI.delay(3)

WebUI.setText(findTestObject('Stripe/Team_Member_Email'), 'mohamade@countable.co')

WebUI.click(findTestObject('Stripe/Access_Type'))

WebUI.click(findTestObject('Stripe/Admin_Access_Type'))

WebUI.click(findTestObject('Stripe/Add_Button'))

WebUI.verifyTextPresent('Team member record added successfully', false)

WebUI.click(findTestObject('Create_Engagement_Pravin/Engagement_List'))

String TE = WebUI.getText(findTestObject('Stripe/Total_Engagements'))

int tot_eng = Integer.parseInt(TE)

System.out.print('Total Engagements= ' + tot_eng)

