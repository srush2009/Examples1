import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailVerifyRegex {
	public static void main(String[] args) {
		String str="nikhil";
		String regex="^[a-zA-Z].*[0-9]$";
		String regex1="(?=^[a-zA-Z-].*\\.[a-zA-Z]*$)(?=^[^@]*@[^@]*$)";
		
		
		new Regex_Test().checker(regex);
	}

}
class Regex_Test{
	public void checker(String Regex_Pattern) {
		System.out.println("Enter a String: ");
		Scanner sc=new Scanner(System.in);
		String Test_String=sc.nextLine();
		Pattern P=Pattern.compile(Regex_Pattern);
		Matcher M=P.matcher(Test_String);
		System.out.println(M.find());
	}
}
