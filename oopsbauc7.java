public class oopsbauc7 {

    // Simple inner class
    static class CharacterPatternMap {
        char character;
        String[] pattern;

        CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
    }

    public static void main(String[] args) {

        // Define patterns (7 lines as in your comment)
        String[] O = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };

        String[] P = {
                " ******",
                "*     *",
                "*     *",
                " ******",
                "*      ",
                "*      ",
                "*      "
        };

        String[] S = {
                " ******",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ******"
        };

        String[] SPACE = {
                "        ",
                "        ",
                "        ",
                "        ",
                "        ",
                "        ",
                "        "
        };

        // Create array of objects
        CharacterPatternMap[] maps = {
                new CharacterPatternMap('O', O),
                new CharacterPatternMap('P', P),
                new CharacterPatternMap('S', S),
                new CharacterPatternMap(' ', SPACE)
        };

        String message = "OOPS";
        message = message.toUpperCase();

        // Print banner (7 rows)
        for (int row = 0; row < 7; row++) {

            for (int i = 0; i < message.length(); i++) {

                char ch = message.charAt(i);

                // Find matching character
                for (int j = 0; j < maps.length; j++) {
                    if (maps[j].character == ch) {
                        System.out.print(maps[j].pattern[row] + "  ");
                    }
                }
            }

            System.out.println(); // next line
        }
    }
}