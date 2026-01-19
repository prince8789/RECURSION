public class getter_setter {
     public static void main (String[] args){
        Pen p1 = new Pen();
        p1.setcolor("yellow");
        System.out.println(p1.getcolor());
        p1.settip(5);
        System.out.println(p1.gettip());
        p1.settip(6);
        System.out.println(p1.gettip());
    }   
}
class Pen{
    private String color;
    private float tip;
    String getcolor(){
        return color;
    }
    void setcolor(String color){
        this.color = color;
    }
    float gettip(){
        return tip;
    }
    void settip(float tipsize){
        this.tip = tipsize;
    }
}
