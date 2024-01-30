class Demo{
    static int a;
    static int b;

    int m,n;
    static
    {
        a=10;
        b=34;
        System.out.println("This is a static block");
    }

    {
        m=23;
        n=56;
        System.out.println("This is a Non static block");
    }

    static void disp(){
        System.out.println(a);
        System.out.println(b);
    }

    void disp1(){
        System.out.println(m);
        System.out.println(n);
    }
}
class StaticAndNonStatic{
    public static void main(String[] args) {
       Demo.disp1();
       Demo d = new Demo();
       d.disp();
       
    }
}

