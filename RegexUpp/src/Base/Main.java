package Base;

import Base.Code.AnswerHandler;
import Base.Code.TextHandler;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;



public class Main
    {
        private static final Map<String, Integer> userOptions = Map.of("a", 0, "b", 1, "c", 3, "d",3, "e", 4, "f", 5, "g", 6, "h",7, "i", 8, "j", 9);
        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws FileNotFoundException {
            startScanner();
        }



        public static void startScanner() throws FileNotFoundException {


                System.out.println("Welcome to Regex Assignment Viewer\n\nPlease choose which part of the assignment you wanna see.\nYou can make your choose by typing in the letter you see after each Part name.\nPart 1 = A\nPart 2 = B\nPart 3 = C\nPart 4 = D\nPart 5 = E\nPart 6 = F\nPart 7 = G\nPart 8 = H\nPart 9 = I\nPart 10 = J");

                 String scannerInput = scanner.nextLine();

                if (!isValidInput(scannerInput.toLowerCase())) {

                    System.out.println("Ogiltig input");
                    startScanner();
                }
                else
                {
                    if(userOptions.get(scannerInput.toLowerCase())!=null)
                    {
                       AnswerHandler.selectedPart =  userOptions.get(scannerInput.toLowerCase());
                        TextHandler.readFile();
                    }
                }
        }

        private static boolean isValidInput(String input) {
            return userOptions.containsKey(input);
        }
    }

