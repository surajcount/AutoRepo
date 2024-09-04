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

WebUI.setText(findTestObject('Page_UAT (Countable)/EmailElement'), Email_MainAcc)

WebUI.setEncryptedText(findTestObject('Page_UAT (Countable)/Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Page_UAT (Countable)/span_Login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('StripePayment/Page_UAT (Countable)/AccountMenuButton'))

WebUI.delay(1)

WebUI.click(findTestObject('StripePayment/Page_UAT (Countable)/BillingButton'))

WebUI.delay(2)

WebUI.takeScreenshotAsCheckpoint('BillingPageUI')

WebUI.click(findTestObject('StripePayment/Page_UAT (Countable)/span_Upgrade Plan_button'))

WebUI.click(findTestObject('StripePayment/HideFeature Button'))

WebUI.takeScreenshotAsCheckpoint('Features Page')

WebUI.scrollToElement(findTestObject('StripePayment/HideViewFeature'), 10)

WebUI.takeScreenshotAsCheckpoint('FeaturePage2')

WebUI.click(findTestObject('StripePayment/HideViewFeature'))

WebUI.click(findTestObject('StripePayment/Back to Billing'))

WebUI.click(findTestObject('StripePayment/EngagementSection/DashboardGoToEngagement'))

WebUI.click(findTestObject('StripePayment/EngagementSection/Create Engegement_Button'))

WebUI.click(findTestObject('StripePayment/EngagementSection/SelectClientArrowbutton'))

WebUI.click(findTestObject('StripePayment/EngagementSection/SelectClient'))

WebUI.click(findTestObject('StripePayment/EngagementSection/HitGO_EngagementCreation'))

WebUI.setText(findTestObject('StripePayment/EngagementSection/EngagementPeriod'), '11/11/2023')

WebUI.setText(findTestObject('StripePayment/EngagementSection/SetBudget'), '10')

