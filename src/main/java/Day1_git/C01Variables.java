package Day1_git;

public class C01Variables {

        public static void main(String[] args) {
            byte stdAge = 37;
            System.out.println(stdAge);

            // 3245
            short numOfStdInSchool = 3245;
            System.out.println(numOfStdInSchool);

            // 1200000
            int populationOfMiami = 1200000;
            System.out.println(populationOfMiami);

            // If we write long variable not in range of an int we need to add "L" to the end
            long popOfWorld = 7000000000L;
            System.out.println(popOfWorld);

            // If we write long variable  in range of an int we dont need to add "L" to the end
            long popOfChina = 1500000000;
            System.out.println(popOfChina);

            float shirtPrice = 23.34F;
            System.out.println(shirtPrice);

            double weightOfCell = 0.000000012;
            System.out.println(weightOfCell);

            boolean isRetired= false;
            System.out.println(isRetired);

            char initial = 'H';
            System.out.println(initial);

            String name = "Mark Twain";
            System.out.println("name = " + name);


        }
    }
