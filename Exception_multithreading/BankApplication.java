/*
# Exception Handling & Multithreading:

15. Bank Application

Create a class BankApplication. Define method that throws exception using throws. Call method in main and handle exception.

Output: 'Transaction processed' or 'Exception handled in main'

 
 */

class BankApplication {

    void processTransaction() throws Exception {
        int x = 10 / 0; // exception
        System.out.println("Transaction processed");
    }

    public static void main(String[] args) {

        BankApplication b = new BankApplication();

        try {
            b.processTransaction();
        } catch (Exception e) {
            System.out.println("Exception handled in main");
        }
    }
}