package OOPS;

public class StaticM {
    public static void main(String[] args) {
       // Student s1 = new Student();
        Student.schoolName = "SBESB";
       // System.out.println(s1.schoolName);
    }
}


class Student{
    String Name;
    int Rollno;

    static String schoolName;

    void setName(String name ){
        this.Name = name;
    }
    String getName(){
        return this.Name;
    }
}