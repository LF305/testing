package ProblemSet3;
import java.util.Scanner;
public class Shape {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
        System.out.println("what is the radius of your circle?");
        double radius = scanner.nextDouble();
        System.out.println("what measurment would you like to find?");
        String operation = scanner.next();
        switch(operation){
            case "diameter":
            diameter(radius);
            break;
            case "circumference":
            circumference(radius);
            break;
            case "area":
            area(radius);
            break;
            default:
            System.out.println("Invalid input");
        }
    }
    public static void diameter(double radius){
        System.out.println(radius*2);
    }
    public static void circumference(double radius){
        System.out.println(3.14*2*radius);
    }
    public static void area(double radius){
        System.out.println(radius*radius*3.14);
    }
}