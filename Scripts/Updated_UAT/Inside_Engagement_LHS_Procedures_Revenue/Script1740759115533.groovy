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

WebUI.delay(3)

WebUI.click(findTestObject('Procedures_Object/Procedure_Section'))

WebUI.delay(2)

WebDriver driver = DriverFactory.getWebDriver()

//Revenue
if (WebUI.verifyElementPresent(findTestObject('LHS_InsideEngagement/Procedures/Revenue_Group'), 0)) {
    WebUI.click(findTestObject('LHS_InsideEngagement/Procedures/Revenue_Group'))

    WebUI.click(findTestObject('LHS_InsideEngagement/Procedures/Revenue_Subgroup'))

    if (WebUI.verifyElementPresent(findTestObject('LHS_InsideEngagement/Procedures/Revenue_LS'), 0)) {
        WebUI.mouseOver(findTestObject('LHS_InsideEngagement/Procedures/Revenue_LS'))

        WebUI.click(findTestObject('LHS_InsideEngagement/Procedures/Revenue_LS_Kebab'))

        List<Map> elements = driver.findElements(By.xpath('//div/div[@role=\'menu\']/div/button'))

        // Expected values for comparison
        String[] expectedValues = ['Reorder', 'Renumber', 'Raise a request', 'Raise issue', 'Add comment', 'Add document']

        // Iterate through each WebElement and compare with expected values
        for (int i = 0; i < elements.size(); i++) {
            String actualValue = elements.get(i).getText()

            String expectedValue = expectedValues[i]

            System.out.print(('Kebab values are : ' + actualValue) + ' ')

            // Assert that the actual value matches the expected value
            Assert.assertEquals('Mismatch at index ' + i, expectedValue, actualValue)
        }
        
        WebUI.click(findTestObject('User_Access/Raise_Request_Kebab_Option'))

        WebUI.delay(1)

        WebUI.click(findTestObject('LHS_InsideEngagement/Select_LeadSheet'))

        WebUI.click(findTestObject('LHS_InsideEngagement/40_Expenses'))

        WebUI.setText(findTestObject('Procedures_Object/Document_name'), 'Created under Revenue using automation')

        WebUI.setText(findTestObject('Procedures_Object/Document_Description'), 'Revenue : It makes the code optimized, we can retrieve or sort the data efficiently.')

        WebUI.scrollToElement(findTestObject('Procedures_Object/Request_Due_Date'), 5)

        WebUI.click(findTestObject('Procedures_Object/Request_Due_Date'), FailureHandling.CONTINUE_ON_FAILURE)

        WebUI.click(findTestObject('Procedures_Object/Current_Date_Procedures'))

        WebUI.click(findTestObject('Procedures_Object/Send_Request_button'))

        WebUI.click(findTestObject('Procedures_Object/Send_Now'))

        WebUI.verifyTextPresent('Document request created successfully', false)

        WebUI.delay(2)

        WebUI.mouseOver(findTestObject('LHS_InsideEngagement/Procedures/Revenue_LS'))

        WebUI.click(findTestObject('LHS_InsideEngagement/Procedures/Revenue_LS_Kebab'))

        WebUI.click(findTestObject('LHS_InsideEngagement/Add_Documents_Kebab'))

        WebUI.delay(1)

        WebUI.uploadFile(findTestObject('Procedures_Object/Upload_Documents'), 'C:\\Users\\Admin\\Desktop\\Upload_Functions_Test\\COM-AUT-Dec312023-EL.pdf')

        WebUI.uploadFile(findTestObject('Procedures_Object/Upload_Documents'), 'C:\\Users\\Admin\\Desktop\\Upload_Functions_Test\\COM-AUT-Dec312023-EL.doc')

        WebUI.uploadFile(findTestObject('Procedures_Object/Upload_Documents'), 'C:\\Users\\Admin\\Desktop\\Upload_Functions_Test\\Trial Balance Grouping (65).xlsx')

        WebUI.delay(1)

        WebUI.click(findTestObject('Procedures_Object/Add_Button'))

        WebUI.delay(5)

        WebUI.mouseOver(findTestObject('LHS_InsideEngagement/Procedures/Revenue_LS'))

        WebUI.click(findTestObject('LHS_InsideEngagement/Procedures/Revenue_LS_Kebab'))

        WebUI.click(findTestObject('LHS_InsideEngagement/Reorder'))

        WebUI.click(findTestObject('LHS_InsideEngagement/3rd_Docs'))

        WebUI.click(findTestObject('LHS_InsideEngagement/UP_Arrow'))

        WebUI.click(findTestObject('LHS_InsideEngagement/Save_Reorder'))

        WebUI.verifyTextPresent('Document reordered successfully', false)

        WebUI.delay(3)

        WebUI.mouseOver(findTestObject('LHS_InsideEngagement/Procedures/Revenue_LS'))

        WebUI.click(findTestObject('LHS_InsideEngagement/Procedures/Revenue_LS_Kebab'))

        WebUI.click(findTestObject('LHS_InsideEngagement/Renumber'))

        WebUI.verifyTextPresent('Renumber Documents', false)

        WebUI.verifyTextPresent('Your are attempting to renumber the documents', false)

        WebUI.verifyTextPresent('Note: Kindly modify references within the financial statements or other relevant sections before renumbering, as it will affect all linked references.', 
            false)

        WebUI.click(findTestObject('LHS_InsideEngagement/Renumber'))

        WebUI.verifyTextPresent('Document renumbered successfully', false)

        WebUI.delay(3)

        WebUI.mouseOver(findTestObject('LHS_InsideEngagement/Procedures/Revenue_LS'))

        WebUI.click(findTestObject('LHS_InsideEngagement/Procedures/Revenue_LS_Kebab'))

        WebUI.click(findTestObject('LHS_InsideEngagement/Add_comment_LHS_Kebab'))

        WebUI.setText(findTestObject('Procedures_Object/Comment_Desc_Procedures'), 'Comment added under Equity')

        WebUI.click(findTestObject('Engagement_Section_LHS/Submit_BTN_Raise_Issue'))

        WebUI.verifyTextPresent('New comment created successfully', false)

        WebUI.delay(3)

        WebUI.mouseOver(findTestObject('LHS_InsideEngagement/Procedures/Revenue_LS'))

        WebUI.click(findTestObject('LHS_InsideEngagement/Procedures/Revenue_LS_Kebab'))

        WebUI.click(findTestObject('LHS_InsideEngagement/Raise_Issue_LHS'))

        WebUI.setText(findTestObject('Procedures_Object/Issue_Title'), 'Issue created using automation in Revenue')

        WebUI.setText(findTestObject('Procedures_Object/Issue_Description'), 'Revenue-An object of a dynamically formed class is called an array in Java. Java array.')

        WebUI.click(findTestObject('LHS_InsideEngagement/Assigned_To'))

        WebUI.click(findTestObject('LHS_InsideEngagement/Assigned_to_All'))

        WebUI.click(findTestObject('Procedures_Object/Due_Date'), FailureHandling.CONTINUE_ON_FAILURE)

        WebUI.click(findTestObject('Procedures_Object/Current_Date_Procedures'))

        WebUI.click(findTestObject('Engagement_Section_LHS/Submit_BTN_Raise_Issue'))

        WebUI.verifyTextPresent('New issue created successfully', false)

        WebUI.delay(3)
    } else {
        WebUI.comment('Equity is not available')
    }
}

WebUI.click(findTestObject('LHS_InsideEngagement/Procedures/Revenue_Group'))

