// 
// Decompiled by Procyon v0.6.0
// 

public final class ape extends Exception
{
    public final int a;
    
    public ape(final String s, final int a) {
        super(s);
        this.a = a;
    }
    
    public ape(final String s, final int a, final Throwable t) {
        super(s, t);
        this.a = a;
    }
}
