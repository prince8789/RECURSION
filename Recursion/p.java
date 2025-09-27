import java.util.*;
public class p{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        else{
        
        return n*factorial(n-1);}
    }
}
