package Handler.Parsing;

public class ParsingParams<T> {
    public Boolean WasParsed;
    public String UnparsedString;
    public String Separator;
    public T ParsedValue;

    public ParsingParams(String unparsedString){
        WasParsed = false;
        UnparsedString = unparsedString;
    }

    public ParsingParams(String unparsedString, String separator){
        WasParsed = false;
        Separator = separator;
        UnparsedString = unparsedString;
    }
}
