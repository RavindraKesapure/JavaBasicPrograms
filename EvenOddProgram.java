package com.ravi.basicPrograms;

public class EvenOddProgram {

	public static void main(String[] args) {
		
		  removeDuplicateString("FOOOOOOOOLLLLLOWWWWWWWWWW UUUUP");
    }
		
		public static void removeDuplicateString(String input) {
	        String value1 = input;
	        String value2 = input;
	        String finalValue = "";
	        int count = 0;
	        char char1;
	        char char2 = 0;
	        for (int i = 0; i < value1.length(); i++) {
	         char1 = value1.charAt(i);
	            for (int j = 0; j < value2.length(); j++) {
	                char2 = value2.charAt(j);
	                if (char1 == char2) {
	                    count++;
	                }
	            }

	            if (count > 1) {
	                finalValue=finalValue+char1;
	                i=i+(count-1);
	            } else {
	                finalValue = finalValue + char1;
	            }
	            count = 0;
	        }
	        System.out.println(finalValue);
	    }
	}
