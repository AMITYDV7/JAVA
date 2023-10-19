// public class array_1d {
//     public static void main(String[] args) {
//         int a[]={2,3,4,5};
//         // System.out.println(a[0]);
//         // System.out.println(a[1]);
//         // System.out.println(a[2]);
//         // System.out.println(a[3]);
//         for(int i=0;i<=3;i++){
//             System.out.println(a[i]);
//         }

//       //   int num[] = new int[4];
//       //   num[0] = 3;
      
//       // for(int i=0;i<=3;i++){
//       //   System.out.println(num[i]);
//       // }
//     }
    
// }
/*import java.util.Scanner;
class array_1d{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int []a = new int[5];

        for(int i=0;i<=4;++i){
            System.out.print("Enter your marks for "+ i + ":");
            a[i] = scan.nextInt();

        }
        for(int j =0; j<=4; j++)
        {
            System.out.println("Your stored array value are " + a[j]);
        }
       
      
scan.close();
    }
} */
//import java.util.Scanner;
class array_1d{
    public static void main(String[] args) {
      int [][]a = {{2,3,4},
                   {4,6,7},
                   {8,9,0}    }  ;

                   for(int i=0;i<=2;i++){
                    for(int j=0;j<=2;j++){
                        System.out.print(a[i][j] + "_");
                    }
                    System.out.println(" ");
                   }
    }
}

