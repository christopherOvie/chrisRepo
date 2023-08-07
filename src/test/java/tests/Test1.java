package tests;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Test1 {

	@Test
	public void reverseString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you are String :");
		String name = sc.nextLine();
		sc.close();
		String reverseName ="";
		int length = name.length();
		for(int i=length-1;i>=0;i--) {
			reverseName = reverseName+name.charAt(i);
		}
		System.out.println("your String reverse is: "+reverseName);
		
		
		
	}
	
}
