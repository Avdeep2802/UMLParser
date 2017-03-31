import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import net.sourceforge.plantuml.SourceStringReader;

public class MainFILE {
	public static void main (String args[])
	{
		if(args!= null)
		{
		
			try
			{
				Code_Parser cp = new Code_Parser();
				StringBuilder sb = cp.Read("/Users/avdeepsandhu/Desktop/A");
				System.out.println(sb.toString());
				SourceStringReader plantUmlReader = new SourceStringReader(sb.toString());
				try (FileOutputStream imageOutputStream = new FileOutputStream("/Users/avdeepsandhu/Desktop/uml.png")) {
	                plantUmlReader.generateImage(imageOutputStream);
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
			}
			catch(Exception e)
			{
				System.out.println("Exception in uml generator");
			}
		}
	}

}