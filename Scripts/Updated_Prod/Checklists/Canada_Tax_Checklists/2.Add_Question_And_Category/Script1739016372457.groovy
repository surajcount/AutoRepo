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

WebUI.navigateToUrl(PROD)

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

WebUI.click(findTestObject('Checklist_Objects/Completion_Checklist_In_Firm'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Checklist_Objects/Question_Category'), 0)

WebUI.click(findTestObject('Checklist_Objects/Add_a_Question'))

WebUI.click(findTestObject('Checklist_Objects/Category_Knowledge'))

WebUI.click(findTestObject('Checklist_Objects/Add_to_Category_button'))

WebUI.setText(findTestObject('Checklist_Objects/Question_Details'), 'Write a script to validate broken links on a webpage')

WebUI.setText(findTestObject('Checklist_Objects/Question_Text_Area'), 'List<WebElement> links = driver.findElements(By.tagName("a"));\nfor (WebElement link : links) {\n    String url = link.getAttribute("href");\n    HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();\n    conn.setRequestMethod("HEAD");\n    conn.connect();\n    int respCode = conn.getResponseCode();\n    if (respCode >= 400) {\n        System.out.println(url + " is a broken link.");\n    }\n}')

WebUI.delay(1)

WebUI.click(findTestObject('User_Access/Save_Team_Details'))

WebUI.verifyTextPresent('Success', false)

WebUI.click(findTestObject('Checklist_Objects/Checklist_Container'))

WebUI.delay(5)

WebUI.click(findTestObject('Checklist_Objects/Edit_Checklist'))

WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/Question_Type'))

WebUI.click(findTestObject('Checklist_Objects/Date_Format'))

WebUI.click(findTestObject('User_Access/Save_Team_Details'))

WebUI.verifyTextPresent('Success', false)

WebUI.click(findTestObject('Checklist_Objects/Checklist_Container'))

WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/Edit_Checklist'))

WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/2nd_Question_Planning'))

WebUI.delay(1)

WebUI.click(findTestObject('Checklist_Objects/Delete_2nd_question_Planning'))

WebUI.verifyTextPresent('Question deleted', false)

WebUI.closeBrowser()

