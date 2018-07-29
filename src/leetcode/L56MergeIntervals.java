package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L56MergeIntervals {

    public List<Interval> merge(final List<Interval> intervals) {
        if (intervals.size() == 0) return intervals;
        final List<Interval> res = new ArrayList<>();
        Collections.sort(intervals, (x, y) -> x.start - y.start);
        final Interval start = intervals.get(0);
        int curStart = start.start;
        int curEnd = start.end;
        for (final Interval interval : intervals) {
            if (interval.start <= curEnd) {
                curEnd = Math.max(curEnd, interval.end);
            } else {
                res.add(new Interval(curStart, curEnd));
                curStart = interval.start;
                curEnd = interval.end;
            }
        }
        res.add(new Interval(curStart, curEnd));
        return res;
    }

    public class Interval {

        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(final int s, final int e) {
            start = s;
            end = e;
        }
    }
}
