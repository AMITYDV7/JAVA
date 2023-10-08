// import java.util.Scanner;
// public class ConditionQuestionPractice 
// {
    // Question 1 ) Write a program to find out the enter number is positive or negative
    /*public static void main(String args[])
  {
Scanner scan = new Scanner(System.in);

System.out.print("Enter your number:");
int num1 = scan.nextInt();

if(num1>0){
    System.out.print("Your number is positive");
}
else if(num1<0){
    System.out.println("Your number is negative");
}
else{
    System.out.println("Your number is Zero");
}
scan.close();
  } */


  // Question 2) WAP to finding roots of quadratic equation !
      /*   public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
System.out.print("Enter the value of a: ");
double a= scan.nextDouble();

System.out.print("Enter the value of b: ");
double b= scan.nextDouble();

System.out.print("Enter the value of c: ");
double c= scan.nextDouble();

double d = (b*b) - 4*a*c;
System.out.println("The deteriment of this equation is: " + d);

if(d>0){
    double r1 = (-b + Math.sqrt(d)) /( 2*a);
    double r2 = (-b - Math.sqrt(d)) /( 2*a);
    System.out.println("The root of this equation is " + r1 + "and" + r2);
}
else if (d==0){
    System.out.println("Your root are real");
    double R1 =  -b/(2*a);
    double R2 =  -b/(2*a);
    System.out.println("Your root are "+ R1 + R2);
}
else{
    System.out.println("Your Equation has no real roots");
}
            scan.close();
        }
    }
*/

// <<<<---------- Question ==3 ----------->>>>>>>>>>>>>>>
//Compare three number and tell wqhich is greatest

 /* import java.util.Scanner;
class ConditionQuestionPractice{
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
System.out.println("enter the value of a , b and c");
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();

if(a>b){
   if(a>c){
        System.out.println("A is greatest");
   }
    }
if(b>a){
    if(b>c){
       System.out.println("B is greatest");
    }
}
else{
    System.out.println("C is greatest");
}


sc.close();
    }
} */

//          <<--------- Question = 4 ------------>>
/* 
import java.util.Scanner;
class ConditionQuestionPractice{
    public static void main(String[] args) {
        System.out.print("Enter yout number:");
        Scanner sc = new Scanner(System.in);
        float f = sc.nextFloat();

        if(f<0){
            System.out.println("negative number");
        }
        else if(f>0){
            System.out.println("Positive number");
        }
        else{
            System.out.println("Your number is Zero");
        }
        sc.close();

    }
} */

//<<<<<<<<<-------- Question 5 ------->>>>>>
/* 
import java.util.Scanner;
class ConditionQuestionPractice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number:");
        int a = sc.nextInt();

        switch(a){
            case 1: System.out.print("Monday");
            break;
            case 2: System.out.print("Tuesday");
            break;
            case 3: System.out.print("Wednesday");
            break;
            case 4: System.out.print("Thrusday");
            break;
            case 5: System.out.print("Friday");
            break;
            case 6: System.out.print("Saturday");
            break;
            case 7: System.out.print("Sunday");
            default:System.out.println("Invalid input");

           sc.close();         
        }
    }
} */
