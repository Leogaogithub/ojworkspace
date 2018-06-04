package leetcode;

public class L10RegularExpressionMatching {

    boolean _map[][];

    public static void main(final String[] args) {
        final String s = "aa";
        final String p = "a*";
        final L10RegularExpressionMatching solution = new L10RegularExpressionMatching();
        System.out.print(solution.isMatch(s, p));
    }

    public boolean isMatch(final String s, final String p) {
        final char[] ss = s.toCharArray();
        final char[] pp = p.toCharArray();
        _map = new boolean[s.length() + 1][p.length() + 1];

        for (int i = 0; i < _map.length; i++) {
            _map[i] = new boolean[p.length() + 1];
        }
        _map[0][0] = true;
        for (int i = 0; i < p.length(); i++) {
            if (pp[i] == '*') {
                _map[0][i + 1] = _map[0][i - 1];
            }
        }

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < p.length(); j++) {
                if (ss[i] == pp[j] || pp[j] == '.') {
                    _map[i + 1][j + 1] = _map[i][j];
                }

                if (pp[j] == '*') {
                    if (pp[j - 1] != ss[i] && pp[j - 1] != '.') {
                        _map[i + 1][j + 1] = _map[i + 1][j - 1];
                    } else {
                        _map[i + 1][j + 1] = _map[i + 1][j] || _map[i][j + 1] || _map[i + 1][j - 1];
                    }
                }
            }
        }
        return _map[s.length()][p.length()];
    }
}
