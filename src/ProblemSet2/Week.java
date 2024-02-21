package ProblemSet2;
import java.util.Scanner;
public class Week {
    public static void main(String[] args) throws Exception {
    System.out.println("Enter a number from 1 to 7");
    String[] arr = {"invalid input", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    Scanner scanner = new Scanner (System.in);
    boolean shouldContinue = true;
    while (shouldContinue){
    int number = scanner.nextInt();
    if (number>=8 || number==0){
        System.out.println("Invalid input");
        System.out.println("Enter a number from 1 to 7");
    } else{ 
        System.out.println(arr[number]);
        shouldContinue = false;
    }
    }
    scanner.close();
    }   
}