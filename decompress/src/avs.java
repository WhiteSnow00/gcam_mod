import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class avs extends IOException
{
    private static final long serialVersionUID = 1L;
    
    public avs(final String s, final int n) {
        this(s, n, null);
    }
    
    public avs(final String s, final int n, final Throwable t) {
        final StringBuilder sb = new StringBuilder(String.valueOf(s).length() + 26);
        sb.append(s);
        sb.append(", status code: ");
        sb.append(n);
        super(sb.toString(), t);
    }
}
