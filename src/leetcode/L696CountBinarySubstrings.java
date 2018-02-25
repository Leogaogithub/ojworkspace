package leetcode;

public class L696CountBinarySubstrings {
    public int countBinarySubstrings(String s) {
        int curRunLength = 1;
        int preRunLength = 0;
        int count = 0;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i)==s.charAt(i-1)) curRunLength++;
            else{
                preRunLength = curRunLength;
                curRunLength = 1;
            }
            if (preRunLength >= curRunLength) count++;
        }
        return count;
    }
}
