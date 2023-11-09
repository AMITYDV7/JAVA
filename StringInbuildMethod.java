
public class StringInbuildMethod {
    public static void main(String[] args) {
      //  String s = "RajaRamMohanRoy";

        // This is the example of charAt() method of string
        // System.out.println(s.charAt(6));
        
    //  this is the example of indexOf method of the string
        // System.out.println(s.indexOf('z'));
        // System.out.println(s.indexOf('R',2));
        // System.out.println(s.indexOf("Ra"));
        // System.out.println(s.indexOf("Ra",3));


   /*  String s1 = "AmitYadav";
        s1.toUpperCase();
        System.out.println(s1); // output is same as s1 bacause we are not create a new string
        System.out.println(s1.toUpperCase()); */ // Output is AMITYADAV beacause we are creating new string in sout 


        /* 
        String s2 = "RajaRamMohanRoy";
        String s3 = "RajaRamMohanRoy";
        
        String [] arr = s2.split("a");// this is a split method which can remove any character or string from the main string and store them in the form of arrays of string which we have to print by for loop or for each loop 
        String [] arr2 = s3.split("Ram");
        
        for(String elem: arr){// this is for each loop 
            System.out.println(elem);
             
        } System.out.println("\n");
for(String elem2 : arr2){
    System.out.println(elem2);
}  */

StringBuilder s1 =new StringBuilder("Amit Yadav");

System.out.print(s1.reverse());



    }
}
