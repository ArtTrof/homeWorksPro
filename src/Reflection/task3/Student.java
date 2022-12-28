package Reflection.task3;

public class Student {
    private int height;
    public int age;
    protected String name;

    public Student() {

    }

    public Student(int height, int age, String name) {
        this.height = height;
        this.age = age;
        this.name = name;
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String show() {
        return "Name -" + this.name + " Age -" + this.age + " Height -" + this.height;
    }

    public static void info() {
        System.out.println("Student usually between 17 - 25 y.o.");
    }
}
