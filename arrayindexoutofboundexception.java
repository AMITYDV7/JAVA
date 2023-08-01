public class arrayindexoutofboundexception {
    public static void main(String[] args) {
        int a[]={2,5,67,90};
        // System.out.println(a[a.length-1]);
        // System.out.println("amit");
        // if we want to use for loop 
        // for(int i=0;i<4;i++){ // we should not use <= in this use only <
        //     System.out.println(a[i]);
        // }
        // we can use enhance for loop instead of this
        for(int n:a){
            System.out.println(n);
        }
    }
}
