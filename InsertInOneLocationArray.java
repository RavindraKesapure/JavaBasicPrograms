package com.ravi.basicPrograms;
import java.util.*;

public class InsertInOneLocationArray {

	public static void main(String[] args) {
		
		int a[]=new int[20];
		int n,value,loc;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Size");
		n=sc.nextInt();
		
		System.out.println("Enter "+n+" Element in Array");
		for(int i=0; i<n; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the Value U want To insert in Array ");
		value=sc.nextInt();
		
		System.out.println("Enter the location insert in Array ");
		loc=sc.nextInt();
		
		for(int i=n-1; i>=loc; i--)
		{
			a[i+1] = a[i];
		}
		
		a[loc]=value;
		
		System.out.println("After add Value In array");
		for(int i=0; i<n+1; i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
