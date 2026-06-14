
class SharedResource {
    private int count = 0;

    public synchronized void increment() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + count++);
        }
    }
}

class MyThread implements Runnable {
    private SharedResource sharedResource;

    public MyThread(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    public void run() {
        // Each thread increments the count in the shared resource
        sharedResource.increment();
    }
}

public class ThreadWithoutSyncDemo {

    public static void main(String[] args) {
        // Creating an instance of a shared resource
        SharedResource s = new SharedResource();

        // Creating two threads that access the shared resource
        Thread thread1 = new Thread(new MyThread(s));
        Thread thread2 = new Thread(new MyThread(s));

        // Starting the threads
        thread1.start();
        thread2.start();
    }
}

