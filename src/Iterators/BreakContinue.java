
public class BreakContinue {
    public static void main(String[] args) {
           for(int i = 0; i<= 10; i++) {    
            System.out.println(i);    
            if(i==6) {    
            break;  // stops the loop   
            }    
            if(i==4){
                continue; //skips the value
            }
        }    
    }    
}
