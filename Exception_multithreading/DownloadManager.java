/*
# Exception Handling & Multithreading:

17. Download Manager

Create a class DownloadManager. Create multiple threads using Runnable interface. Each thread represents file download.

Output: Downloading messages.
 
*/

class Download implements Runnable {

    String fileName;

    Download(String fileName) {
        this.fileName = fileName;
    }

    public void run() {
        System.out.println("Downloading " + fileName);
    }
}

class DownloadManager {
    public static void main(String[] args) {

        Thread t1 = new Thread(new Download("File1"));
        Thread t2 = new Thread(new Download("File2"));

        t1.start();
        t2.start();
    }
}