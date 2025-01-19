package Handler.Randomizer;

import java.util.random.RandomGenerator;

public class IntegerRandomizer extends Randomizer<Integer>{

    @Override
    protected Integer GenerateRandomNumber(Integer minValue, Integer maxValue, RandomGenerator random) {
        return random.nextInt(minValue, maxValue);
    }
}
