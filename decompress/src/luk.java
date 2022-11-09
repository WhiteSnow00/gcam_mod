// 
// Decompiled by Procyon v0.6.0
// 

public final class luk extends Exception
{
    public luk(final Exception ex) {
        super("Exception while parsing video", ex);
    }
    
    public luk(final String s) {
        super(s);
    }
}
