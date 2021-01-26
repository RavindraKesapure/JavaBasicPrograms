package com.ravi.basicPrograms;

import java.util.*;
public class PracticeProgram {
	
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter The row Size");
	 int row=sc.nextInt();
	 
	 for(int i=0; i<row; i++)
	 {
		 for(int k=row; i>=i; i--)
		 {
			 System.out.print(" ");
		 }
		 
		 int no=1;
		 for(int j=0; j<=i; j++)
		 {
			 System.out.print(no+"  ");
			 no= no * (i-j)/(j+1);
		 }
	 }
	 System.out.println();	
				  		
	}		
}
