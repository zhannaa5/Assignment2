import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Student("Ringo", "Starr", 2.36 ));
        persons.add(new Employee("John", "Lennon", "doctor", 478000.0));
        persons.add(new Student("Paul", "McCartney", 3.57));
        persons.add(new Employee("George", "Harrison", "enginneer", 450000.0));

        Collections.sort(persons);

        printData(persons);


    }

    public static void printData(ArrayList<Person> persons){
        for(Person person : persons) {
            System.out.println(person);
        }

    }
}
