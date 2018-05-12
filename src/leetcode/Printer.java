package leetcode;

import java.util.List;

public class Printer {

    static <T> void print(final List<List<T>> output) {
        output.forEach(
                m -> {
                    m.forEach(
                            n -> System.out.print(n.toString()));
                    System.out.println("");
                }
        );
    }
}
