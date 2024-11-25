import java.util.*; 

class Calculator {
    // Method to perform addition (this can be overridden by subclasses)
    public double calculate(double a, double b) {
        return 0;
    }
}

// Adder class extends Calculator and implements addition
class Adder extends Calculator {
    @Override
    public double calculate(double a, double b) {
        return a + b;
    }
}

// Multiplier class extends Calculator and implements multiplication
class Multiplier extends Calculator {
    @Override
    public double calculate(double a, double b) {
        return a * b;
    }
}

// Subtractor class extends Calculator and implements subtraction
class Subtractor extends Calculator {
    @Override
    public double calculate(double a, double b) {
        return a - b;
    }
}

// Divider class extends Calculator and implements division
class Divider extends Calculator {
    @Override
    public double calculate(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN; // Return "Not-a-Number" if division by zero occurs
        }
        return a / b;
    }
}



public class MainCalc {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter first number: ");
	        double num1 = sc.nextDouble();
	        
	        System.out.println("Enter second number: ");
	        double num2 = sc.nextDouble();
	        
	        System.out.println("Choose operation:");
	        System.out.println("1. Add");
	        System.out.println("2. Multiply");
	        System.out.println("3. Subtract");
	        System.out.println("4. Divide");
	        int choice = sc.nextInt();
	        
	        Calculator calculator = null;
	        
	        switch (choice) {
	            case 1:
	                calculator = new Adder();
	                break;
	            case 2:
	                calculator = new Multiplier();
	                break;
	            case 3:
	                calculator = new Subtractor();
	                break;
	            case 4:
	                calculator = new Divider();
	                break;
	            default:
	                System.out.println("Invalid choice.");
	                return; // Exit if invalid choice
	        }
	        
	        // Perform the calculation
	        double result = calculator.calculate(num1, num2);
	        System.out.println("Result: " + result);

	        sc.close(); // Close the scanner to avoid resource leak
	    }

}