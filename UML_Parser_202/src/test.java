import java.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import net.sourceforge.plantuml.FileFormat;
import net.sourceforge.plantuml.FileFormatOption;
import net.sourceforge.plantuml.SourceStringReader;
public class Test {
	
	public static void main(String args[])
	{
		
		StringBuilder plantUmlSource = new StringBuilder();

        plantUmlSource.append("@startuml\n");

        plantUmlSource.append("Alice -> Bob: Authentication Request\n");

        plantUmlSource.append("Bob --> Alice: Authentication Response\n");

        plantUmlSource.append("@enduml");

        SourceStringReader reader = new SourceStringReader(plantUmlSource.toString());

        try (FileOutputStream imageOutputStream = new FileOutputStream("/Users/avdeepsandhu/Desktop/uml.png")) {
            reader.generateImage(imageOutputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
				
	}
	
}
