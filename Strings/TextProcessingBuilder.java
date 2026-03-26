/*
8. Create a class TextProcessingBuilder.

Use StringBuilder to create a string.

Append additional text.

Display modified string.

Write a comment comparing StringBuilder and StringBuffer.
*/

class TextProcessingBuilder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Welcome");

        sb.append(" to Java Programming");

        System.out.println("Modified String: " + sb);
    }
}

/*
 * Difference:
 * StringBuffer -> Thread-safe, slower
 * StringBuilder -> Not thread-safe, faster
 */