import java.io.*;
public class E4 {
    public static void main(String[] args) throws IOException {
        String str;
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))) { // try with resources
            System.out.print("Enter any Data: ");
            str=br.readLine();
            System.out.println(str);
            // br.close();  // Not needed - Closed Automatically by Autoclosable.
        }
    }
}
// we can write try block without using the catch or finally block. to do that we can write using try with resources.





/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=null;
        String str;
        try {
            br=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter any Data: ");
            str=br.readLine();
            System.out.println(str);
        } 
        catch (Exception e) {
            br.close();
        }
    }
}*/