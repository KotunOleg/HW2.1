public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("fish", "black", 5, "Fedya");
        Dog dog = new Dog("bone", "brown", 10, "Betty");
        Veterinarian veterinarian = new Veterinarian("Alexey");
        veterinarian.treatment(cat);
        cat.eat();
        cat.getVoice();
        cat.sleep();
        veterinarian.treatment(dog);
        dog.eat();
        dog.getVoice();
        dog.sleep();

    }
}
