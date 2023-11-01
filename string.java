class string{
    public static void main(String[] args) {
       String s1 = new String("Zara");
      String s2 = new String("Amit");

    //    System.out.println(s1==s2);
    // System.out.println(s1.equals(s2));
    // System.out.println(s1.equalsIgnoreCase(s2));
    // int index1 = s1.charAt(2);

    // System.out.println((char)index1);
// System.out.println(s1.compareTo(s2));
// System.out.println("yERA".compareToIgnoreCase("YERA"));
int res = s1.compareTo(s2);

if(res==0){
    System.out.println("Both are Same");
   
}
 if (res>0) {
        System.out.println("s1 is greater than s2");
        
    } else {
        System.out.println("s2 is greater than s1");
    }
    }
    
}
