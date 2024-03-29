/**
 * Created by Hein on 28-4-2016.
 */
public class LexiconQ2 extends Lexicon {
    public LexiconQ2() {
        super();
        // Add String lexeme
        Lexeme stringLexeme = new Lexeme("STRING").add("\\\"@\\\"");
        addLexeme(stringLexeme);
    }

    @Override
    public void test() {
        System.out.println("");
        System.out.println("Testing Lexicon Q2 with language definition:");
        System.out.println(toString());
        System.out.println("");
        printHeader();

        // STRING tests
        executeTest("\"\"", "STRING");
        executeTest("\"a\"", "STRING");
        executeTest("\"abc\"", "STRING");
        executeTest("\"a\"b\"c\"", "STRING");
        executeTest("\"a b\"", "STRING");

        executeTest("", null);
        executeTest("\"", null);
        executeTest("\"a", null);
        executeTest("a\"", null);
        executeTest("''", null);
        executeTest("'abc'", null);
        executeTest("'abc", null);
        executeTest("abc'", null);
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
    }
}