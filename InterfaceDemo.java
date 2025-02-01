interface A{
    void show();
}

interface X{
    void display();
}
class B implements A{
    public void show(){
        System.out.println("in show");
    }
    public void display(){
        System.out.println("displayed");
    }
}
public class InterfaceDemo {
    public static void main(String args[]){
        B obj = new B();
        obj.show();
        obj.display();
    }
}
    
