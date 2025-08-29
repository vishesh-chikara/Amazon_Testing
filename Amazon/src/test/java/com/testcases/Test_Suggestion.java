package com.testcases;

import org.testng.annotations.Test;
import com.BaseClass.Amazon_BaseClass;
import com.pages.Suggestion_Page;

public class Test_Suggestion extends Amazon_BaseClass {
	
	@Test(priority = 4, description = "tO Verify the suggestions under search fields")
	public void ValidateSuggestion() throws InterruptedException
	{
		Suggestion_Page S1 = new Suggestion_Page();
		S1.verifySearchSuggestions();
		
		
		
	}

	
}
