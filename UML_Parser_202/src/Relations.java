public class RelationType {

	String startClass;
    String endClass;
    RelationEnum r_enum;
    String label;

    RelationType(String startClass, String endClass, RelationEnum r_enum, String label) {
        this.endClass = endClass;
        this.startClass = startClass;
        this.label = label;
        this.r_enum = r_enum;
    }

    @Override
    public String toString() {
        return endClass + r_enum.symbol + startClass + label;
    }

    
    
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