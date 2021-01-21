package arrayer.code;


import arrayer.ui.UIFrame;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayCollector {


        public void ReadArrayFile(UIFrame uiFrame){
        try {
            File arrayFile = new File("C:\\Users\\anton\\Desktop\\InUppEttUI\\Java\\InUppEttUI\\src\\resources\\arrayOne.txt");
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
        String[] array = null;
        array = data.split(",");

        SendToResolver(array, uiFrame);
    }

    public void SendToResolver(String[] array, UIFrame uiFrame){

            StreamPartOne streamPartOne = new StreamPartOne();
        streamPartOne.ArrayPartOne(array, uiFrame);


    }
}