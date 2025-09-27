import java.util.*;
public class Nth_fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        System.out.print(fib(n)+" ");
        
    }
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        // int prev =fib(n-1);
        // int prevprev = fib(n-2);
        return fib(n-1)+fib(n-2);
    }
    
    
    
}
