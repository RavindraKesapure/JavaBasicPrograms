package com.ravi.basicPrograms;
import java.util.*;
public class AddValue {

	public static void main(String[] args) {

		 int n,min,max,rem;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the Number");
		 n=sc.nextInt();
		 rem=n%10;
		 min=rem;
		 max=rem;
		 while(n > 0)
		 {
			 rem=n%10;
			 n=n/10;
			 
			 if(rem > max)
			 {
				 max=rem;
			 }
			 
			 if(rem < min)
			 {
				 min=rem;
			 }		 
		 }
		 
		 System.out.println(max +" "+min);	 
		 System.out.println("Max Min Addition is "+(min+max));		 
	}
}
