package Handler.Parsing;

public class ParserInteger extends Parser<Integer> {
    @Override
    protected ParsingParams<Integer> OnSuccess(ParsingParams params) {
        params.ParsedValue = Integer.parseInt(params.UnparsedString);
        params.WasParsed = true;
        return params;
    }

    @Override
    protected ParsingParams<Integer> OnFailure(ParsingParams params) {
        return params;
    }
}
