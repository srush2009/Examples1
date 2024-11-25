import java.util.*;

class Product{
	List<String> productList = new ArrayList<>();
	public void addProduct(String pName) {
		productList.add(pName);
	}
	public void removeProduct(String pName) {
		productList.remove(pName);
	}
	public int uniqueProduct() {
		HashSet<String> hset = new HashSet<>(productList);
		return hset.size();
	}
	
	public List<String> getProductList(){
		return productList;
	}
}

public class MainProductList {
	public static void main(String[] args) {
		Product pList1 = new Product();
		pList1.addProduct("Ball");
		pList1.addProduct("Shirt");
		pList1.addProduct("Bat");
		pList1.removeProduct("Ball");
		int count = pList1.uniqueProduct();
		System.out.println(count);
		for (String p : pList1.getProductList()) {
            System.out.println(p);
        }
	}

}