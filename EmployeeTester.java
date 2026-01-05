package com.constrator_19_09_24;

import java.util.Scanner;

public class EmployeeTester 
{

	public static void main(String[] args) 
	{
		
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter Name :");
		String name=sc.nextLine();
		System.out.print("Enter Age :");
		int age=sc.nextInt();
		System.out.print("Enter Department :");
		String department=sc.nextLine();
		sc.nextLine();
		System.out.print("Enter Salary :");
		double salary=sc.nextDouble();
		System.out.print("Enter Performance :");
		sc.nextLine();
		String performance=sc.nextLine();
		Employee scott=new Employee(name, age, department, salary,performance );
		System.out.println("================================================");
		scott.updateSalary();
		System.out.println(scott);
		sc.close();
		
		
	}

}
