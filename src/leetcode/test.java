package leetcode;

import java.util.Arrays;

/**
 * it is because you can't have a List of a primitive type. In other words, List<int> is not possible. You can, however, have a List<Integer>.
 */
public class test {

    public static void main(final String[] args) {
        final int[] a = new int[10];
        a[0] = 30;
        a[1] = 100;
        a[2] = 33;
        final Integer[] b = new Integer[10];
        b[0] = 30;
        b[1] = 100;
        b[2] = 33;

        //final ArrayList lis = new ArrayList<Integer>(Arrays.asList(a));
        //System.out.println(lis.size());
        System.out.println(b.length);
        System.out.println(Arrays.asList(b).size());
        System.out.println(a.length);
        System.out.println(Arrays.asList(a).size());
    }
}
