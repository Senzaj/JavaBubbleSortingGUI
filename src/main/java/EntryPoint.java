import Handler.Randomizer.IRandomizer;
import Handler.Randomizer.IntegerRandomizer;
import Handler.Sorting.ISorter;
import Handler.Sorting.IntegerBubbleSorter;
import View.MainWindowView;

import java.util.ArrayList;
import java.util.List;

public class EntryPoint {

    public static void main(String[] args) {
        StartProgram();
    }

    //TODO: Requires Unit-tests

    private static void StartProgram(){
        MainWindowView mainView = new MainWindowView();

        mainView.SetStartPanel();
        mainView.DrawWindow();
    }

    private static void TestArrayAndShowResult(){
        ISorter<Integer> sorter = new IntegerBubbleSorter();
        IRandomizer<Integer> randomizer = new IntegerRandomizer();
        int minValue = 0;
        int maxValue = 10;
        int length = 12;

        List<Integer> list = new ArrayList<>(randomizer.GetRandomList(minValue, maxValue, length));

        System.out.println("Unsorted Integer List: " + list);
        System.out.println("Sorted Integer List: " + sorter.Sort(list));
    }
}