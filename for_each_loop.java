public class for_each_loop 
{
    // it is very important loop for array because in jagged array the row and column are not same
    public static void main(String args[])
    {
    // int nums[] = {2,3,4,5};

    // for(int n : nums)
    // {
    //     System.out.println(n);
    //       }
    int nums[][]={
    {2,3,4,5},
    {6,7,8},
    {9,0}
    };
                
    for(int a[] : nums)
    {
        for(int b: a )
        // length is use to know the index value of an arrays
        {
            System.out.print(b +" ");
        }
        System.out.println( );
    }


   }
 }
    



