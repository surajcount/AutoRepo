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
import groovy.console.ui.SystemOutputInterceptor as SystemOutputInterceptor
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.support.ui.Select as Select
import java.util.List as List
import org.openqa.selenium.WebDriver as WebDriver
import org.junit.Assert as Assert

WebUI.openBrowser('')

WebUI.navigateToUrl(UAT)

WebUI.setText(findTestObject('LoginPage/User_Email'), LoginEmail)

WebUI.setEncryptedText(findTestObject('LoginPage/User_Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('LoginPage/LoginButton'))

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Create_Engagement_Pravin/Engagement_List'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Checklist_Objects/1st_Engagement'))

WebUI.delay(8)

WebUI.click(findTestObject('Materiality/Planning'))

WebUI.click(findTestObject('Materiality/Materiality'))

//Benchmark_Applied
String BenchmarkApplied = WebUI.getText(findTestObject('Materiality/BenchMark_Applied'))

float benchmark_applied

if (BenchmarkApplied.contains('(') && BenchmarkApplied.contains(')')) {
    BenchmarkApplied = BenchmarkApplied.replaceAll('[^0-9.]', '' // Remove all non-numeric characters
        )

    benchmark_applied = (Float.parseFloat(BenchmarkApplied) * -1)

    WebUI.comment('Benchmark value in materiality for assets is : ' + benchmark_applied // Remove unwanted characters
        // Convert to positive number
        //benchmark_applied = Integer.parseInt(BenchmarkApplied)
        )
} else {
    BenchmarkApplied = BenchmarkApplied.replaceAll('[^0-9.]', '')

    benchmark_applied = Float.parseFloat(BenchmarkApplied)

    WebUI.comment('Benchmark applied for total assets in materiality is : ' + benchmark_applied)
}

if (benchmark_applied == 2.00) {
    KeywordUtil.markPassed('Value fetched correctly from firm template')
} else {
    KeywordUtil.markFailed('Value not fetched correctly from firm template')
}

WebUI.delay(3)

WebUI.click(findTestObject('Create_Engagement_Pravin/TB_Adjusting'))

WebUI.delay(90)

WebUI.click(findTestObject('Notes_Inside_Engagement/Ignore_Popup'))

WebUI.click(findTestObject('Materiality/Materiality'))

WebUI.delay(2)

WebUI.verifyTextPresent('There are changes in numbers in trial balance post to when the data has been pulled. If you would like to accept these changes, please click on Refresh button', 
    false)

WebUI.click(findTestObject('Materiality/Refresh_button'))

WebUI.verifyTextPresent('Refresh Materiality', false)

WebUI.verifyTextPresent('“Please note that clicking on refresh will update the current values shown with new values. Are you sure you want to continue?”', 
    false)

WebUI.click(findTestObject('Stripe/Yes_button'))

WebUI.delay(1)

WebUI.click(findTestObject('Materiality/Save_Materiality'))

