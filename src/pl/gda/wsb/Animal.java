package pl.gda.wsb;

public abstract class Animal {

    private String name;
    private int weight;
    private int age;


    public Animal(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getAge(){
        return this.age;
    }
    public abstract String setSpecies();

    @Override
    public String toString() {
        return "I am a "+ setSpecies() +".My name is "+ getName() + ". I have "+getAge()+" years and my weight is "+getWeight()+" kg.";
    }
}
