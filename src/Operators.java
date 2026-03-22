public class Operators {
    public static void main(String[] args) {

//        Java Unary Operator

        // Pre-increment and Post-increment
        int x=10;
        System.out.println(x++);
        System.out.println(++x);

        // Pre-decrement and Post-decrement
        System.out.println(x--);
        System.out.println(--x);

        //Logical Complement Operator and Negation
        int a=10;
        int b=-10;
        boolean c=true;
        boolean d=false;
        System.out.println(~a);
        System.out.println(~b);
        System.out.println(!c);
        System.out.println(!d);

//        Java Arithmetic Operators
        int num1=10;
        int num2=5;
        System.out.println(num1+num2);//15
        System.out.println(num1-num2);//5
        System.out.println(num1*num2);//50
        System.out.println(num1/num2);//2
        System.out.println(num1%num2);//0

//        Java Shift Operators
        System.out.println(10<<2);//Left Shift Operator -> 10*2^2=10*4=40    
        System.out.println(20>>2);//Right Shift Operator -> 20/2^2=20/4=5   

//        Java Relational Operators
        int val1=10;    
        int val2=20;    
        System.out.println("(val1 < val2) : " + (val1<val2));    
        System.out.println("(val1 > val2) : " + (val1>val2));    
        System.out.println("(val1 <= val2) : " + (val1<=val2));    
        System.out.println("(val1 >= val2) : " + (val1>=val2));    
        System.out.println("(val1 == val2) : " + (val1==val2));    
        System.out.println("(val1 != val2) : " + (val1!=val2));  

//      Java Bitwise Operators
        int p = 11;   // binary representation 1011  
        int q = 5;     // binary representation 0101  
        System.out.println("The value of p|q is: " + (p | q));  //OR operation -> 1111
        System.out.println("The value of p & q is: " + (p & q)); // AND Operation -> 0001
        System.out.println("The value of p ^ q is: " + (p ^ q)); // XOR Operation -> 1110  
        
//      Java Assignment Operator
        int m=10;    
        m+=3;//10+3    
        System.out.println(m);    
        m-=4;//13-4    
        System.out.println(m);    
        m*=2;//9*2    
        System.out.println(m);    
        m/=2;//18/2    
        System.out.println(m);    
        m %= 3; // 9 % 3 = 0  
        System.out.println(m);    


    }
}
