import java.math.BigInteger;
import java.util.Scanner; 

public class Menu {
    public static void main(String[] args) {
        int num, option; 
        Scanner inp = new Scanner(System.in);  
        do {
        System.out.print("Press any of these keys(0,1,2,3)=>"); 
        System.out.println("0.Exit, 1.EvenOdd, 2.Prime, 3.Factorial"); 
        option = inp.nextInt(); 
        if (option == 0)  {
            System.out.println("--Exit--");
            break;  // Exit the loop
        }
        System.out.println("Type a number:");
        num = inp.nextInt(); 

        displayOption(option,num); 

      }while(option != 0);  

        inp.close();
    }

    public static void displayOption(int option, int num) {  
            
            // Alternative: valueOf(1), new BigInteger("1") 
            BigInteger fact = BigInteger.ONE; // fact for factorial check 
            int flag = 1; // flag for primer check 
            switch (option) {
                case 1:
                    if(num %2 == 0)  
                        System.out.println("Even Number");
                    else 
                        System.out.println("Odd Number");
                    break;
                case 2:   
                    for(int j = 2; j <= num/2; j++) { 
                        if(num % j == 0) 
                            flag = 0;
                    } 
                    if(num <= 1) { 
                        System.out.println("Neutral Number");
                    }
                    else if(flag == 1) { 
                        System.out.println("Prime Number");
                    }
                    else 
                    {
                    System.out.println("Not a prime Number");
                    }
                    break; 
                case 3:   
                    for(int i = 1; i <= num; i++) {
                        fact = fact.multiply(BigInteger.valueOf(i));  
                      }
                        System.out.println("Factorial of " + num + 
                                      "=" + fact); 
                    break; 
                case 0: 
                      System.out.println("--Exit--");
                    break; 
                default: 
                    System.out.println("Invalid option");
                    break; 
                    } // end of the switch block 
   } // end of the function block 
} // end of the main class 

