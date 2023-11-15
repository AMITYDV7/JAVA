
class book{
 private  int page; // This is data member in encapsulation . but inreal time they are instance variable

 public void  setData(int x)
 {
if(x>0){
    page = x;
}
else{
    System.out.println("invalid number");
}
}
public int getData(){
    if(page>0){
        return page;
    }
    else{
        System.out.println("Book is empty");
        return 0;
    }
 }
}


public class Encapsulation {
    public static void main(String []args){
book b = new book();
// b.page= 34;
// System.out.print(b.page);
b.setData(0);
System.out.println(b.getData());

    }
}
