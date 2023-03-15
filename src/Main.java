import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Mikhail", "Lermontov", 26));
        people.add(new Person("Alexander", "Pushkin", 37));
        people.add(new Person("Fedor", "Dostoevsky", 59));
        people.add(new Person("Leo", "Tolstoy", 82));
        people.add(new Person("Ivan", "Bunin", 83));
        people.add(new Person("Anna", "Egorova", 17));
        people.add(new Person("Lera", "Ivanova", 16));

        Predicate<Person> predicate = (person -> person.getAge() < 18);

        people.removeIf(predicate);
        System.out.println(people);
    }
}