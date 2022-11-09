// 
// Decompiled by Procyon v0.6.0
// 

public final class aiz extends cwy
{
    public final Throwable a;
    
    public aiz(final Throwable a) {
        this.a = a;
    }
    
    @Override
    public final String toString() {
        return String.format("FAILURE (%s)", this.a.getMessage());
    }
}
