package com.constrator_19_09_24;

import java.util.Scanner;

public class InventoryMain 
{
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter Item Name : ");
	 String itemName=sc.nextLine();
	 //sc.nextLine();
	 System.out.print("Enter Price : ");
	 double pericePerUnit=sc.nextDouble();
	 System.out.print("Enter Quntity : ");
	 int quantityInStock=sc.nextInt();
	 InventoryItem Apple=new InventoryItem(itemName, pericePerUnit, quantityInStock);
	  if(pericePerUnit>0 && quantityInStock>0)
	  {
		  double total=0;
		  Apple.calculateTotalValue(total);
		  System.out.println(Apple);
	  }
	  else
	  {
		  System.err.println("Invalid Input ");
	  }
	 sc.close();
 }
}