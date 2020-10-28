/**
 * A dog is a pet. Therefore, the "Dog" class is an extension of the "Pet" class. This means that it
 * obtains all attributes (name, age) of the "Pet" class, but additional attributes and methods can be added 
 * to describe the custom behaviour of dogs.
 */
public class Dog extends Pet {
    
    // In addition to name and age, dogs can be of a breed.
    String breed;

    // Gets called when creating a new dog.
    public Dog(int age, String name, String breed) {
        // Create a pet with the specified age and name.
        super(age, name);
        // Set the breed of the dog. This is our new custom property that applies only to dogs.
        this.breed = breed;
    }

    // We override ("over-write") this method of the pet class. This way, we can specify a custom sound that dogs make.
    public void makeSound() {
        System.out.println("Woof!");
    }
}
