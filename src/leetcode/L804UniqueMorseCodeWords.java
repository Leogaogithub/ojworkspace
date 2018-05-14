package leetcode;

import java.util.HashSet;
import java.util.Set;

public class L804UniqueMorseCodeWords {

    String morseMap[] = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
    };

    public int uniqueMorseRepresentations(final String[] words) {
        //iterate it then put result into set
        final Set<String> set = new HashSet<>();
        final StringBuilder sb = new StringBuilder();
        for (final String word : words) {
            sb.setLength(0);
            for (final char c : word.toCharArray()) {
                sb.append(morseMap[c - 'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
