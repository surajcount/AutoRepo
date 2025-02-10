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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver
import java.util.List



WebUI.openBrowser('')

WebUI.navigateToUrl(UAT)

WebUI.setText(findTestObject('LoginPage/User_Email'), LoginEmail)

WebUI.setEncryptedText(findTestObject('LoginPage/User_Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('LoginPage/LoginButton'))

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.click(findTestObject('Notes_Firm/Template'))

WebUI.click(findTestObject('Notes_Firm/div_Engagements'))

WebUI.click(findTestObject('Checklist_Objects/Checklist_Dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/Expand_Last_Folder'))

WebUI.click(findTestObject('Checklist_Objects/New_Engagement_Acceptance_ChkList'))

WebUI.delay(4)

WebUI.scrollToElement(findTestObject('Checklist_Objects/Add_a_Question'), 0)

WebUI.click(findTestObject('Checklist_Objects/Add_a_Question'))

WebUI.delay(4)

WebUI.click(findTestObject('Checklist_Objects/Review_Category_Selection'))

WebUI.click(findTestObject('Checklist_Objects/Add_to_Category_button'))

WebUI.setText(findTestObject('Checklist_Objects/Question_Details'), 'What are the different types of locators in Selenium?')

WebUI.setText(findTestObject('Checklist_Objects/Question_Text_Area'), 'ID\nName\nClass Name\nTag Name\nLink Text\nPartial Link Text\nCSS Selector\nXPath')

WebUI.delay(1)

WebUI.click(findTestObject('User_Access/Save_Team_Details'))

WebUI.verifyTextPresent('Success', false)

WebUI.click(findTestObject('Checklist_Objects/Checklist_Container'))

WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/Existing_Engagement_Checklist'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Checklist_Objects/Question_Category'), 0)

WebUI.click(findTestObject('Checklist_Objects/Question_Category'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Checklist_Objects/Category_Name'), 'Review Category')

WebUI.click(findTestObject('Checklist_Objects/Add_Question_in_Category'))

WebUI.setText(findTestObject('Checklist_Objects/Question_Details'), 'What is Selenium?')

WebUI.setText(findTestObject('Checklist_Objects/Question_Text_Area'), 'Selenium is an open-source automation testing framework used to automate web applications. It supports multiple browsers, programming languages (Java, Python, C#, etc.), and platforms.')

WebUI.delay(1)

WebUI.click(findTestObject('User_Access/Save_Team_Details'))

WebUI.verifyTextPresent('Success', false)

WebUI.click(findTestObject('Checklist_Objects/Checklist_Container'))

WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/Understanding_Basics_Checklist'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Checklist_Objects/Question_Category'), 0)

WebUI.click(findTestObject('Checklist_Objects/Add_a_Question'))

WebUI.click(findTestObject('Checklist_Objects/Review_Category_Selection'))

WebUI.click(findTestObject('Checklist_Objects/Add_to_Category_button'))

WebUI.setText(findTestObject('Checklist_Objects/Question_Details'), 'Write a script to validate broken links on a webpage')

WebUI.setText(findTestObject('Checklist_Objects/Question_Text_Area'), 'List<WebElement> links = driver.findElements(By.tagName("a"));\nfor (WebElement link : links) {\n    String url = link.getAttribute("href");\n    HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();\n    conn.setRequestMethod("HEAD");\n    conn.connect();\n    int respCode = conn.getResponseCode();\n    if (respCode >= 400) {\n        System.out.println(url + " is a broken link.");\n    }\n}')

WebUI.delay(1)

WebUI.click(findTestObject('User_Access/Save_Team_Details'))

WebUI.verifyTextPresent('Success', false)

WebUI.click(findTestObject('Checklist_Objects/Checklist_Container'))

WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/Edit_Checklist'))

WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/Question_Type'))

WebDriver driver = DriverFactory.getWebDriver()

// Find elements using XPath
List<WebElement> listQUEType = driver.findElements(By.xpath('//div[@role=\'listbox\']/div/div'))

// Expected values
List<Map> expectedValues = Arrays.asList('Date', 'Long Answer', 'Short Answer', 'Yes/No', 'Amount', 'Multiple Choice')

// Iterate and compare
boolean allMatch = true
for (int i = 0; i < listQUEType.size(); i++) {
    String actualText = listQUEType.get(i).getText().trim()

    String expectedText = expectedValues.get(i)

    if (!(actualText.equals(expectedText))) {
        System.out.println(((((('Mismatch at index ' + i) + ': Expected \'') + expectedText) + '\', but found \'') + actualText) + 
            '\'')

        allMatch = false
    }
}

// Final validation
if (allMatch) {
    System.out.println('All elements match the expected values ✅')
} else {
    System.out.println('Some elements do not match the expected values ❌')
}

WebUI.click(findTestObject('Checklist_Objects/Multiple_Choice'))

WebUI.click(findTestObject('Checklist_Objects/Add_Option'))

WebUI.click(findTestObject('Checklist_Objects/1st_Option_MCQ'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Checklist_Objects/1st_Option_MCQ'), 'Option 1')

WebUI.click(findTestObject('Checklist_Objects/Add_Option'))

WebUI.click(findTestObject('Checklist_Objects/2nd_Option_MCQ'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Checklist_Objects/2nd_Option_MCQ'), 'Option 2')

WebUI.click(findTestObject('User_Access/Save_Team_Details'))

WebUI.verifyTextPresent('Success', false)

WebUI.click(findTestObject('Checklist_Objects/Checklist_Container'))

WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/SubSequent_Event'))

WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/Edit_Checklist'))

WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/2nd_Question_Planning'))

WebUI.delay(1)

WebUI.click(findTestObject('Checklist_Objects/Delete_2nd_question_Planning'))

WebUI.verifyTextPresent('Question deleted', false)

WebUI.closeBrowser()

