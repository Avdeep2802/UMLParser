public class RelationType {
    
}

enum RelationEnum {
    EXTENDS(" <|-- "),
    ASSOCIATE(" - "),
    IMPEMENTS(" <|.. "),
    ASSOCIATE_MANY(" \"0...*\" - "),
    DEPENCENCY(" <.. ");

    String symbol;

    RelationEnum(String symbol) {
        this.symbol = symbol;
    }

    String getSymbol() {
        return symbol;
    }
}