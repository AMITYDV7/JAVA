import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
// This code without apply opps concept on this
class Square{
    float length;
    float area;
    public void  acceptInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of square : ");
        length = sc.nextFloat();
    }

    public void compute()
    {
        area = length*length;
    }

public void display()
{
    System.out.println("Area of square is: "+ area);
}
}
// Creating rectangle class with method
class Rectangle{
    float length;
    float breadth;
    float area;

    public void acceptInput(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of reactangle :");
        length = sc.nextFloat();

        System.out.print("Enter the breadth of rectangle :");
        breadth = sc.nextFloat();
    }

    public void compute(){
        area = length*breadth;
    }
    
    public void display(){
        System.out.println("Area of rectabgle is "+area);
    }
}


class Circle{
    float radius;
    float area;

    public void acceptInput(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle : ");
        radius = sc.nextFloat();
       }

       public void compute(){
        area = 3.14f *radius*radius;
       }
       
       public void display(){
        System.out.println("Area of circle is "+area);
       }
}

class Assignment2{
    public static void main(String[] args) {
       Square s = new Square();
       Rectangle r = new Rectangle();
       Circle c = new Circle();
       
       s.acceptInput();
       s.compute();
       s.display();

       r.acceptInput();
       r.compute();
       r.display();

       c.acceptInput();
       c.compute();
       c.display();
    }
}


