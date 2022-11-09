import java.util.regex.Matcher;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ofy
{
    private static final Pattern a;
    
    static {
        Pattern.compile("\\.java:\\d+\\)\n");
        a = Pattern.compile("([^:^\n]+).*((?:\n\\s*at [^:~\n]*:?~?[0-9]*[^\n]*)+)(?:(\nCaused by: )([^:^\n]+).*((?:\n\\s*at [^:~\n]*:?~?[0-9]*[^\n]*)+))?(?:(\nCaused by: )([^:^\n]+).*((?:\n\\s*at [^:~\n]*:?~?[0-9]*[^\n]*)+))?");
    }
    
    public static String a(final Throwable t) {
        final StringWriter stringWriter = new StringWriter();
        t.printStackTrace(new PrintWriter(stringWriter));
        final String string = stringWriter.toString();
        final StringBuilder sb = new StringBuilder();
        final Matcher matcher = ofy.a.matcher(string);
        if (matcher.find()) {
            for (int i = 1; i <= matcher.groupCount(); ++i) {
                if (matcher.group(i) == null) {
                    break;
                }
                sb.append(matcher.group(i));
            }
        }
        return sb.toString();
    }
}
