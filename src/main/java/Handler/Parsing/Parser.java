package Handler.Parsing;

public abstract class Parser<T> implements IParser<T>{

    @Override
    public ParsingParams<T> TryParse(ParsingParams params) {
        try{
            return OnSuccess(params);
        }
        catch (NumberFormatException exception){
            return OnFailure(params);
        }
    }

    protected abstract ParsingParams<T> OnSuccess(ParsingParams params);

    protected abstract ParsingParams<T> OnFailure(ParsingParams params);
}
