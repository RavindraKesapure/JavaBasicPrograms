package com.ravi.basicPrograms;
public class RecursionInDirect {

	int n=1;
	
    public void odd()
	{
		if(n <= 10)
		{
			System.out.println(n+1);
			n++;
			even();
		}
		return;
	}
    
    public void even()
    {
    	if(n <= 10)
    	{
    		System.out.println(n-1);
    		n++;
    		odd();
    	}
    	
    }	
	
	public static void main(String[] args) {

		RecursionInDirect sr=new RecursionInDirect();
		sr.odd();
	}

}
