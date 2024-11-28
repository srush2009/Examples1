import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//class name is NetProfitCalculator
public class QuantitativeTraining {
	public static List<Long> getNetProfit(List<String>events){
		HashMap<String,Integer> portfolio=new HashMap<>();
		long Profit=0;
		List<Long> result=new ArrayList<>();
		
		for(String event:events) {
			String[] words=event.split(" ");
			switch(words[0]) {
			case "BUY":
				String Stock=words[1];
				int quantity=Integer.parseInt(words[2]);
				portfolio.put(Stock,portfolio.getOrDefault(Stock,0)+quantity);
				break;
				
			case "SELL":
				Stock=words[1];
				quantity=Integer.parseInt(words[2]);
				portfolio.put(Stock,portfolio.get(Stock)-quantity);
				break;
				
			case "CHANGE":
				Stock=words[1];
				int priceChange=Integer.parseInt(words[2]);
				Profit+=priceChange*portfolio.getOrDefault(Stock, 0);
				break;
				
			case "QUERY":
				result.add(Profit);
				break;
			}
			
		}return result;
	}

}
