import java.util.HashMap;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;


public class Code_Parser {
	
	private StringBuilder build_uml;
	private HashMap<String,ClassOrInterfaceDeclaration> CIMap;
	
	public Code_Parser()
	{
		build_uml = new StringBuilder();		
	}

	public StringBuilder getBuild_uml() {
		return build_uml;
	}

	public StringBuilder Read(String path) throws FileNotFoundException
	{
		File file = new File(path);
		build_uml.append("@startuml\n skinparam classAttributeIconSize 0\n");
		System.out.println();
		if(file.exists())
		{
			System.out.println("file exists");
			System.out.println(file.listFiles().toString());
			for(File f : file.listFiles())
			{
				if(f.getName().endsWith(".java"))
				{
					try 
					{
						System.out.println("asamxlkasmxoamom");
						CompilationUnit cunit = JavaParser.parse(f);
						System.out.println("huha");
						ClassOrInterfaceDeclaration cid = GetClassAndInterface(cunit);
						System.out.println(cid+"----------");
						if (cid != null) {
							System.out.println("cid is not null");
							CIMap.put(cid.getName().toString(), cid);
							System.out.println("CIMAP : "+cid.getName().toString());
						}
						parseClassInterfaceTypes(cid);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
			build_uml.append("\n@enduml");
            System.out.print("uml " + build_uml.toString());
		}
		else
		{
			System.out.println("file does not exists");
		}
		
		return build_uml;
		
	}

	private void parseClassInterfaceTypes(ClassOrInterfaceDeclaration unit) {
		// TODO Auto-generated method stub
		if(!unit.isInterface())
		{
			build_uml.append("class ").append(unit.getName()).append("{\n");
			
		}
		else
		{
			build_uml.append("interface ").append(unit.getName()).append("{\n}\n");
		}
		build_uml.append("}\n");
	}

	public ClassOrInterfaceDeclaration GetClassAndInterface(CompilationUnit cunit) {
		// TODO Auto-generated method stub
		List<Node> Nlist = cunit.getChildNodes(); 
		for(Node node : Nlist)
		{
			if(node instanceof ClassOrInterfaceDeclaration)
			{
				return (ClassOrInterfaceDeclaration)node;
			}
			
		}
		return null;
	}
	
	

}
