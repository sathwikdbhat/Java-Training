public class FestRegistration {
    static class FormFilling extends Thread{
        public void run(){
            System.out.println("Form Filling Started");
        }
    }

    static class DocumentsUpload extends Thread{
        public void run(){
            System.out.println("Document Uploading Started");
        }
    }
    static class EmailNotification extends Thread{
        public void run(){
            System.out.println("Confirmation Email Sent");
        }
    }
    public static void main(String[] args){
        FormFilling ff=new FormFilling();
        DocumentsUpload  du=new DocumentsUpload();
        EmailNotification en=new EmailNotification();
        ff.start();
        du.start();
        en.start();
    }
}

/*
Java program starts with one main thread.
Threads allow parallel execution -> concurrency.
Output order is not guaranteed.
Threads share the same memory.
Improves the performance & responsiveness.
When start() is called, the JVM creates a new Thread.
When run() is called directly, there is no concurrency.

ℹ️ Process Vs Thread

Process is a running program.
Thread: A path of execution inside the program.
A process has its own memory.
Threads: It share the same memory.
Creating a thread is cheaper than creating a process.
Examples : Process -> Chrome Browser         Thread -> New Tab of Browser.
Closing a tab will not close chrome or kill chrome.
*/