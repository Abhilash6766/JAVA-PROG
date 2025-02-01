
enum Status{
    Running, Complied, Failed, Success;
}

public class EnumDemo {
    public static void main(String args[]){
        Status[] s = Status.values();
        for(Status ss: s){
            System.out.println(ss+" : "+ss.ordinal());
        }
    }
}
