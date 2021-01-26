package com.ravi.basicPrograms;

import java.util.*;
public class DeleteAnOneArrayElement {

	public static void main(String[] args) {

		int a[]=new int[20];
		int loc,n;
		System.out.println("Enter the Array Length");
		
		Scanner sc=new Scanner(System.in);
		
		n=sc.nextInt();
		
		System.out.println("Enter "+n+" Element in Array");
		for(int i=0; i<n; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the Delete Location");
		loc=sc.nextInt();
		
		for(int i=loc; i<n; i++)
		{
			a[i]=a[i+1];
		}
		
		System.out.println("Enter the After delete Array Value");
		for(int i=0; i<n-1; i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
