import java.util.Arrays;
public class SortAndBinary {
    public static void main(String[] args) {
        
    
    int []a = {5,6,4,2,1,8,6,9};
    int []b = Arrays.copyOf(a,a.length);
    Arrays.sort(b);
    System.out.println(Arrays.toString(b));
}
}
