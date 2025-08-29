package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.BaseClass.Amazon_BaseClass;

public class Suggestion_Page extends Amazon_BaseClass {

	public void verifySearchSuggestions() throws InterruptedException {

	

		// Step 1: Enter input in the search bar
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("iPhone");

		// Step 2: Wait for suggestions to load
		Thread.sleep(3000); // Can be replaced by explicit wait

		// Step 3: Capture all suggestions
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));

		// Step 4: Print and validate number of suggestions
		int suggestionCount = suggestions.size();
		System.out.println("Number of suggestions: " + suggestionCount);

		// Example: Assert at least 3 suggestions should appear
		Assert.assertTrue(suggestionCount >= 3, "Suggestions are less than expected!");

		// Print all suggestion text
		for (WebElement suggestion : suggestions) {
			System.out.println(suggestion.getText());
		}
	}

}
