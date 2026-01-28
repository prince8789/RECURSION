public class basicInheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.color = "white";
        shark.fins = 2;
        shark.eat();
        System.out.println(shark.color+" "+ shark.fins);

        
    }
    
}
class Animal{
    void eat(){
        System.out.println("eats");
    }
    String color;
    void breath(){
        System.out.println("breathes");
    }
}
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swims in water ");
    }
}
