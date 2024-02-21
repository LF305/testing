package ProblemSet1;
import java.util.Scanner;
public class QuestionFour {
    public static void main(String[] args) throws Exception {
   System.out.println("True or false test");
   System.out.println("True or false, three dogs survived the Titanic sinking");
   Scanner scanner = new Scanner (System.in);
   int score = 0;
   String one;
   one = scanner.nextLine();
   if (one.equals ("true")) {
     score++;
   }
   System.out.println("True or false, a snail can sleep for three years");
   String two;
   two = scanner.nextLine();
   if (two.equals ("true")) {
     score++;
   }
   System.out.println("True or false, slugs have three noses");
   String three;
   three = scanner.nextLine();
   if (three.equals ("false")) {
    score++;
  }
  System.out.println("True or false, the heart of a shrimp is located in it's head");
   String four;
   four = scanner.nextLine();
   if (four.equals ("true")) {
    score++;
   }
   System.out.println("True or false, it takes a sloth three weeks to digest its food");
   String five;
   five = scanner.nextLine();
   if (five.equals ("false")) {
    score++;
   } 
   if (score >= 3) {
     System.out.println("You win... Tryhard");
   } else {
     System.out.println("You just lost a 5 question quiz.");
   }
   scanner.close();
  }
}