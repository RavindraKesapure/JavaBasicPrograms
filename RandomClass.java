package com.ravi.basicPrograms;

import java.util.*;
public class RandomClass {

	public static void main(String[] args) {

		Random ran=new Random();
	
		for(int i=1; i<=20; i++)
		{
		   int x=ran.nextInt(100);
		   System.out.println(x);
		}
	}

}
