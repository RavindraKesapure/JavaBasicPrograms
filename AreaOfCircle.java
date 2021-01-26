package com.ravi.basicPrograms;

import java.util.*;
public class AreaOfCircle {

	public static void main(String[] args) {
		
		float pi=3.14f,area,rad;
		
		System.out.println("Enter the radius of circle\n");
		Scanner sc=new Scanner(System.in);
		
		rad=sc.nextFloat();
		
		area= pi * rad* rad;
		
		System.out.println("Area of Circle is "+area);

	}

}
