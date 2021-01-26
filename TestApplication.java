package com.ravi.basicPrograms;

import java.util.*;
public class TestApplication {

	public static void main(String[] args) {

		int a[]=new int[5];
		a[0]=1;
		a[1]=2;
		
		System.out.println(Arrays.toString(a));
		
		int b[][]=new int[3][3];
		
	     b[0][1]=10;
	     b[1][1]=20;
	     
	     System.out.println(Arrays.deepToString(b));
	}

}
