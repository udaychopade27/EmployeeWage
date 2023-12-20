package com.bridgelabz.uc1;
import java.util.Random;

public class EmployeeWage {
	    static int wagePerHour = 20;
	    static int fullDayHours = 8;

    //Start 
	public static void main(String[] args) {
		 System.out.println("Welcome to Employee Wage Computations");
		 


	}
	//User case 1
	 static boolean checkEmployeeAttendance() {
		 boolean present=true;
		 Random random = new Random();
		 
		 if(present == random.nextBoolean()) {
			 System.out.println("employee is present");
		 }else
			 System.out.println("employee is absent");
		return present;
	 }
	 
	 //User case 2
	 static int calculateDailyWage() {
	        boolean attendance = checkEmployeeAttendance();
	        if (attendance == true) {
	            return wagePerHour * fullDayHours;
	        } else {
	            return 0;
	        }
	    }
	 //User case 3
	 

}
