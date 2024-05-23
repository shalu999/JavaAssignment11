package ErrorHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ass8Filenotfound {
	public static void main(String[] args) {
        String filePath = "D:\\22.txt";  // This should be the path to the file you want to read

        try {
            readFile(filePath);
        } catch (FileNotFoundException e) {
            System.out.println("Error: The file was not found.");
        } catch (IOException e) {
            System.out.println("Error: An IO error occurred while reading the file.");
        }
    }

    public static void readFile(String filePath) throws FileNotFoundException, IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

	
	

}
