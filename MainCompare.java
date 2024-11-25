class Comparator{
	boolean comparator(int a, int b) {
		if(a == b) {
			return true;
		} 
		return false;
	}
	boolean compare(String a, String b) {
		if(a.equals(b)) {
			return true;
		}
		return false;
	}
	boolean compare1(int[] a, int[] b) {
		if(a.length != b.length) {
			return false;
		}else {
			for(int i=0; i<a.length; i++) {
				if(a[i] != b[i]) {
					return false;
				}
			}
			return true;
		}
	}
}

public class MainCompare {
	public static void main(String[] args) {
		Comparator comp = new Comparator();
		int a = 10; int b = 21;
		System.out.println(comp.comparator(a, b));
		
		 // Take user input for array comparison
       /* System.out.print("Enter the length of the first array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter the elements of the first array: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the length of the second array: ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        System.out.println("Enter the elements of the second array: ");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println("Comparing arrays: " + comp.compare1(arr1, arr2));
        
        sc.close();
    }*/
		
	}

}