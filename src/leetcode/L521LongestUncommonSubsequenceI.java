package leetcode;

/**
 * Created by leo on 9/23/18.
 */
public class L521LongestUncommonSubsequenceI {
    public int findLUSlength(String a, String b) {
        if(a.length() == b.length() && a.equals(b)) return -1;
        return Math.max(a.length(), b.length());
    }
}
