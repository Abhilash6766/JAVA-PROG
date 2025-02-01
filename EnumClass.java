enum Laptop{
    Macbook(2000), Windows(1000), ThinkPad(1500), Intel;

    private int price;

    private Laptop(){
        price =500;
    }

    private Laptop(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
}
public class EnumClass {
    public static void main(String args[]){
        for( Laptop lap: Laptop.values()){
            System.out.println(lap+" : "+lap.getPrice());
        }
    }
}
