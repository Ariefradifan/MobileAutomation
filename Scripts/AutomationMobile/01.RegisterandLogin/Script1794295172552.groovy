import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
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
Mobile.startExistingApplication('com.eraspace.app')
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
	
	try {
//	CustomKeywords.'automationMobile.EraspaceAPP.RegisterApp'(username, password, Namadepan, Namabelakang, 
//		                                                      Pilihnegara, Carinegara, Listnegara, Nohp, Email, 
//															  Password, Confirmpass, Coderefral)
	CustomKeywords.'automationMobile.EraspaceAPP.loginApp'(username, Password)
	}catch (Exception e) {
		Mobile.takeScreenshot()
		Mobile.comment('Error occurred: ' + e.message)
		Mobile.closeApplication()
	}finally {
	   Mobile.delay(3)
	   Mobile.closeApplication()
      }
}
