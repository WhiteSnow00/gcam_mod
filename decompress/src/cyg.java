import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cyg
{
    private static final Pattern a;
    
    static {
        a = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        Pattern.compile("^(0|false|f|off|no|n)$", 2);
    }
    
    public static boolean a(final String s) {
        return cyg.a.matcher(s).matches();
    }
}
