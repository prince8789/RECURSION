import java.util.*;
public class sum_of_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = sc.nextInt();
        System.out.println("the digit sum is "+sumOfdigit(n));
    }
    public static int sumOfdigit(int n){
        int sum =0;
        if(n>=0 && n<=9){
            return n;
        }
        sum =sumOfdigit(n/10)+n%10;
        return sum;


    }
    
}
