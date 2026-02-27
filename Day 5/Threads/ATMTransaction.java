public class ATMTransaction extends Thread{
    public void run(){
        System.out.println("Processing ATM Transaction");
    }
    public static void main(String[] args) {
        ATMTransaction t=new ATMTransaction();
        System.out.println("Thread State: "+t.getState());  // New Thread
        t.start();
        System.out.println("Thread State after Start: "+t.getState()); // Runnable Thread
    }
}


/*
➡️Code Explanation:- Initially the Thread is in NEW State. After calling start(), it moves to RUNNABLE and executes the run() method. The exact timings of the state changes depends on the JVM Scheduler.

➡️Points to Remember:-
Thread is created once.
start() changes state.
Thread cannot be restarted.
Final State is TERMINATED or DEAD.
*/