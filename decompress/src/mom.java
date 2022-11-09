// 
// Decompiled by Procyon v0.6.0
// 

public final class mom extends RuntimeException
{
    public final int a;
    
    public mom(final int a, String s, final Throwable t) {
        if (s != null) {
            final StringBuilder sb = new StringBuilder(s.length() + 13);
            sb.append(a);
            sb.append(": ");
            sb.append(s);
            s = sb.toString();
        }
        else {
            s = String.valueOf(a);
        }
        super(s, t);
        this.a = a;
    }
}
