package Handler;

public class BubbleSorter implements IBubbleSorting {
    @Override
    public int[] Sort(int[] intArray) {

        if (intArray.length < 2)
            return null;

        int unsortedArrayPart = intArray.length;
        int maxNumber = 0;
        int tempNextNumber;
        int tempCurrentNumber;

        //TODO: Require UNIT-TEST

        while (unsortedArrayPart > 1) {

            for (int i = 0; i < unsortedArrayPart - 1; i++) {
                tempCurrentNumber = intArray[i];
                tempNextNumber = intArray[i + 1];

                if (tempNextNumber < tempCurrentNumber) {
                    intArray[i + 1] = tempCurrentNumber;
                    intArray[i] = tempNextNumber;
                    maxNumber = tempCurrentNumber;
                }
                else
                    maxNumber = tempNextNumber;
            }

            if (intArray[unsortedArrayPart - 1] == maxNumber)
                unsortedArrayPart--;
        }

        return intArray;
    }
}
