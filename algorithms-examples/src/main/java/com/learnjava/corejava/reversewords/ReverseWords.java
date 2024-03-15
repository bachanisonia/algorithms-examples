package com.learnjava.corejava.reversewords;

import java.util.StringTokenizer;

public class ReverseWords {

	
	String[] outputStr;
	int lettercnt=0;
	
	public String reverseWordsInAString(String inputStr) {
		
		
		if (inputStr == null) {
			return "";
		}
		
		String [] inputStrArr = inputStr.split(" ");
		StringBuilder sb = new StringBuilder();
		
		//StringTokenizer st = new StringTokenizer(inputStr);
		
		for (int i= inputStrArr.length-1; i>=0; i--)
		{
			//outputStr[lettercnt]=inputStrArr[i];
			sb.append(inputStrArr[i]);
			
			lettercnt+=1;
		}
		
		System.out.println("The output string  is " + sb.toString());
		
		return sb.toString();
	}
	
	
	
	
}
