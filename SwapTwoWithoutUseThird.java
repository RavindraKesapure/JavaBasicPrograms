package com.ravi.basicPrograms;

import java.util.*;
public class SwapTwoWithoutUseThird {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter the First number\n");
		a=sc.nextInt();
		System.out.println("Enter the Second number\n");
		b=sc.nextInt();
		System.out.println("Before Swapping number\n");
        System.out.println(a+"\t"+b);
				
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swapping number\n");
        System.out.println(a+"\t"+b);
		
	}

}
