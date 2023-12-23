 
class BasicJavaPractice{
  public static void main(String []args){
    char a = '`';
 
   int b;  // this is a example of type casting 
    b = a;

     System.out.println(b);
  
  // There is also second approach in java by using in built method = Charter.getNumericValue(parameter)
  // here is the example for this
  char c ='P';
  int d = Character.getNumericValue(c);
  System.out.print(d);

//   char myChar = 'A'; // Example character
// int asciiValue = Character.getNumericValue(myChar); // Get ASCII value of 'A'
// System.out.println("The ASCII value of '" + myChar + "' is " + asciiValue);


char x= 'g';
int v = (int)x;
System.out.println(x);
System.out.println(v);

// Question one 
System.out.print("Hey there\n");
System.out.println("I am data");

//Question 2nd
System.out.println("*\n**\n***\n****");

// question 3
System.out.print(2+4+5);

//Question 4
System.out.println(45*32);
System.out.println(32-45);
  }
} 

// Another approach for type casting

// class BasicJavaPractice{
//   public static void main(String[] args) {
//     System.out.println((int)'A');// this is exlicit type casting
//   }
// }  



// input from user
//inport java.util.Scanner;
// class BasicJavaPractice{
//   public static void main(String[] args) {

//     Scanner s = new Scanner(System.in);

//   System.out.print("Enter your number= ");
//   int num = s.nextInt();
//   int num1 = s.nextInt();

//   System.out.print("Your number is "+num + " "+ num1);
    
//   }
// }