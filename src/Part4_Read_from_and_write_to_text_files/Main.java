package Part4_Read_from_and_write_to_text_files;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        try {
            // Get user input
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the name of the input file: ");
            String inputFile = reader.readLine();

            // Open the desired file for reading
            BufferedReader fileReader = new BufferedReader(new FileReader(inputFile));

            // Create a new file by adding .txt to the one we are reading
            String newFile = inputFile + ".txt";

            // Open the output file for writing (To test an empty file use "src/Part2_Wrappers/Test.java")
            PrintWriter fileWriter = new PrintWriter(new FileWriter(newFile));

            String line;
            int ln = 1;

            // Go through the lines of code and add numeration to them
            while ((line = fileReader.readLine()) != null) {
                // Format line number with leading 0's and write to output file
                fileWriter.printf("[%03d] %s%n", ln++, line);
            }

            System.out.println("Done!");

            // Close the reader and writer
            fileReader.close();
            fileWriter.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}