package com.example
import groovy.json.JsonSlurper

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements
import org.openqa.selenium.By
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords


/**
 * The following prompt is for explaining a class with StudioAssist
 * 
 * Select the code -> Right-click -> StudioAssist -> Explain Code
 */

public class WebUICustomKeywords {
	/**
	 * Get all rows of HTML table
	 * @param table Katalon test object represent for HTML table
	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	 * @return All rows inside HTML table 
	 */
	@Keyword
	def List<WebElement> getHtmlTableRows(TestObject table, String outerTagName) {
		WebElement mailList = WebUiBuiltInKeywords.findWebElement(table)
		List<WebElement> selectedRows = mailList.findElements(By.xpath("./" + outerTagName + "/tr"))
		return selectedRows
	}

	/**
	 * Get all cells of HTML table row
	 * @param row a WebElement instance represent for HTML table row 
	 * @param tagName HTML column tag name, usually is TD/TH
	 * @return All cells inside HTML table row 
	 */
	@Keyword
	def List<WebElement> getHtmlTableColumns(WebElement row, String tagName) {
		List<WebElement> selectedColumns = row.findElements(By.tagName(tagName))
		return selectedColumns
	}
}