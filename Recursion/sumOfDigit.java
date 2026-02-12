public class sumOfDigit {
    static int Sod(int n){
        if(n>=0 && n<=9) return n;
        int sum =Sod(n/10)+n%10;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(Sod(908765));
    }
    
}
