package ProblemSet2;
import java.util.Scanner;
public class BetterExclamation { 
    public static void main(String[] args) throws Exception {
        int number = 1;
        String exclamation = "!";
        while (number<10){
            System.out.println(exclamation);
            exclamation+="!";
            number++;
        }
    }
}
