package com.ravi.basicPrograms;

class A
{
   A()
   { System.out.println("I am constructor");
   }
  static
   { System.out.println("I am static block");
   }
  
  {
   System.out.println("I am non static block");
  }
}
public class StateTest
{
  public static void main(String x[])
   { 
     A a1=new A();
     A a2=new A();
   //  A a3=new A();
   }
}