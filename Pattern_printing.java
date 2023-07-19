// public class Pattern_printing {
//     public static void main(String[]args){
//         int i,j;
//         for(i=0;i<6;i++){
//             for(j=0;j<6;j++){
//                 System.out.print("*");
//         }
//         System.out.println(" ");
//     }
// }
// }
class Pattern_printing {
    public static void main(String []args) {
        int n=13;
        for(int i=0;i<n;i++){
                        for(int j=0;j<n;j++){
                           if(i==0 || j==0 || i==n-1 || j==n-1){
                            System.out.println("*");
                           }
                           else{
                            System.out.print("");
                           }
                    }
                  
                }
        
    }
}
// complex pattern for loops
// class Pattern_printing{
//     public static void main(String[]args){
//         int i,j,n=8;
//         for(i=0;i<n;i++){
//             for(j=0;j<n;j++)
//             {
//                 if(i==0 || j==0 || i==7 || j==7 ){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//         }
//         System.out.println(" ");
//     }
// }
