import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(new Cat());
		animalList.add(new Cow());
		animalList.add(new Bird());

        for (int position = 0; position < animalList.size(); position++) {
            Animal animal = animalList.get(position);
	        System.out.println(animal.getName() + " makes " + animal.getSound());
	    }

	}

}