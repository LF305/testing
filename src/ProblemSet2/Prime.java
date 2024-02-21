package ProblemSet2;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter an integer");
        int integer = scanner.nextInt(); 
        int number = 2;
        int i = 2; 
        boolean isPrime = true;
        while (i<integer){
            while (number<i) {
                if (i%number == 0) {
                    isPrime = false; 
                }
                number++;
            }
            if (isPrime == true & i!=2) {
                System.out.println(i);
            } 
            i++;
            isPrime=true;
            number=2;
        }
        scanner.close();
    }
}
