class calc{
    public int add(int nums[]){
        int result =0;
        for(int n :nums){
            result = result +n;
     
        }
        return result; 
    }
}


public class anonymous_array {
    public static void main(String[] args) 
    {
        calc obj = new calc();
        int nums[]={5,6,8,9};
        int result = obj.add(nums);
        System.out.println(result);
    }
}
