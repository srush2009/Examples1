import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;


//class name is Result
public class ErrorLossQuestions {
	/* Complete the 'extractErrorLogs' function below
	 * 
	 * The function is expected to return a 2D_STRING_ARRAY
	 * The function accepts 2D_STRING_ARRAY logs as parameter 
	 */

	public static List<List<String>> extractErrorLogs (List<List<String>> logs){
		List<List<String>> errorLogs=new ArrayList<>();
		for(List<String> log:logs) {
			if((log.get(2).equals("ERROR")||log.get(2).equals("CRITICAL"))){
				errorLogs.add(log);
			}
		}
		Collections.sort(errorLogs,new Comparator<List<String>>(){
			@Override
			public int compare(List<String> log1,List<String> log2) {
				SimpleDateFormat dateFormat=new SimpleDateFormat("dd_MM_yyyyHH:mm");
				
				try {
					Date date1=dateFormat.parse(log1.get(0)+" "+log1.get(1));
					Date date2=dateFormat.parse(log2.get(0)+" "+log2.get(1));
					return date1.compareTo(date2);
				}
				catch(ParseException e){
					e.printStackTrace();
					return 0;
					
				}
			}
		});
		return errorLogs;
	}
}

