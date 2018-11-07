package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class GameTool {

    /**
     * Calculates a random value between min and max
     *
     * @return  Random integer between min and max
     */
    public static int randomIntValue(int min, int max) {
        Random r = new Random();

        int randomNum = r.nextInt(max - min + 1);
        int finalNum = randomNum + min;

        return finalNum;
    }


    /**
     *  This method reads a text file.
     *
     * @param filename pure name without location or .txt
     * @return an array list with elements which are representing each line in the text file.
     * @throws IOException
     */
    public static ArrayList<String> readFromFile(String filename) throws IOException{

        ArrayList<String> values = new ArrayList<String>();  // declaring arraylist with name "values"
        values.add("spacing.....");   // add an element to 0 index, so element in index 1 is the same element
                                      // in the list in line number 1. It makes just easier to manage txt file.

        String file ="languages\\"+filename+".txt"; // inserting filename parameter to the whole file name declaration

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String currentLine = reader.readLine();  // reads a line
        while (currentLine != null){ // runs loop until the current line is not empty.
            values.add(currentLine);   // add line as an element to the array list
            currentLine = reader.readLine();  // reads next line
        }
        reader.close();


        return values;
    }
}
