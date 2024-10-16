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

'This Script covers reating template report from master library.'
WebUI.navigateToUrl('https://platform.countable.co/login')

WebUI.maximizeWindow()

WebUI.waitForElementPresent(findTestObject('Page_UAT (Countable)/EmailElement'), 5)

WebUI.setText(findTestObject('Page_UAT (Countable)/EmailElement'), EmailLogin)

WebUI.setEncryptedText(findTestObject('Page_UAT (Countable)/Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Page_UAT (Countable)/span_Login'))

WebUI.delay(3)

WebUI.waitForElementClickable(findTestObject('Add_Firm_Template/Template_Button_Dashboard'), 10)

WebUI.click(findTestObject('Add_Firm_Template/Template_Button_Dashboard'))

WebUI.waitForElementPresent(findTestObject('Report_Master_Firm_Inside_Engagement/Firm_Template_Drop_Dwn'), 10)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Firm_Template_Drop_Dwn'))

WebUI.waitForElementPresent(findTestObject('Report_Master_Firm_Inside_Engagement/Report_Section_Firm_Temp'), 10)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Report_Section_Firm_Temp'))

WebUI.waitForElementClickable(findTestObject('Report_Master_Firm_Inside_Engagement/Report_Section_Master_Lib'), 10)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Report_Section_Master_Lib'))

WebUI.delay(3)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Master_Report_Compilation_Drp_Dwn'))

WebUI.delay(2)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Enagegement_Report_Comp_M_Lib'))

WebUI.delay(3)

String Eng_Repo_Content = WebUI.getText(findTestObject('Report_Master_Firm_Inside_Engagement/Enagement_Report_Content_M_Lib'))

Eng_Repo_Content = Eng_Repo_Content.replaceAll('\\s+', '')

println(Eng_Repo_Content)

WebUI.verifyEqual(Eng_Repo_Content, 'HeadergoeshereToManagementofEntityNameOnthebasisofinformationprovidedbymanagement,wehavecompiledtheBalanceSheetofEntityNameasatYearEndDate(CY),theStatementofIncomeandRetainedEarningsfortheyearthenended,andNoteX,whichdescribesthebasisofaccountingappliedinthepreparationofthecompiledfinancialinformation(“financialinformation”).Managementisresponsiblefortheaccompanyingfinancialinformation,includingtheaccuracyandcompletenessoftheunderlyinginformationusedtocompileitandtheselectionofthebasisofaccounting.WeperformedthisengagementinaccordancewithCanadianStandardonRelatedServices(CSRS)4200,CompilationEngagements,whichrequiresustocomplywithrelevantethicalrequirements.Ourresponsibilityistoassistmanagementinthepreparationofthefinancialinformation.Wedidnotperformanauditengagementorareviewengagement,norwerewerequiredtoperformprocedurestoverifytheaccuracyorcompletenessoftheinformationprovidedbymanagement.Accordingly,wedonotexpressanauditopinionorareviewconclusion,orprovideanyformofassuranceonthefinancialinformation.Readersarecautionedthatthefinancialinformationmaynotbeappropriatefortheirpurposes.Practitioner\'sSignatureDateofReportCompleteAddressFootergoeshere')

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Create_Firm_Temp_Eng_Report'))

WebUI.delay(3)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Create_New_Folder_CB'))

WebUI.delay(1)

WebUI.setText(findTestObject('Report_Master_Firm_Inside_Engagement/Set_New_Folder_Name'), 'New_Eng_Folder_Firm_Temp')

WebUI.delay(2)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Copy_Btn_To_Create_Firm_Template'))

WebUI.delay(3)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Firm_Template_Section'))

WebUI.delay(2)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Created_Eng_Report_Drp_Dwn_Firm_Temp'))

WebUI.delay(2)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Enagegement_Report_Comp_M_Lib'))

String Eng_Repo_Content_F_Temp = WebUI.getText(findTestObject('Report_Master_Firm_Inside_Engagement/Enagement_Report_Content_M_Lib'))

Eng_Repo_Content_F_Temp = Eng_Repo_Content_F_Temp.replaceAll('\\s+', '')

println(Eng_Repo_Content_F_Temp)

WebUI.delay(2)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Report_Section_Master_Lib'))

WebUI.delay(2)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Mater_Lib_Report_Review_Drp_Dwn'))

WebUI.delay(2)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Master_Lib_Review_Report1'))

