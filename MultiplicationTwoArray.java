package com.ravi.basicPrograms;

import java.util.*;
public class MultiplicationTwoArray {

	public static void main(String[] args) {
		
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int sum[][]=new int[3][3];
		int val=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first 3 * 3 matrics value\n");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter the Second 3 * 3 matrics value\n");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				b[i][j]=sc.nextInt();
			}
		}

		
		System.out.println("\n\t Multiplication of two matrices\n");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				for(int k=0; k<3; k++)
				{
				   
					val = val + a[i][k] * b[k][j];	
				}

				sum[i][j]=val;
                val=0;
			}
			
		}
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				
			  System.out.print("\t "+sum[i][j]);
			}
			System.out.println();
		}



	}

}
