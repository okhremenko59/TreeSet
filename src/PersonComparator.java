import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        Set<String> cnt1 = new HashSet<>((List.of(o1.getSurname().split("\\P{IsAlphabetic}+"))));
        Set<String> cnt2 = new HashSet<>((List.of(o2.getSurname().split("\\P{IsAlphabetic}+"))));
        if (cnt1.size() > cnt2.size()) {
            return 1;
        } else if (cnt1.size() < cnt2.size()) {
            return -1;
        } else {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }
}
