import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;

import gen.lib.pathplan.solvers__c;
import net.sourceforge.plantuml.SourceStringReader;

public class test2 {
	
	
	private static HashMap<String,ClassOrInterfaceDeclaration> class_interface_map;
	private static StringBuilder build_uml;
	private static StringBuilder build_relation = new StringBuilder();
	

	public static StringBuilder readCode() throws FileNotFoundException
	{
		class_interface_map = new HashMap<>();
		build_uml = new StringBuilder();
		build_uml.append("@startuml").append("\n");
		
		String path = "/Users/avdeepsandhu/Desktop/A";
		File file = new File(path);
		if(file.exists())
		{
			for(File f : file.listFiles())
			{
				if(f.getName().endsWith(".java"))
				{				
					CompilationUnit cunit = JavaParser.parse(f);
					ClassOrInterfaceDeclaration class_node = getNodes(cunit);
					if(class_node != null)
					{						
						class_interface_map.put(class_node.getNameAsString(), class_node);
					}
				}
			}
			
			for(ClassOrInterfaceDeclaration node: class_interface_map.values())
			{
                parseClassInterfaceTypes(node);

			}
			build_uml.append("@enduml");
			
		}		
		return build_uml;
	}	
	
	
	
	
	
	public static void main(String args[])
	{
		try {
			StringBuilder sb = readCode();
			System.out.println(sb);
			SourceStringReader plantUmlReader = new SourceStringReader(sb.toString());
			try (FileOutputStream imageOutputStream = new FileOutputStream("/Users/avdeepsandhu/Desktop/uml.png")) {
                plantUmlReader.generateImage(imageOutputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

