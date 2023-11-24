package Day1_git;

public class C03WrapperClass {

        public static void main(String[] args) {
            // Wrapper Class: Java created a new data structure by adding some usefull methods to primitive data types.
            //                This new structure is called as "Wrapper class"

            // Java created wrapper class for every primitive data

        /*
                Primitive               Wrapper Class
                byte        ----->        Byte
                short       ----->        Short
                int         ----->        Integer
                long        ----->        Long
                float       ------>       Float
                double      ------>       Double
                boolean     ------>       Boolean
                char        ------->      Character

         */
            // primitive data does not have methods
            int weight = 25;

            // Wrapper class has usefull methods
            Integer height = 120;

            System.out.println(Integer.MAX_VALUE);
            System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);

            System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);


        }

    }
