import java.util.Scanner; 

public class SumAndRev {
    // Sum of splitted digits  
    public static int sumOfDigits(int num) { 
            int sum = 0;
            while(num > 0) { 
                sum += num % 10; 
                num /= 10; 
            }
            //System.out.println("Sum Of Digits " + sum);
            return sum; 
    }
    // Reverse number 
    public static int reverseNumber(int num) { 
        int remainder; 
        int rev = 0;
        //int orig = num; 
        if(num < 10) { 
            return -1;   
        }
        else 
        {
        while(num > 0) {  
            remainder = num % 10; 
            rev = rev * 10 + remainder;  
            num /= 10; 
          }
            //System.out.println("\nORIGINAL:" + orig + "\n" + "REVERSED:");
        }
        return rev;
    }
    // Main class 
    public static void main(String[] args) {
        int num; 
        Scanner inp = new Scanner(System.in); 
        System.out.println("INPUT NUMBER ");
        num = inp.nextInt(); 
        
        System.out.println("\nSUM OF DIGITS " + sumOfDigits(num));
        System.out.println("REVERSED NUMBER " + reverseNumber(num));

        inp.close();
    }
}
