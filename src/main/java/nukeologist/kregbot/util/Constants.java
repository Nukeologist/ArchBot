package nukeologist.kregbot.util;

import java.util.regex.Pattern;

/**
 * Shamelessly copied from https://github.com/tterrag1098/K9/blob/master/src/main/java/com/tterrag/k9/util/Patterns.java
 *
 * @author Nukeologist
 */
public class Constants {

    public static final Pattern INCREMENT_DECREMENT = Pattern.compile("^(\\S+)(\\+\\+|--)$");

    public static final Pattern ONEROLL = Pattern.compile("d\\d+");
    public static final Pattern ANYROLL = Pattern.compile("\\d+d\\d+");
    public static final Pattern GETINTEGER = Pattern.compile("^\\D*?(-?\\d+).*$");

    public static final Pattern HERE = Pattern.compile("@here");
    public static final Pattern EVERYONE = Pattern.compile("@everyone");

    public static final Pattern PUNCTUATION = Pattern.compile("[!,.*]");


    public static class Emotes {
        public static final String ItsApproved = "ItsApproved:233361278372937728";
    }

    public static class Symbols {
        public static final char DOUBLE_VERTICAL_BAR = 186;
        public static final char DOUBLE_HORIZONTAL_BAR = 205;


        public static final char DOUBLE_TOP_LEFT_CORNER = 201;
        public static final char DOUBLE_TOP_RIGHT_CORNER = 187;
        public static final char DOUBLE_BOTTOM_LEFT_CORNER = 200;
        public static final char DOUBLE_BOTTOM_RIGHT_CORNER = 188;
    }
}
