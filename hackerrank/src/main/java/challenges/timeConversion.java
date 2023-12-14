package challenges;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class timeConversion {
    public static String timeConversion(String s) {
    String stringDate = null;
    
    try {
    SimpleDateFormat sdfInput = new SimpleDateFormat("hh:mm:ssa");

    SimpleDateFormat sdfOutput = new SimpleDateFormat("HH:mm:ss");

    Date date = sdfInput.parse(s);

    stringDate = sdfOutput.format(date);
    }
    catch (ParseException e){
        e.printStackTrace();
    }
    return stringDate;
    }
}
