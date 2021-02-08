package se.lexicon;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class App
{
    public static void main( String[] args ) {
        List<String> content= Arrays.asList("Hello", "Sebastian");
        File url= new File("/Users/sebastianbocaciu/Documents/BufferWriter.txt");
        write(url, content);


    }
    public static List<String> write(File destination, List<String> text) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(destination))) {
            for (String toWrite: text) {writer.write(toWrite);
            writer.newLine();
        }
            writer.flush();

        } catch(IOException e) {
            e.printStackTrace();
        }
        return text;
    }

}
