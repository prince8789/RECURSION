import java.util.*;
public class printNto1NaturalNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entr the nth number");
        int n = sc.nextInt();
        PrintNatural(n);

    }
    static void PrintNatural(int n ){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        PrintNatural(n-1);
    }
    
}
