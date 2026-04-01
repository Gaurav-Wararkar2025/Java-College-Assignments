/*
# Exception Handling & Multithreading:

22. Banking System

Create a class BankingSystem. Multiple threads access shared account balance using synchronized block.

Output: Balance deduction messages.
 
*/

class Account {

    int balance = 1000;

    void withdraw(int amount) {

        synchronized (this) {
            if (balance >= amount) {
                System.out.println("Withdrawing: " + amount);
                balance -= amount;
                System.out.println("Remaining Balance: " + balance);
            } else {
                System.out.println("Insufficient balance");
            }
        }
    }
}

class BankingSystem {
    public static void main(String[] args) {

        Account acc = new Account();

        Thread t1 = new Thread(() -> acc.withdraw(700));
        Thread t2 = new Thread(() -> acc.withdraw(500));

        t1.start();
        t2.start();
    }
}