package Handler.Parsing;

import java.util.List;

public class ParserIntegerList extends Parser<List<Integer>>{

    private ParserInteger parserInteger = new ParserInteger();

    @Override
    protected ParsingParams<List<Integer>> OnSuccess(ParsingParams params) {
        //TODO: Парсить в список интов через разделитель
        String separator = params.Separator;
        return params;
    }

    @Override
    protected ParsingParams<List<Integer>> OnFailure(ParsingParams params) {
        return params;
    }
}
