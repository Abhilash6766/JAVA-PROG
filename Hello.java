import java.util.*;

class Student{
    private int rno;
    private String name;
    private int marks;
    Student(int rno,String name,int marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName(){
        return this.name;
    }
}
class Hello{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s[] = new Student[3];
        for(int i=0;i<3;i++){
            int rno = sc.nextInt();
            String name = sc.next();
            int marks = sc.nextInt();
            s[i] = new Student(rno,name,marks);
        }
        for(int i=0;i<3;i++){
            System.out.println(s[i].getName());
        }
    }
}