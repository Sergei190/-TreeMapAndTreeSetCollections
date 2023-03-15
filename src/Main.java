import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Mikhail", "Lermontov", 26));
        people.add(new Person("Alexander", "Pushkin", 37));
        people.add(new Person("Fedor", "Dostoevsky", 59));
        people.add(new Person("Leo", "Tolstoy", 82));
        people.add(new Person("Ivan", "Bunin", 83));

        Collections.sort(people, new ComparatorMaximumNumberOfWordsInASurname(10));
        System.out.println(people);
    }
}