import java.util.Scanner;

public class Series {
    static int i; 
  public static void main(String[] args) {
     int num; 
     Scanner inp = new Scanner(System.in); 
     num = inp.nextInt(); 
     method(num); 
     System.out.println(evenSeries(num)); 
     inp.close();
  }   
  public static int evenSeries(int num) {
        int count = 0;  
        System.out.print("\nEven Numbers\n");
        for(i = 2; i <= num; i+=2) {
            count++; 
            System.out.print(i + " ");
        } 
        System.out.print("\nTotal Count\n");
        return count; 
  } 
  public static void method(int num) { 
    for(i = 1; i <= num; i++) {  
        int result = num * i; 
        System.out.println(num + " * " + i + " = " + result);
    }
  }
}
