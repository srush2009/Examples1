import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PassRegex {

	public static void main(String[] args) {
		// Event regex is used, but for testing password pattern, we can use regex for password validation
		String regex="^(?=.*[a-z])(?=.*[A-Z])(?=.*[@$#])(?=\\S+$).{6,12}$";
		// Event regex (this pattern matches SPC event code format)
		String eventRegex="([S][P][C][0-9]{3}(0[0-9]|1[0-2])(AM|PM))";
		
		// Call the checker method with the eventRegex or password regex 
		new Regex_Test1().checker(regex);
//		new Regex_Test1().checker(eventRegex);
	}

}

class Regex_Test1{
	public void checker(String Regex_Pattern) {
		System.out.println("Enter a String: ");
		Scanner sc = new Scanner(System.in);
		String Test_String = sc.nextLine();
		sc.close();
		
		Pattern P = Pattern.compile(Regex_Pattern);
		Matcher M = P.matcher(Test_String);
		
		// Change M.find() to M.matches() for full match
        System.out.println(M.matches());
	}
}
