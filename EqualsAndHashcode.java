import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EqualsAndHashcode {
	String Pin;
	String City;
	
	public EqualsAndHashcode(String pin, String city) {
		Pin = pin;
		City = city;
	}

	@Override
	public int hashCode() {
		return Objects.hash(City, Pin);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EqualsAndHashcode other = (EqualsAndHashcode) obj;
		return Objects.equals(City, other.City) && Objects.equals(Pin, other.Pin);
	}

	@Override
	public String toString() {
		return "EqualsAndHashcode [Pin=" + Pin + ", City=" + City + "]";
	}
	
	public static void main(String[] args) {
		List<EqualsAndHashcode> address=new ArrayList<>();
		address.add(new EqualsAndHashcode("2342","pune"));
		address.add(new EqualsAndHashcode("2432","Akola"));
		address.add(new EqualsAndHashcode("2122","Amravati"));
		
		
		System.out.println(address);
		
	}
	

}
