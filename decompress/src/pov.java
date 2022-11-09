import java.util.concurrent.CancellationException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pov extends CancellationException implements pnu
{
    public final pou a;
    
    public pov(final String s, final Throwable t, final pou a) {
        s.getClass();
        a.getClass();
        super(s);
        this.a = a;
        if (t != null) {
            this.initCause(t);
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o != this) {
            if (o instanceof pov) {
                final pov pov = (pov)o;
                if (plr.b(pov.getMessage(), this.getMessage()) && plr.b(pov.a, this.a)) {
                    if (plr.b(pov.getCause(), this.getCause())) {
                        return b;
                    }
                    return false;
                }
            }
            b = false;
        }
        return b;
    }
    
    @Override
    public final Throwable fillInStackTrace() {
        if (pod.a) {
            return super.fillInStackTrace();
        }
        this.setStackTrace(new StackTraceElement[0]);
        return this;
    }
    
    @Override
    public final int hashCode() {
        final String message = this.getMessage();
        message.getClass();
        final int hashCode = message.hashCode();
        final int hashCode2 = this.a.hashCode();
        final Throwable cause = this.getCause();
        int hashCode3;
        if (cause != null) {
            hashCode3 = cause.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        return (hashCode * 31 + hashCode2) * 31 + hashCode3;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        sb.append(this.a);
        return sb.toString();
    }
}
