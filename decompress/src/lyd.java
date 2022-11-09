// 
// Decompiled by Procyon v0.6.0
// 

public final class lyd extends RuntimeException
{
    public lyd(final String s) {
        super(s);
    }
    
    public static lyd a(final map map) {
        final String value = String.valueOf(map);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 42);
        sb.append("Could not create EGL context for version ");
        sb.append(value);
        sb.append(".");
        return new lyd(sb.toString());
    }
}
