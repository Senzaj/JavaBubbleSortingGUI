import Handler.Sorting.ISorter;
import Handler.Sorting.IntegerBubbleSorter;
import java.util.Arrays;
import java.util.List;

public class EntryPoint {
    public static void main(String[] args) {
        TestArrayAndShowResult();
    }

    //TODO: Requires Unit-tests

    private static void TestArrayAndShowResult(){
        List<Integer> intList = Arrays.asList(5, 3, 8, 1, 2);
        ISorter<Integer> sorter = new IntegerBubbleSorter();
        List<Integer> sortedList = sorter.Sort(intList);

        System.out.println("Sorted Integer List: " + sortedList);
    }
}