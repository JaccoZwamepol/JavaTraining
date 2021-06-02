package DataTypeAssignments;
public class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }
    public void printIntroduction(){
        System.out.println("Hi, I am " + this.name + ", and I am " + this.age + ".");
    }
}
