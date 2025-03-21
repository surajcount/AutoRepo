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

WebUI.click(findTestObject('Materiality/Workbook'))

WebUI.switchToWindowIndex(1)

WebUI.delay(3)

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.verifyTextPresent('Trial Balance Grouping', false)

WebUI.delay(3)

/*
 * WebUI.click(findTestObject('Materiality/Balance_Sheet'))
 * 
 * WebUI.delay(3)
 * 
 * WebUI.click(findTestObject('Notes_Inside_Engagement/Open_Preview'))
 * 
 * WebUI.delay(3)
 * 
 * String total_assets =
 * WebUI.getText(findTestObject('Materiality/Total_Assets_On_Balance_Sheet'))
 * 
 * int total_assets_on_bs
 * 
 * int total_revenue_on_stat
 * 
 * // Check if the string contains parentheses (Negative Number) if
 * (total_assets.contains('(') && total_assets.contains(')')) { total_assets =
 * total_assets.replaceAll('[^0-9]', '' // Remove all non-numeric characters )
 * 
 * total_assets_on_bs = (Integer.parseInt(total_assets) * -1 // Convert to
 * negative number )
 * 
 * WebUI.comment('Total assets on balance sheet is : ' + total_assets_on_bs //
 * Remove unwanted characters // Convert to positive number ) } else {
 * total_assets = total_assets.replaceAll('[^0-9]', '')
 * 
 * total_assets_on_bs = Integer.parseInt(total_assets)
 * 
 * WebUI.comment('Total assets on balance sheet is : ' + total_assets_on_bs) }
 * 
 * WebUI.delay(2)
 */

WebUI.click(findTestObject('Materiality/Income_Statement'))

WebUI.delay(3)

WebUI.click(findTestObject('Notes_Inside_Engagement/Open_Preview'))

WebUI.delay(3)

/*
 * String total_revenue =
 * WebUI.getText(findTestObject('Materiality/Total_Revenue_On_Statement'))
 * 
 * // Check if the string contains parentheses (Negative Number) if
 * (total_revenue.contains('(') && total_revenue.contains(')')) { total_revenue
 * = total_revenue.replaceAll('[^0-9]', '' // Remove all non-numeric characters
 * )
 * 
 * total_revenue_on_stat = (Integer.parseInt(total_revenue) * -1 // Convert to
 * negative number )
 * 
 * WebUI.comment('Total revenue on balance sheet is : ' + total_revenue_on_stat
 * // Remove unwanted characters // Convert to positive number ) } else {
 * total_revenue = total_revenue.replaceAll('[^0-9]', '')
 * 
 * total_revenue_on_stat = Integer.parseInt(total_revenue)
 * 
 * WebUI.comment('Total revenue on balance sheet is : ' + total_revenue_on_stat)
 * }
 * 
 * WebUI.delay(3)
 */

int total_expenses_on_stat

//Total Expenses
String total_expenses = WebUI.getText(findTestObject('Materiality/Total_Expenses_On_Statement'))

// Check if the string contains parentheses (Negative Number)
if (total_expenses.contains('(') && total_expenses.contains(')')) {
    total_expenses = total_expenses.replaceAll('[^0-9]', '' // Remove all non-numeric characters
        )

    total_expenses_on_stat = (Integer.parseInt(total_expenses) * -1 // Convert to negative number
    )

    WebUI.comment('Total Expenses on statement is : ' + total_expenses_on_stat // Remove unwanted characters
        // Convert to positive number
        )
} else {
    total_expenses = total_expenses.replaceAll('[^0-9]', '')

    total_expenses_on_stat = Integer.parseInt(total_expenses)

    WebUI.comment('Total expenses on statement is : ' + total_expenses_on_stat)
}

//Net loss before income tax
WebUI.delay(3)

