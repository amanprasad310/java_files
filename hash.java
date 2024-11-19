import java.util.HashSet;
import java.util.Iterator;

public class hash {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("Aman");
        set.add("Arjun");
        set.add("Aryan");
        set.add("Chaitanya");
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
