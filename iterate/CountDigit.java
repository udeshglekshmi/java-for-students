import java.util.Scanner;

public class CountDigit {
    // Main method 
    public static void main(String[] args) { 
        int num; 
        Scanner inp = new Scanner(System.in); 
        num = inp.nextInt();  
        System.out.println("NUMBER OF DIGITS: " + func_count(num)); 

        inp.close();
    }
        // count procedure 
    public static int func_count(int num){ 
       
        /*for(int count = 0; num != 0; count++) {
            num /= 10; 
        }*/ 

        if(num == 0) { 
            return 1; 
        }
        int count = 0; 
        while(num != 0) {
            num /= 10; 
            count++; 
        } 
        return count; 
    }
}
