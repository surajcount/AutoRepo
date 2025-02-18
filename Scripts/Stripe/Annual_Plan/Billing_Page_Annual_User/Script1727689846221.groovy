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

WebUI.click(findTestObject('Stripe/User_Profile'))

WebUI.click(findTestObject('Stripe/Billing'))

WebUI.delay(5)

WebUI.verifyTextPresent('per user/month, billed annually', false)

//Total Seats
String Tot_Seats_PlanDetails = WebUI.getText(findTestObject('Stripe/Total_Seats'))

int Total_Seats = Integer.parseInt(Tot_Seats_PlanDetails)

System.out.print(('Total Seats under plan details are : ' + Total_Seats) + ' ')

//Unused Seats
String Used_PlanDetails = WebUI.getText(findTestObject('Stripe/Used_Seats'))

int Used_Seats = Integer.parseInt(Used_PlanDetails)

System.out.print(('Used Seats under plan details are : ' + Used_Seats) + ' ')

//Remaining Seats
int remaining_seats = Total_Seats - Used_Seats

System.out.print(('Remaining Seats under plan details are : ' + remaining_seats) + ' ')

String payment_fre = WebUI.getText(findTestObject('Stripe/Payment_Frequency_PlanDetails'))

System.out.print(('Payment frequency is : ' + payment_fre) + ' ')

String Next_payment_Date = WebUI.getText(findTestObject('Stripe/Next_Payment_date'))

System.out.print(('Next Payment date is : ' + Next_payment_Date) + ' ')

String NPA = WebUI.getText(findTestObject('Stripe/Next_Payment_Amount'))

String NPA_numericPart1 = NPA.replaceAll('[^0-9]', '')

float NPA_integerPart1 = Integer.parseInt(NPA_numericPart1)

float Next_Amount = NPA_integerPart1 / 100

System.out.print(('Next Payment amount is : ' + Next_Amount) + ' ')

//Add-on: Countable Flex
String Tot_Used = WebUI.getText(findTestObject('Stripe/Total_Used_Till_Date'))

int Total_Flex_Used = Integer.parseInt(Tot_Used)

System.out.print(('Total Flex used till date= ' + Total_Flex_Used) + ' ')

String TC = WebUI.getText(findTestObject('Stripe/Total_Commitment'))

if (TC.equalsIgnoreCase('NA')) {
    print('User dont have any flex commitment ')
} else {
    int total_commitment = Integer.parseInt(TC)

    System.out.print(('Total Commitments= ' + total_commitment) + ' ')

    int remaining_unused_flex = total_commitment - Total_Flex_Used

    boolean commitmentMet = total_commitment == Total_Flex_Used

    System.out.println('Total Commitment: ' + commitmentMet ? 'Commitment Met' : 'Commitment Not Met')

    if (commitmentMet) {
        System.out.println('Remaining Unused: NA')
    } else {
        System.out.println('Remaining Unused: ' + remaining_unused_flex)
    }
}

