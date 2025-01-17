package Handler.Sorting;

import java.util.List;

public class BubbleSorter<T extends Comparable<T>> implements ISorter<T> {

    @Override
    public List<T> Sort(List<T> unsortedList) {

        if (unsortedList == null || unsortedList.size() < 2) {
            return unsortedList;
        }

        boolean shouldSort = true;

        while (shouldSort) {
            shouldSort = false;
            for (int i = 0; i < unsortedList.size() - 1; i++) {

                if (unsortedList.get(i).compareTo(unsortedList.get(i + 1)) > 0) {

                    T temp = unsortedList.get(i);
                    unsortedList.set(i, unsortedList.get(i + 1));
                    unsortedList.set(i + 1, temp);
                    shouldSort = true;
                }
            }
        }

        return unsortedList;
    }
}
