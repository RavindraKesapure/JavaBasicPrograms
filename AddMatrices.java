package com.ravi.basicPrograms;

/**
 * This example explains how to create multidimentional array and sum it
 * multidimensional arrays
 */

import java.util.*;
public class AddMatrices {

	public static void main(String[] args) {
		
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int sum[][]=new int[3][3];
		
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

		
		System.out.println("\n\t Addition of two matrices\n");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				
				sum[i][j] = a[i][j] + b[i][j];
				
				System.out.print("\t "+sum[i][j]);
			}
			System.out.println();
		}

		
	}

}
