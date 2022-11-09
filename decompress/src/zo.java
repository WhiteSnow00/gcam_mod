// 
// Decompiled by Procyon v0.6.0
// 

final class zo extends Throwable
{
    public zo(final String s) {
        super(s);
    }
    
    @Override
    public final Throwable fillInStackTrace() {
        monitorenter(this);
        monitorexit(this);
        return this;
    }
}
