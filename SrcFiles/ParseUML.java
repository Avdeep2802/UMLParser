
public class ParseUML
{

    public static void main(String[] args) throws Exception {
        String arg0 = args[0];
        String arg1 = args[1];
        String arg2 = args[2];
        String arg3 = args[3];
        String arg4 = args[4];
        if (arg0.equals("class")) {
        //check if it wants the class diagram
            ParseEngine parse = new ParseEngine(arg1, arg2);
            parse.start();
        } else if (arg0.equals(("seq"))) {
        //check if the argument is a sequence diagram
            ParseSeqEngine seq = new ParseSeqEngine(arg1, arg2, arg3, arg4;
            seq.start();
        } else {
            System.out.println("What you entered is invalid: " + arg0);
        }

    }

}
