package Part6_Classes;

public class Main {
    public static void main(String[] args) {
        // #6.1
        Counter counter1 = new Counter(); // Creating objects of class Counter
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        Counter counter4 = new Counter();
        Counter counter5 = new Counter();

        System.out.println(Counter.getInstanceCount() + " - total number of instances"); // Printing out the total number of instances using the getInstanceCount() method

        System.out.println();
        System.out.println(); // Making some space
        System.out.println();

        // #6.2
        Person Danylo = new Person(); // Creating a new person and assigning the values using the default constructor with the help of setters.
        Danylo.setName("Danylo");
        Danylo.setSurname("Mamchur");
        Danylo.setBirthYear(2004);
        Danylo.printPersonInfo(); // Checking the value of the instance fields using a method creaeted for it

        System.out.println();
        System.out.println(); // Making some space
        System.out.println();

        Person Uliana = new Person("Uliana", "Mamchur", 2004); // Creating a second person using a constructor with declared fields
        Uliana.printPersonInfo(); // Checking the value of the instance fields of the second person

        System.out.println();
        System.out.println(); // Making some space
        System.out.println();

        System.out.println("Is adult? - " + Uliana.isAdult());
        System.out.println("Is adult? - " + Danylo.isAdult());
    }
}
