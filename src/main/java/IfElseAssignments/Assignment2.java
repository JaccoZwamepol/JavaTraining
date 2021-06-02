package IfElseAssignments;
import java.util.ArrayList;
import java.util.List;

public class Assignment2 {
    public static void main(String[] args){
        Zoo zoo = new Zoo();
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Jacco", 5));
        persons.add(new Person("Julian", 10));
        persons.add(new Person("Leon", 29));
        for (Person person : persons) {
            System.out.println(zoo.ticketPrice(person));
        }
    }
}
