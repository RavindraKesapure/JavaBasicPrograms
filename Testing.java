package com.ravi.basicPrograms;

public class Testing {
	  public static void main(String[] args) {
	  
		  int count=0,p=0,row=5;
		  for(int i=0; i<row; i++)
		  {
			   count=1;
			   p=0;
			  for(int j=row; j>i; j--)
			  {
				  if(j>=row- i)
				  {
					  System.out.print(count+" ");
					  count=count*(i-p)/(p+1);
					  p++;
				  }
				  else
				  {
					  System.out.print(" ");
				  }
			  }
			  System.out.println();
		  }
	  }
	 
	

}
