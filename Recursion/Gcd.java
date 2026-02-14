import java.util.*;
public class Gcd {
    static int IterativeGcd(int x , int y){
        while(x%y != 0){
            int rem = x%y;
            x=y;
            y=rem;
        }
        return y;
    }
    static int RecursiveGcd(int x, int y){
        if(y==0){
            return x;
        }
        return RecursiveGcd(y, x%y);
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of x  ");
        int x = sc.nextInt();
        System.out.print("enter the value of y ");
        int y = sc.nextInt();
        System.out.println(IterativeGcd(x, y));
        System.out.println(RecursiveGcd(x,y));

    }
    
}
