package com.ravi.basicPrograms;

class Base 
{
    public void show()
    // public static void show()
    {
    	System.out.println("This is Base Class");
    }
}
class Derived extends Base
{
	public void show()
	// public static void show()
	{
		System.out.println("This is Derived CLass");
	}
	
}
public class InheritanceSimple {

	public static void main(String[] args) {

	//	Base b=new Base();
	//	Derived b=new Derived();
		
		Base b=new Derived();
		b.show();
	}

}
