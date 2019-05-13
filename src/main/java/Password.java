import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

    public static void main(String[] args) {

        String patternSize = "(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*])(?=.*[0-9])[0-9a-zA-Z!@#$%^&*]{8,20}";

        String wrongPass1 = "NoNumbersNoSymbol";
        String wrongPass2 = "nouppercase00";
        String goodPass = "as12d@ekLner";

        Pattern pt = Pattern.compile(patternSize);

        Matcher m = pt.matcher(wrongPass1);
        if (m.matches()) System.out.println("good pass");
        else System.out.println("Bad pass");
        System.out.println();

        m = pt.matcher(wrongPass2);
        if (m.matches()) System.out.println("good pass");
        else System.out.println("Bad pass");
        System.out.println();

        m = pt.matcher(goodPass);
        if (m.matches()) System.out.println("good pass");
        else System.out.println("Bad pass");
        System.out.println();

    }
}
