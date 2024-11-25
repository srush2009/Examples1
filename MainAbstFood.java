
abstract class Food{
	double proteins;
	double fats;
	double carb;
	double tastyScore;
	
	public abstract void getMacroNutrients();
}
class Egg extends Food{
	public Egg(double proteins, double fats, double carb) {
		this.proteins = proteins;
		this.fats = fats;
		this.carb = carb;
	}
	int tastyScore = 7;
	String type = "NonVeg";

	@Override
	public void getMacroNutrients() {
		System.out.println("Egg has "+ this.proteins + "gm");
		
	}
}
class Bread extends Food{
	public Bread(double proteins, double fats, double carb) {
		this.proteins = proteins;
		this.fats = fats;
		this.carb = carb;
	}
	int tastyScore = 8;
	String type = "Veg";
	@Override
	public void getMacroNutrients() {
		System.out.println("Egg has "+ this.proteins + "gm");
		}
}

public class MainAbstFood {
	public static void main(String[] args) {
		Egg egg = new Egg(8.9, 4.5, 5.5);
		egg.getMacroNutrients();
	}

}

/*
 package quesBank2;

abstract class Food {
    double proteins;
    double fats;
    double carb;
    double tastyScore;

    // Abstract method to get macronutrients details
    public abstract void getMacroNutrients();

    // Method to display tasty score
    public abstract void getTastyScore();
}

class Egg extends Food {
    
    // Constructor to initialize the macronutrients
    public Egg(double proteins, double fats, double carb) {
        this.proteins = proteins;
        this.fats = fats;
        this.carb = carb;
        this.tastyScore = 7; // Default tasty score
    }

    // Override the getMacroNutrients method
    @Override
    public void getMacroNutrients() {
        System.out.println("Egg has: ");
        System.out.println(this.proteins + " grams of Proteins");
        System.out.println(this.fats + " grams of Fats");
        System.out.println(this.carb + " grams of Carbs");
    }

    // Override the getTastyScore method
    @Override
    public void getTastyScore() {
        System.out.println("Tasty Score of Egg: " + this.tastyScore);
    }

    // Additional property to represent the type of food
    String type = "NonVeg";
}

public class MainAbstFood {
    public static void main(String[] args) {
        // Create an Egg object with some sample macronutrient values
        Egg egg = new Egg(6.3, 5.0, 1.1); // Example: 6.3 gm protein, 5 gm fats, 1.1 gm carbs

        // Display details about the Egg
        System.out.println("Food Type: " + egg.type);
        egg.getMacroNutrients();
        egg.getTastyScore();
    }
}
 
 */