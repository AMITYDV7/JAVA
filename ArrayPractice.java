// public class ArrayPractice {
//     public static void main(String[] args) {
//         int a[]= {1,2,3,4,5};
//        int n = a.length;
   
// //    for(int i=0;i<n/2;i++){
// //     if(a[i]!=a[n-i-1]){
// //         System.out.print("NOT");
// //     }
// //     else{
// //         System.out.println("hai");for
// for(int i =n-1;i>=0;i--){
//     System.out.print(a[i] + " ");
// }
//     }
//    }


// class ArrayPractice{
//     public static void main(String[] args) {
//         int a[] = {1,2,4,5,6};
//         int sum=0;
//         int n= a.length;

//         int sum_natural = ((n+1)*(n+2))/2;

//         for(int i=0;i<n;i++){
//             sum += a[i] ;
//         }
    
     
//     int total_sum = sum_natural-sum;
//     System.out.println(total_sum);
//     }
// }


// class ArrayPractice{
//     public static void main(String[] args) {
//         int a[]= {1,3,5,6,3};
//         int n = a.length;

//         for(int i=0;i<n;i++){                                  //Time complexity is 0(n)  and space complexity is 0(1)
//             for(int j = i+1;j<n;j++){
//                 if(a[i]==a[j]){
//                     System.out.println("Same element is "+ a[i]);
//                 }
//             }
//         }
//     }
// }
import java.util.Arrays;
class ArrayPractice{
    public static void main(String[] args) {
       int a[][]= {
        {1,2,3},
        {4,5,6},
        {7,8,9}
       };

      for(int i=0;i<a.length;i++){
        for(int j=i;j<a[0].length;j++){
           int temp = a[i][j];
           a[i][j]= a[j][i];
           a[j][i]=temp;
        } 
      }

      // SWapping 
      for(int k=0;k<a.length;k++){
        int Li =0;
        int Ri = a[0].length-1;
       
        while(Li<Ri){
          int tepo = a[k][Li];
          a[k][Li]= a[k][Ri];
          a[k][Ri]= tepo;
          Li++;
          Ri--;
        }
      }

       for(var mark:a){
        System.out.println(Arrays.toString(mark));
       }

}
}