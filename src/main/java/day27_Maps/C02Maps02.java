package day27_Maps;

import java.util.HashMap;
import java.util.Map;

public class C02Maps02 {
    public static void main(String[] args) {

        //Example 1: Type code to find the number of occurrences of words in a sentence
        //           Java is easy, Java is OOP, OOP makes Java easy. ==> Java=3, is=2, easy=2, oop=2, makes=1
        String str = "Java is easy, Java is OOP, OOP makes Java easy.";
        // First remove the all punct marks
        str = str.replaceAll("\\p{Punct}","");  // Java is easy Java is OOP OOP makes Java easy
        // Use split() methos to get words
        String[] words = str.split(" ");
        // Create Map container to store "word = numOfOcc" structure
        Map<String, Integer> result = new HashMap<>();
        // Use foreach loop to count numOfOcc and put them into the Map
        for (String w: words){
            Integer numOfOcc = result.get(w);
            if(numOfOcc==null){
                result.put(w,1);
            } else {
                result.replace(w,numOfOcc+1);
            }
        }
        System.out.println(result);

    }
}
