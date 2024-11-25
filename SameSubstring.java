
public class SameSubstring {
	public static int sameSubstring(String s,String t,int k) {
		int left=0;
		int maxLength=0;
		int currentCost=0;
		for(int right=0;right<Math.min(s.length(),t.length());
				right++){ 
			currentCost+=Math.abs(s.charAt(right)-t.charAt(right));
			System.out.println("Right: " + right + ", Left: " + left + ", CurrentCost: " + currentCost); 
			
			while(currentCost>k) {
				currentCost-=Math.abs(s.charAt(left)-t.charAt(left));
				left++;
			}
			maxLength=Math.max(maxLength, right-left+1);
		}
		return maxLength;
		
	}

	public static void main(String[] args) {
		String s="srushti.gajendrawasnik@capgemini.com";
		String t="HackerRank";
		int k=12;
		System.out.println(sameSubstring(s,t,k));
		

	}

}
