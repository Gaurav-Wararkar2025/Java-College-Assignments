/*
# Exception Handling & Multithreading:

23. Chat Application

Create a class ChatApplication. Create threads for sending and receiving messages. Demonstrate thread lifecycle.

Output: Sending and receiving messages.
 
*/

class ChatApplication {

    static class Sender extends Thread {
        public void run() {
            try {
                System.out.println("Sending message...");
                Thread.sleep(1000); // simulate delay
                System.out.println("Message sent");
            } catch (Exception e) {
            }
        }
    }

    static class Receiver extends Thread {
        public void run() {
            try {
                System.out.println("Receiving message...");
                Thread.sleep(1000); // simulate delay
                System.out.println("Message received");
            } catch (Exception e) {
            }
        }
    }

    public static void main(String[] args) {

        Sender s = new Sender();
        Receiver r = new Receiver();

        // Thread Lifecycle demonstration
        System.out.println("Sender State: " + s.getState()); // NEW

        s.start();
        r.start();

        System.out.println("Sender State after start: " + s.getState()); // RUNNABLE

        try {
            s.join();
            r.join();
        } catch (Exception e) {
        }

        System.out.println("Sender State after completion: " + s.getState()); // TERMINATED
    }
}