public class App {
    public static void main(String[] args) throws Exception {
        Animal animal = new Animal("Animal");
        System.out.println(animal);
        animal.eat();
        
        Cat cat = new Cat("Tom", "Cute");
        System.out.println(cat);
        cat.eat();
        cat.speak();
        
        Dog dog = new Dog("Spike", "Loyal");
        System.out.println(dog);
        dog.eat();
        dog.speak();
    }
}
