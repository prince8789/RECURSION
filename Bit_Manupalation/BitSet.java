import java.util.*;
public class BitSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = sc.nextInt();
        System.out.println("enter the location of bit");
        int pos = sc.nextInt();
        int mask =1<<pos;
        System.out.println(n | mask);
    }
    
}
