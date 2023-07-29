public class D2_Array {
    public static void main( String[] args)
    {
    // int num[][]= new int[3][3];
    // num[0][0]=1;
    // num[0][1]=2;
    // num[0][2]=3;
    // num[1][0]=4;
    // num[1][1]=5;
    // num[1][2]=6;
    // num[2][0]=7;
    // num[2][1]=8;
    // num[2][2]=9;
    // We can also save this array like this
int num[][]={
               {1,2,3},
               {4,5,6},
               {7,8,9}
            };

    for(int i=0;i<=2;i++)
    {
        for(int j=0;j<=2;j++)
        {
            System.out.print(num[i][j] + " ");
        }
        System.out.println( );
    }
  
    }
    
}
