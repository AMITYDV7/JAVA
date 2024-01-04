 import java.util.Scanner;
// public class iforelse {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

import javax.sound.midi.Soundbank;

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

// import java.util.Scanner;
// class iforelse{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter your Quantity: ");
//         int a = sc.nextInt();

       
//     if(a>10){
//          System.out.print("Enter your percentage: ");
//         int p = sc.nextInt();

//     System.out.print(((a*100)-((1.0/p)*a*100)));
//     }
// else{

//     System.out.println("your amount is "+ (a*100));
// }
//     }
// }


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


// Question 4
// class iforelse{
//     public static void main(String[] args) {
//         int s,yos;

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter your Salary: ");
//         s = sc.nextInt();

//         System.out.print("Enter your year of services: ");
//         yos = sc.nextInt();

//         if(yos>5){
//             System.out.print("Enter salary bonus is :"+(s/100*5)+ "And Salary is: "+(s + (s/100*5)));
//         }

//         else{
//             System.out.println("Your salary is: "+ s);
//         }
//     }
// }


//        Question 5
class iforelse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int a = sc.nextInt();

        if(a<25){
            System.out.println("Your grade is F");
        }
        else if((a>=25)&& (a<45)){
            System.out.println("Your grade is E");
        }
        else if((a>=45)&& (a<50)){
            System.out.println("Your grade is D");
        }
        else if((a>=50)&&(a<60)){
            System.out.println("Your grade is C ");
        }
        else if((a>=60)&&(a<80)){
            System.out.println("Your grade is B");
        }
        else if((a>=80)&&(a<=100)){
            System.out.println("Your grade is A");
        }
        else{
            System.out.println("Padh le Bhai kya kr rha hai life mai");
        }
    }
}


