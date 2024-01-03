// import java.util.Scanner;

// import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
// // This code without apply opps concept on this
// class Square{
//     float length;
//     float area;
//     public void  acceptInput()
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the length of square : ");
//         length = sc.nextFloat();
//     }

//     public void compute()
//     {
//         area = length*length;
//     }

// public void display()
// {
//     System.out.println("Area of square is: "+ area);
// }
// }
// // Creating rectangle class with method
// class Rectangle{
//     float length;
//     float breadth;
//     float area;

//     public void acceptInput(){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the length of reactangle :");
//         length = sc.nextFloat();

//         System.out.print("Enter the breadth of rectangle :");
//         breadth = sc.nextFloat();
//     }

//     public void compute(){
//         area = length*breadth;
//     }
    
//     public void display(){
//         System.out.println("Area of rectabgle is "+area);
//     }
// }


// class Circle{
//     float radius;
//     float area;

//     public void acceptInput(){

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the radius of circle : ");
//         radius = sc.nextFloat();
//        }

//        public void compute(){
//         area = 3.14f *radius*radius;
//        }
       
//        public void display(){
//         System.out.println("Area of circle is "+area);
//        }
// }

// class Assignment2{
//     public static void main(String[] args) {
//        Square s = new Square();
//        Rectangle r = new Rectangle();
//        Circle c = new Circle();
       
//        s.acceptInput();
//        s.compute();
//        s.display();

//        r.acceptInput();
//        r.compute();
//        r.display();

//        c.acceptInput();
//        c.compute();
//        c.display();
//     }
// }


// // With oops 
import java.util.Scanner;
abstract class shape{
    float area;

    abstract public void acceptInput();
    abstract public void compute();

    public void display(){
        System.out.println("Area is: "+area);
    }
}


class square extends shape{
    float length;

    public void acceptInput(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length of square is: ");
    length = sc.nextFloat();
    }
    public void compute(){
        area = length*length;
    }
    }


class reactangle extends shape{
     private  float length;
     private float breadth;

    public void acceptInput(){// it is type of a setter
        Scanner sc = new Scanner(System.in);// this is a setter

        System.out.print("Enter the length : ");
        length = sc.nextFloat();

        System.out.print("Enter the breadth :");
        breadth = sc.nextFloat();
    }

    public void compute(){
        area = length*breadth;
    }
}

class circle extends shape{
  private  float radius;

    public void acceptInput(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        radius = sc.nextFloat();
    }

    public void compute(){
        area = 3.14f * radius*radius;
    }
}

class goemetry{ // baar baar same task ko krne k leya we just create a method 
    public void permit(shape ref){
        ref.acceptInput();
        ref.compute();
        ref.display();
    }
}

class Assignment2{
    public static void main(String[] args) {
        square s = new square();
        reactangle r = new reactangle();      // creating object
        circle c = new circle();


        goemetry gc = new goemetry();
        gc.permit(s);
        gc.permit(r);
        gc.permit(c);

        // s.acceptInput();// calling by reference      this is loose coupling 
        // s.compute();    // calling by reference
        // s.display();// calling by reference

        // r.acceptInput();// calling by reference
        // r.compute();// calling by reference
        // r.display();// calling by reference

        // c.acceptInput();// calling by reference
        // c.compute();// calling by reference
        // c.display();// calling by reference

        // in above polymorphism is not present to apply polymorphism we have to create parent type referece 
        // for this reference  we can point to any type of child type 

        // shape ref; // reference is created

        // ref = s;// ref is pointing to the square object
        // ref.acceptInput();
        // ref.compute();
        // ref.display();

        // ref = r;
        // ref.acceptInput();
        // ref.compute();       // It increases the code redundancy 
        // ref.display();   // so we just use method to implement this

        // ref = c;
        // ref.acceptInput();
        // ref.compute();
        // ref.display();

    }
}