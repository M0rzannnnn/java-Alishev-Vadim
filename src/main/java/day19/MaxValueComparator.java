package day19;

import java.util.Comparator;
import java.util.Map;

public class MaxValueComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return ((Comparable) ((Map.Entry) (o2)).getValue()).compareTo(((Map.Entry) (o1)).getValue());
    }
}
