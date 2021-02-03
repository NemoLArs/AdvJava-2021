package Base.Code;


import Base.Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextHandler {


    public static void readFile() throws FileNotFoundException {

        File fileObject = new File("src/Base/Resources/Text.txt");
        int count = 0;
        System.out.println("Results: ");
        if (fileObject.canRead()) {
            Scanner scanner = new Scanner(fileObject);
            while (scanner.hasNextLine()) {
                String lineText = scanner.nextLine();
                count++;
                AnswerHandler.giveAnswer(lineText, count);

            }
        }
        else
        {

            System.out.println("Failed to read File");

        }
        System.out.println("");
        Main.startScanner();
    }
}
