package Part6_Classes;

public class Counter {
    private static int instanceCounter = 0; // Declaring a static variable for instance counter, this value should be private as to reduce the complexity of this program(encapsulation).

    private static void incrementCount(){ // Creating the incrementCount variable that increments the instanceCounter each time the constructor is called. Should be private for encapsulation because it's only used inside of this class.
        instanceCounter++;
    }
    public Counter (){ // Creating the constructor for objects of class Counter. Should be public for the user  to be able  to call the constructor and create new objects.
        incrementCount(); // Calls the method increment count once a new object gets created.
        System.out.println("The current number of instances is: " + instanceCounter);
    }

    public static int getInstanceCount() { // Getting the instanceCounter value. Should be public for the user to be able to call it to get the instanceCounter(getter).
        return instanceCounter;
    }
}
