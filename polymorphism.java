 class plane{
    public void fly(){
        System.out.print("plane can fly");
    }
    public void run(){
        System.out.print("plane can run");

    }
}

  class cargoplane extends plane {
public void fly(){
    System.out.println("plane can fly at low high");
}
public void run(){
    System.out.println("plane can run slow");
}
 }

  class passplane extends plane {
public void fly(){
    System.out.println("plane can fly at medium high");
}
public void run(){
    System.out.println("plane can run medium");
}
 }

  class fighterplane extends plane {
public void fly(){
    System.out.println("plane can fly at very low high");
}
public void run(){
    System.out.println("plane can run fast");
}
 }
/* 
 class polymorphism{
 public static void main(String[] args){
    cargoplane cp = new cargoplane();
    passplane pp = new passplane();
    fighterplane fp = new fighterplane();

    plane ref;

    ref = cp;
    ref.fly();
    ref.run();

    ref = pp;
    ref.fly();
    ref.run();

    ref = fp;
    ref.fly();
    ref.run();
 }
 } */ // or 
