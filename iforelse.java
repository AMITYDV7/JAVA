import java.util.Scanner;
public class iforelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your length and breadth: ");
        int l = sc.nextInt();
        int b = sc.nextInt();

        if(l==b){
            System.out.println("it's a Square");
        }

        else{
            System.out.println("It's a rectangle");
        }

    }
}
