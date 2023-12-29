import java.util.Scanner;
public class inputbyuser {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your 1st number ");
        int num1 = sc.nextInt();

        System.out.print("Enter your 2nd number ");
        int num2 = sc.nextInt();

        System.out.println("Your sum of these number is "+ (num1+num2));

        System.out.println("Your product of these number is "+ (num1*num2));
        sc.close(); 

        // que 3 
        
    }
    
}
