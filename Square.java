import java.util.Scanner;
// import java.util.*;


public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number for finding Square root:");
        float a = sc.nextFloat();

        // float root =  (float) Math.pow(a,(0.5));
        double root = Math.sqrt(a);

        System.out.println(root);


sc.close();
    }
}
