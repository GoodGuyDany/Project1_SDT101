package Part6_Classes;

import java.util.Calendar;

public class Person {
    // Declaring all the private values an object of class "Person" is going to have.
    private String name;
    private String surname;
    private int birthYear;
    // Declaring setters
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }
    // Declaring getters
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public int getBirthYear(){
        return birthYear;
    }
    public void printPersonInfo(){ // Creating the printPersonInfo method for formatted console output
    System.out.println("Name: " + name);
    System.out.println("Surname: " + surname);
    System.out.println("Birth year: " + birthYear);
    }
    public static int COMING_OF_AGE = 18; // Declaring a constant for later comparison
    public boolean isAdult(){ // Declaring a method for checking if a person is 18 or not.
        int yearToday = Calendar.getInstance().get(Calendar.YEAR);
        return yearToday - birthYear >= COMING_OF_AGE;
    }
    public Person(){ // Declaring a default constructor
    }
    public Person(String name, String surname, int birthYear){
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }
}
