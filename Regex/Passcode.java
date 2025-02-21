import java.util.Scanner;

public class Passcode {
    
    public static void main(String[] args) {
        String p, cp; // p=> password, cp => confirm password

        Scanner inp = new Scanner(System.in); 
        System.out.println("Type password");
        p = inp.nextLine(); 
        System.out.println("Retype password"); 
        cp = inp.nextLine(); 
        // function call 
        myfunction(p,cp); 
        // close input stream  
        inp.close();
    }

    public static void myfunction(String p,String cp) {
            /*
             * 1. Validate if password meets security requirements 
             * 2. Validate if password is same as confirm password 
             * 3. Throw error messages for invalid password
             */
        String validate = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&_.])[A-Za-z\\d@$!%*?&_.]{8,}$"; 

        if(p.matches(validate) && p.equals(cp)) {
            System.out.println("Password Created!");
        }
        else 
        { 
            System.out.println("Password is weak! Must have:");
            System.out.println("At least 8 characters");
            System.out.println("1 uppercase, 1 lowercase, 1 digit, 1 special character");
        }
    }

}
