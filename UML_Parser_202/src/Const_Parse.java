import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.BodyDeclaration;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.ConstructorDeclaration;
import com.github.javaparser.ast.body.Parameter;

import java.util.List;


public class Const_Parse {
    
    private Code_Parser _mainParser;
    
    public Const_Parse(Code_Parser parser) {
        this._mainParser = parser;
    }
    
    public void Constructor_Read(ClassOrInterfaceDeclaration unit) {
        
        NodeList<BodyDeclaration<?>> list = unit.getMembers();
        
        for (BodyDeclaration node : list) {
            if (node instanceof ConstructorDeclaration) {
                ConstructorDeclaration l = (ConstructorDeclaration) node;
                StringBuilder builder = new StringBuilder();
                for (Parameter params : l.getParameters()) {
                    builder.append(params.getName()).append(" : ").append(params.getType()).append(" ");
                    String paramType = params.getType().toString();
                    if (_mainParser._getTypeMap().containsKey(paramType) &&
                        (_mainParser._getTypeMap().get(paramType).isInterface())) {
                        _mainParser.getRelationsBuilder().updateRelationsList(new RelationType(unit.getNameAsString(),
                                                                                               params.getType().toString(), RelationEnum.DEPENCENCY, " : using "));
                    }
                }
                _mainParser.getUmlBuilder().append("+").append(l.getName())
                .append('(').append(builder).append(')')
                .append("\n");
            }
            
        }
        
    }
}
