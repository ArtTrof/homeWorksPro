package SerializationXMLJSON.task2;

import java.io.Serializable;

public class Animal implements Serializable {
    private int age,weight;
    private String name;
    public Animal(){}

    public Animal(int age, int weight, String name) {
        this.age = age;
        this.weight = weight;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){

        return "Animal's name " + this.getName() + " it is "+this.getAge()+" years old and it weight is " + this.getWeight();
    }
    public static String announcement(){
        return "I'm animal not a human";
    }
}
