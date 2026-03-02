public class OOPSBannerApp {

    public static void main(String[] args) {

        CharacterPattern oPattern = new CharacterPattern('O', new String[]{
                "*****",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*****"
        });

        CharacterPattern pPattern = new CharacterPattern('P', new String[]{
                "*****",
                "*   *",
                "*   *",
                "*****",
                "*",
                "*",
                "*"
        });

        CharacterPattern sPattern = new CharacterPattern('S', new String[]{
                "*****",
                "*",
                "*",
                "*****",
                "    *",
                "    *",
                "*****"
        });

        CharacterPattern[] word = {oPattern, oPattern, pPattern, sPattern};

        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (CharacterPattern cp : word) {
                line.append(cp.getPattern()[row]).append(" ");
            }

            System.out.println(line);
        }
    }

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
}
