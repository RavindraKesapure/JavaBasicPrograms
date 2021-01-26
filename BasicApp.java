package com.ravi.basicPrograms;
public class BasicApp {
	
	public static void main(String x[])
	{
		String a=new String("ravi");
		String b=new String("ravi");
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		a=a+b;
		System.out.println(a);
		
		String h="ravi";
		String j="ravi";
		System.out.println(h==j);
		System.out.println(h.equals(j));
		
		int f=10;
		f=20;	
		System.out.println(f);
		
		String c="Ravindra";
		c="Kesapure";
		System.out.println(c);
	}

}
