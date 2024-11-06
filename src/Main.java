public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.eat();
        cat.makeSound();
        cat.sleep();

        dog.eat();
        dog.makeSound();
        dog.sleep();
    }
}