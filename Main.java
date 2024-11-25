

import java.util.ArrayList;
import java.util.List;

//Abstract class with inheritance

abstract class Employee {
  // Attributes
  protected int salary;
  protected String grade;

  // Abstract methods
  abstract void setSalary(int salary);  // Method to set the salary
  abstract int getSalary();             // Method to get the salary
  abstract void setGrade(String grade); // Method to set the grade
  abstract String getGrade();           // Method to get the grade

  // Concrete method to print employee data
  public void label() {
      System.out.println("Employee Data:");
      System.out.println("Salary: " + getSalary());
      System.out.println("Grade: " + getGrade());
  }
}
  
  class Engineer extends Employee {
  	private int salary;
  	private String grade;
      // Implementing the abstract methods
  	
  	public Engineer(int salary, String grade) {
          this.salary = salary;
          this.grade = grade;
      }

      @Override
      void setSalary(int salary) {
          this.salary = salary;  // Set the salary value
      }

      @Override
      int getSalary() {
          return salary;    // Return the current salary value
      }

      @Override
      void setGrade(String grade) {
          this.grade = grade;    // Set the grade value
      }

      @Override
      String getGrade() {
          return grade;     // Return the current grade value
      }

	public void display() {
		System.out.println("Employee's data:\n"+"GRADE: "+grade+"\nSALARY: "+salary);
	}
  }
  
  class Manager extends Employee{
	  private int salary;
	  private String grade;
	  
	  public Manager(int salary, String grade) {
		super();
		this.salary = salary;
		this.grade = grade;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	public void display() {
		System.out.println("Manager's data:\n"+"GRADE: "+grade+"\nSALARY: "+salary);
	}
  }
  
	public class Main {
		public static void main(String[] args) {
			// Create an Engineer object
			List<Engineer> engineer=new ArrayList<>();
			engineer.add(new Engineer(80000,"A"));
			engineer.add(new Engineer(75000,"B"));
			
			for(Engineer eng:engineer) {
				eng.display();
			}
  
			List<Manager> manager=new ArrayList<>();
			manager.add(new Manager(800000,"A+"));
			manager.add(new Manager(750000,"A"));
			
			for(Manager mng:manager) {
				mng.display();
			}


			
          
      }
  }
 
