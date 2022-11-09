import java.util.logging.Logger;
import java.util.logging.Level;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

final class nwy implements nxa
{
    static final nwy a;
    
    static {
        a = new nwy();
    }
    
    public nwy() {
    }
    
    @Override
    public final void a(final Closeable closeable, final Throwable t, final Throwable t2) {
        final Logger a = nwx.a;
        final Level warning = Level.WARNING;
        final String value = String.valueOf(closeable);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 42);
        sb.append("Suppressing exception thrown when closing ");
        sb.append(value);
        a.logp(warning, "com.google.common.io.Closer$LoggingSuppressor", "suppress", sb.toString(), t2);
    }
}
