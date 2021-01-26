package com.ravi.basicPrograms;

public class VariableProgram {

	 int i=10;//alwase access using the class name object  ->  Instance variable 
	 
	 static int s=20; //access anyware in the program  --> static variable
	 
	 public int x=10;
	 private int y=10;
	 protected int c=10; 
	 static int d=10;          // All variable declaire in the  globle 
	 volatile int e=10;
	 transient int f=10;
	 final int h=10;
	 
	public static void main(String[] args) {

		VariableProgram v=new VariableProgram();
		System.out.println(v.i);
		
		System.out.println(s);
		
		/*
		 * public int b=10; private int c=10; protected int d=10; static int e=10;
		 * volatile int f=10; transient int g=10;    NOt Allowoud  in method 
		 */
		
		final int h=10;  // this variable allow any ware
		
		
		int a=10;
		for(int j=1; j<3; j++)
		{
			final int u=20;
			a=a+j;
		}
		System.out.println(a);
		
		
		
		
		
		
		
		
	}

}
