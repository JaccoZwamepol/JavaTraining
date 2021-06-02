package IfElseAssignments;
public class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }
    public int getAge(){
        return this.age;
    }
    public void printIntroduction(){
        System.out.println("Hi, I am " + this.name + ", and I am " + this.age + ".");
    }
}
