package OOPS;

public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }
}


class Animal {
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("Breaths");
    }
}

class Fish extends Animal {
    int fins;

    void swims(){
        System.out.println("Swims in the water");
    }
}