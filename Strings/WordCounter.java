/*
6. Create a class WordCounter.

Accept a sentence from the user.

Use StringTokenizer to count words.

Display total number of words
*/

import java.util.*;

class WordCounter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        StringTokenizer st = new StringTokenizer(sentence);

        int count = st.countTokens();

        System.out.println("Total number of words: " + count);
    }
}