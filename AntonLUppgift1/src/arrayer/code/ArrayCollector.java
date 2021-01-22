package arrayer.code;


import arrayer.ui.UIFrame;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayCollector {

    String arrayFilePath = "AntonLUppgift1/src/resources/arrayOne.txt";

        public void readArrayFile(UIFrame uiFrame){
        try {
            File arrayFile = new File(arrayFilePath);
            Scanner myReader = new Scanner(arrayFile);
            while (myReader.hasNextLine()) {
               String data = myReader.nextLine();
                makeStringArray(data, uiFrame);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public void makeStringArray(String data, UIFrame uiFrame) {
        String[] array;
        array = data.split(",");

        sendToResolver(array, uiFrame);
    }

    public void sendToResolver(String[] array, UIFrame uiFrame){

        StreamPartOne.ArrayPartOne(array, uiFrame);

    }
}