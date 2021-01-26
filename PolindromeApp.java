package com.ravi.basicPrograms;

import java.util.*;
public class PolindromeApp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n,rev=0,temp;
		System.out.println("Enter the Polindrome number or not");
		n=sc.nextInt();
		
		temp=n;
		
		while(n!=0)
		{
			rev= rev * 10;
			rev = rev + n % 10;
			n= n / 10;
		}
		
		if(temp==rev)
		{
			System.out.println(temp + " Number is Polindrome");
		}
		else
		{
			System.out.println(temp+" Number is Not Polindrome");
		}
		
	}

}
