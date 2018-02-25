package leetcode;

public class L389FindTheDifference {
    public char findTheDifference(String s, String t) {
        char out = 0;
        for(char ss: s.toCharArray()){
            out ^= ss;
        }

        for(char tt: t.toCharArray()){
            out ^= tt;
        }
        return (char)(out^0);
    }
}
