import java.util.*;
public class fibonacci_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the nth number ");
        int n = sc.nextInt();
        for(int i =0; i<=n;i++){
            System.out.print(fibboSeries(i)+" ");
        }
    }
    static int fibboSeries(int n ){
        if(n == 0 || n ==1){
            return n;
        }
        return fibboSeries(n-1)+fibboSeries(n-2);
    }

    
}
