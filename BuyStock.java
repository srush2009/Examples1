import java.util.*;
	 
public class BuyStock {
	 
	    public static List<Long> getNetProfit(String[] events) {
	        Map<String, Stock> portfolio = new HashMap<>();
	        long profit = 0;
	        List<Long> result = new ArrayList<>();
	 
	        for (String event : events) {
	            String[] parts = event.split(" ");
	            String action = parts[0];
	 
	            if (action.equals("BUY")) {
	                String stock = parts[1];
	                int quantity = Integer.parseInt(parts[2]);
	                portfolio.putIfAbsent(stock, new Stock(0, 0));
	                Stock currentStock = portfolio.get(stock);
	                currentStock.quantity += quantity;
	 
	            } else if (action.equals("SELL")) {
	                String stock = parts[1];
	                int quantity = Integer.parseInt(parts[2]);
	                Stock currentStock = portfolio.get(stock);
	                profit += (long) quantity * currentStock.price;
	                currentStock.quantity -= quantity;
	 
	            } else if (action.equals("CHANGE")) {
	                String stock = parts[1];
	                int priceChange = Integer.parseInt(parts[2]);
	                if (portfolio.containsKey(stock)) {
	                    Stock currentStock = portfolio.get(stock);
	                    profit += (long) currentStock.quantity * priceChange;
	                    currentStock.price += priceChange;
	                }
	 
	            } else if (action.equals("QUERY")) {
	                result.add(profit);
	            }
	        }
	 
	        return result;
	    }
	 
	    static class Stock {
	        int quantity;
	        int price;
	 
	        Stock(int quantity, int price) {
	            this.quantity = quantity;
	            this.price = price;
	        }
	    }
	 
	    public static void main(String[] args) {
	        String[] events = {
	            "BUY googl 20", 
	            "BUY aapl 50", 
	            "CHANGE googl 6", 
	            "QUERY", 
	            "SELL aapl 10", 
	            "CHANGE aapl -2", 
	            "QUERY"
	        };
	 
	        List<Long> results = getNetProfit(events);
	        for (long res : results) {
	            System.out.println(res);
	        }
	    }
	

}
