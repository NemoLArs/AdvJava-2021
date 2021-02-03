package Base.Code;

import java.io.FileNotFoundException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AnswerHandler {

    public static int selectedPart;

    public static void giveAnswer(String lineText, int count) throws FileNotFoundException {


        switch (selectedPart) {
            case 0 -> answerPartZero(lineText, count);
            case 1 -> answerPartOne(lineText, count);
            case 2 -> answerPartTwo(lineText, count);
            case 3 -> answerPartThree(lineText, count);
            case 4 -> answerPartFour(lineText, count);
            case 5 -> answerPartFive(lineText, count);
        }
    }

    static void answerPartZero(String lineText, int count) throws FileNotFoundException {

        Pattern pattern = Pattern.compile("abcdefghijlklmnopqstuvxyz+");
        Matcher matcher = pattern.matcher(lineText);
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Line:"+count+" : "+lineText);
        }


    }

    static void answerPartOne(String lineText, int count){

        Pattern pattern = Pattern.compile("ola+");
        Matcher matcher = pattern.matcher(lineText);
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Line:"+count+" : "+lineText);
        }

    }

    static void answerPartTwo(String lineText, int count){

        Pattern pattern = Pattern.compile("[aB]{3,5}");
        Matcher matcher = pattern.matcher(lineText);
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Line:"+count+" : "+lineText);
        }

    }
    static void answerPartThree(String lineText, int count){

        Pattern pattern = Pattern.compile("\\p{Punct}");
        Matcher matcher = pattern.matcher(lineText);
        boolean matchFound = matcher.find();
        if(matchFound)
        {
            System.out.println("Line:"+count+" : "+lineText);
        }
    }
    static void answerPartFour(String lineText, int count){

        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");
        Matcher matcher = pattern.matcher(lineText);
        boolean matchFound = matcher.find();
        if(matchFound)
        {
            System.out.println("Line:"+count+" : "+lineText);
        }

    }

    static void answerPartFive(String lineText, int count){
        Pattern pattern = Pattern.compile("[aB]{3,5}");
        Matcher matcher = pattern.matcher(lineText);
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Line:"+count+" : "+lineText);
        }

    }

}