/*
 * String NetIncomeloss =
 * WebUI.getText(findTestObject('Materiality/Net_Income-loss_before_Tax'))
 * 
 * int NetIncomeloss_on_stat
 * 
 * // Check if the string contains parentheses (Negative Number) if
 * (NetIncomeloss.contains('(') && NetIncomeloss.contains(')')) { NetIncomeloss
 * = NetIncomeloss.replaceAll('[^0-9]', '' // Remove all non-numeric characters
 * )
 * 
 * NetIncomeloss_on_stat = (Integer.parseInt(NetIncomeloss) * -1 // Convert to
 * negative number )
 * 
 * WebUI.comment('Net income / loss on statement is : ' + NetIncomeloss_on_stat
 * // Remove unwanted characters // Convert to positive number ) } else {
 * NetIncomeloss = NetIncomeloss.replaceAll('[^0-9]', '')
 * 
 * NetIncomeloss_on_stat = Integer.parseInt(NetIncomeloss)
 * 
 * WebUI.comment('Net income / loss on statement is : ' + NetIncomeloss_on_stat)
 * }
 * 
 * WebUI.delay(3)
 */

WebUI.switchToWindowIndex(0)

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

//Total Expenses
WebUI.click(findTestObject('Materiality/Total_Expenses_option'))

WebUI.delay(3)

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
String CurrentP = convertAmount(Current_period_value)
int CurrentPeriod_Amount=Integer.parseInt(CurrentP)
// Print it to console
println("Current Period Value: " + CurrentPeriod_Amount)
if (total_expenses_on_stat == CurrentPeriod_Amount) {
	KeywordUtil.markPassed('Total expenses fetched correctly')
} else {
	KeywordUtil.markFailed(((('Incorrect total expenses value on Balance Sheet ' + total_expenses_on_stat) + ' ') + ' and Materiality ') +
		CurrentPeriod_Amount)
}


//Extrapolated Period
String Extrapolated_Period = WebUI.getText(findTestObject('Materiality/Extrapolated_period'))

String extraP = convertAmount(Extrapolated_Period)
int Extrapolated=Integer.parseInt(extraP)

println("Exta polated Period Value: " + extraP)

//Benchmark_Applied
String BenchmarkApplied = WebUI.getText(findTestObject('Materiality/BenchMark_Applied'))

//String BenchmarkApplied=Extrapolated_Period.split('\\.')[0]
float benchmark_applied

// Check if the string contains parentheses (Negative Number)
if (BenchmarkApplied.contains('(') && BenchmarkApplied.contains(')')) {
    BenchmarkApplied = BenchmarkApplied.replaceAll('[^0-9.]', '' // Remove all non-numeric characters
        )

    // benchmark_applied = Integer.parseInt(BenchmarkApplied) * -1 // Convert to negative number
    benchmark_applied = (Float.parseFloat(BenchmarkApplied) * -1)

    WebUI.comment('Benchmark applied for total expenses in materiality is : ' + benchmark_applied // Remove unwanted characters
        // Convert to positive number
        //benchmark_applied = Integer.parseInt(BenchmarkApplied)
        )
} else {
    BenchmarkApplied = BenchmarkApplied.replaceAll('[^0-9.]', '')

    benchmark_applied = Float.parseFloat(BenchmarkApplied)

    WebUI.comment('Benchmark applied for total expenses in materiality is : ' + benchmark_applied)
}

//Materiality_Cy
String Materiality_cy = WebUI.getText(findTestObject('Materiality/Materiality_cy'))

//String BenchmarkApplied=Extrapolated_Period.split('\\.')[0]
float materiality_cy

