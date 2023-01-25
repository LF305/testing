package ProblemSet2;
import java.util.Scanner;
public class Time {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
        System.out.println("What is the starting hour?");
        int start = scanner.nextInt();
        System.out.println("am or pm?");
        String day = scanner.next();
        System.out.println("How many hours have elapsed?");
        int elapsed = scanner.nextInt();
        int end = start + elapsed;
        if (start==12 && elapsed<12){
            end -= 12;
            System.out.println(end);
            System.out.println(day);
        } else{
            if (end>12){
                while (end>12){
                    end-=12;
                    switch(day){
                    case "am":
                    day="pm";
                    break;
                    case "pm":
                    day="am";
                    break;
                    default:
                    System.out.println("invalid inputs");
                    }
                System.out.println(end);
                System.out.println(day);
            }
            }else{
            System.out.println(end);
            System.out.println(day);
            }
        }
     }    
}