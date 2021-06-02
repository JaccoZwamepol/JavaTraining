package IfElseAssignments;
public class Zoo {
    public int ticketPrice(Person person){
        if (person.getAge() <= 5)
            return 0;
        else if (person.getAge() <= 12)
            return 5;
        else
            return 15;
    }
}