// Check if the string contains parentheses (Negative Number)
if (Materiality_cy.contains('(') && Materiality_cy.contains(')')) {
    Materiality_cy = Materiality_cy.replaceAll('[^0-9.]', '' // Remove all non-numeric characters
        )

    // materiality_cy = Integer.parseInt(Materiality_cy) * -1 // Convert to negative number
    materiality_cy = (Float.parseFloat(Materiality_cy) * -1)

    WebUI.comment('Materiality cy for total expenses in materiality is : ' + materiality_cy // Remove unwanted characters
        // Convert to positive number
        //materiality_cy = Integer.parseInt(Materiality_cy)
        )
} else {
    Materiality_cy = Materiality_cy.replaceAll('[^0-9.]', '')

    materiality_cy = Float.parseFloat(Materiality_cy)

    WebUI.comment('Materiality cy for total expenses in materiality is : ' + materiality_cy)
}

//Materiality_CY_Formula
float MaterialityCy = (Extrapolated * benchmark_applied) / 100

float MaterialityFormValue = Math.round(MaterialityCy * 100) / 100.0

WebUI.comment('Materilaity using formula is : ' + MaterialityFormValue)

if (materiality_cy.equals(MaterialityFormValue)) {
    KeywordUtil.markPassed('Materiality CY value calculated correctly')
} else {
    KeywordUtil.markFailed(((('Materiality CY value is incorrect:' + 'Materiality without formula is :') + materiality_cy) + 
        ' Materiality with formula is :') + MaterialityFormValue)
}

//Threshold
String Threshold = WebUI.getAttribute(findTestObject('Materiality/Threshold'), 'value')

//String BenchmarkApplied=Extrapolated_Period.split('\\.')[0]
float threshold_value

// Check if the string contains parentheses (Negative Number)
if (Threshold.contains('(') && Threshold.contains(')')) {
    Threshold = Threshold.replaceAll('[^0-9.]', '' // Remove all non-numeric characters
        )

    // materiality_cy = Integer.parseInt(Materiality_cy) * -1 // Convert to negative number
    threshold_value = (Float.parseFloat(Threshold) * -1)

    WebUI.comment('Threshold percentage is : ' + threshold_value // Remove unwanted characters
        // Convert to positive number
        //materiality_cy = Integer.parseInt(Materiality_cy)
        )
} else {
    Threshold = Threshold.replaceAll('[^0-9.]', '')

    threshold_value = Float.parseFloat(Threshold)

    WebUI.comment('Threshold percentage is : ' + threshold_value)
}

//Amount
String Amount = WebUI.getAttribute(findTestObject('Materiality/Amount'), 'value')

//CMS_Amount = Float.parseFloat(Amount)
//WebUI.comment('Clearly trivial misstatements : ' + CMS_Amount)
//String BenchmarkApplied=Extrapolated_Period.split('\\.')[0]
float CMS_Amount

// Check if the string contains parentheses (Negative Number)
if (Amount.contains('(') && Amount.contains(')')) {
    Amount = Amount.replaceAll('[^0-9.]', '' // Remove all non-numeric characters
        )

    // materiality_cy = Integer.parseInt(Materiality_cy) * -1 // Convert to negative number
    CMS_Amount = (Float.parseFloat(Amount) * -1)

    WebUI.comment('Clearly trivial misstatements :  ' + CMS_Amount // Remove unwanted characters
        // Convert to positive number
        //materiality_cy = Integer.parseInt(Materiality_cy)
        )
} else {
    Amount = Amount.replaceAll('[^0-9.]', '')

    CMS_Amount = Float.parseFloat(Amount)

    WebUI.comment('Clearly trivial misstatements : ' + CMS_Amount)
}

//Clearly missstatement amount using formula
float Clearlymiss = (MaterialityFormValue * threshold_value) / 100

float CMSFormAmount = Math.round(Clearlymiss * 100) / 100.0

WebUI.comment('Clearly trivial misstatements amount using formula is : ' + CMSFormAmount)

if (CMS_Amount.equals(CMSFormAmount)) {
    KeywordUtil.markPassed('Clearly trivial misstatements amount value calculated correctly')
} else {
    KeywordUtil.markFailed(((('Clearly trivial misstatements value is incorrect:' + 'CMS without formula is :') + CMS_Amount) + 
        ' CMS with formula is :') + CMSFormAmount)
}
