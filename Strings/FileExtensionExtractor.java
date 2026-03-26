/*
5. Define a class File Extension Extractor.

Accept a file name (example: "report.pdf").

Extract file extension using substring() method.

Display extracted extension.
*/

import java.util.*;

class FileExtensionExtractor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter File Name:");
        String file = sc.nextLine();

        int index = file.lastIndexOf('.'); // find dot position
        String extension = file.substring(index + 1);

        System.out.println("File Extension: " + extension);
    }
}