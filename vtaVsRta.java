//public class vtaVsRta {
    
       // public static void main(String[] args) {
            //Example of value typed assignment
            // int a=23;
            // int b;
            //  b=a;
            //  System.out.println(a);
            //  System.out.println(b);
    
            //  b= 45;
            //  System.out.println(a);
            //  System.out.println(b);

            //Example of reference typed assignment
            class fan{
                String brand;
                int no_of_blades;
                float price;
            }
            class vtaVsRta 
            {
                public static void main(String[] args)
                 {
                    fan a= new fan();
                    a.brand="anything";
                    a.no_of_blades = 4;
                    a.price = 2343.34f;
              System.out.println(a.brand);  
              System.out.println(a.no_of_blades);
              System.out.println(a.price + "\n");

              fan b;
              b=a;
               System.out.println(b.brand);  
              System.out.println(b.no_of_blades);
              System.out.println(b.price);

              b.brand="fanbrand";
                    b.no_of_blades = 6;
                    b.price = 23465573.34f;

                     System.out.println(a.brand);  
              System.out.println(a.no_of_blades);
              System.out.println(a.price + "\n");

               System.out.println(b.brand);  
              System.out.println(b.no_of_blades);
              System.out.println(b.price);
                 }
    }

