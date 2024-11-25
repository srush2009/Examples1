import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Iterator;

class SortingUsingCollections {
	String name;
	int age;
	
	public SortingUsingCollections(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "SortingUsingCollections [Name=" + name + ", age=" + age + "]";
	}
	
	class CustomSortingComparator implements Comparator<SortingUsingCollections>{ //add static keyword if error
		@Override
		public int compare(SortingUsingCollections Student1,SortingUsingCollections Student2) {
			int nameCompare=Student1.getName().compareTo(Student2.getName());
			int ageCompare=Integer.compare(Student1.getAge(),Student2.getAge());
			return (nameCompare==0)?ageCompare:nameCompare;
			}
	}
	public class ComparatorStudent{
	public static void main(String[] args) {
		List<SortingUsingCollections> a1 = new ArrayList<>();
		SortingUsingCollections Obj1=new SortingUsingCollections("Ajay",23);
		SortingUsingCollections Obj2=new SortingUsingCollections("Srushti",20);
		SortingUsingCollections Obj3=new SortingUsingCollections("Ashita",2);
		SortingUsingCollections Obj4=new SortingUsingCollections("Yogini",8);
		
		a1.add(Obj1);
		a1.add(Obj2);
		a1.add(Obj3);
		a1.add(Obj4);
		
		Iterator<SortingUsingCollections> custIterator=a1.iterator();
		System.out.println("Before Sorting:\n");
		while(custIterator.hasNext()) {
			System.out.println(custIterator.next());
		}
		Collections.sort(a1, new CustomSortingComparator());
		
		System.out.println("\n\n After Sorting: \n");
		for(SortingUsingCollections student:a1) {
			System.out.println(student);
		}
		

	}

}
}
