import java.util.HashMap;
import java.util.Map;
public class OOPSBannerAppUC7 {
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
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

    public static void main(String[] args) {

        Map<Character, CharacterPatternMap> patternMap = new HashMap<>();

        // Pattern for O
        patternMap.put('O', new CharacterPatternMap('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        }));

        // Pattern for P
        patternMap.put('P', new CharacterPatternMap('P', new String[]{
                " *** ",
                "*   *",
                "*   *",
                " *** ",
                "*    ",
                "*    ",
                "*    "
        }));

        // Pattern for S
        patternMap.put('S', new CharacterPatternMap('S', new String[]{
                " *** ",
                "*   *",
                "*    ",
                " *** ",
                "    *",
                "*   *",
                " *** "
        }));

        String word = "OOPS";

        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {
                line.append(patternMap.get(c).getPattern()[i]).append("  ");
            }

            System.out.println(line);
        }
    }
}
