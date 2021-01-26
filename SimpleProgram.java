package com.ravi.basicPrograms;

import java.util.*;
public class SimpleProgram {
	  public static void main(String[] args) {

		   Scanner sc=new Scanner(System.in);
		   int a[]=new int[5],temp;
		   System.out.println("Enter the Array Element");
		   for(int i=0; i<5; i++)
		 {
			 a[i]=sc.nextInt();
		 }
		   
		   for(int i=0; i<5; i++)
		   {
			   for(int j=i+1; j<5; j++)
			   {
				   if(a[i] < a[j])
				   {
				         temp=a[i];
				         a[i]=a[j];
				         a[j]=temp;
				   }
			   }
		   }
		
		   System.out.println("Second Large Number is");
		   System.out.println(a[1]);
		
	}

}
