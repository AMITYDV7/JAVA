//Question 1

// class looplooploop{
//     public static void main(String[] args) {
//      for(int i = 0;i<5;i=i+1){
//         for(int j =0;j<5;j=j+1){
//             System.out.print("3");
//         }
//         System.out.println("");
//      }
        
//     }
// }
// Output is 
// 33333
// 33333
// 33333
// 33333
// 33333

// Question ==2
// class looplooploop{
//     public static void main(String []args){
//         int n =5;

//         for(int row=1;row<=n;row++){     // outer loop 
//             for(int col=1;col<=row;col++){  // inner loop just remember about everytime inner will be restart when i value is change
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// Output :-
// *
// **
// ***
// ****
// *****



//Question 3)
// class looplooploop{
//     public static void main(String[] args) {
//         int N =5;

//         for(int row =1;row<=N;row++){
//             for(int col =N;col>=row;col-- ){
    
//                 System.out.print(row+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// Output:-
// * * * * * 
// * * * * 
// * * * 
// * * 
// * 

//Question 4

// class looplooploop{
//     public static void main(String[] args) {
//          for(int row =1;row<=5;row++){
//             for(int col = 1;col<=row;col++){
//                 System.out.print(col+" ");
//             }
//             System.out.println();
//          }
//     }
// }


// Output:=
// 1 
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

// Question 5

// class looplooploop{
//     public static void main(String[] args) {
        // int N =5;
        // int n = N-1;

        // for(int row =1;row<=N;row++){
        //     for(int col = 1;col<=row;col++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // for(int row1 = 1;row1<=n;row1++){
        //     for(int col1 =n;col1>=row1;col1--){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


        // kunal approach 
    //     int N=5;
    //     for(int row =0;row<=2*N-1;row++){
    //         int totalCol = row>N ? 2*N-row:row;

    //         for(int col=1;col<=totalCol;col++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }
    //}



// Question 7
    // class looplooploop{
    //     public static void main(String[] args) {
            
    //         int N =10;
            
    //         for(int row =0;row<N;row++){            //outer loop
    //             //there are 3 inner loop for spaces ,star and spaces
    //             // For spaces
    //             for(int col = 0;col<N-row-1;col++){
    //                 System.out.print("_ ");
    //             }

    //             // For stars
    //             for(int col=0;col<2*row+1;col++){
    //                 System.out.print("7 ");
    //             }

    //             // For spaces
    //             for(int col = 0;col<N-row-1;col++){
    //                 System.out.print("_ ");
    //             }
    //             System.out.println();

    //         }
    //     }
    // }


    //Output:=
// _ _ _ _ _ _ _ _ _ 7 _ _ _ _ _ _ _ _ _ 
// _ _ _ _ _ _ _ _ 7 7 7 _ _ _ _ _ _ _ _
// _ _ _ _ _ _ _ 7 7 7 7 7 _ _ _ _ _ _ _
// _ _ _ _ _ _ 7 7 7 7 7 7 7 _ _ _ _ _ _
// _ _ _ _ _ 7 7 7 7 7 7 7 7 7 _ _ _ _ _ 
// _ _ _ _ 7 7 7 7 7 7 7 7 7 7 7 _ _ _ _
// _ _ _ 7 7 7 7 7 7 7 7 7 7 7 7 7 _ _ _
// _ _ 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 _ _
// _ 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 _ 
// 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7 7


// Question 8
// class looplooploop{
//     public static void main(String[] args) {
//         int N=5;

//         // outer loop
//         for(int row=0;row<N;row++){
//             for(int col =0;col<row;col++){
//                 System.out.print("_ ");
//             }
//             for(int col =0;col<2*N-(2*row+1);col++){
//                 System.out.print("7 ");
//             }
//             for(int col =0;col<row;col++){
//                 System.out.print("_ ");
//             }
//             System.out.println();
//         }
//     }
// }

// Output:=
// 7 7 7 7 7 7 7 7 7 
// _ 7 7 7 7 7 7 7 _
// _ _ 7 7 7 7 7 _ _
// _ _ _ 7 7 7 _ _ _
// _ _ _ _ 7 _ _ _ _ 


// Question 9

// class looplooploop{
//     public static void main(String[] args) {
//         int N=5;
//         for(int row =0;row<N;row++){            //outer loop
//             //             //there are 3 inner loop for spaces ,star and spaces
//                         // For spaces
//                         for(int col = 0;col<N-row-1;col++){
//                             System.out.print("_ ");
//                         }
        
//                         // For stars
//                         for(int col=0;col<2*row+1;col++){
//                             System.out.print("7 ");
//                         }
        
//                         // For spaces
//                         for(int col = 0;col<N-row-1;col++){
//                             System.out.print("_ ");
//                         }
//                         System.out.println();
        
//                     }
//                       // outer loop
//         for(int row=0;row<N;row++){
//             for(int col =0;col<row;col++){
//                 System.out.print("_ ");
//             }
//             for(int col =0;col<2*N-(2*row+1);col++){
//                 System.out.print("7 ");
//             }
//             for(int col =0;col<row;col++){
//                 System.out.print("_ ");
//             }
//             System.out.println();
//         }
//     }
// }

//Output:-

// _ _ _ _ 7 _ _ _ _ 
// _ _ _ 7 7 7 _ _ _
// _ _ 7 7 7 7 7 _ _
// _ 7 7 7 7 7 7 7 _
// 7 7 7 7 7 7 7 7 7
// 7 7 7 7 7 7 7 7 7
// _ 7 7 7 7 7 7 7 _
// _ _ 7 7 7 7 7 _ _
// _ _ _ 7 7 7 _ _ _
// _ _ _ _ 7 _ _ _ _ 


// Question 10

// class looplooploop{
//     public static void main(String[] args) {
//         int N=6;

//         // for(int row =1;row<=N;row++){

//         //     for(int col =1;col<=row;col++){
//         //         System.out.print("7 ");
//         //     }
//         //     System.out.println();}
            
//         //     for(int row=1;row<=N;row++){

//         //         for(int col =N-1;col>=row;col--){
//         //             System.out.print("7 ");
//         //         }
//         //         System.out.println();
//         //     }

//         // second approach

//         for(int row=1;row<=2*N-1;row++){
//             int totalCol = row>N? 2*N-row:row;

//             for(int col=1;col<=totalCol;col++){
//                 System.out.print("7 ");
//             }
//             System.out.println();
//         }

           
//     }
// }

// Output: =
// 7 
// 7 7
// 7 7 7
// 7 7 7 7
// 7 7 7 7 7
// 7 7 7 7 7 7
// 7 7 7 7 7
// 7 7 7 7
// 7 7 7
// 7 7
// 7

// Question 11

// class looplooploop{
//     public static void main(String[] args) {
//         int N = 5;

//         for(int row =1;row<=N;row++){

//             for(int col =1;col<=row;col++){
             

//                if((col+row)%2==0){
//                 System.out.print("1 ");
//                }
//                else{
//                 System.out.print("0 ");
//                }
//             }
//             System.out.println();
//         }
//     }
// }

//Output:=
// 1 
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

// Question 12

class looplooploop{
    public static void main(String[] args) {
        int N =4;
        int space = N+2;// My approach
        // int space = 2*(n-1); // Striver approach

        for(int row=1;row<=N;row++){
            // numbers
            for(int col =1;col<=row;col++){
                System.out.print(col);
            } 
            //spaces
            for(int col=1;col<=space;col++){
                System.out.print("-");
            } 
            // numbers
            for(int col =1;col<=row;col++){
                System.out.print(col);
            } 
            
            System.out.println();
            space = space-2;
        }
       
    }
}