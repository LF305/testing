package ProblemSet3;
import java.util.Scanner;
import java.lang.Math;
public class Random{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
        double number = Math.random()*10;
        number = Math.round(number);
        int chances=1;
        int guess = 0;
        while(chances<=5){
            System.out.println("What is your guess?");
            guess = scanner.nextInt();
            if (guess==number){
                System.out.println("Right number, you win");
                chances = 7;
            } else {
                System.out.println("Wrong number");
                chances++;
            }
        }
        if(chances==6){
            System.out.println("You failed to guess the number. It was");
            System.out.println(number);
        }
        scanner.close();
    }
}