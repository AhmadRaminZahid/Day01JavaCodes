package day27_Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01Maps01 {

    public static void main(String[] args) {

        Map<String,Integer> stdAges= new HashMap<>();

        //How to add entries to a map:

        stdAges.put("Ehsan",24);
        stdAges.put("Ramin",26);
        stdAges.put("Enayat",27);
        stdAges.put("Hekmat",17);
        stdAges.put("Zamir",22);
        stdAges.put("Ramin",28); //if we put existing key it overrides the previous value
        System.out.println("stdAges = " + stdAges);

        // How to work only with Keys:
        //Example1: Get the total number of characters in student names:

        Set<String> keys= stdAges.keySet();
        System.out.println("keys = " + keys);

        int totalChars= 0;
        for(String w:keys)
        {
            totalChars= totalChars+ w.length();
        }
        System.out.println("totalChars = " + totalChars);

        //how to work only with values:

        //Example2: Find the average age of students

        Collection<Integer> averageAge= stdAges.values();

        System.out.println("averageAge = " + averageAge);

        double sum =0;
        int increment=0;
        for(Integer w:averageAge){
            sum= sum+w;
            increment++;
        }
        Double average1= sum/averageAge.size();
        Double average2= sum/increment;
        System.out.println("average1 = " + average1);
        System.out.println("average2 = " + average2);

        //How to work with entries(each element of map):
        //Example3: Find sum of number of characters and age for every individual entry

        Set<Map.Entry<String, Integer>> entries= stdAges.entrySet();
        System.out.println("entries = " + entries);
        int sumofNumbers =0;
        for(Map.Entry<String,Integer> w:entries) {
            sumofNumbers = w.getValue()+w.getKey().length();
            System.out.println("For "+w.getKey()+" :" + sumofNumbers);
        }

        //common methods in map:
        Integer age = stdAges.get("Ramin");
        System.out.println("age = " + age);
        stdAges.put("Ramin", 30); //updates "Ramin"
        stdAges.putIfAbsent("Enayat",31);// no update as "Enayat" exists.
        stdAges.putIfAbsent("Mursal",18);
        stdAges.replace("Ramin", 26);// similar to put.
        stdAges.replace("Mursal",18,19);
        System.out.println(stdAges);
        System.out.println(stdAges.containsKey("Ehsan")); //true
        System.out.println(stdAges.containsKey("Ehsan Jan"));//false
        System.out.println(stdAges.containsValue(19));//true
        System.out.println(stdAges.containsValue(30));//false

        System.out.println(stdAges.getOrDefault("Hekmat", 1));
        System.out.println(stdAges.getOrDefault("Hikmat", 1));
        //getorDefault method gets if exists and gives the default value if does not exist.
        stdAges.remove("Ramin");
        stdAges.remove("Zamir",22);
        System.out.println(stdAges);


    }
}
