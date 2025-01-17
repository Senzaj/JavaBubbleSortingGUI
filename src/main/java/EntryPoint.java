import Handler.BubbleSorter;
import Handler.IBubbleSorting;
import View.MainMenuView;

public class EntryPoint {
    private static final MainMenuView _mainMenuView = new MainMenuView();
    private static final IBubbleSorting _bubbleSorter = new BubbleSorter();

    public static void main(String[] args) {
        TestArrayAndShowResult();
    }

    private static void TestArrayAndShowResult(){
        int[] unsortedArray = new int[]{6, 5, 1, 7, 8, 8, 19, 0, 3, 2, 12};
        int[] sortedArray = _bubbleSorter.Sort(unsortedArray);
        for (int i : sortedArray) System.out.println(i);
    }
}