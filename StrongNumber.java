package com.ravi.basicPrograms;

import java.util.*;
public class StrongNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n,sum=0,r;
		
		System.out.println("Enter the Number ");
		n=sc.nextInt();
		
		int temp=n;
		
		while(n>0)
		{
			r=n%10;
			int fact=1;
			
			for(int i=r; i>1; i--)
			{
				fact=fact*i;
			}
			
			sum= sum + fact;
			
			System.out.println("Sum is "+sum);
			n= n / 10;
			
		}
		
		if(temp==sum)
		{
			System.out.println(temp+" Number is Strong Number ");
		}
		else
		{
			System.out.println(temp+" Number is Not Strong Number");
		}
		
	}

}
