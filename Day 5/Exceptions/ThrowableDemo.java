public class ThrowableDemo {
    static void test() throws Throwable{
        throw new Throwable("Something went wrong");
    }
    public static void main(String[] args) {
        try {
            test();
        } catch (Throwable t) {
            System.out.println("Handled: "+t);      // Fully qualified name.
            System.out.println("\nHandled: "+t.getMessage());     // Only the message.
        }
    }
}



/*
throw new String("Error"); ❌
throw new Integer("Error"); ❌
throw new Throwable("Error"); ✅
throw new Exception("Error"); ✅
throw new RuntimeException("Error"); ✅
throw new IOException("Error"); ✅
*/