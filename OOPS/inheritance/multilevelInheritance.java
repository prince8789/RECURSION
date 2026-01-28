public class multilevelInheritance {
     public static void main(String[] args) {
        Fish shark = new Fish();
        shark.color = "white";
        shark.fins = 2;
        shark.eat();
        System.out.println(shark.color+" "+ shark.fins);


        //multilevel inheritance 
        System.out.println();
        System.out.println();
        Dolphin D = new Dolphin();
        D.eat();
        D.breath();
        D.swim();
        D.color = "skyblue";
        System.out.println(D.color);
        D.types = "gangas";
        System.out.println(D.types);

        // hirearchial inheritance 
        System.out.println();
        System.out.println();
        Bird b = new Bird();
        b.eat();
        b.color = "black";
        System.out.println(b.color);
        b.type ="crow";
        b.fly();

        
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
class Dolphin extends Fish{
    String types;
}
class Bird extends Animal{
    void fly(){
        System.out.println("birds fly in air ");
    }
    String type ;
}