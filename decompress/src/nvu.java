// 
// Decompiled by Procyon v0.6.0
// 

public final class nvu extends RuntimeException
{
    public nvu(final String s) {
        super(s);
    }
    
    public static nvu a(final String s, final String s2, final int n) {
        return new nvu(d(s, s2, n, n + 1));
    }
    
    public static nvu b(final String s, final String s2, final int n, final int n2) {
        return new nvu(d(s, s2, n, n2));
    }
    
    public static nvu c(final String s, final String s2, final int n) {
        return new nvu(d(s, s2, n, -1));
    }
    
    private static String d(final String s, final String s2, final int n, final int n2) {
        int length = n2;
        if (n2 < 0) {
            length = s2.length();
        }
        final StringBuilder sb = new StringBuilder(s);
        sb.append(": ");
        if (n > 8) {
            sb.append("...");
            sb.append(s2, n - 5, n);
        }
        else {
            sb.append(s2, 0, n);
        }
        sb.append('[');
        sb.append(s2.substring(n, length));
        sb.append(']');
        if (s2.length() - length > 8) {
            sb.append(s2, length, length + 5);
            sb.append("...");
        }
        else {
            sb.append(s2, length, s2.length());
        }
        return sb.toString();
    }
    
    @Override
    public final Throwable fillInStackTrace() {
        monitorenter(this);
        monitorexit(this);
        return this;
    }
}
