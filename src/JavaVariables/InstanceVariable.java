package JavaVariables;

public class InstanceVariable {

    public String name;
    public int age=19;
    //Creadting a default Constructor initializing Instance Variable
    public InstanceVariable()
    {
        this.name = "Deepak";
    }

    public static void main(String[] args) {

            // Object Creation
            InstanceVariable obj = new InstanceVariable();
            System.out.println("Student Name is: " + obj.name);
            System.out.println("Age: "+ obj.age);

    }
}

