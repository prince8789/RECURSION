import java.util.*;
public class findShortestPath {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the direction ");
        String str = sc.nextLine();
        int x =0;
        int y =0;
        for(int i =0;i<str.length();i++){
            char dir = str.charAt(i);            
            if(dir=='n'){
                y++;
            }
            else if(dir=='s'){
                y--;
            }
            else if(dir =='e'){
                x++;
            }
            else{
                x--;
            }
        }
        float result = (float)Math.sqrt(((x*x)+(y*y)));
        System.out.println(result);

    }
    
}
