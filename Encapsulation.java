
// // class book{
// //  private  int page; // This is data member in encapsulation . but inreal time they are instance variable

// //  public void  setData(int x)
// //  {
// // if(x>0){
// //     page = x;
// // }
// // else{
// //     System.out.println("invalid number");
// // }
// // }
// // public int getData(){
// //     if(page>0){
// //         return page;
// //     }
// //     else{
// //         System.out.println("Book is empty");
// //         return 0;
// //     }
// //  }
// // }


// // public class Encapsulation {
// //     public static void main(String []args){
// // book b = new book();
// // // b.page= 34;
// // // System.out.print(b.page);
// // b.setData(0);
// // System.out.println(b.getData());

// //     }
// // }



// Next example for this keyword
// class Dog{
//     private String breed;
//     private double age;
//     private int price;

//     // public void setDog(String breed,double age,int price){
//     //   breed = breed;
//     //   age = age; // this variable faces shadowing problem to prevent shadowing problem we have to use this keyword
//     //    price = price;

//     // // this.breed = breed;
//     // // this.age = age;
//     // // this.price = price;
//     // }


//     // or we can use special setter name 'constructor '
//     public Dog(String bree, double ge,int rice){
//         breed = bree;
//         age = ge;
//         price = rice;

//     }
//     public String getBreed(){
//         return breed;
//     }
//     public double getAge(){
//         return age;
//     }
//     public int getPrice(){
//         return price;
//     }
// }

// class Encapsulation{
//     public static void main(String[] args) {

//        Dog d = new Dog("amit",3.5,666);// this is a constructor call from starting for the core java we use constructor in java
//      //   d.Dog("AMit", 345, 245);

//         System.out.println(d.getBreed());
//         System.out.println(d.getAge());
//         System.out.println(d.getPrice());

//     }
// }
// }      
// class dog{
//     private int age;
//     public void setAge(int x){
//         age = x;
//     }
//     public int getAge(){
//         return age ; 
//     }
// }

// class Encapsulation{
//     public static void main(String[] args) {
//         dog d = new dog();
//         d.setAge(34);
//        System.out.println(d.getAge()); 
//     }
// }

// class Encapsulation{
//     int page;

//     public int getPage(){
//         return page;
//     }
//     public static void main(String []args){
//         Encapsulation gp = new Encapsulation();
//         System.out.println(gp.getPage());
//     }
// 

// this code is for default constructor and constructor overloading 
class Demo{
    private int a;
    private int b;

    Demo(){
        System.out.println("This is a zero parameter constructor"); // we have to create this constructor if we want to execute Demo call of zero parameter
    }

    Demo(int a,int b){ // THis is also called constructor overloading = same name constructor but different parameters 
        this.a = a;
        this.b = b;
    }

    void disp(){
        System.out.println(a);
        System.out.println(b);
    }

}
class Encapsulation{
    public static void main(String[] args) {
        Demo d = new Demo();// constructor call (which have zero parameter )
        d.disp();

        Demo d1 = new Demo(12,34); // constructor call (which have 2 integer parameter)
        d1.disp();
    }
}

