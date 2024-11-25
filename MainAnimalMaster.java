import java.util.Collections;
import java.util.List;
import java.util.Map;

class Animal implements IAnimal{
	private int id;
	private String species;
	private String name;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
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
}

class Zoo implements IZoo{
	private List<IAnimal> animals = new ArrayList<>();
	
	public void addAnimal(IAnimal animal) {
		animals.add(animal);
		
		public void removeAnimal(int id) {
			Iterator<IAnimal> iterator = animals.iterator();
			while(iterator.hasNext()) {
				IAnimal animal = iterator.next();
				if(animal.getid() == id) {
					iterator.remove();
				}
			}
		}
		public int countAnimals() {
			return animals.size();
		}
		public List<IAnimal>getAnimalsByspecies(String species){
			List<IAnimal> speAnimals = new ArrayList<>();
			for(IAnimal animal : animals) {
				if(animal.getspecies().equals(species)) {
					speAniamls.add(animal);
				}
			}
			return speAnimals;
		}
		public List<Map.Entry<Integer,List<IAnimal>>>getAnimalsByAge(){
			Map<Integer,List<IAnimal>> ageGroups = new HashMap<>();
			for(IAnimal animal : animals) {
				int age = animal.getAge();
				if(!ageGroups.containsKey(age)) {
					ageGroups.put(age, new ArrayList<IAnimal>());
				}
				ageGroups.get(age).add(animal);
			}
			List<Map.Entry<Integer, List<IAnimal>>>
			result = new ArrayList<>(ageGroups.entrySet());
			
			Collections.sort(result, newComparator<Map.Entry<Integer, List<IAnimal>>>){
	public int compare(Map.Entry<Integer, List<IAnimal>>01, Map.Entry<Integer, List<IAnimal>>02) {
		return 02.getKey().compareTo(o1.getKey());
	}
			});
			return result;
		}
	}
	
	interface IZoo{
		void addAnimal(IAnimal animal);
		void removeAnimal(int id);
		int countAnimal();
		List<IAnimal>getAnimalByspecies(String species);
		List<Map.Entry<Integer,List<IAnimal>>>getAnimalsByAge();
	}
	}

public class MainAnimalMaster {

}

/*package quesBank2;

import java.util.*;

// Define the IAnimal interface
interface IAnimal {
    int getId();
    void setId(int id);
    String getSpecies();
    void setSpecies(String species);
    String getName();
    void setName(String name);
    int getAge();
    void setAge(int age);
}

// Implement the Animal class that implements IAnimal
class Animal implements IAnimal {
    private int id;
    private String species;
    private String name;
    private int age;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getSpecies() {
        return species;
    }

    @Override
    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }
}

// Define the IZoo interface
interface IZoo {
    void addAnimal(IAnimal animal);
    void removeAnimal(int id);
    int countAnimals();
    List<IAnimal> getAnimalsBySpecies(String species);
    List<Map.Entry<Integer, List<IAnimal>>> getAnimalsByAge();
}

// Implement the Zoo class that implements IZoo
class Zoo implements IZoo {
    private List<IAnimal> animals = new ArrayList<>();

    @Override
    public void addAnimal(IAnimal animal) {
        animals.add(animal);
    }

    @Override
    public void removeAnimal(int id) {
        Iterator<IAnimal> iterator = animals.iterator();
        while (iterator.hasNext()) {
            IAnimal animal = iterator.next();
            if (animal.getId() == id) {
                iterator.remove();
                break; // Remove only the first match and stop.
            }
        }
    }

    @Override
    public int countAnimals() {
        return animals.size();
    }

    @Override
    public List<IAnimal> getAnimalsBySpecies(String species) {
        List<IAnimal> speciesAnimals = new ArrayList<>();
        for (IAnimal animal : animals) {
            if (animal.getSpecies().equals(species)) {
                speciesAnimals.add(animal);
            }
        }
        return speciesAnimals;
    }

    @Override
    public List<Map.Entry<Integer, List<IAnimal>>> getAnimalsByAge() {
        Map<Integer, List<IAnimal>> ageGroups = new HashMap<>();
        
        // Group animals by their age
        for (IAnimal animal : animals) {
            int age = animal.getAge();
            ageGroups.putIfAbsent(age, new ArrayList<>());
            ageGroups.get(age).add(animal);
        }

        // Convert the map entries to a list
        List<Map.Entry<Integer, List<IAnimal>>> result = new ArrayList<>(ageGroups.entrySet());

        // Sort by age in descending order
        Collections.sort(result, new Comparator<Map.Entry<Integer, List<IAnimal>>>() {
            @Override
            public int compare(Map.Entry<Integer, List<IAnimal>> o1, Map.Entry<Integer, List<IAnimal>> o2) {
                return o2.getKey().compareTo(o1.getKey()); // Descending order
            }
        });

        return result;
    }
}

// Main class to test the implementation
public class MainAnimalMaster {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        // Create some animals
        Animal animal1 = new Animal();
        animal1.setId(1);
        animal1.setName("Lion");
        animal1.setSpecies("Panthera leo");
        animal1.setAge(5);

        Animal animal2 = new Animal();
        animal2.setId(2);
        animal2.setName("Elephant");
        animal2.setSpecies("Elephas maximus");
        animal2.setAge(10);

        Animal animal3 = new Animal();
        animal3.setId(3);
        animal3.setName("Lioness");
        animal3.setSpecies("Panthera leo");
        animal3.setAge(4);

        Animal animal4 = new Animal();
        animal4.setId(4);
        animal4.setName("Zebra");
        animal4.setSpecies("Equus quagga");
        animal4.setAge(7);

        // Add animals to the zoo
        zoo.addAnimal(animal1);
        zoo.addAnimal(animal2);
        zoo.addAnimal(animal3);
        zoo.addAnimal(animal4);

        // Print the total number of animals
        System.out.println("Total Animals in the Zoo: " + zoo.countAnimals());

        // Print animals by species
        String speciesQuery = "Panthera leo";
        List<IAnimal> lions = zoo.getAnimalsBySpecies(speciesQuery);
        System.out.println("\nAnimals of species '" + speciesQuery + "':");
        for (IAnimal lion : lions) {
            System.out.println(lion.getName() + " (Age: " + lion.getAge() + ")");
        }

        // Print animals grouped by age
        System.out.println("\nAnimals grouped by age (Descending):");
        List<Map.Entry<Integer, List<IAnimal>>> animalsByAge = zoo.getAnimalsByAge();
        for (Map.Entry<Integer, List<IAnimal>> entry : animalsByAge) {
            System.out.println("Age " + entry.getKey() + ":");
            for (IAnimal animal : entry.getValue()) {
                System.out.println("  " + animal.getName());
            }
        }

        // Remove an animal
        zoo.removeAnimal(2); // Remove Elephant with ID 2
        System.out.println("\nAfter removing Elephant, total animals in the zoo: " + zoo.countAnimals());
    }
}
*/
