// 
// Decompiled by Procyon v0.6.0
// 

public final class nsq extends Exception
{
    public nsq(final Throwable t, final nsz nsz, final StackTraceElement[] stackTrace) {
        super(nsz.toString(), t);
        this.setStackTrace(stackTrace);
    }
    
    @Override
    public final Throwable fillInStackTrace() {
        return this;
    }
}
