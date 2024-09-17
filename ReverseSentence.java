import java.util.Stack;

public class ReverseSentence {
    public static String reverseSentence(String sentence) {

        String[] words = sentence.split(" ");

        Stack<String> stack = new Stack<>();

        for (String word : words) {
            stack.push(word);
            
        }

        // Pop words  construct the reversed sentence
        StringBuilder reversedSentence = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedSentence.append(stack.pop()).append(" ");
        }

        return reversedSentence.toString().trim();
        
    }

    public static void main(String[] args) {
\        String inputSentence = "data structures and algorithms";

        String reversedSentence = reverseSentence(inputSentence);

        System.out.println("Reversed Sentence: " + reversedSentence);
    }
}