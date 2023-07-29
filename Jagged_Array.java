public class Jagged_Array {
    public static void main(String args[]){
// int num[][]={
//     {2,3,4,5},
//     {6,7,8},
//     {9,0}
// };
// we can also do this 
int num[][]= new int[3][];
num[0]= new int[4];
num[1]= new int[3];
num[2]= new int[2];
num[0][1]=2;

 for(int i=0;i<=2;i++)
    {
        for(int j=0;j<num[i].length;j++)
        // length is use to know the index value of an arrays
        {
            System.out.print(num[i][j] + " ");
        }
        System.out.println( );
    }
  
    }
    
}
