import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = sc.nextInt();

        int result = factorial(n, 1);
        System.out.println(result);
    }

    public static int factorial(int n, int fact) {
        if (n == 1) {
            return fact;
        }
        return factorial(n - 1, n * fact);
    }
}
