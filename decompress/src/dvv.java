// 
// Decompiled by Procyon v0.6.0
// 

public final class dvv extends RuntimeException
{
    public dvv(final String s) {
        super(s);
    }
    
    public dvv(final Throwable t) {
        super("Error processing secondary payload.", t);
    }
}
