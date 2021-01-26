package com.ravi.basicPrograms;

import java.util.*;
public class InsertOneArrayToAnother {

	public static void main(String[] args) {

		int a[]=new int[50];
		int b[]=new int[10];
		
		int loc,n,m;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the First Array Length");
		n=sc.nextInt();
		
		System.out.println("Enter "+n+" element in First Array");
		for(int i=0; i<n; i++)
		{
			a[i]=sc.nextInt();
		}
		
		
		System.out.println("Enter the Second Array Length");
		m=sc.nextInt();
		
		System.out.println("Enter "+m+" element in First Array");
		for(int i=0; i<m; i++)
		{
			b[i]=sc.nextInt();
		}
		
		System.out.println("Enter the Location You Want insert in second Array in First Array ");
		loc=sc.nextInt();
		
		for(int i=n-1; i>=loc; i--)
		{
			a[i+m]=a[i];
		}
		
		for(int i=0; i<m; i++)
		{
			a[loc+i]=b[i];
		}
		
		
		System.out.println("After add One To Two Array is ");
		for(int i=0; i<n+m; i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
