// import java.util.Scanner;
// public class inputbyuser {
//     public static void main(String []args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your 1st number ");
//         int num1 = sc.nextInt();

//         System.out.print("Enter your 2nd number ");
//         int num2 = sc.nextInt();

//         System.out.println("Your sum of these number is "+ (num1+num2));

//         System.out.println("Your product of these number is "+ (num1*num2));
//         sc.close(); 

//         // que 3 area of rectangle related question 
        
//         System.out.println("Enter length ");
//         double l = sc.nextDouble();
        
//         System.out.println("ENter your breadth ");
//         double b = sc.nextDouble();

//         System.out.println("Area of rectangle is " + (l*b));
//     }
    
// }

import java.util.Scanner;
class inputbyuser{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Enter your Roll number:");
        int rollnu = sc.nextInt();

        sc.nextLine();////To consume '\n' left by ENTER KEY, it is not consumed by nextInt()

        System.out.print("Enter your field of interest:");
        // we can also add consume line there 
        String field = sc.nextLine();
       

        System.out.println("My name is "+ name + " My roll number is " + rollnu + " My field of interest is " + field);
        sc.close();
    }

}