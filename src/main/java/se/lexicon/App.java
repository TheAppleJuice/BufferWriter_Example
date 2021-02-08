package se.lexicon;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App
{
    public static void main( String[] args ) {

        //Call for method to write content to text file.
        List<String> content= Arrays.asList("Hello", "Sebastian");
        File url= new File("/Users/sebastianbocaciu/Documents/BufferWriter.txt");
        write(url, content);


        //Call for method to print out content in text file.
        File url2 = new File ("/Users/sebastianbocaciu/Documents/BufferWriter.txt");
        for (String string : read(url2)){
            System.out.println(string);
        }



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

    public static List<String> read(File source) {
        List<String> strings = new ArrayList<>();
        try (BufferedReader reader= new BufferedReader(new FileReader(source))) {
            String line;
            while((line= reader.readLine()) != null) {
                strings.add(line);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
        return strings;
    }

}
