package com.nitin.driver;

import com.nitin.balancebrackets.BalancedBrackets;

public class Driver {

	public static void main(String[] args) {
		//BalancedBrackets balancedBrackets = new BalancedBrackets();
		String bracketExp = "([[]]";
	
		Boolean result;
		
		result = BalancedBrackets.areBracketsBalanced(bracketExp);
        
		if (result)
			System.out.println("The entered String has Balanced Brackets"); 
		else
			System.out.println("The entered Strings do not contain Balanced Brackets ");
	 

	}
	}