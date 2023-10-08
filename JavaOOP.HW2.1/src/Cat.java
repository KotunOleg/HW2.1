public class Cat extends Animal {
    private String name;

    public Cat(String ration, String color, int weight, String name) {
        super(ration, color, weight);
        this.name = name;
    }
    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getVoice(){
        return "I say meow";
    }

    @Override
    public void eat(){
        System.out.println("I'm eating fish");
    }

    @Override
    public void sleep(){
        System.out.println("psheee");
    }

}
