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

WebUI.navigateToUrl(UAT)

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


WebUI.delay(3)

WebUI.click(findTestObject('Materiality/Planning'))

WebUI.click(findTestObject('Materiality/Materiality'))

WebUI.delay(3)

WebUI.delay(3)

WebUI.click(findTestObject('Materiality/Basis_For_Calculations_Dropdown'))

WebDriver driver = DriverFactory.getWebDriver()

List<Map> elements = driver.findElements(By.xpath('//div[contains(@class,\'basis-for-calc-dropdown\')]/mat-option'))

// Expected values for comparison
String[] expectedValues = ['Income from continuing operations', 'Gross revenues', 'Total Assets', 'Total Expenses', 'EBIDTA'
    , 'Other']

// Iterate through each WebElement and compare with expected values
for (int i = 0; i < elements.size(); i++) {
    String actualValue = elements.get(i).getText()

	String expectedValue = expectedValues[i]

    System.out.print(('Basis for calculations dropdown values are  : ' + actualValue) + ' ')

    // Assert that the actual value matches the expected value
    Assert.assertEquals('Mismatch at index ' + i, expectedValue, actualValue)
}

//Total Revenuw
WebUI.click(findTestObject('Materiality/Gross_Revenues_option'))

WebUI.delay(3)
// Get the text from the object
String Current_period_value = WebUI.getText(findTestObject('Materiality/Current_Period_Amount'))

// Function to clean and convert the value
def convertAmount(String input) {
    input = input.replaceAll(",", "").trim()
    
    def isNegative = false
    
    if (input.startsWith("(") && input.endsWith(")")) {
        isNegative = true
        input = input.substring(1, input.length() - 1)
    }
    
    BigDecimal number = new BigDecimal(input)
    
    // If the number is like 1234.00, drop the .00
    if (number.scale() > 0 && number.stripTrailingZeros().scale() <= 0) {
        number = number.setScale(0)
    }
    
    if (isNegative) {
        number = number.multiply(new BigDecimal(-1))
    }
    
    return number.toPlainString()
}

// Convert the fetched text
String cleanValue = convertAmount(Current_period_value)

// Print it to console
println("Current Period Value: " + cleanValue)
