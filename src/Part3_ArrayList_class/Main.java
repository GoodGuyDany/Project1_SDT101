package Part3_ArrayList_class;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        //Initializing ArrayList for Strings
        // #1
        ArrayList<String> stringArrayList = new ArrayList<>();
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        // Using methods for working with the ArrayList<String>, literally the same thing applies to ArrayList<Integer> so I decided to only work with String type
        // #2
        stringArrayList.add("Horse"); // Index 0, add(value) method
        stringArrayList.add("Pig");  // Index 1, add(value) method
        stringArrayList.add("Dog"); // Index 2, add(value) method

        System.out.println(stringArrayList); // Printing out the ArrayList after adding values

        System.out.println();
        System.out.println(); // Making some space
        System.out.println();
        // #3
        stringArrayList.add(1, "Cat"); // adding value "Cat", setting the index to 1 using add(index, value) method
        stringArrayList.add(2, "Chicken"); // adding value "Chicken", settings the index to 2 using add(index, value) method

        System.out.println(stringArrayList); // Printing out the ArrayList after making changes to it

        System.out.println();
        System.out.println(); // Making some space
        System.out.println();
        // #4
        String getArrayListEntry = stringArrayList.get(3); // using the get() method to get the value stored at index 3

        System.out.println(getArrayListEntry); // Printing out the ArrayList entry that we got using the get(index) method

        System.out.println();
        System.out.println(); // Making some space
        System.out.println();
        // #5
        stringArrayList.set(3, "Cow"); // Setting the value at index 3 to "Cow" using set() method

        System.out.println(stringArrayList); // Printing out the ArrayList after making the changes

        System.out.println();
        System.out.println(); // Making some space
        System.out.println();
        // #6
        stringArrayList.remove(3); // Removing the value at index 3 using remove(index) method

        System.out.println(stringArrayList); // Printing the ArrayList after making changes

        System.out.println();
        System.out.println(); // Making some space
        System.out.println();
        // #7
        ArrayList<String> tools = new ArrayList<>(); // Creating a new arraylist to add to the main stringArrayList
        tools.add("Pickaxe");
        tools.add("Hoe"); // Adding values to the new ArrayList
        tools.add("Shovel");
        stringArrayList.addAll(tools); // Using the addAll() method to add all the values from ArrayList<>() tools to the original ArrayList

        System.out.println(stringArrayList); // Printing the ArrayList after adding tool to it

        System.out.println();
        System.out.println(); // Making some space
        System.out.println();
        // #8
        int indexOf = stringArrayList.indexOf("Shovel"); // Getting the index of value "Shovel" in ArrayList

        System.out.println(indexOf + " This is the index of item -Shovel- in stringArrayList"); // Printing out the index

        System.out.println();
        System.out.println(); // Making some space
        System.out.println();
        // #9
        stringArrayList.remove("Pickaxe"); // Removing the item "Pickaxe" From the ArrayList

        System.out.println(stringArrayList); // Printing out the changed ArrayList

        System.out.println();
        System.out.println(); // Making some space
        System.out.println();
        // #10
        for (int i = 0; i < stringArrayList.size(); i++){
            System.out.println(stringArrayList.get(i) + " element at index: " + i); // Iterating through an ArrayList using a regular "for" loop
            }
        int f = 0;
        for (String entry : stringArrayList){
            System.out.println(entry + " element at index: " + f); // Iterating through an ArrayList using an enhanced "for" loop
            f++;
            }

        System.out.println();
        System.out.println(); // Making some space
        System.out.println();


        // 3.2.1 initialization and execution
        ArrayList<String> listOfNames = new ArrayList<>(); // Initializing an ArrayList with names
        listOfNames.add("Alfred");
        listOfNames.add("Bob");
        listOfNames.add("Chloe");
        listOfNames.add("Danylo");
        listOfNames.add("Evelyn"); // Adding names to the list
        listOfNames.add("Fred");
        listOfNames.add("Greg");
        listOfNames.add("Hayley");
        listOfNames.add("Irene");
        System.out.println(listOfNames + " - list before inserting a name"); // Printing out the list before changes
        insertName(listOfNames, "Cassandra"); // Adding the name "Cassandra" to the list, #3.2.1 execution
        System.out.println(listOfNames + " - list after inserting a name"); // Printing the list out after making changes to it

        System.out.println();
        System.out.println(); // Making some space
        System.out.println();

        // 3.2.2 Initialization and execution
        ArrayList<Integer> intsArrayList1 = new ArrayList<>(); // Initializing an empty ArrayList\
        ArrayList<Integer> intsArrayList2 = new ArrayList<>(); // Initializing an ArrayList where no elements are removed
        intsArrayList2.add(15);
        intsArrayList2.add(14);
        intsArrayList2.add(13);
        ArrayList<Integer> intsArrayList3 = new ArrayList<>(); // Initializing an ArrayList where all values are removed
        intsArrayList3.add(2);
        intsArrayList3.add(2);
        intsArrayList3.add(2);
        ArrayList<Integer> intsArrayList4 = new ArrayList<>(); // Initializing an ArrayList where only the first element gets removed
        intsArrayList4.add(10);
        intsArrayList4.add(11);
        intsArrayList4.add(12);
        ArrayList<Integer> intsArrayList5 = new ArrayList<>(); // Initializing an ArrayList where only the middle element gets removed
        intsArrayList5.add(10);
        intsArrayList5.add(11);
        intsArrayList5.add(12);
        ArrayList<Integer> intsArrayList6 = new ArrayList<>(); // Initializing an ArrayList where only the last element gets removed
        intsArrayList6.add(10);
        intsArrayList6.add(11);
        intsArrayList6.add(12);

        // Running the arrays through arrayListRemove() method
        arrayListRemove(intsArrayList1, 5);
        arrayListRemove(intsArrayList2, 10);
        arrayListRemove(intsArrayList3, 2);
        arrayListRemove(intsArrayList4, 10);
        arrayListRemove(intsArrayList5, 11);
        arrayListRemove(intsArrayList6, 12);

        // Printing out all the results after running the arrays through arrayListRemove() method
        System.out.println(intsArrayList1);
        System.out.println(intsArrayList2);
        System.out.println(intsArrayList3);
        System.out.println(intsArrayList4);
        System.out.println(intsArrayList5);
        System.out.println(intsArrayList6);

    }
    public static void insertName(ArrayList<String> list, String name){ // Initializing a method to insert a name into the ArrayList without changing the alphabetical order
        int index = 0;
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).compareTo(name) > 0){
                index = i;
                break;
            }
            index = i + 1;
        }
        list.add(index, name);
    }

    public static void arrayListRemove(ArrayList<Integer> list, int value){ // Initializing a method for removing objects from an int ArrayList
        if (list.isEmpty()){
            System.out.println("The given ArrayList is empty. (only prints this for the first, empty list)");
            return;
        }
        else{
            for (int i = list.size() - 1; i >= 0; i--){
                int elementToRemove = list.get(i);
                if (elementToRemove == value){
                    list.remove(i);
                }
            }
        }
    }
}
