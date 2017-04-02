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
        
    }
}
