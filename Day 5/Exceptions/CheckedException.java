import java.io.IOException;
public class CheckedException{
    static void readFile() throws IOException {
        throw new IOException("File not Found!");
    }
    public static void main(String[] args) {
        try{
            display();
        }
        catch (IOException e){
            System.out.println(e.getMessage()); // .getMessage only returns the message inside the ' () ' in the print function.
        }
    }
    static void display() throws IOException{
        readFile();
    }
}


// Output : java.io.IOException: File not Found   -----> in this output the "java.io.IOException" called as Fully classified class name.

// For checked exception we always use try-catch Block.
// The 'throws' keyword doesn't handle the exception. It only passes on the information to the calling method.
// The calling method has to handle the exception using try-catch.
// The 'throws' keyword is written in the method signature(name).