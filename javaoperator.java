public class javaoperator {
    public static void main(String[] args) {

int l=5,b=7;
int area = l*b,perimeter = 2*(l+b);

System.out.println("Area is"+area  +"perimter is"+perimeter);

        System.out.println("Perimeter of triangle is "+ (2+3+5));

        System.out.println((((8+2345)/3)%5)*5);

        int number;
        number = 2345;
        number += 8;
        

        int F =76;
        double C = (F-32)*5/9;
        System.out.println(C);


        int n=12345;
        System.out.println(n + "6" + "7");

        int x = 455;// This type question is solved by modulus and divide approach
        int first_no = x/100;
        int second_no = (x/10)%10;
        int third_no =x%10;
        int result = first_no + second_no + third_no;
        System.out.println(result);


        // we can use this appraoch for reverse this number by just print each digit one by one 
        // just remind ine thing you have to add there hundred tens value digit with them

        int result1 = third_no*100 + second_no*10 + first_no;
        System.out.println(result1);


    }
}
