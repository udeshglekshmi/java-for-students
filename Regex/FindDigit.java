import java.util.Scanner;
import java.util.regex.*; 

public class FindDigit {

    // Return execution status 
    public static int extractDigit() { 
        return 0;    
    }
    // Main function
    public static void main(String[] args) {
        String seq; 
        Scanner inp = new Scanner(System.in); 
        System.out.println("Type anything..."); 
        seq = inp.nextLine(); 
        
        // compile a pattern 
        Pattern p = Pattern.compile("\\d+"); 
        // create matching sequence 
        Matcher m = p.matcher(seq);
        // loop until the end of the sequence. 
        // Use find() to search and group() to print the extracted digits
        while(m.find()) {
            System.out.println(m.group());
        } 
        System.out.println(extractDigit()); 
        inp.close();
    }
}