import java.util.*;

public class oop {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Pen p1 = new Pen();
        Student s1= new Student();
        p1.color = "yellow";
        System.out.println(p1.color);
        p1.tip = 5;
        System.out.println(p1.tip);
        p1.tipset(6);
        System.out.println(p1.tip);

        //student 
        s1.name = "prince kumar";
        s1.branch="csaiml";
        s1.rollno = 139;
        s1.subject = "oops";
        s1.marks = 95;
        System.out.println(s1.name+" "+s1.branch+" "+s1.rollno+" "+s1.subject+" "+s1.marks);
        

        //bank account 
        BankAccount acc = new BankAccount();
        acc.username = "prince kumar";
        //acc.password = "guhicvhjbn";      // this is not allowed because private data is not directly access
        acc.setpassword("prince@123");
        System.out.println("the user name is "+acc.username);
        //System.out.println(acc.password);     // not show password direct 
        acc.showpassword();

    }
    
}
class BankAccount{
    public String username;
    private String password;
    void setpassword(String pwd){
        password = pwd;
    }
    void showpassword(){
        System.out.println(password);
    }
}
class Pen{
    String color;
    float tip;
    void tipset(float tipsize){
        tip = tipsize;

    }

}
class Student{
    String name;
    int rollno;
    String branch;
    String subject;
    int marks;
}
