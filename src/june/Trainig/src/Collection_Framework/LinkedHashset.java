package Collection_Framework;

import java.util.LinkedHashSet;

public class LinkedHashset {
    public static void main(String[] args) {
        LinkedHashSet hs = new LinkedHashSet();
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

         //Printing first value of set
       String h3 = String.valueOf(hs.getFirst());
        System.out.println(h3);

        //Print last value of set
        String h4 = String.valueOf(hs.getLast());
        System.out.println(h4);
    }

//
}

