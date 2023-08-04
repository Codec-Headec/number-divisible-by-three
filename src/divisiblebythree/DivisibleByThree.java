package divisiblebythree;
import java.util.*;

public class DivisibleByThree{
    public static void main(String[] args) {
        int num;
        Scanner sc;

        sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        num = sc.nextInt();

        if (num%3 == 0)
            System.out.println("Number is divisible by 3");

        else
            System.out.println("Number is not divisible by 3");
    }
}