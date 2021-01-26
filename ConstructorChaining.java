package com.ravi.basicPrograms;

class A1
{
   A1()
   {   this(3);
	   System.out.println("Default Constructor");
   }
   A1(int x)
   {    this(3,5);
	   System.out.println("Value is "+x);
   }
   A1(int x,int y)
   {
	   System.out.println("Addition is "+(x+y));
   }
}

public class ConstructorChaining {

	public static void main(String[] args) {
		
		A1 a=new A1();	

	}

}
