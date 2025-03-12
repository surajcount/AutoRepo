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

WebUI.click(findTestObject('Materiality/Balance_Sheet'))

WebUI.delay(3)

WebUI.click(findTestObject('Notes_Inside_Engagement/Open_Preview'))

WebUI.delay(3)

String total_assets = WebUI.getText(findTestObject('Materiality/Total_Assets_On_Balance_Sheet'))

// Check if the string contains parentheses (Negative Number)
if (total_assets.contains('(') && total_assets.contains(')')) {
    total_assets = total_assets.replaceAll('[^0-9]', '' // Remove all non-numeric characters
        )

    int total_assets_on_bs = Integer.parseInt(total_assets) * -1 // Convert to negative number

    WebUI.comment('Total assets on balance sheet is : ' + total_assets_on_bs // Remove unwanted characters
        // Convert to positive number
        )
} else {
    total_assets = total_assets.replaceAll('[^0-9]', '')

    int total_assets_on_bs = Integer.parseInt(total_assets)

    WebUI.comment('Total assets on balance sheet is : ' + total_assets_on_bs)
}

WebUI.delay(2)

WebUI.click(findTestObject('Materiality/Income_Statement'))

WebUI.delay(3)

WebUI.click(findTestObject('Notes_Inside_Engagement/Open_Preview'))

WebUI.delay(3)

String total_revenue = WebUI.getText(findTestObject('Materiality/Total_Revenue_On_Statement'))

// Check if the string contains parentheses (Negative Number)
if (total_revenue.contains('(') && total_revenue.contains(')')) {
    total_revenue = total_revenue.replaceAll('[^0-9]', '' // Remove all non-numeric characters
        )

    int total_revenue_on_stat = Integer.parseInt(total_revenue) * -1 // Convert to negative number

    WebUI.comment('Total revenue on balance sheet is : ' + total_revenue_on_stat // Remove unwanted characters
        // Convert to positive number
        )
} else {
    total_revenue = total_revenue.replaceAll('[^0-9]', '')

    int total_revenue_on_stat = Integer.parseInt(total_revenue)

    WebUI.comment('Total revenue on balance sheet is : ' + total_revenue_on_stat)
}

WebUI.delay(3)

//Total Expenses
String total_expenses = WebUI.getText(findTestObject('Materiality/Total_Expenses_On_Statement'))

// Check if the string contains parentheses (Negative Number)
if (total_expenses.contains('(') && total_expenses.contains(')')) {
    total_expenses = total_expenses.replaceAll('[^0-9]', '' // Remove all non-numeric characters
        )

    int total_expenses_on_stat = Integer.parseInt(total_expenses) * -1 // Convert to negative number

    WebUI.comment('Total Expenses on statement is : ' + total_expenses_on_stat // Remove unwanted characters
        // Convert to positive number
        )
} else {
    total_expenses = total_expenses.replaceAll('[^0-9]', '')

    int total_expenses_on_stat = Integer.parseInt(total_expenses)

    WebUI.comment('Total expenses on statement is : ' + total_expenses_on_stat)
}

//Net loss before income tax
WebUI.delay(3)

String NetIncomeloss = WebUI.getText(findTestObject('Materiality/Net_Income-loss_before_Tax'))

// Check if the string contains parentheses (Negative Number)
if (NetIncomeloss.contains('(') && NetIncomeloss.contains(')')) {
    NetIncomeloss = NetIncomeloss.replaceAll('[^0-9]', '' // Remove all non-numeric characters
        )

    int NetIncomeloss_on_stat = Integer.parseInt(NetIncomeloss) * -1 // Convert to negative number

    WebUI.comment('Net income / loss on statement is : ' + NetIncomeloss_on_stat // Remove unwanted characters
        // Convert to positive number
        )
} else {
    NetIncomeloss = NetIncomeloss.replaceAll('[^0-9]', '')

    int NetIncomeloss_on_stat = Integer.parseInt(NetIncomeloss)

    WebUI.comment('Net income / loss on statement is : ' + NetIncomeloss_on_stat)
}

WebUI.delay(3)

WebUI.switchToWindowIndex(0)

WebUI.delay(3)

WebUI.click(findTestObject('Materiality/Planning'))

WebUI.click(findTestObject('Materiality/Materiality'))

WebUI.delay(3)

WebUI.verifyTextPresent('Materiality', false)

WebUI.verifyTextPresent('To determine materiality for the financial statements as a whole and apply this materiality in designing the procedures and in evaluating the results obtained from those procedure.', 
    false)

WebUI.mouseOver(findTestObject('Materiality/Preliminary_Materiality_Tooltip'))

WebUI.verifyTextPresent('Materiality for the F/S as a whole. Use professional judgment as to the highest amount of misstatement(s) that could be included in the F/S without affecting the economic decisions taken by the F/S users identified above. Round off the figures (such as to the nearest thousand). Other qualitative guidance may also be detailed here.', 
    false)

WebUI.delay(3)

WebUI.mouseOver(findTestObject('Materiality/Workbook'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Materiality/Start_Date'), 0)

WebUI.verifyElementPresent(findTestObject('Materiality/End_Date'), 0)

WebUI.verifyElementPresent(findTestObject('Materiality/Pull_Button_Disabled'), 0)

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

