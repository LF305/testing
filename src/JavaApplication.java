import java.io.*;
public class JavaApplication {
    public static void main(String[] args)
    {
        int base = 3, power = 3;
        int result = 1;
        while (power != 0) {
            result = result * base;
             power--;
        }
        System.out.println("Result =  " + result);
    }
}
