// class Test{

//     int age;
//     String name;

//     public Test(){
//         System.out.println("This is a zero parameter constructor");
//     }


//     public Test(int n){
//         this();
//         age = n;
//         System.out.println(age);
//     }

//     public static void main(String[] args) {
//         Test t = new Test();
//         Test t2 = new Test(25);

//         System.out.println(t.age);
//     }
// }

class Test {

    int age;
    String name;

    public Test() {
        System.out.println("This is a zero parameter constructor");
    }

    public Test(int n) {
        this();  // Calling the zero-parameter constructor
        age = n;
        System.out.println(age);
    }
    }

    class This{
        public static void main(String[] args) {
            Test t = new Test();  //If we write this it's means we are calling constructor of 0 parameter so Test() execute 
            Test t2 = new Test(25); // anad then constructor is executed 
    
             System.out.println(t.age);   // it we use this the output must be
            //  This is a zero parameter constructor
            //  This is a zero parameter constructor
            //  25
            //  0
    }
}

