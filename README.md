Overview:
A broad overview of my personal project is that I have built a parser that converts a java source code into a class diagram.


TOOLS USED BY ME:

I have used java parser and yUML for the development of this project.

Java parser: It takes java file as input and creates token that uses Abstract Syntax Tree to match with the Java Grammar. The parsers main function is to read all the java source code or all the java files in the provided source path, and finally make a grammar that can be interpreted by the UML generator.

yUML: This handles the part which generates the final class diagram. The Java Parser creates grammar using which url is created and finally which can be used to create class diagram using yUML.


Steps For Execution:
You need to follow the following instructions to run the jar file and generate the class diagram.

1. You have to download the jar file
2. Go inside the directory inside the terminal in which the jar file is
located
3. Execute the query given below to run the jar file and generate the
class diagram.

java -jar [Name_of_jar] class “Path_of_test_files” [Name_of_output_file]

For instance if we want to run avdeep.jar file and lets say test case location is “/user/avdeepsandhu/desktop” and the name of the ouput file we want is “avi”

-> java -jar avdeep.jar class “/user/avdeepsandhu/desktop” avi

After running this command the final class diagram will be created and the name of the file will be avi.png
