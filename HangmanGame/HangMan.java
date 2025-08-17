import java.util.*;

public class HangMan {
    private static final int STARTING_LIVES = 6;

    private static String chooseWord(List<String> wordList) {
        Random rand = new Random();
        return wordList.get(rand.nextInt(wordList.size()));
    }

    private static String createPlaceholder(String word, Set<Character> guessed) {
        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (guessed.contains(c)) {
                sb.append(c).append(" ");
            } else {
                sb.append("_ ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        String chosenWord = chooseWord(words);

        Set<Character> guessed = new HashSet<>();
        int lives = STARTING_LIVES;
        boolean gameOver = false;

        System.out.println("Welcome to Hangman!");
        System.out.println("The word has " + chosenWord.length() + " letters.");
        System.out.println(createPlaceholder(chosenWord, guessed));

        Scanner sc = new Scanner(System.in);

        while (!gameOver) {
            System.out.print("Guess a letter: ");
            String guess = sc.nextLine().toLowerCase().trim();

            // validate
            if (!(guess.length() == 1 && Character.isLetter(guess.charAt(0)))) {
                System.out.println("❌ Please guess a single letter.");
                continue;
            }

            char letter = guess.charAt(0);
            if (guessed.contains(letter)) {
                System.out.println("⚠️ You already guessed '" + letter + "'. Try again.");
                continue;
            }

            guessed.add(letter);

            if (chosenWord.contains(String.valueOf(letter))) {
                System.out.println("✅ Good guess!");
            } else {
                System.out.println("❌ " + letter + " is not in the word.");
                lives--;
            }

            // show updated placeholder + lives
            System.out.println(createPlaceholder(chosenWord, guessed));
            System.out.println("Lives left: " + lives);

            // check win/lose
            if (!createPlaceholder(chosenWord, guessed).contains("_")) {
                System.out.println("🎉 You win! The word was '" + chosenWord + "'.");
                gameOver = true;
            } else if (lives == 0) {
                System.out.println("💀 You lose! The word was '" + chosenWord + "'.");
                gameOver = true;
            }
        }
    }
}
