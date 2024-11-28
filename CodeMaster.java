import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodeMaster {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a String: ");
		String str=sc.nextLine();
		if(str.length()!=8) 
			System.out.println("Error in length");
		else if(!Pattern.compile("(^#.*$)").matcher(str).find())
			System.out.println("Error in #");
		else if(!Pattern.compile("(^#[A-Z]{4}.*$)").matcher(str).find())
			System.out.println("Error in caps alpha");
		else if(!Pattern.compile("(^.....[0-9]{3}$)").matcher(str).find())
			System.out.println("Error in number last ");
		else
			System.out.println("String valid");
		}
		
}
class Regex_Test2{
	public void checker(String Regex_Pattern) {
		System.out.println("Enter the string: ");
		Scanner input=new Scanner(System.in);
		String Test_String=input.nextLine();
		Pattern P=Pattern.compile(Regex_Pattern);
		Matcher m=P.matcher(Test_String);
		System.out.println(m.find());
	}
	
}




