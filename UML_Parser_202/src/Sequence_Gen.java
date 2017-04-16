
class Sequence_Gen {

	private void MethodBody(String file_name, String method_name) {
		File file = new File(file_name);
        if (file.exists() && file.getName().endsWith(".java")) {
            try {
                CompilationUnit unit = JavaParser.parse(file);



            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

	}


}
