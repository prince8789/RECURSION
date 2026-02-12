public class countOfDigit {
    static int Cod(int n){
        if(n<=9) return 1;
        int count =Cod(n/10)+1;
        return count;
    }
    public static void main(String[] args) {
        System.out.println(Cod(908765));
    }
    
}
