package Part2_Wrappers;

public class Main {
    public static void main(String[] args) {
        // Initializing wrappers for different variables
        Integer wrapperInteger;
        Double wrapperDouble;
        Boolean wrapperBoolean;
        Character wrapperCharacter;

        // Using valueOf() method to initialize wrappers
        Integer wrapperInteger2 = Integer.valueOf(18);
        Double wrapperDouble2 = Double.valueOf(3.14);
        Boolean wrapperBoolean2 = Boolean.valueOf(true);
        Character wrapperCharacter2 = Character.valueOf('a');

        // Using parseInt() method for Integer
        Integer wrapperInteger3 = Integer.parseInt("16");

        // Using intValue() and doubleValue() methods]
        int i = wrapperInteger2.intValue();
        double j = wrapperDouble2.doubleValue();

        // Using toString() method
        String x = wrapperInteger2.toString();

        // Using hashCode() for Integer, Char, Boolean, Double
        int hashInteger = wrapperInteger2.hashCode();
        int hashChar = wrapperCharacter2.hashCode();
        int hashBoolean = wrapperBoolean2.hashCode();
        int hashDouble = wrapperDouble2.hashCode();

        System.out.println(
                 hashInteger + " hash value for integer" + '\n' +
                 hashChar + " hash value for char" + '\n' +
                 hashBoolean + " hash value for boolean" + '\n' +
                 hashDouble + " hash value for double"
                );

        //Creating some space between outputs
        System.out.println();
        System.out.println();
        System.out.println();

        // Using compareTo() method
        Integer integer1 = 15;
        Integer integer2 = 16;
        Integer integer3 = 15;
        Double double1 = 3.14;
        Double double2 = 3.13; // Initializing values to compare to eachother
        Double double3 = 3.14;
        Character character1 = 'a';
        Character character2 = 'b';
        Character character3 = 'a';
        String string1 = "Hello";
        String string2 = "Hello!";
        String string3 = "Hello";

        int resultintegertoInteger = integer1.compareTo(integer2); // Comparing integers with different values
        int resultintegertoInteger2 = integer1.compareTo(integer3); // Comparing integers with the same value
        int resultdoubletoDouble = double1.compareTo(double2); // Comparing doubles with different values
        int resultdoubletoDouble2 = double1.compareTo(double3); // Comparing doubles with the same value
        int resultcharactertoCharacter = character1.compareTo(character2); // Comparing characters with different values
        int resultcharactertoCharacter2 = character1.compareTo(character3); // Comparing characters with the same value
        int resultstringtoString = string1.compareTo(string2); // Comparing strings with different values
        int resultstringtoString2 = string1.compareTo(string3); // Comparing strings with the same value

        System.out.println(
                resultintegertoInteger + " Comparing integers with different values"  + '\n' +
                resultintegertoInteger2 + " Comparing integers with the same value" + '\n' +
                resultdoubletoDouble + " Comparing doubles with different values" + '\n' +
                resultdoubletoDouble  + " Comparing doubles with the same value" + '\n' +
                resultcharactertoCharacter + " Comparing characters with different values" + '\n' +
                resultcharactertoCharacter2 + "Comparing characters with the same value" + '\n' +
                resultstringtoString + "Comparing strings with different values" + '\n' +
                resultstringtoString2 + "Comparing strings with the same values" + '\n'
        );

        // Creating some space between the outputs
        System.out.println();
        System.out.println();
        System.out.println();

        // Comparing outputs a + b and a.toString() + b.toString() where a and b have Integer type
        Integer a = 42;
        Integer b = 51;
        Integer resultAB = a + b;
        String resultABtoString = a.toString() + b.toString();
        int resultComparison = resultAB.compareTo(Integer.valueOf(resultABtoString)); // The only way to compare values without getting an error
        System.out.println(resultComparison);
    }
}