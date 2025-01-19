package Handler.Randomizer;

import java.util.random.RandomGenerator;

public class FloatRandomizer extends Randomizer<Float>{

    @Override
    protected Float GenerateRandomNumber(Float minValue, Float maxValue, RandomGenerator random) {
        return random.nextFloat(minValue, maxValue);
    }
}
