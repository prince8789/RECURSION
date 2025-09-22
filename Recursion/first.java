import java.util.*;
public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        PrintNumber(n);
        
        
    }
    static void PrintNumber(int n ){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        PrintNumber(n-1);
    }
    
}
