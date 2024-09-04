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

WebUI.findWebElement(findTestObject('Page_UAT (Countable)/EmailElement'), 0)

WebUI.setText(findTestObject('Page_UAT (Countable)/EmailElement'), LoginEmail)

WebUI.findWebElement(findTestObject('Page_UAT (Countable)/Password'), 5)

WebUI.setEncryptedText(findTestObject('Page_UAT (Countable)/Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Page_UAT (Countable)/span_Login'))

WebUI.delay(2)

WebUI.maximizeWindow()

WebUI.click(findTestObject('StripePayment/Page_UAT (Countable)/AccountMenuButton'))

WebUI.delay(1)

WebUI.click(findTestObject('StripePayment/Page_UAT (Countable)/BillingButton'))

WebUI.delay(2)

WebUI.click(findTestObject('StripePayment/Page_UAT (Countable)/span_Upgrade Plan_button'))

WebUI.click(findTestObject('StripePayment/Page_UAT (Countable)/span_Select Plan_Essential_button'))

WebUI.click(findTestObject('StripePayment/Page_UAT (Countable)/span_Confirm_button'))

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.switchToFrame(findTestObject('StripePayment/iframe_Enter payment details___privateStripeFrame8274'), 5)

WebUI.setText(findTestObject('StripePayment/input_Card number_number'), '4242424242424242')

WebUI.setText(findTestObject('StripePayment/input_MM  YY_expiry'), '02/28')

WebUI.setText(findTestObject('StripePayment/input_CVC_cvc'), '111')

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('StripePayment/span_ConfirmPay_ButtonFinal'))

WebUI.delay(20)

WebUI.verifyElementText(findTestObject('StripePayment/Success_Toaster_Message'), 'Plan Successfully upgraded!', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('StripePayment/Success_Toaster_Message -PlanName'), 'You have successfully upgraded your plan to the Monthly Essentials.', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('StripePayment/spanBillingAlert_CloseButton'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('StripePayment/span_Change Plan'))

WebUI.click(findTestObject('StripePayment/Select Plan_Ignite'))

WebUI.click(findTestObject('StripePayment/Page_UAT (Countable)/span_Confirm_button'))

WebUI.click(findTestObject('StripePayment/span_Confirm and Pay'))

WebUI.delay(20)

WebUI.verifyElementText(findTestObject('StripePayment/Success_Toaster_Message'), 'Plan Successfully upgraded!', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('StripePayment/spanBillingAlert_CloseButton'))

WebUI.click(findTestObject('StripePayment/span_Change Plan'))

WebUI.click(findTestObject('StripePayment/span_Select Plan_Accelerate'))

WebUI.click(findTestObject('StripePayment/Page_UAT (Countable)/span_Confirm_button'))

WebUI.click(findTestObject('StripePayment/span_Confirm and Pay'))

WebUI.delay(20)

WebUI.verifyElementText(findTestObject('StripePayment/Success_Toaster_Message'), 'Plan Successfully upgraded!', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('StripePayment/spanBillingAlert_CloseButton'))

WebUI.click(findTestObject('StripePayment/span_Change Plan'))

WebUI.click(findTestObject('StripePayment/Page_UAT (Countable)/span_Select Plan_Essential_button'))

WebUI.click(findTestObject('StripePayment/Proceed_To_Downgrade'))

WebUI.click(findTestObject('StripePayment/span_Confirm and Pay'))

WebUI.delay(20)

WebUI.verifyElementText(findTestObject('StripePayment/Success_Toaster_Message'), 'Plan Successfully upgraded!', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('StripePayment/spanBillingAlert_CloseButton'))

WebUI.click(findTestObject('StripePayment/span_Activate_CountableFlexPlan'))

WebUI.click(findTestObject('StripePayment/Container_COUNTABLE FLEXPLAN TERMS'))

WebUI.scrollToElement(findTestObject('StripePayment/span_I agree to the terms and conditions'), 0)

WebUI.check(findTestObject('StripePayment/span_I agree to the terms and conditions'))

WebUI.click(findTestObject('StripePayment/span_Proceed_TermsandCondition'))

WebUI.click(findTestObject('StripePayment/span_Activate_Final_Confrm'))

WebUI.verifyElementText(findTestObject('StripePayment/flex_Success_Toaster_Message'), 'Flex plan on your account activated successfully.')

WebUI.delay(3)

WebUI.click(findTestObject('StripePayment/Deactivate_Activate_CountableFlexPlan'))

WebUI.click(findTestObject('StripePayment/span_Deactiavte_Confirm_Proceed'))

WebUI.setText(findTestObject('StripePayment/Page_UAT (Countable)/TypeDeactivate_Placeholder'), 'Deactivate')

WebUI.click(findTestObject('StripePayment/Page_UAT (Countable)/span_Confirm_button'))

