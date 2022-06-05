package BioData;

import java.util.Scanner;
import java.util.Arrays;

public class CheckStringNumber {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		String input_data=scan.nextLine();
		
		if(number(input_data)) {
			System.out.println("It is a number value "+input_data);
		}else {
			System.out.println("It is a string value "+input_data);
		}
		
		array();
		
		subsString(); 
		
	
	}
	public static boolean number(String str) {
		
		if(str==null) {
			return false;
		}
		try {
			double num=Double.parseDouble(str);
			return true;
		}catch(Exception test) {
			return false;
		}
		
		
		
	}
	
	
	public static void array() {
		String[] myArray={"apple","lichi","grape","banana","berry"};
		System.out.println("It is a string value "+Arrays.toString(myArray));
	}
	
	
	
	public static void subsString() {
		
		String str="my name is inonnahar";
		System.out.println("this is sub string"+ str.substring(7));
		System.out.println("this is sub string "+ str.substring(0,6));
	}

}
