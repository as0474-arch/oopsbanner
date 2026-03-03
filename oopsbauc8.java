import java.util.*;

public class oopsbauc8 {

    // Class to encapsulate character and its pattern
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Static Inner Class to manage pattern mappings
    static class CharacterPatternMap {

        private static final Map<Character, CharacterPattern> patternMap = new HashMap<>();

        static {
            patternMap.put('O', new CharacterPattern('O', new String[]{
                    " ***** ",
                    "*     *",
                    "*     *",
                    "*     *",
                    " ***** "
            }));

            patternMap.put('P', new CharacterPattern('P', new String[]{
                    " ***** ",
                    "*     *",
                    " ***** ",
                    "*      ",
                    "*      "
            }));

            patternMap.put('S', new CharacterPattern('S', new String[]{
                    " ***** ",
                    "*      ",
                    " ***** ",
                    "      *",
                    " ***** "
            }));
        }

        public static CharacterPattern getPattern(char c) {
            return patternMap.get(Character.toUpperCase(c));
        }
    }

    // Method to display banner
    public static void displayBanner(String text) {

        int height = 5;

        for (int row = 0; row < height; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char c : text.toCharArray()) {

                CharacterPattern cp = CharacterPatternMap.getPattern(c);

                if (cp != null) {
                    lineBuilder.append(cp.getPattern()[row]).append("  ");
                }
            }

            System.out.println(lineBuilder);
        }
    }

    public static void main(String[] args) {

        displayBanner("OOPS");
    }
}