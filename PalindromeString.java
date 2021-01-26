package com.ravi.basicPrograms;

import java.util.*;
public class PalindromeString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str;
		int b,m,e,len=0;
		
		System.out.println("Enter the Palndrome String or not\n");
		str=sc.nextLine();
		
		len=str.length();
		
		while(len != 0)
		{
			len++;
		}
		
		e= len -1;
		m = len / 2;
		
		for(b=0; b<m; b++)
		{
			if(b != e) 
			{
				System.out.println("String is Not Polindrome\n");
				break;
			}
			
			e--;
			
		}
		if(b==m)
		{
			System.out.println("String is Palindrome\n");
		}
	}

}
