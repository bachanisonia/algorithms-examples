package com.learnjava.corejava.reversewords;

import java.util.Scanner;

import com.learnjava.corejava.reversewords.ReverseWords;

public class ReverseWordsExample {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the input String : ");
		
		String inputString = scan.nextLine();
		
		ReverseWords rw = new ReverseWords();
		rw.reverseWordsInAString(inputString);
		
	}

}
