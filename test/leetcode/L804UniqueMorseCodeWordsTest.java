package leetcode;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class L804UniqueMorseCodeWordsTest {

    @Test
    public void uniqueMorseRepresentations() throws Exception {
        final L804UniqueMorseCodeWords solution = new L804UniqueMorseCodeWords();
        final String[] words = new String[]{"gin", "zen", "gig", "msg"};
        assertThat(solution.uniqueMorseRepresentations(words), is(2));
    }
}