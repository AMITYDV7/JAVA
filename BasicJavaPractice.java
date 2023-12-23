/* 
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

  }
} */

class BasicJavaPractice{
  public static void main(String[] args) {
    System.out.println((int)'A');// this is exlicit type casting
  }
}