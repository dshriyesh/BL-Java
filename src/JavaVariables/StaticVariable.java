package JavaVariables;

public class StaticVariable {
    static int age;


    public static void main(String args[]){
        StaticVariable s1 = new StaticVariable();
        StaticVariable s2 = new StaticVariable();
        s1.age = 24;
        s2.age = 21;
        StaticVariable.age = 23;
        System.out.println("S1\'s age is: " + s1.age);
        System.out.println("S2\'s age is: " + s2.age);
    }
}
