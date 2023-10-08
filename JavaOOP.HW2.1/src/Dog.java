public class Dog extends Animal {
    private String name;

    public Dog(String ration, String color, int weight, String name) {
        super(ration, color, weight);
        this.name = name;
    }
    public Dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Bones");
    }

    @Override
    public void sleep() {
        System.out.println("Hrrrrrr");
    }

    @Override
    public String getVoice() {
        return "Gaw-gaw";
    }
}
