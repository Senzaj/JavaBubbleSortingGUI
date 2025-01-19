package Handler.Sorting;

import java.util.List;

public abstract class BubbleSorter<T extends Comparable<T>> implements ISorter<T> {

    boolean shouldSort;

    @Override
    public List<T> Sort(List<T> unsortedList) {

        if (unsortedList == null || unsortedList.size() < 2) {
            return unsortedList;
        }

        do {
            shouldSort = false;
            IterateBubbleSorting(unsortedList);
        }
        while (shouldSort);

        return unsortedList;
    }

    protected void IterateBubbleSorting(List<T> list){

        for (int i = 0; i < list.size() - 1; i++) {

            if (list.get(i).compareTo(list.get(i + 1)) > 0) {

                T temp = list.get(i);
                list.set(i, list.get(i + 1));
                list.set(i + 1, temp);
                shouldSort = true;
            }
        }
    }
}
