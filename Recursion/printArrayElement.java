public class printArrayElement {
    static void Display(int[] arr, int idx){
        if(idx==0){
            System.out.print(arr[idx]+" ");
        }
        Display(arr,idx-1);
        System.out.print(arr[idx]+" ");
    }
    public static void main(String[] args) {
        int[] arr ={1,3,5,7,8,4,5,7,9};
        Display(arr, arr.length);
    }
    
}
