/*
# Exception Handling & Multithreading:

21. Producer Consumer System

Create a class Restaurant. Chef prepares food and waiter serves

it using wait() and notify().

Output: 'Chef prepared food' and 'Waiter served food'
 
*/

class Restaurant {

    boolean foodReady = false;

    synchronized void prepareFood() throws Exception {
        System.out.println("Chef prepared food");
        foodReady = true;
        notify();
    }

    synchronized void serveFood() throws Exception {
        while (!foodReady) {
            wait();
        }
        System.out.println("Waiter served food");
    }
}

class MainRestaurant {
    public static void main(String[] args) {

        Restaurant r = new Restaurant();

        Thread chef = new Thread(() -> {
            try {
                r.prepareFood();
            } catch (Exception e) {
            }
        });

        Thread waiter = new Thread(() -> {
            try {
                r.serveFood();
            } catch (Exception e) {
            }
        });

        waiter.start();
        chef.start();
    }
}