package Collection_Framework;
import java.util.HashSet;

public class Hashset<S> {
    public static void main(String[] args) {
       HashSet hs = new HashSet();
       hs.add("Rishabh");
        hs.add("Rishabh");
        hs.add("Raghav");
        hs.add("Anisha");
        hs.add("Biren");
        hs.add(null);
        //Null values allowed in Set

        //Printing the Set
        System.out.println(hs);

        //Getting the size
        int h1 = hs.size();
        System.out.println(h1);

        //Checking if set is empty or not
        boolean h2 = hs.isEmpty();
        System.out.println(h2);

        hs.add(null);
        System.out.println(hs);
        //Only one null value is allowed


    }
}
