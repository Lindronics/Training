
/**
 * Similar to dogs, cats have custom behaviours an attributes,
 * but have all attributes that a generic pet has.
 */
public class Cat extends Pet {
    
    // Cats e.g. have a weight (dogs ofc do too, but for this example we'll just pretend that this only
    // applies to cats. Maybe we only care about the weight of cats, not that of dogs within the 
    // context of our program).
    double weight;

    // Gets called when creating a new cat.
    public Cat(int age, String name, double weight) {
        // Create a pet with the specified age and name.
        super(age, name);
        // Set the weight of the cat. This is our new custom property that applies only to cats.
        this.weight = weight;
    }

    // We override ("over-write") this method of the pet class.
    // This way, we can specify a custom sound that cats make.
    public void makeSound() {
        System.out.println("Meow!");
    }
}
