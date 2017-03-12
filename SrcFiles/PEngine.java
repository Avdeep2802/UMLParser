import java.io.*;
import java.util.*;
import java.lang.*;


import com.github.javaparser.ast.*;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.body.*;
import com.github.javaparser.*;

public class PEngine {	
    final String incPath;    
    HashMap<String, Boolean> m;
    HashMap<String, String> mcc;
    String yumlCode;
    ArrayList<CompilationUnit> cuArray;
    final String outPath;

//Initializing the constructor
    ParseEngine(String incPath, String outPath) {
    	yumlCode = "";
        this.incPath = incPath;
        this.outPath = incPath + "\\" + outPath + ".png";
        mcc = new HashMap<String, String>();
        m = new HashMap<String, Boolean>();                
    }
    }
