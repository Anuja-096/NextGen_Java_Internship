import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Task10FileHandling {

    public static void main(String[] args) {

        String fileName = "internship.txt";

        try {
            // Writing data into a file
            FileWriter writer = new FileWriter(fileName);
            writer.write("Java File Handling\n");
            writer.write("This is Week 3 Task 2.\n");
            writer.write("Learning to write and read files.");
            writer.close();

            System.out.println("Data written successfully.");

            // Reading data from the file
            BufferedReader reader =
                    new BufferedReader(new FileReader(fileName));

            String line;
            System.out.println("\nFile Content:");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
