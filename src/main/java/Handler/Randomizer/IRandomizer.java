package Handler.Randomizer;

import java.util.List;

public interface IRandomizer<T extends Number> {

    public List<T> GetRandomList(T minValue, T maxValue, int length);
}
