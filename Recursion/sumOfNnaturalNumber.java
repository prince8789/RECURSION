import java.util.*;
public class sumOfNnaturalNumber {
    public static int SumofNumber(int n){
        if(n==1){
            return 1;
        }
        int sum = n+SumofNumber(n-1);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        System.out.println(SumofNumber(n));
    }
    
}
