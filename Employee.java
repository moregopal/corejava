package com.constrator_19_09_24;

public class Employee
{
  private String name;
  private int age;
  private String department;
  private double salary;
  private String performance;
   Employee(String name ,int age ,String department,double salary,String performance)
  {
    super();
    this.name=name;
    this.age=age;
    this.department=department;
    this.salary=salary;
    this.performance=performance;

  }
   public double updateSalary()
   {
	  
	   if(this.performance.equals("good"))
	   {
		  return this.salary+=10000;
		   
	   }
	   else if(this.performance.equals("avrage"))
	   {
		   return this.salary+=5000;
		   //System.out.println(salary);
	   }
	   else
	   {
		   //System.out.println("No Bonus");
		   return salary;
	   }
	   
   }
@Override
public String toString() {
	return "Employee [name=" + name + ", age=" + age + ", department=" + department + ", salary=" + salary
			+ ", performance=" + performance + "]";
}
   

}
   

