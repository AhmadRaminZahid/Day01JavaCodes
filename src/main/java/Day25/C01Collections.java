package Day25;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class C01Collections {
    public static void main(String[] args) {


         /*
            1) Sets are for storing multiple "unique" data
            2) Hash: Hashing is a technique to create unique data
            3) There are three types of Sets:
                 i) HashSet is for storing "unique" data
                      HashSet stores data in random order
                      It excepts "null" values
                      HashSets are superfast because they don't spend time to organize element's order
                 ii) LinkedHashSet is for storing "unique" data
                      LinkedHashSet stores data in insertion order
                 iii) TreeSet is for storing "unique" data
                       TreeSet stores data in natural order (ascending order for numerical data,
                       Alphabetical order for Strings )
                       TreeSet are so slow because putting elements in order takes time
                       TreeSet does nor accept "null"
     */
            System.out.println("Hi");
            long t1 =System.nanoTime();
            HashSet<String> emails = new HashSet<>();
            emails.add("ab@gmail.com");
            emails.add("bc@gmail.com");
            emails.add("de@gmail.com");
            emails.add("xy@gmail.com");
            emails.add("kn@gmail.com");
            emails.add("kn@gmail.com"); //  Repetitions will be ignored
            emails.add(null);    // HashSet accepts "null" value
            System.out.println(emails); // [ab@gmail.com, xy@gmail.com, de@gmail.com, bc@gmail.com, kn@gmail.com]
            long t2= System.nanoTime();
            LinkedHashSet<String> ssn = new LinkedHashSet<>();
            ssn.add("ab@gmail.com");
            ssn.add("bc@gmail.com");
            ssn.add("de@gmail.com");
            ssn.add("xy@gmail.com");
            ssn.add("kn@gmail.com");
            ssn.add("kn@gmail.com"); //  Repetitions will be ignored
            ssn.add(null);    // HashSet accepts "null" value
            System.out.println(ssn);
            long t3= System.nanoTime();
            TreeSet<String > ids = new TreeSet<>();
            ids.add("ab@gmail.com");
            ids.add("bc@gmail.com");
            ids.add("de@gmail.com");
            ids.add("xy@gmail.com");
            ids.add("kn@gmail.com");
            ids.add("kn@gmail.com"); //  Repetitions will be ignored
            //  ids.add(null);    // TreeSet does not accept "null" value ----> throws exception
            ids.add("ae@gmail.com");
            System.out.println(ids);
            long t4= System.nanoTime();


            HashSet<String > stdIds = new HashSet<>();
            stdIds.add("ab@gmail.com");
            stdIds.add("bc@gmail.com");
            stdIds.add("de@gmail.com");
            stdIds.add("xy@gmail.com");
            stdIds.add("kn@gmail.com");
            stdIds.add("kn@gmail.com"); //  Repetitions will be ignored
            //  ids.add(null);    // TreeSet does not accept "null" value ----> throws exception
            stdIds.add("ae@gmail.com");

            TreeSet<String > stdIdsTree = new TreeSet<>(stdIds);
            System.out.println(stdIdsTree);

            long t5= System.nanoTime();

            System.out.println("HashSet  " + (t2-t1));
            System.out.println("LinkedHashSet  " + (t3-t2));
            System.out.println("TreeSet  " + (t4-t3));
            System.out.println("HashToTreeSet  " + (t5-t4));

        }

    }
