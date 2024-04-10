package com.mycompany.app;

import java.io.FileReader;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        String filePath = "/Users/bhumitmehta/projects/alag/my-app/src/main/java/com/mycompany/app/test.txt";

        // Try-with-resources statement to automatically close the FileReader
        try (FileReader fileReader = new FileReader(filePath)) {
            int character;
            int lines=0;
            // Read characters until end of file (EOF) is reached
            while ((character = fileReader.read()) != -1) {
                // Process the character (e.g., print it)
                System.out.println((char) character);
                if((char)character == '\n'){
                         System.out.println("here is the new line ");
                         lines++;
                }
            }
            System.out.println(lines);
        } catch (IOException e) {
            // Handle any IO exceptions that may occur
            e.printStackTrace();
        }
    }
}
