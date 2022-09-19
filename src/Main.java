import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Ivan", "Pupkin Kozlov", 10));
        personList.add(new Person("Nastya", "Neleghko Petrova", 12));
        personList.add(new Person("Oleg", "Korovin", 18));
        personList.add(new Person("Nadya", "Vaselkova Nekifirova Nebrezko", 12));
        personList.add(new Person("Olya", "Vaselkova Nekifirova Nebrezko Nekrasova", 24));

        System.out.println(personList);
        Collections.sort(personList, new PersonComparator());
        Collections.reverse(personList);
        System.out.println(personList);

    }
}
