package DataTypeAssignments;
import java.util.ArrayList;
import java.util.List;

public class Assignment6 {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Jacco", 28));
        persons.add(new Person("Julian", 29));
        persons.get(1).printIntroduction();
    }
}
