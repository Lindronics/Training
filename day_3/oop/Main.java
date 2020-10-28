import java.util.ArrayList;

/**
 * This class runs our program.
 */
public class Main {
    public static void main(String... args) {

        // This line creates an empty list of pets. You don't have to understand this line.
        var pets = new ArrayList<Pet>();

        // Create a new Dog with age 10, name Rowlie of breed Australian Shepherd,
        // and add to the list of pets.
        pets.add(new Dog(10, "Rowlie", "Australian Shepherd"));

        // Create a new Cat with age 3, name Ruby and weight 3.8, and add to the list of pets.
        pets.add(new Cat(3, "Ruby", 3.8));

        // Like above
        pets.add(new Cat(6, "Freddie", 5.5));

        // This goes through each pet in the list of pets and prints the pet's custom sound
        for (Pet p : pets) {
            p.makeSound();
        }
    }
}
