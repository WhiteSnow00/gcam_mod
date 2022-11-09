// 
// Decompiled by Procyon v0.6.0
// 

public final class lfp extends RuntimeException
{
    public final int a;
    
    public lfp(final String s, final int a, final Throwable t) {
        super(s, t);
        this.a = a;
    }
}
