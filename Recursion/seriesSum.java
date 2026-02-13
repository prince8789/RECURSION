public class seriesSum {
    static int seriessum(int n){
        if(n==1) return 1;
        int sub = seriessum(n-1);
        if(n%2==0){
            return sub-n;
        }
        return sub+n;
    }
    public static void main(String[] args) {
        System.out.println(seriessum(10));
    }
    
}
