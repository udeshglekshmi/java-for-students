import java.util.Scanner;
import java.lang.Math;  

public class Armstrong {
    /*
     * 153 => 1 + 125 + 27 == 153 
     */ 
public static void main(String[] args) {
    int num; 
    Scanner inp = new Scanner(System.in); 
    System.out.println("Input number "); 
    num = inp.nextInt();  
    compute(num); 
    inp.close();
}
public static void compute(int num){
        int rem = 0; 
        int sum = 0; 
        int n = 0; 
        int original = num; 
     while(original > 0) { 
        original /= 10; 
        n++; 
     }
     while(original > 0) { 
        rem = num % 10; 
        //sum += rem * rem * rem; 
        sum += (int) Math.pow(rem,n); 
        num /= 10; 
      }  
      if(original == sum) 
        System.out.println(true); 
      else
        System.out.println(false);
    }
}

/*
 * 1634 
 * 8208 
 * 9474
 */