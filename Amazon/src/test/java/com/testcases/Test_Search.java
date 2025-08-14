package com.testcases;

import org.testng.annotations.Test;

import com.BaseClass.Amazon_BaseClass;
import com.pages.Search_field;

public class Test_Search extends Amazon_BaseClass {
	
	@Test (priority=3 , description="to test the search functionality by enter mobile")
	public void SearchBar() throws InterruptedException
	{
		Search_field S1 = new Search_field(driver);
		S1.Search();
		
	}

}
