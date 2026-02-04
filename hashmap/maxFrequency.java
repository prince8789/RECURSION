import java.util.*;
public class maxFrequency {
    public int Maximum(int[] arr){
        Map<Integer , Integer> mp = new HashMap<>();
        for(int el : arr){
            if(!mp.containsKey(el)){
                mp.put(el,1);
            }
            else{
                mp.put(el,mp.get(el)+1);
            }
            
        }
        int maxfreq = 0, anskey =-1;
        for(var e : mp.entrySet()){
            if(e.getValue()>maxfreq){
                maxfreq = e.getValue();
                anskey = e.getKey();
            }
            

        }
        return anskey;
        
    }

    public static void main(String[] args) {
        maxFrequency mf = new maxFrequency();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array ");
        int n = sc.nextInt();
        System.out.println("enter the array element ");
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the maximum number present in the array is ");
        System.out.println(mf.Maximum(arr));
    }
    
    
}
