import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract class Food{
	abstract String method();
	double protein;
	double fat;
	double carbohydrate;
	int typecasting;
}
class Egg extends Food{
	String type;
public Egg() {
}
public Egg(double protein,double fat,double carbohydrate) {
	this.protein=protein;
	this.fat=fat;
	this.carbohydrate=carbohydrate;
	this.typecasting=7;
	this.type="Vegatarian";
	}
	@Override
	String method() {
		double calories=5*(this.protein+this.carbohydrate)+9*this.fat;
		return String.format("%.2f", calories);
	}
	
}
class Fish extends Food{
	String type;
	
	public Fish(double protein,double fat,double carbohydrate) {
		this.protein=protein;
		this.fat=fat;
		this.carbohydrate=carbohydrate;
		this.typecasting=15;
		this.type="non-vegatarian";
	}
	@Override
	String method() {
		double calories=5*(this.protein+this.carbohydrate)+9*this.fat;
		return String.format("%.2f", calories);
	}
}
public class FoodMaster {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		double protein=Double.parseDouble(bufferedReader.readLine().trim());
		double fat=Double.parseDouble(bufferedReader.readLine().trim());
		double carbohydrate=Double.parseDouble(bufferedReader.readLine().trim());
		
		Egg egg=new Egg(protein,fat,carbohydrate);
		Fish fish=new Fish(protein,fat,carbohydrate);
		System.out.println(egg.method());
		System.out.println(fish.method());
		
		bufferedReader.close();
	}

}
