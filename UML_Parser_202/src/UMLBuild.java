public class UMLBuild {
    private StringBuilder _umlGeneratorInput = new StringBuilder("@startuml\n skinparam classAttributeIconSize 0\n");

   
    public StringBuilder getUMLInput() {
        return _umlGeneratorInput;
    }

}
