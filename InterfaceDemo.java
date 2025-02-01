interface A{
    void show();
}
class B implements A{
    public void show(){
        System.out.println("in show");
    }
}
public class InterfaceDemo {
    public static void main(String args[]){
        B obj = new B();
        obj.show();
    }
}
    
