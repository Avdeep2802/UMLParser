public class UMLBuild {
    private StringBuilder _umlGeneratorInput = new StringBuilder("@startuml\n skinparam classAttributeIconSize 0\n");
    public void addUMLInput(String inputs) {
        _umlGeneratorInput.append(inputs);
    }

   
    public StringBuilder getUMLInput() {
        return _umlGeneratorInput;
    }

}
