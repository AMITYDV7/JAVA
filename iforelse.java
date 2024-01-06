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
// class iforelse{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter your marks: ");
//         int a = sc.nextInt();

//         if(a<25){
//             System.out.println("Your grade is F");
//         }
//         else if((a>=25)&& (a<45)){
//             System.out.println("Your grade is E");
//         }
//         else if((a>=45)&& (a<50)){
//             System.out.println("Your grade is D");
//         }
//         else if((a>=50)&&(a<60)){
//             System.out.println("Your grade is C ");
//         }
//         else if((a>=60)&&(a<80)){
//             System.out.println("Your grade is B");
//         }
//         else if((a>=80)&&(a<=100)){
//             System.out.println("Your grade is A");
//         }
//         else{
//             System.out.println("Padh le Bhai kya kr rha hai life mai");
//         }
//     }
// }


//    Question 6

// class iforelse{
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter your 1st age: ");
//         int a= sc.nextInt();

//         System.out.print("Enter your 2nd age: ");
//         int b= sc.nextInt();

//         System.out.print("Enter your 3rd age: ");
//         int c = sc.nextInt();


//         // for oldest
//         if((a>=b)&&(a>=c)){
//             System.out.println("1st person is oldest");
//         }
//         else if((b>=a)&&(b>=c)){
//             System.out.println("2nd is oldest");
//         }
//         else{
//             System.out.println("C is oldest");
//         }

//         // for youngest
//         if((a<=b)&& (a<=c)){
//             System.out.println("A is Youngest");
//         }
//         else if((b<=a) && (b<=c)){
//             System.out.println("B is Youngest");
//         }
//         else{
//             System.out.println("C is Youngest");
//         }

//     }
// }


// We can also use another appraoch for this 
//by using in bulid method of maths class 

// class iforelse{
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter your 1st age: ");
//         int a= sc.nextInt();

//         System.out.print("Enter your 2nd age: ");
//         int b= sc.nextInt();

//         System.out.print("Enter your 3rd age: ");
//         int c = sc.nextInt();

       
        
//         System.out.println("The oldest in this is: "+Math.max(Math.max(a, b),c));
//         System.out.println("Youngest among them: "+ Math.min(Math.min(a, b),c));
//     }
// }


// Question 7
// class iforelse{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter your number: ");
//         int a = sc.nextInt();

//         if(a<0){
//             System.out.println("The absolute value of your number is "+ a*-1);
//         }
//         else{
//             System.out.println("The absolute value of your number is "+a);
//         }


// // we can also use this in build method of Math class for finding absolute value of any number 
//         System.out.println(Math.abs(-45));
//     }
// }

// Question 8
// class iforelse{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the number of class held: ");
//         double held = sc.nextInt();

//         System.out.print("Enter the number of class atennded: ");
//         double attend = sc.nextInt();

//         double per = attend/held*100;

//         if(per>75){
//             System.out.println("Your percentage of attendance is "+ per + " You are Eligible");
//         }
//         else{
//             System.out.println("Your the not eligible: " + per + " Because of this");
//         }
//     }
// }

// Question 10
// class iforelse{
//   public static void main(String[] args){
//     int x = 2;
//     int y = 5;
//     int z = 0;
//     System.out.println(x==2);
//     System.out.println(x != 5);
//     System.out.println(x != 5 && y >= 5);
//     System.out.println(z != 0 || x == 2);
//     System.out.println(!(y < 10));
//   }
// }

// Question 11
// class iforelse{
//     public static void main(String[] args) {
      
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter your character: ");
//         String a = sc.nextLine();

//         int b = (int)a.charAt(0);
        
//         if((b>=65)&&(b<=90)){
//             System.out.println("This is upper case character");
//         }
//         else if((b>=97)&&(b<=122)){
//             System.out.println("This is lower case character");
//         }
//         else{
//             System.out.println("This is invalid input");
//         }
//     }
// }


//       Level ===2
// Question 1
class iforelse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your year: ");
        int a = sc.nextInt();

        if(a%4==0){
            System.out.println("This is a leap year");

            if(a%100==0){
                if(a%400==0){
                System.out.print("This is so divide by 400");
            }
        }
        else{
            System.out.print(" This is not a leap year");
        }
    }
}
}





