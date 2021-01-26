package com.ravi.basicPrograms;

import java.util.*;
public class PerfectNumber {

	public static void main(String[] args) {

		int n,sum=0,temp;
		System.out.println("Enter the Number ");
		
		Scanner sc=new Scanner(System.in);
		
		n=sc.nextInt();
		temp=n;
		for(int i=1; i<n; i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		
		if(temp==sum)
		{
			System.out.println(n+ " is a Perfect Number");
		}
		else
		{
			System.out.println(n+ " is Not A Perfect Number");
		}
		
	}

}
