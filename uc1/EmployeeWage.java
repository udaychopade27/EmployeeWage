package com.bridgelabz.uc1;

import java.util.Random;
public class EmployeeWage {
	    static int wagePerHour = 20;
	    static int fullDayHours = 8;
	    
	    
	public static void main(String[] args) {
		 System.out.println("Welcome to Employee Wage Computations");
		// TODO Auto-generated method stub
		 int dailyWage = calculateDailyWage();
	        System.out.println("UC 1 - Calculate Daily Employee Wage: " + dailyWage);

	        // UC 2
	        int partTimeWage = addPartTimeEmployee();
	        System.out.println("UC 2 - Add Part Time Employee & Wage: " + partTimeWage);

	        // UC 3
	        int switchCaseWage = wageUsingSwitchCase();
	        System.out.println("UC 3 - Solving using Switch Case Statement: " + switchCaseWage);

	        // UC 4
	        int monthlyWage = calculateMonthlyWage();
	        System.out.println("UC 4 - Calculating Wages for a Month: " + monthlyWage);

	        // UC 5
	        int[] result = calculateWagesTillCondition();
	        System.out.println("UC 5 - Calculate Wages till a condition: Total Working Hours: " + result[0] + ", Total Working Days: " + result[1]);

	        // UC 6
	        System.out.println("\nThank You");
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
	 
	 static int addPartTimeEmployee() {
	        int partTimeHours = 8;  // Assuming part-time hours are 8
	        return wagePerHour * partTimeHours;
	        		
	 }
	        
	 //User case 3
	 static int wageUsingSwitchCase() {
	        boolean attendance = checkEmployeeAttendance();
	        if (attendance) {
	        	return wagePerHour * fullDayHours;
	        }else {
	        	return 0;
	        }
	    }
	 // User case 4
	 static int calculateMonthlyWage() {
	        int workingDaysPerMonth = 20;
	        int monthlyWage = 0;

	        for (int day = 0; day < workingDaysPerMonth; day++) {
	            monthlyWage += calculateDailyWage();
	        }

	        return monthlyWage;
	    }
	 
	 //User case 5
	 static int[] calculateWagesTillCondition() {
	        int totalWorkingHours = 0;
	        int totalWorkingDays = 0;
	        int maxHours = 100;
	        int maxDays = 20;

	        while (totalWorkingHours < maxHours && totalWorkingDays < maxDays) {
	            totalWorkingHours += calculateDailyWage();
	            totalWorkingDays++;
	        }
	        int[] result = {totalWorkingHours, totalWorkingDays};
	        return result;
	      }
	 
}
