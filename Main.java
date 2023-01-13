import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Student("John", "Smith", 2.36 ));
        persons.add(new Employee("Michael", "Clark", "doctor", 478000.0));
        persons.add(new Student("Paul", "Flory", 3.57));
        persons.add(new Employee("Kerem", "Bursin", "enginneer", 450000.0));

        Collections.sort(persons);

        printData(persons);

    }

    public static void printData(ArrayList<Person> persons){
        for(Person person : persons) {
            System.out.println(person);
        }
    }
}
