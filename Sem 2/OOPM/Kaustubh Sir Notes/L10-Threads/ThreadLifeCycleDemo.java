class MyThread extends Thread {
	
    public void run() {
        // Performing some work in the thread (transition to the Runnable state)
        for (int i = 0; i < 10; i++) {
            System.out.println("\nMy Thread is running the next iteration of its for loop. Counter : " + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n\n\n\tMy thread's for loop is over\n\n\n");

    }
}

public class ThreadLifeCycleDemo {

    public static void main(String[] args) {
        // Creating a new thread
        MyThread t = new MyThread();
        Thread.State state = t.getState();
		System.out.println("\nMy thread state just after being created : " + state);
		
	
        // Starting the thread (transition to the Runnable state)
        t.start();
		state = t.getState();
		System.out.println("\nMy thread state after calling start() : " + state);
        
        
        // Main thread is working
        for (int i = 0; i < 5; i++) {
            
            System.out.println("\nMain Thread is running the next iteration of its for loop. Main counter : " + i+" .Main thread state is : "+Thread.currentThread().getState());
            try {
                System.out.println("\nMy thread state before Main thread goes to sleep: " + t.getState());
		        Thread.sleep(50);
                System.out.println("\nMy thread state after Main thread wakes up : " + t.getState());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n\n\tMain thread for loop is over\n\n\n");
        // Making the main thread wait for the completion of myThread
        try {

            state = t.getState();
			System.out.println("\nMy thread state before it calls join(): " + state);
			state = Thread.currentThread().getState();
			System.out.println("\nMain thread state before My thread calls join(): " + state);
            t.join(); 
            System.out.println("\nMy thread's join() completed.");
            state = Thread.currentThread().getState();
			System.out.println("\nMain thread state after being joined by My thread: " + state);
			state = t.getState();
			System.out.println("\nMy thread state after join(): " + state);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}