public class fact {
    public static int factorial(int n ){
        if(n==1){
            return 1;
        }
        //int factnm1 = factorial(n-1);
        int fact = n*factorial(n-1);
        return fact;

    }
    public static int calcsum(int n){
        if(n==1){
            return 1;
        }
        int sum = n+calcsum(n-1);
        return sum;
    }
    public static int fibbo(int n){
        if(n==1|| n==0){
            return n;
        }

        int fib = fibbo(n-1)+ fibbo(n-2);
        return fib;
        
        
    }
    public static void main(String[] args) {
        // System.out.println(factorial(5));
        // System.out.println(calcsum(5)); 
        System.out.println(fibbo(7));
    }
    
}
