import java.util.*;
public class factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = sc.nextInt();
        int fact =1;
        factorial(n,fact);
        System.out.println(fact);
    }
    public static int factorial(int n, int fact){
        if(n==1){
            return fact;
        }
        fact = n*factorial(n-1,fact);
        
        return fact;
    }
}
