/*
# Exception Handling & Multithreading:

14. File Processing System

Create a class FileProcessing System. Simulate file reading using try-catch. Use finally block to display cleanup message.

Output: 'Reading file...' and 'Closing file resources'
 
*/

class FileProcessingSystem {
    public static void main(String[] args) {

        try {
            System.out.println("Reading file...");
            int a = 10 / 2; // dummy operation

        } catch (Exception e) {
            System.out.println("Error while reading file");
        } finally {
            System.out.println("Closing file resources");
        }
    }
}