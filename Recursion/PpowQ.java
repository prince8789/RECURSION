public class PpowQ {
    // static int Pow(int p,int q){
    //     if(q==0){
    //         return 1;
    //     }
    //     return Pow(p,q-1)*p;
    // }

    // optimse this code 
    static int Pow(int p ,int q){
        if(q==0) return 1;
        int smallpow = Pow(p,q/2);
        if(q%2==0){
            return smallpow*smallpow;
        }
        return p*smallpow*smallpow;
    }
    public static void main(String[] args) {
        System.out.println(Pow(5,3));
    }
    
}
