import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(UAT)

WebUI.setText(findTestObject('LoginPage/User_Email'), LoginEmail)

WebUI.setEncryptedText(findTestObject('LoginPage/User_Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('LoginPage/LoginButton'))

WebUI.maximizeWindow()

WebUI.delay(5)

//String TotalEng = WebUI.getText(findTestObject('Stripe/Total_Engagements_Dashboard'), FailureHandling.CONTINUE_ON_FAILURE)
//
//int totalengbilling = TotalEng.toInteger()
//
//print(('Total Engagements on billing page are :' + totalengbilling) + ' ')
//
//WebUI.delay(3)
WebUI.click(findTestObject('Stripe/User_Profile'))

WebUI.click(findTestObject('Stripe/Billing'))

WebUI.delay(3)

String Downgrade_Left = WebUI.getText(findTestObject('Stripe/Downgrades_Left'))

int downleft = Downgrade_Left.toInteger()

String CurrentPlan = WebUI.getText(findTestObject('Stripe/Plan_Name'))

WebUI.comment(('Current plan is ' + CurrentPlan) + ' ')

if (CurrentPlan.contains('Accelerate Plan')) {
    KeywordUtil.markFailed('User is on Accelerate Plan and cannot Upgrade to another monthly plan')

    return null //FailureHandling.STOP_ON_FAILURE
} else if (CurrentPlan.contains('Essentials Plan')) {
    WebUI.click(findTestObject('Stripe/Change_Plan'))

    WebUI.delay(3)

    WebUI.click(findTestObject('Stripe/Select_Plan_Accelerate'))

    WebUI.delay(2)

    WebUI.verifyTextPresent('Confirm Change of Plan', false)

    WebUI.verifyTextPresent('You are about to subscribe to the Accelerate Monthly Plan', false)

    WebUI.delay(2)

    WebUI.click(findTestObject('Stripe/Confirm_on_Popup'))
} else if (CurrentPlan.contains('Ignite Plan')) {
    WebUI.click(findTestObject('Stripe/Change_Plan'))

    WebUI.delay(3)

    WebUI.click(findTestObject('Stripe/Select_Plan_Accelerate'))

    WebUI.delay(2)

    WebUI.verifyTextPresent('Confirm Change of Plan', false)

    WebUI.verifyTextPresent('You are about to subscribe to the Accelerate Monthly Plan', false)

    WebUI.delay(2)

    WebUI.click(findTestObject('Stripe/Confirm_on_Popup'))

    WebUI.delay(3)
}

WebUI.delay(2)

WebUI.click(findTestObject('Stripe/Proceed_to_Checkout_Button'))

WebUI.delay(1)

WebUI.verifyTextPresent('Checkout', false)

WebUI.delay(2)

WebUI.click(findTestObject('Stripe/View_Previous_Plan'))

WebUI.verifyTextPresent('Previous Plan Details', false)

//WebUI.verifyTextPresent('Accelerate Monthly', false)
WebUI.click(findTestObject('Stripe/Ok_Button'))

WebUI.delay(2)

String PPS = WebUI.getText(findTestObject('Stripe/Price_per_seat'))

String numericPart = PPS.replaceAll('[^0-9]', '')

double integerPart = Integer.parseInt(numericPart)

double price = integerPart / 100

System.out.print(price)

String value = WebUI.getAttribute(findTestObject('Stripe/No. of _Seat'), 'value')

int ns = Integer.parseInt(value)

System.out.print(('The no of seats ' + ns) + ' ')

String months = WebUI.getText(findTestObject('Stripe/No. Of_Months'))

int NOM = Integer.parseInt(months)

System.out.print(('The number of months= ' + NOM) + ' ')

double PlanCharges = (price * NOM) * ns

System.out.print(('Plan Charges are= ' + PlanCharges) + ' ')

String PC = WebUI.getText(findTestObject('Stripe/Plan_Charges'))

String Charge = PC.replaceAll('[^0-9]', '')

double integerPar = Integer.parseInt(Charge)

double PlanC = integerPar / 100

System.out.print(PlanC)

if (PlanCharges == PlanC) {
    System.out.print('Test Passed : Plan charges calculated correctly ')
} else {
    KeywordUtil.markFailed('Test Failed : Plan charges calculated incorrectly')
}

String CF = WebUI.getText(findTestObject('Stripe/Countable_Flex_Charge'))

String numericPart1 = CF.replaceAll('[^0-9]', '')

double integerPart1 = Integer.parseInt(numericPart1)

double FlexCharge = integerPart1 / 100

System.out.print(FlexCharge)

String ST = WebUI.getText(findTestObject('Stripe/Subtotal_New_Plan'))

String numericPart2 = ST.replaceAll('[^0-9]', '')

double integerPart2 = Integer.parseInt(numericPart2)

double Subtotalnc = integerPart2 / 100

System.out.print(Subtotalnc)

double SubtotalNewPlan = PlanCharges + FlexCharge

System.out.print('Subtotal is ' + SubtotalNewPlan)

//DiscountApplied
String Disc = WebUI.getText(findTestObject('Stripe/Discount_Applied_New_Plan'))

System.out.print('Discount ' + Disc)

String discAmt = Disc.replaceAll('[^0-9]', '')

double discNum = Integer.parseInt(discAmt)

double DiscountedAmount = discNum / 100

System.out.print('Discounted Amount is ' + DiscountedAmount)

double NetTotal = SubtotalNewPlan + DiscountedAmount

System.out.print('Net Total is ' + NetTotal)

//Tax
String taxn = WebUI.getText(findTestObject('Stripe/Tax_New_Plan'))

String taxper = taxn.replaceAll('[^0-9]', '')

double taxPercentage = Integer.parseInt(taxper)

System.out.print('Tax percentage is ' + taxPercentage)

double TaxCal = (NetTotal * taxPercentage) / 100

String formattedTaxC = String.format('%.2f', TaxCal)

double finalTaxC = Double.parseDouble(formattedTaxC)

System.out.print('Tax should be :' + finalTaxC)

//Total
double Total = NetTotal + finalTaxC

System.out.print('Total Amount :' + Total)

String tot = WebUI.getText(findTestObject('Stripe/Total_New_Plan'))

String totnum = tot.replaceAll('[^0-9]', '')

double totval = Integer.parseInt(totnum)

double TotalNewPlan = totval / 100

System.out.print('Total New plan charges= ' + TotalNewPlan)

if (Total == TotalNewPlan) {
    System.out.print('Test Passed :Total is correct ')
} else {
    KeywordUtil.markFailed('Test Failed : Total calculated incorrectly')
}

//Pro Rated New Plan Charge:
String PNPC = WebUI.getText(findTestObject('Stripe/Pro Rated New Plan Charge_Check'))

String PNPC_Numbers = PNPC.replaceAll('[^0-9]', '')

double PNPC_integerPart = Integer.parseInt(PNPC_Numbers)

double Protated_Charge = PNPC_integerPart / 100

System.out.print(Protated_Charge)

//if (Protated_Charge == 0.00) {
//    print('Test Passed : Downgrade plan has no charges ')
//} else {
//    KeywordUtil.markFailed('Showing incorrect amount for downgarde plan')
//}

//Pro Rated Old Plan Charge/Refund:
String POPR = WebUI.getText(findTestObject('Stripe/Pro_Rated_Old_Plan'))

String POPR_Numbers = POPR.replaceAll('[^0-9]', '')

double POPR_integerPart = Integer.parseInt(POPR_Numbers)

double Protated_Old_Charge = POPR_integerPart / 100

System.out.print(Protated_Old_Charge)

//Subtotal_RHS
double subtotal_rhs = Protated_Charge + Protated_Old_Charge

System.out.print('Subtotal_RHS= ' + subtotal_rhs)

double Tax_RHS = (subtotal_rhs * taxPercentage) / 100

String formattedTax = String.format('%.2f', Tax_RHS)

double finalTax = Double.parseDouble(formattedTax)

System.out.println(finalTax)

//Tax_RHS
System.out.print('Tax_RHS= ' + finalTax)

String Tax_check = WebUI.getText(findTestObject('Stripe/Tax_RHS_Check'))

String Tax_check_Numbers = Tax_check.replaceAll('[^0-9]', '')

double Tax_check_integerPart = Integer.parseInt(Tax_check_Numbers)

double Tax_RHS_Checkout = Tax_check_integerPart / 100

System.out.print(('Tax at RHS= ' + Tax_RHS_Checkout) + ' ')

//Total_RHS
double Total_RHS = subtotal_rhs + finalTax

System.out.print('Total_RHS= ' + Total_RHS)

String Tot_RHS = WebUI.getText(findTestObject('Stripe/Total_RHS_Check'))

String Tot_RHS_Numbers = Tot_RHS.replaceAll('[^0-9]', '')

double Tot_RHS_integerPart = Integer.parseInt(Tot_RHS_Numbers)

double Total_RHS_Check = Tot_RHS_integerPart / 100

System.out.print(Total_RHS_Check)

double tolerance = 0.10

double AmountDueNowCheck = Total_RHS_Check

System.out.print('Amount Due Now=' + AmountDueNowCheck)

WebUI.click(findTestObject('Stripe/Select_Payment_Method'))

String Amount_Payment = WebUI.getText(findTestObject('Stripe/Amount_Due_Now_PaymentPage'))

String Amount_Payment_Numbers = Amount_Payment.replaceAll('[^0-9]', '')

double Amount_Payment_integerPart = Integer.parseInt(Amount_Payment_Numbers)

double Amount_Due_Now_On_Payment_Page = Amount_Payment_integerPart / 100

System.out.print(Amount_Due_Now_On_Payment_Page)

if (AmountDueNowCheck == Amount_Due_Now_On_Payment_Page) {
    System.out.print('Test Passed: Amount Matched')
} else {
    System.out.print(((((('Test Failed: Amount MisMatched ' + 'Amount Due now on Checkout page=') + AmountDueNowCheck) + 
        ' ') + 'Amount due now on payment page=') + Amount_Due_Now_On_Payment_Page) + ' ')

    KeywordUtil.markFailed('Test Failed ')
}

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Stripe/Pay_Now'), 0)

WebUI.click(findTestObject('Stripe/Pay_Now'), FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.click(findTestObject('Stripe/Pay_Now'), FailureHandling.CONTINUE_ON_FAILURE)
//WebUI.click(findTestObject('Stripe/Pay_Now'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(20)

WebUI.verifyTextPresent('Plan Successfully upgraded!', false)

WebUI.verifyTextPresent('You have successfully upgraded your plan to the Monthly Accelerate', false)

WebUI.delay(5)

WebUI.click(findTestObject('Create_Engagement_Pravin/Engagement_List'))

WebUI.verifyTextPresent('Engagements', false)

