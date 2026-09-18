package OOPS;

public class Abstraction {
    public static void main(String[] args) {
        Mustang myHorse = new Mustang();
        //  aniaml > horse > mustang
        myHorse.walk();
    }
}

abstract class Animal1{
    String color;
    Animal1(){
        System.out.println("Animal constractor is called");
    }
    void eats(){
        System.out.println("animal eats");

    }
    abstract void walk();

}

class horse extends Animal1{
    horse(){
        System.out.println("Horse constructer is called");
    }
    void walk(){
        System.out.println("Walks on four legs");
    }
}

class Mustang extends horse{
    Mustang(){
        System.out.println("Mustang Constructor is called");
    }
    void walk(){
        System.out.println("walks");
    } 
}

