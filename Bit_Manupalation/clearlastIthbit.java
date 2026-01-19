import java.util.*;
public class clearlastIthbit {
     public static int clearbit(int n ,int i){
        int bitmask =-1<<i;
        return n&bitmask;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number whose bit is check  ");
        int n = sc.nextInt();
        System.out.println("enter the number of bit");
        int i = sc.nextInt();
        System.out.println(clearbit(n, i));
    }
    
}
