import java.util.*;
public class countSetBit {
     public static int countsetbit(int n){
        int count =0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n=n<<1;
        
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number whose bit is check ");
        int n = sc.nextInt();
        System.out.println(countsetbit(n));
    }
    
}