WebUI.delay(2)

String report1_content = WebUI.getText(findTestObject('Report_Master_Firm_Inside_Engagement/Review_Report_1_Content'))

println(report1_content)

report1_content = report1_content.replaceAll('\\s+', '')

WebUI.verifyEqual(report1_content, 'HeadergoeshereAddressee-ManagementofEntityNameWehavereviewedtheaccompanyingfinancialstatementsofEntityName(theCompany)thatcomprisetheBalanceSheetasatYearEndDate(CY),andtheStatementofIncomeandRetainedEarningsfortheyearthenended,andasummaryofsignificantaccountingpoliciesandotherexplanatoryinformation.Management\'sResponsibilityfortheFinancialStatementsManagementisresponsibleforthepreparationandfairpresentationofthesefinancialstatementsinaccordancewithCanadianaccountingstandardsforprivateenterprises,andforsuchinternalcontrolasmanagementdeterminesisnecessarytoenablethepreparationoffinancialstatementsthatarefreefrommaterialmisstatement,whetherduetofraudorerror.Practitioner\'sResponsibilityOurresponsibilityistoexpressaconclusionontheaccompanyingfinancialstatementsbasedonourreview.WeconductedourreviewinaccordancewithCanadiangenerallyacceptedstandardsforreviewengagements,whichrequireustocomplywithrelevantethicalrequirements.AreviewoffinancialstatementsinaccordancewithCanadiangenerallyacceptedstandardsforreviewengagementsisalimitedassuranceengagement.Thepractitionerperformsprocedures,primarilyconsistingofmakinginquiriesofmanagementandotherswithintheentity,asappropriate,andapplyinganalyticalprocedures,andevaluatestheevidenceobtained.Theproceduresperformedinareviewaresubstantiallylessinextentthan,andvaryinnaturefrom,thoseperformedinanauditconductedinaccordancewithCanadiangenerallyacceptedauditingstandards.Accordingly,wedonotexpressanauditopiniononthesefinancialstatements.ConclusionBasedonourreview,nothinghascometoourattentionthatcausesustobelievethatthefinancialstatementsdonotpresentfairly,inallmaterialrespects,thefinancialpositionoftheCompanyasatYearEndDate(CY),andtheresultsofitsoperationsanditscashflowsfortheyearthenendedinaccordancewithCanadianaccountingstandardsforprivateenterprises.FootergoeshereHeadergoesherePractitioner\'sSignatureDateofReportCompleteAddressFootergoeshere')

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Master_Lib_Review_Report2'))

WebUI.delay(3)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Master_Lib_Review_Report3'))

WebUI.delay(3)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Master_Lib_Review_Report4'))

WebUI.delay(3)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Master_Lib_Review_Report5'))

WebUI.delay(3)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Master_Lib_Review_Report6'))

WebUI.delay(4)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Master_Lib_Review_Report1'))

WebUI.delay(2)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Create_Firm_Temp_Eng_Report'))

WebUI.delay(3)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Create_New_Folder_CB'))

WebUI.delay(1)

WebUI.setText(findTestObject('Report_Master_Firm_Inside_Engagement/Set_New_Folder_Name'), 'New_Review_Folder_Firm_Temp')

WebUI.delay(2)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Copy_Btn_To_Create_Firm_Template'))

WebUI.delay(3)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Firm_Template_Section'))

WebUI.delay(2)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Open_New_Copy_Firm_Folder'))

WebUI.delay(2)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Master_Lib_Review_Report1'))

WebUI.delay(3)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Report_Section_Master_Lib'))

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Mater_Lib_Report_Review_Drp_Dwn'))

WebUI.delay(2)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Select_All_Review_Reoprt_CB'))

WebUI.waitForElementClickable(findTestObject('Report_Master_Firm_Inside_Engagement/Firm_Template_Copy_Icon'), 10)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Firm_Template_Copy_Icon'))

WebUI.delay(3)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Create_New_Folder_CB'))

WebUI.delay(1)

WebUI.setText(findTestObject('Report_Master_Firm_Inside_Engagement/Set_New_Folder_Name'), 'All_Review_Report_Master_Lib')

WebUI.delay(2)

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Add_Button_Create_New_Folder'))

WebUI.click(findTestObject('Report_Master_Firm_Inside_Engagement/Firm_Template_Section'))

WebUI.delay(4)

WebUI.closeBrowser()

