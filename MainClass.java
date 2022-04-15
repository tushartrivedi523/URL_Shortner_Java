package main;

import java.util.*;

public class MainClass extends URLShortnerClass {

	public static void main(String[] args) {
		URLShortnerClass shortner = new URLShortnerClass();
		Scanner sc = new Scanner(System.in);
		int choice;
		String originalURL = "";
		String changedURL = "";
		do
		{
		System.out.println("************************");
		System.out.println("  Choose which operation you wany to perform  ");
		System.out.println("  1. Shorten URL \n  2. Get Original URL \n  3. Exit");
		System.out.println("************************");

		choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter URL to Shorten: ");
			originalURL = sc.next();
			changedURL = shortner.convertToShortURL(originalURL);
			System.out.println("Shortned URL is : "+ changedURL);
			break;
		case 2:
			System.out.println("Enter Shorten URL: ");
			originalURL = sc.next();
			changedURL = shortner.convertToOriginalURL(originalURL);
			if(changedURL==null)
			{
				System.out.println("Original URL is not found");
			}
			else
			{
				System.out.println("Original URL : "+changedURL);
			}
			
			break;
		case 3:
			System.out.println("System Closing!!1");
			break;
		
		}
		}
		while(choice!=3);
		
	}

}
