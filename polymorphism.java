public class plane{
    public void fly(){
        System.out.print("plane can fly");
    }
    public void run(){
        System.out.print("plane can run");

    }
}

 public class cargoplane extends plane {
public void fly(){
    System.out.println("plane can fly at low high");
}
public void run(){
    System.out.println("plane can run slow");
}
 }

 public class passplane extends plane {
public void fly(){
    System.out.println("plane can fly at medium high");
}
public void run(){
    System.out.println("plane can run medium");
}
 }

 public class fighterplane extends plane {
public void fly(){
    System.out.println("plane can fly at very low high");
}
public void run(){
    System.out.println("plane can run fast");
}
 }


 