package com.ravi.basicPrograms;

public class PrintWitoutLoop {
	
	// Prints numbers from 1 to n 
    static void printNos(int n) 
    { 
        if(n > 0) 
        { 
            printNos(n - 1); 
            System.out.print(n + " "); 
        } 
        return; 
    } 

	public static void main(String[] args) {
		
		  printNos(10); 
		
	}

}
