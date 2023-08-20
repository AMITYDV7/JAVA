 
 import java.util.Scanner;
 class addition{
    void add(){
Scanner scan = new Scanner(System.in);
System.out.print("Enter your Number:");
int num1 = scan.nextInt();

System.out.print("Enter your second number:");
int num2 = scan.nextInt();

int result = num1 + num2;
System.out.println("Addition of your number: "+result);
System.out.print("Congratulation your program have zero Error");
    }
 } 
 class SumOfTwoNumber{
    public static void main(String[] args) {
        addition a = new addition();
        a.add(); 
    
    }
 }
    

