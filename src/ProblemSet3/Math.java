package ProblemSet3;
import java.util.Scanner;
public class Math {
        public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner (System.in);
            System.out.println("what operation would you like to use?");
            String math = scanner.nextLine();
            System.out.println("Enter your 2 numbers");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            switch(math){
                case "multiply":
                multiply(x, y);
                break;
                case "add":
                add(x, y);
                break;
                case "subtract":
                subtract(x, y);
                break;
                case "divide":
                divide(x, y);
                break;
                default:
                System.out.println("Invalid input");
            }
        }
        public static void add(double x, double y){
            System.out.println(x+y);
        }
        public static void multiply(double x, double y){
            System.out.println(x*y);
        }
        public static void subtract(double x, double y){
            System.out.println(x-y);
        }
        public static void divide(double x,double y){
            System.out.println(x/y);
        }
    }