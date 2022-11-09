import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jwr
{
    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }
    
    public static boolean a(final String s) {
        return s == null || s.trim().isEmpty();
    }
}
