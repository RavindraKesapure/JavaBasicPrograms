package com.ravi.basicPrograms;
public class PracticeApp {

	public static void main(String x[])
	{
		System.out.println("Interface App");
		Deriveds d=new Deriveds();
		d.disp();
		d.show();
		d.in();
	}
	
   	void in()
	{
		System.out.println("Main Method");
	}
}
interface Base2
{
	public void disp();
}
interface base4
{
	public void show();
}
class Deriveds extends PracticeApp implements Base2,base4
{

	@Override
	public void show() {
System.out.println("Base2 ....");		
	}

	@Override
	public void disp() {
		System.out.println("base 4");
		
	}
	

}
