/**
 * Enum of KWs expressions returning strings by overwriting toString() method.
 *
 * @author Karl Werner
 * @version 1.0
 *
 * Ausfüllen...
 */
public enum BingoValues {
    I("Don't Panic!"),
    II("Syntaktischer Zucker"),
    III("358"),
    IV("meine Damen und Herren"),
    V("in der FOP"),
    VI("Sie werden das noch ganz oft hören"),
    VII("Bitte schnell hinsetzen"),
    VIII(""),
    IX(""),
    X(""),
    XI(""),
    XII(""),
    XIII(""),
    XIV(""),
    XV(""),
    XVI(""),
    XVII(""),
    XVIII(""),
    XIX(""),
    XX(""),
    XXI(""),
    XXII(""),
    XXIII(""),
    XXIV(""),
    XXV("");

    private String expression;

    BingoValues(String expression) {
        this.expression = expression;
    }

    public String getExpression() {
        return expression;
    }
}
