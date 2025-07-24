package Collection_Framework;

import java.util.HashMap;
import java.util.Map;

public class HashMapExp {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap();
        hm.put("Rishabh",25);
        hm.put("Raghav",null);
        hm.put("null",78);
        hm.put("Biren",null);

        System.out.println(hm);

        //One null value is allow and any number null key is allowed
        Integer h1 = hm.get("Biren");
        System.out.println(h1);

        //Replacing the value
        hm.replace("Rishabh",78);
        System.out.println(hm);

        //Checking value present or not
        Boolean h2 = hm.containsValue(78);
        System.out.println(h2);

        hm.remove("Biren",null);
        System.out.println(hm);

        }
    }

