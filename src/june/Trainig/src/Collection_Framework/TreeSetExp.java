package Collection_Framework;

import java.util.TreeSet;

public class TreeSetExp {
    public static void main(String[] args) {
       TreeSet ts = new TreeSet<>();

        ts.add("Rishabh");
        ts.add("Rishabh");
        ts.add("Raghav");
        ts.add("Anisha");
        ts.add("Biren");

        //ts.add(null);
        //Null values not allowed in Treeset

        //Printing the Set
        System.out.println(ts);

        String h5 = String.valueOf(ts.reversed());
        System.out.println(h5);

        //Getting the size
        int h1 = ts.size();
        System.out.println(h1);
//
        //Checking if set is empty or not
        boolean h2 = ts.isEmpty();
        System.out.println(h2);
//
//
//
        //Printing first value of set
        String h3 = String.valueOf(ts.getFirst());
        System.out.println(h3);
//
        //Print last value of set
        String h4 = String.valueOf(ts.getLast());
        System.out.println(h4);
    }
}
