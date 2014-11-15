package behavioral.interpreter;

/**
 * Created by dv28149 on 10/28/2014.
 */
public class HundredRomanExpression extends RomanExpression {
    public  String one() { return "C"; }
    public  String four(){ return "CD"; }
    public  String five(){ return "D"; }
    public  String nine(){ return "CM"; }
    public  int multiplier() { return 100; }
}
