package OOPS;

public class Constructer {
    public static void main(String[] args) {
       // Student s1 = new Student();
       // Student s2 = new Student("Pranit");
    }
}

class Student {
    String name;
    int roll;


    Student(){          //CONSTRUCTEr
        System.out.println("constructer is called...");
    }

    Student(String name){
        this.name = name;

    }
}
