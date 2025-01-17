package Handler.Sorting;

import java.util.List;

public interface ISorter<T extends Comparable<T>> {
    public List<T> Sort(List<T> unsortedList);
}
