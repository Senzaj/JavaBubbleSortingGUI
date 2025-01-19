package Handler.Randomizer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;

public abstract class Randomizer<T extends Number> implements IRandomizer<T> {

    @Override
    public List<T> GetRandomList(T minValue, T maxValue, int length) {

        RandomGenerator random = new Random();
        List<T> list = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            list.add(GenerateRandomNumber(minValue, maxValue, random));
        }

        return list;
    }

    protected abstract T GenerateRandomNumber(T minValue, T maxValue, RandomGenerator random);
}
