package arrayer.code;


import arrayer.ui.UIFrame;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayCollector {

    String arrayFilePath = "AntonLUppgift1/src/resources/arrayOne.txt";

        public void ReadArrayFile(UIFrame uiFrame){
        try {
            File arrayFile = new File(arrayFilePath);
            Scanner myReader = new Scanner(arrayFile);
            while (myReader.hasNextLine()) {
               String data = myReader.nextLine();
                MakeStringArray(data, uiFrame);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public void MakeStringArray(String data, UIFrame uiFrame) {
        String[] array;
        array = data.split(",");

        SendToResolver(array, uiFrame);
    }

    public void SendToResolver(String[] array, UIFrame uiFrame){

            StreamPartOne streamPartOne = new StreamPartOne();
        streamPartOne.ArrayPartOne(array, uiFrame);


    }
}