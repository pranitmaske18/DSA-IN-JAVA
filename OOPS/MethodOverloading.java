package OOPS;

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calc=new Calculator();
        System.out.println(calc.sum(1,9));
        System.out.println(calc.sum((float)1.50,(float)9.22));
        Fisha f = new Fisha();
        f.eat();
    }
}


class Calculator{
    int sum(int a, int b){
        return a+b;
    }
     float sum (float a , float b){
        return a + b;
     }
    
}


class Animal{
    void eat(){
        System.out.println("eats everything");
    }
}

class Fisha extends Animal{
    void eat(){
        System.out.println("MEthod overiding is done here beacuse it calls child funciton");
    }
}