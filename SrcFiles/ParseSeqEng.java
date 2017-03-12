import java.util.*;
import java.io.*;

import com.github.javaparser.ast.*;
import com.github.javaparser.*;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.stmt.*;
import com.github.javaparser.ast.body.*;

public class ParseSeqEng{
    
    final String incPath;
    final String outPath;
    final String incFunctName;
    final String incClassName;
    String pumlCode;
    
    HashMap<String, String> mapClass;
    ArrayList<CompilationUnit> cuArray;
    HashMap<String, ArrayList<MethodCallExpr>> mapMethodCalls;
    
    
    //Initialize the constructor
    
    ParseSequenceEngine(String incPath, String incClassName, String incFunctName,
                        String outgoingFile) {
        this.incPath = incPath;
        this.outPath = inPath + "\\" + outgoingFile + ".png";
        this.incClassName = incClassName;
        this.incFunctName = incFunctName;
        mapClass = new HashMap<String, String>();
        mapMethodCalls = new HashMap<String, ArrayList<MethodCallExpr>>();
        pumlCode = "@startuml\n";
    }
}
