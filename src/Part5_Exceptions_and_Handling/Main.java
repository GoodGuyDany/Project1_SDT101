package Part5_Exceptions_and_Handling;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[3]; // Declaring an array with 3 elements
        a[0] = 30;
        a[1] = 340;
        a[2] = 3440;
        try{ // Declaring the try-catch block
            System.out.println(a[3]); // Trying to access the non-existing element
        }catch (ArrayIndexOutOfBoundsException e){ // Catching the exception if it happens
            System.err.println("IndexOutOfBoundsException"); // Handling the exception
        }

        System.out.println();
        System.out.println(); // Making some space
        System.out.println();

        int[] b = new int[3];
        b[0] = 30;
        b[1] = 340;
        b[2] = 3440;
        try{
            System.out.println(a[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println("IndexOutOfBoundsException");
        }finally{
            assert System.err != null;
            System.err.println("Code ended");
        }
    }
}
