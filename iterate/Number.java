import java.util.Scanner; 

public class Number {
    public static void main(String[] args) { 
        Scanner inp = new Scanner(System.in); 
        /*
         * Input range of numbers 
         */
        System.out.println("INPUT NUMBER");
        int num1 = inp.nextInt(); 
        printNumber(num1); 

        /*
         * Input range of numbers until it gets negative
         */
        System.out.println("");
        System.out.println("Input number.To stop use(-)"); 
        while(num1 >= 0) 
        {
            num1 = inp.nextInt();   
        }
        
        System.out.println("Negative number entered, stopping input...");
        System.out.println("Is last number positive? " + isPositive(num1));
        inp.close();
    
    } 
public static void printNumber(int num1) { 
        System.out.println("Printing..." );
        int i = 1;
        while(i <= num1) {
            System.out.print(i + "\t"); 
            i++; 
        }
}
public static boolean isPositive(int num1) {
        return num1 >= 0; 
  }
}
