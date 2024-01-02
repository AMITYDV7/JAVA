// import java.util.Scanner;
// public class iforelse {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter your length and breadth: ");
//         int l = sc.nextInt();
//         int b = sc.nextInt();

//         if(l==b){
//             System.out.println("it's a Square");
//         }

//         else{
//             System.out.println("It's a rectangle");
//         }

//     }
// }


//Question 2 
// import java.util.Scanner;
// public class iforelse {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter your both numbers: ");
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         if(a>b){
//             System.out.println("a is greater than b");
//         }
//         else{
//             System.out.println("b is greater");
//         }

//     }
// }

// Question 3 -- my approach of this question

import java.util.Scanner;
class iforelse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Quantity: ");
        int a = sc.nextInt();
    if(a>10){

    System.out.println("Your amount is: "+ ((a*100)-((a*100)/10)));
    }
else{

    System.out.println("your amount is "+ (a*100));
}
    }
}


// This is a another appraoch for this question


// import java.util.Scanner;
// class iforelse{
//   public static void main(String[] args){
//     Scanner s = new Scanner(System.in);
//     System.out.println("Enter quantity");
//     int x = s.nextInt();
//     if((x*100)>1000){
//       System.out.println("You get a discount of "+(.1*x*100)+" and your total cost is "+(x*100-(.1*x*100)));
//     }
//     else{
//       System.out.println("No discount");
//     }
//   }
// }

