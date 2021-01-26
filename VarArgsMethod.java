package com.ravi.basicPrograms;

public class VarArgsMethod {
	
	 public static void sum(int ...x)
	 {
		 int total=0;
		 for(int i=0; i<x.length; i++)
		 {
			 total=total+x[i];
		 }
		 System.out.println(" Sum of Number is "+total);
	 }
	

	public static void main(String[] args)
	{
 
		 sum();
		 sum(10,20,30);
		 sum(0,2,95);
		 sum(5,6,8,8,6);
		
	}

}
