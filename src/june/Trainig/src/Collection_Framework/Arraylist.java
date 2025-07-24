package Collection_Framework;

import java.util.ArrayList;


public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> T1 = new ArrayList<String>();
        T1.add("Raghav");
        T1.add("Rishabh");
        T1.add("Anisha");
        T1.add("Birender");
        T1.addLast("Nik");

        //Adding null value
        //T1.add(null);
        System.out.print(T1);

        //ArrayList Function

        //Adding new value at index
        T1.add(2,"Swati");
       // System.out.println(T1);

      //Contains function to find value is present or not
       boolean T2= T1.contains("Rishabh");
        System.out.println(T2);

        //Removing value
        T1.remove("Nik");
        System.out.println(T1);

        //Index of value of function
        int T3= T1.indexOf("Raghav");
        System.out.println(T3);

        //Adding duplicate as duplicates of value allowed Arraylist
        T1.add("Raghav");
        System.out.println(T1);

        //Sorting
        T1.sort(null);
        System.out.println(T1);
    }



}
