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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import javax.xml.crypto.dsig.keyinfo.KeyValue as KeyValue
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.builtin.FindWebElementKeyword as FindWebElementKeyword
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import java.util.List as List
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.junit.Assert as Assert

WebUI.openBrowser('')

WebUI.navigateToUrl(PROD)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_UAT (Countable)/EmailElement'), EmailLogin)

WebUI.setEncryptedText(findTestObject('Page_UAT (Countable)/Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Page_UAT (Countable)/span_Login'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Create Engagement_Objects/Dashboard_Button'), 40)

WebUI.click(findTestObject('Create Engagement_Objects/Dashboard_Button'))

WebUI.waitForElementPresent(findTestObject('Create Engagement_Objects/SearchBox_Dashboard'), 0)

WebUI.setText(findTestObject('Create Engagement_Objects/SearchBox_Dashboard'), Search_Engagement)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Create Engagement_Objects/Comp_Engmnt_GoInside'))

WebUI.delay(5)

WebUI.click(findTestObject('Materiality/Planning'))

WebUI.click(findTestObject('Materiality/Materiality'))

WebUI.delay(3)

// Define dropdown options (modify if dynamic)
def options = [ 'Income from continuing operations', 'Gross revenues','Total Assets','Total Expenses','EBIDTA','Other']

// Loop through each option
for (String option : options) {
	
	WebUI.comment("Selecting option: " + option)
    // Click the dropdown
    WebUI.click(findTestObject('Materiality/Basis_for_calculations_dropdown'))

    // Select the option
	WebUI.waitForElementClickable(findTestObject('Materiality/Option_in_dropdown', [('optionName') : option]), 10)
	
    WebUI.click(findTestObject('Materiality/Option_in_dropdown', [('optionName') : option]))

    // Wait for the values to update (adjust delay or use waitForElement)
    WebUI.delay(3)

    // Capture all relevant values after selection
    String currentPeriod = WebUI.getText(findTestObject('Materiality/Current_Period_Amount'))

    String extrapolatedPeriod = WebUI.getText(findTestObject('Materiality/Extrapolated_period'))

    String benchmarkApplied = WebUI.getText(findTestObject('Materiality/BenchMark_Applied'))

    String materialityCY = WebUI.getText(findTestObject('Materiality/Materiality_cy'))

    String threshold = WebUI.getAttribute(findTestObject('Materiality/Threshold'), 'value')

    String amount = WebUI.getAttribute(findTestObject('Materiality/Amount'), 'value')

    // Print or log the captured values
    WebUI.comment("====== Option Selected: $option ======")

    WebUI.comment("Current Period: $currentPeriod")

    WebUI.comment("Extrapolated Period: $extrapolatedPeriod")

    WebUI.comment("Benchmark Applied: $benchmarkApplied")

    WebUI.comment("Materiality CY: $materialityCY")

    WebUI.comment("Threshold: $threshold")

    WebUI.comment("Amount: $amount") // Add your validations or store these in a map/list if needed
}

WebUI.comment('Finished capturing values for all basis of calculation options.')

