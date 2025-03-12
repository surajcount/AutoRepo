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

WebUI.navigateToUrl(UAT)

WebUI.setText(findTestObject('LoginPage/User_Email'), LoginEmail)

WebUI.setEncryptedText(findTestObject('LoginPage/User_Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('LoginPage/LoginButton'))

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.click(findTestObject('OnboardingObjects/Page_UAT (Countable)/Keep_Default_timezone'))

WebUI.click(findTestObject('Stripe/User_Profile'))

WebUI.click(findTestObject('Stripe/Billing'))

WebUI.delay(3)

WebUI.verifyTextPresent('Free Trial', false)

WebUI.scrollToElement(findTestObject('Stripe/Activate_Button'), 0)

WebUI.click(findTestObject('Stripe/Activate_Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('FLEXPLAN TERMS', false)

boolean B = WebUI.verifyElementClickable(findTestObject('Stripe/Proceed_Button'))

System.out.print(B)

WebUI.scrollToElement(findTestObject('Stripe/Terms and Condition Checkbox'), 0)

WebUI.click(findTestObject('Stripe/Terms and Condition Checkbox'))

WebUI.verifyElementClickable(findTestObject('Stripe/Proceed_Button'))

WebUI.click(findTestObject('Stripe/Proceed_Button'))

WebUI.verifyTextPresent('Activate Flex Plan Beta', false)

WebUI.click(findTestObject('Stripe/Activate_On_Popup'))

WebUI.verifyTextPresent('Flex plan on your account activated successfully', false)

WebUI.click(findTestObject('Stripe/Flex_History'))

WebUI.click(findTestObject('Stripe/Teams_Menu'))

WebUI.click(findTestObject('Stripe/Add_Team'))

WebUI.click(findTestObject('Stripe/Add_New_Member'))

WebUI.delay(5)

WebUI.click(findTestObject('Stripe/Choose_Category'))

WebUI.click(findTestObject('Stripe/CMS_Team_member'))

WebUI.delay(3)

WebUI.setText(findTestObject('Stripe/Team_Member_Email'), 'mohamade@countable.co')

WebUI.click(findTestObject('Stripe/Access_Type'))

WebUI.click(findTestObject('Stripe/Admin_Access_Type'))

WebUI.click(findTestObject('Stripe/Add_Button'))

WebUI.verifyTextPresent('Team member record added successfully', false)

WebUI.click(findTestObject('Create_Engagement_Pravin/Engagement_List'))

String TE = WebUI.getText(findTestObject('Stripe/Total_Engagements'))

int tot_eng = Integer.parseInt(TE)

System.out.print('Total Engagements= ' + tot_eng)

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Create_Engagement_Pravin/Create_engagement_button_listpage'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Create_Engagement_Pravin/Client_Name_on_Popup'))

WebUI.click(findTestObject('Create_Engagement_Pravin/Select_Client'))

WebUI.click(findTestObject('Create_Engagement_Pravin/Engagement_Type'))

WebUI.click(findTestObject('Create_Engagement_Pravin/Compilation_Type'))

WebUI.click(findTestObject('Create_Engagement_Pravin/Proceed_on_popup'))

WebUI.waitForPageLoad(3)

WebUI.setText(findTestObject('Create_Engagement_Pravin/Period_Year_End_Date'), '12/31/2023')

WebUI.setText(findTestObject('Create_Engagement_Pravin/Budget'), '1000')

WebUI.scrollToElement(findTestObject('Create_Engagement_Pravin/Add_Engagement_Team_Member'), 0)

WebUI.click(findTestObject('Create_Engagement_Pravin/Add_Engagement_Team_Member'))

WebUI.click(findTestObject('Create_Engagement_Pravin/Select_Team_Option'))

WebUI.click(findTestObject('Stripe/CMS_Member'))

WebUI.setText(findTestObject('Create_Engagement_Pravin/Time_Allocation'), '100')

WebUI.click(findTestObject('Create_Engagement_Pravin/Check_Icon'))

WebUI.click(findTestObject('Create_Engagement_Pravin/Create_engagement_button_listpage'))

WebUI.verifyTextPresent('Engagement created successfully', false)

WebUI.delay(20)

WebUI.click(findTestObject('Create_Engagement_Pravin/Create_engagement_button_listpage'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Create_Engagement_Pravin/Client_Name_on_Popup'))

WebUI.click(findTestObject('Create_Engagement_Pravin/Select_Client'))

WebUI.click(findTestObject('Create_Engagement_Pravin/Engagement_Type'))

WebUI.click(findTestObject('Create_Engagement_Pravin/Compilation_Type'))

WebUI.click(findTestObject('Create_Engagement_Pravin/Proceed_on_popup'))

WebUI.waitForPageLoad(3)

WebUI.setText(findTestObject('Create_Engagement_Pravin/Period_Year_End_Date'), '12/31/2023')

WebUI.setText(findTestObject('Create_Engagement_Pravin/Budget'), '2000')

WebUI.scrollToElement(findTestObject('Create_Engagement_Pravin/Add_Engagement_Team_Member'), 0)

WebUI.click(findTestObject('Create_Engagement_Pravin/Add_Engagement_Team_Member'))

WebUI.click(findTestObject('Create_Engagement_Pravin/Select_Team_Option'))

WebUI.click(findTestObject('Stripe/CMS_Member'))

WebUI.delay(1)

WebUI.verifyTextPresent('Upgrade Plan to Continue', false)

WebUI.verifyTextPresent('Your Free Trial plan has limited Flex Engagements', false)

WebUI.verifyTextPresent('Upgrade now to create additional Flex Engagements', false)

WebUI.click(findTestObject('Stripe/Cancel_Button'))

WebUI.click(findTestObject('Create_Engagement_Pravin/Engagement_List'))

