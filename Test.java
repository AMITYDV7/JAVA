class Test {
    int a;
    String  name;
    public static void main(String[]args){
        // Declare the variable
        //Create the Object
        int num =9;// primitive
        Test obj1 = new Test(); // Reference 
        Test obj2 = new Test();

        obj1.name= "Amit";

        //System.out.println(name);// XX This is wrong XX
        // System.out.println(obj.name);
        // System.out.print(obj.a);
        System.out.println(obj1.a);
        System.out.println(obj1.name);
        System.out.println(obj2.a);
        System.out.println(obj2.name);
        

        
    }
    
}
