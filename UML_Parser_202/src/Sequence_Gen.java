
class Sequence_Gen {

	private void MethodBody(String file_name, String method_name) {
		File file = new File(file_name);
        if (file.exists() && file.getName().endsWith(".java")) {
            try {
                CompilationUnit cunit = JavaParser.parse(file);



            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
	}


	public void run(String file_name, String class_name, String method_name) {
        File folder = new File(file_name);
        if (folder.exists()) {
            for (File source_file : folder.listFiles()) {
                if (source_file.getName().endsWith(".java")) {
                    try {
                        CompilationUnit cunit = JavaParser.parse(source_file);
                        List<Node> node_list = cunit.getChildNodes();
                        for (Node node : node_list) {
                            if (node instanceof ClassOrInterfaceDeclaration) {
                                ClassOrInterfaceDeclaration dec = (ClassOrInterfaceDeclaration) node;
                                dec.getMethods();

                            }

                        }

                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }


}
