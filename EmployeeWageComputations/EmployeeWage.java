package com.bridgelabz.uc1;
import java.util.Random;
public class EmployeeWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  boolean present = true;
	         Random random = new Random();
	         
	         if(present == random.nextBoolean()) {
	        	 System.out.println("Employee is Present");
	         }
	         else
	        	 System.out.println("Employee is Absent");
		}
	}

