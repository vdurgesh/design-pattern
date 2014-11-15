package behavioral.interpreter;

import java.util.ArrayList;
import java.util.Iterator;

public class Client {
    /*
    Given a language, define a representation for its grammar along with an interpreter
    that uses the representation to interpret sentences in the language.
    */
    public static void main(String args[]) {
        String roman = "MCMXXVIII";
        Context context = new Context(roman);

        // Build the 'parse tree'
        ArrayList<RomanExpression> tree = new ArrayList<RomanExpression>();
        tree.add(new ThousandRomanExpression());
        tree.add(new HundredRomanExpression());
        tree.add(new TenRomanExpression());
        tree.add(new OneRomanExpression());

        // Interpret
        for (Iterator it = tree.iterator(); it.hasNext(); ) {
            RomanExpression exp = (RomanExpression) it.next();
            exp.interpret(context);
        }

        System.out.println(roman + " = " + Integer.toString(context.getOutput()));
    }
}
