import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.katalon.mobile.keyword.action.MobileAbstractActionKeyword
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.llm.keyword.LlmKeywords as LLM
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

TestData excelData = findTestData('Data Files/EraspaceApp/AutomationMobile')

for (int i = 1; i <= excelData.getRowNumbers(); i++) {
	String username     = excelData.getValue('username', i)
	String password     = excelData.getValue('password', i)
	String Namadepan    = excelData.getValue('Namadepan', i)
	String Namabelakang = excelData.getValue('Namabelakang', i)
	String Pilihnegara  = excelData.getValue('Pilihnegara', i)
	String Carinegara   = excelData.getValue('Carinegara', i)
	String Listnegara   = excelData.getValue('Listnegara', i)
	String Nohp         = excelData.getValue('Nohp', i)
	String Email        = excelData.getValue('Email', i)
	String Password     = excelData.getValue('Password', i)
	String Confirmpass  = excelData.getValue('Confirmpass', i)
	String Coderefral   = excelData.getValue('Coderefral', i)


Mobile.startExistingApplication('com.eraspace.app')
//Mobile.tap(findTestObject('Object Repository/01.MobileTest/01.btnDaftar'), 0)
//Mobile.setText(findTestObject('Object Repository/01.MobileTest/02.fldNamaDepan'), Namadepan, 0)
//Mobile.setText(findTestObject('Object Repository/01.MobileTest/03.fldNamaBelakang'), Namabelakang, 0)
//
//if (Pilihnegara == 'Y') {
//	Mobile.tap(findTestObject('Object Repository/01.MobileTest/04.btnCountry'), 0)
//	Mobile.setText(findTestObject('Object Repository/01.MobileTest/08.fldCariNegara'), Carinegara, 0)
//	Mobile.tap(findTestObject('Object Repository/01.MobileTest/05.listNegara', [('label') : Listnegara]), 0)
//}
//Mobile.setText(findTestObject('Object Repository/01.MobileTest/06.fldNoHandpone'), Nohp, 0)
//Mobile.setText(findTestObject('Object Repository/01.MobileTest/07.fldEmail'), Email, 0)
//Mobile.setText(findTestObject('Object Repository/01.MobileTest/09.fldPassword'),Password, 0)
//Mobile.pressBack()
////Mobile.scrollToText('Daftar')
//Mobile.setText(findTestObject('Object Repository/01.MobileTest/10.fldConfirmPass'), Confirmpass, 0)
//Mobile.pressBack()
//Mobile.setText(findTestObject('Object Repository/01.MobileTest/11.fldCoderefral'), Coderefral, 0)
//Mobile.pressBack()
//Mobile.tap(findTestObject('Object Repository/01.MobileTest/12.btnChekBoxDynamic', [('label') : 'Dengan mendaftar, kamu setuju dengan Syarat Ketentuan dan Kebijakan Privasi kami.']), 0)
//Mobile.tap(findTestObject('Object Repository/01.MobileTest/12.btnChekBoxDynamic', [('label') : 'Saya bersedia menerima info seputar produk dan promo menarik.']), 0)
//Mobile.scrollToText('Daftar')
//Mobile.tap(findTestObject('Object Repository/01.MobileTest/13.btnDaftar'), 0)

Mobile.tap(findTestObject('Object Repository/01.MobileTest/14.btnLogin'), 0)
Mobile.setText(findTestObject('Object Repository/01.MobileTest/06.fldNoHandpone'), username, 0)
Mobile.setText(findTestObject('Object Repository/01.MobileTest/09.fldPassword'), password, 0)
Mobile.tap(findTestObject('Object Repository/01.MobileTest/15.btnMasuk'), 0)
}
