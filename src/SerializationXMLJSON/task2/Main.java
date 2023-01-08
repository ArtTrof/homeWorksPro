package SerializationXMLJSON.task2;

import java.io.*;
import java.nio.file.Files;

public class Main {
    public static void main(String[] args) throws Exception {

        File f = new File("F:\\Programming\\EssentialJavaTests\\HomeWorksJavaPro\\src\\SerializationXMLJSON\\task2\\task2");
        Animal animal = new Animal(5, 10, "Bob");
        //serialization
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
        oos.writeObject(animal);
        oos.flush();
        oos.close();
        //deserialization
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
        Animal newAnimal = (Animal) ois.readObject();
        ois.close();
        System.out.println(newAnimal.toString());


    }
}
