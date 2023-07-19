public class Ternary_opeator {
    public static void main(String[]args)
    {
    //     int a = 10;
    //     int b = 2;
    //     boolean res =(a<b)?true:false;
    //     System.out.println(res);
    //     // for writing a line in a result we use String Data type
    //    String  result=(a<b)? "a is bigger":"b is bigger";
    //    System.out.println(result);
    // this a is exapmle of taking three int values 
    // int a = 8;
    // int b = 9;
    // int c = 10;
    // int num = (a<b)?(a<c?a:b):(b<c?b:c);
    // System.out.println(num);
      int a = 20;
    int b = 60;
    int c = 90;
    int num = (a<c)?(a<b?b:c):(b<c?c:b);
System.out.println(num);

    }
}
