import Handler.BubbleSorter;
import Handler.IBubbleSorting;
import View.MainMenuView;

public class EntryPoint {
    static MainMenuView mainMenuView = new MainMenuView();
    static IBubbleSorting bubbleSorter = new BubbleSorter();

    public static void main(String[] args) {
        int[] unsortedArray = new int[]{6, 5, 1, 7, 8, 8, 19, 0, 3, 2, 12};
        int[] sortedArray = bubbleSorter.Sort(unsortedArray);

        for (int s = 0; s < sortedArray.length; s++) {
            System.out.println(sortedArray[s]);
        }
    }
}