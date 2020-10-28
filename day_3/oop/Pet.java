public class Pet {
    int age;
    String name;

    // This constructor creates a new pet with an age and a name
    public Pet(int age, String name) {
        
        // "this" refers to the current object
        this.age = age;

        // By using "this", we make sure the value of the local variable name (line 6)
        // gets saved into the class variable name (line 3), when this gets executed
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Generic pet noise");
    }
}
