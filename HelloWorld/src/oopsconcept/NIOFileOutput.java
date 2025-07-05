package oopsconcept;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.io.IOException;

public class NIOFileOutput {
    public static void main(String[] args) {
        String content = "Hello, World!\nThis is a file output example using NIO.";
        
        try {
            Files.write(Paths.get("nio_output.txt"), content.getBytes(StandardCharsets.UTF_8));
            System.out.println("Data written to file successfully using NIO.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
