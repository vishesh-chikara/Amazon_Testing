package com.testcases;

import org.testng.annotations.Test;

import com.BaseClass.Amazon_BaseClass;
import com.pages.Search_Bar;

public class TypeSearch extends Amazon_BaseClass {
	
	@Test (priority=2 , description="to test the search functionality by enter mobile")
	public void SearchBar() 
	{
		Search_Bar S1 = new Search_Bar(driver);
		S1.Search();
		
	}

}
