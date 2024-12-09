package praktikum.sesi9.Animal;

public class Dog extends Animal {

    // Constructor
    public Dog(String name) {
        super(name); // Memanggil constructor dari superclass
    }

    // Override metode speak
    @Override
    public void speak() {
        System.out.println(name + " says Woof");
    }
}
