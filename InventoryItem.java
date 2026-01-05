package com.constrator_19_09_24;

public class InventoryItem
{
  private String name;
  private double pricePerUnit;
  private int quantityInStock;
  
  public InventoryItem(String name, double pricePerUnit, int quantityInStock) 
  {
	super();
	this.name = name;
	this.pricePerUnit = pricePerUnit;
	this.quantityInStock = quantityInStock;
  }
  double total;
  public double calculateTotalValue(double total)
  {
	   //double total1=0;
	   total= this.pricePerUnit*this.quantityInStock;
	   return total;
  }
@Override
public String toString() {
	return "InventoryItem [name=" + name + ", pricePerUnit=" + pricePerUnit + ", quantityInStock=" + quantityInStock
			+ ", total=" +total+"]";
}
  
  
}