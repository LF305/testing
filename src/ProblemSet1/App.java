package ProblemSet1;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
   System.out.println("What is the temperature in celsius?");
   Scanner scanner = new Scanner (System.in);
   int celsius; 
   celsius = scanner.nextInt();
   System.out.println(celsius*1.8+32);
   scanner.close();
    }
}
