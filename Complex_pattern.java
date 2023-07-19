// this code is for H pattern 


// public class Complex_pattern {
//     public static void main(String[]srgs){
//         int n=14;
//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<n;j++)
//             {
//                 if( j==0 ||  j==n-1 || i==(n-1)/2  )
//                 {
//                     System.out.print("*");
//                 }
//                 else
//                 {
//                 System.out.print(" ");
//                 }
//             }System.out.println("");
//         }
//     }
// }



// This code is for E pattern 


// public class Complex_pattern {
//     public static void main(String[]srgs){
//         int n=14;
//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<n;j++)
//             {
//                 if( i==0 ||  j==0 || i==n-1 ||  i==(n-1)/2  )
//                 {
//                     System.out.print("*");
//                 }
//                 else
//                 {
//                 System.out.print(" ");
//                 }
//             }System.out.println("");
//         }
//     }
// }


// This code is for I pattern

// public class Complex_pattern {
//     public static void main(String[]srgs){
//         int n=14;
//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<n;j++)
//             {
//                 if( i==0 ||  i==n-1 || j==(n-1)/2  )
//                 {
//                     System.out.print("*");
//                 }
//                 else
//                 {
//                 System.out.print(" ");
//                 }
//             }System.out.println("");
//         }
//     }
// }



// This code is for F pattern

public class Complex_pattern {
    public static void main(String[]srgs){
        int n=10;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if( i==0 ||  j==0 || i==(n-1)/2 )
                {
                    System.out.print("*");
                }
                else
                {
                System.out.print(" ");
                }
            }System.out.println("");
        }
    }
}