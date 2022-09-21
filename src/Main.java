import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Ivan", "Pupkin Kozlov", 10));
        personList.add(new Person("Nastya", "Neleghko Petrova", 12));
        personList.add(new Person("Oleg", "Korovin", 18));
        personList.add(new Person("Nadya", "Vaselkova Nekifirova Nebrezko", 12));
        personList.add(new Person("Olya", "Vaselkova Nekifirova Nebrezko Nekrasova", 24));

        Comparator<Person> comp = (o1, o2) -> {
            Set<String> cnt1 = new HashSet<>((List.of(o1.getSurname().split("\\P{IsAlphabetic}+"))));
            Set<String> cnt2 = new HashSet<>((List.of(o2.getSurname().split("\\P{IsAlphabetic}+"))));
            if (cnt1.size() > cnt2.size()) {
                return 1;
            } else if (cnt1.size() < cnt2.size()) {
                return -1;
            } else {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };

        System.out.println(personList);
        personList.sort(comp);
        Collections.reverse(personList);
        System.out.println(personList);

        Predicate<Person> predicate = Main::test;
        personList.removeIf(predicate);

        System.out.println(personList);
    }

    private static boolean test(Person personList) {
        return personList.getAge() < 18;
    }
}
