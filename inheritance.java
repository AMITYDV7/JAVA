// // example of single inheriatance in java 
// class demo1{
//     public void dog1(){
//         System.out.println("dog is sleeping");
//     }
// }


// class demo2 extends demo1{
//     public void dog2(){
//         System.out.println("dog is playing");
//     }
// }
// class inheritance{
//     public static void main(String[] args) {
//         demo2 rox = new demo2();

//         rox.dog2();
//         rox.dog1();
//     }
// }


// Example for mutli-level inheritance

class Grandfather{
    void disp(){
        System.out.println("I am stronger");
    }
}

class father extends Grandfather
{

}

class son extends father
{

}

class inheritance{
    public static void main(String[] args) {
        son s = new son();
        s.disp();
    }
}