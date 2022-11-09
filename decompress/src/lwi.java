// 
// Decompiled by Procyon v0.6.0
// 

public final class lwi extends Exception
{
    protected lwi(final Throwable t) {
        super(t);
        this.setStackTrace(t.getStackTrace());
    }
    
    public static lwi a(final Throwable t) {
        if (t instanceof lwi) {
            return (lwi)t;
        }
        return new lwi(t);
    }
}
