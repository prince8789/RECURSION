import java.util.*;
public class powOf2OrNot {
     public static boolean getbit(int n){
        int bitmask =n-1;
        if((n & bitmask)==0){
            return true;

        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number whose bit is check ");
        int n = sc.nextInt();
        System.out.println(getbit(n));
    }
    
}
