package ProblemSet1;
import java.util.Scanner;
public class QuestionTwo {
    public static void main(String[] args) throws Exception {
   System.out.println("What number do you want to divide?");
   Scanner scanner = new Scanner (System.in);
   int number; 
   number = scanner.nextInt();
   if (number % 4 > 0) {
     System.out.println("This number is not divisible by 4");  
   } else {
     System.out.println("This number is divisible by 4"); 
   }
   if (number % 7 > 0) {
     System.out.println("This number is not divisible by 7");
   } else {
     System.out.println("This number is divisible by 7");
   }
    }
}