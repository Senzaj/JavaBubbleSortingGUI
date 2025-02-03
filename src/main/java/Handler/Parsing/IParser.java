package Handler.Parsing;

public interface IParser<T> {

    public ParsingParams<T> TryParse(ParsingParams<T> params);
}
