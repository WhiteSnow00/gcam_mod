// 
// Decompiled by Procyon v0.6.0
// 

public final class fnf
{
    public static final fnf a;
    public static final fnf b;
    public final boolean c;
    
    static {
        a = a(false);
        b = a(true);
    }
    
    public fnf() {
    }
    
    public fnf(final boolean c) {
        this.c = c;
    }
    
    private static fnf a(final boolean b) {
        return new fnf(b);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof fnf && this.c == ((fnf)o).c);
    }
    
    @Override
    public final int hashCode() {
        int n;
        if (!this.c) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        return n ^ 0xF4243;
    }
    
    @Override
    public final String toString() {
        final boolean c = this.c;
        final StringBuilder sb = new StringBuilder(39);
        sb.append("FirstPreviewFrameState{delivered=");
        sb.append(c);
        sb.append("}");
        return sb.toString();
    }
}
