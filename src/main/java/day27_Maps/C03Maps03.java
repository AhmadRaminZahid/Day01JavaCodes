package day27_Maps;

import java.util.Hashtable;
import java.util.TreeMap;

public class C03Maps03 {

    /*
       HashMap :  1) It does not put Entries in any order ----> Random order ------> It is fast
                  2) It allows you to use null in "Key" or "value"
                  3) It is not "Thread-Safe" and not "synchronised"
      HashTable:  1) It does not put Entries in any order ----> Random order ------> It is slower than HashMap
                  2) It does not allow you to use null in "Key" or "value"
                  3) It is  "Thread-Safe" and  "synchronised"
      TreeMap:    1) It puts Entries in natural order ---> It is slow
                  2) It does nor accept "null" as Key but it accepts multiple "values" as "null"
                  3) It is not "Thread-Safe" and not "synchronised"
    */
    public static void main(String[] args) {
        //Homework: Create a method to display the number of occurrences of letters in a sentence
        //           Java, Java, I love Java. ==> J=3, a=6, v=4, I=1, l=1, o=1, e=1

        Hashtable<Integer, String> define = new Hashtable<>();
        define.put(1, "Baby");
        define.put(15, "Teenager");
        define.put(65, "Senior");
        //define.put(null,"Senior"); // NullPointerException
        //define.put(65,null); // // NullPointerException
        System.out.println(define); // {65=Senior, 15=Teenager, 1=Baby}
        TreeMap<String, Integer> countries = new TreeMap<>();
        countries.put("Albania", 3);
        countries.put("Germany", 83);
        countries.put("USA", 400);
        countries.put("Belgium", 12);
        //countries.put(null,12); // NullPointerException
        countries.put("UK", null);

        System.out.println(countries); // {Albania=3, Belgium=12, Germany=83, USA=400}

    }
}