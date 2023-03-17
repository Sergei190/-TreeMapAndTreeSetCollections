import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Mikhail", "Lermontov", 26));
        people.add(new Person("Alexander", "Pushkin", 37));
        people.add(new Person("Fedor", "Dostoevsky", 59));
        people.add(new Person("Leo", "Tolstoy", 82));
        people.add(new Person("Ivan", "Bunin", 83));

        List<Person> personList = new ArrayList<>();
        personList.sort((o1, o2) -> {
            StringTokenizer stringTokenizer = new StringTokenizer(o1.getSurname());
            StringTokenizer stringTokenizer1 = new StringTokenizer(o2.getSurname());

            int maxAmountWords = 5;
            if (stringTokenizer.countTokens() >= maxAmountWords || stringTokenizer1.countTokens() >= maxAmountWords) {
                if (stringTokenizer.countTokens() < stringTokenizer1.countTokens()) {
                    return -1;
                } else if (stringTokenizer.countTokens() > stringTokenizer1.countTokens()) {
                    return 1;
                }
            }
            return Integer.compare(o1.getAge(), o2.getAge());
        });
        System.out.println(people);
    }
}