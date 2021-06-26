package pl.gda.wsb;

public class Lion extends Animal {

    public Lion(String name, int weight, int age) {
        super(name, weight, age);
    }

    @Override
    public String setSpecies() {
        return "Lion";
    }



}
