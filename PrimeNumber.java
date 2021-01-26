package com.ravi.basicPrograms;

import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n,a=2;
		
		System.out.println("Enter the number\n");
		n=sc.nextInt();
		
		for(a=2; a<n; a++)
		{
			if(n%a==0)
			{
				System.out.println( n+" Number is not Prime Number");
				break;
			}
		}
		if(a==n)
		{
			System.out.println(n+ " Number is A prime");
		}
		
		

	}

}
