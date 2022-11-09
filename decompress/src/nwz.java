import java.io.Closeable;
import java.lang.reflect.Method;

// 
// Decompiled by Procyon v0.6.0
// 

final class nwz implements nxa
{
    private final Method a;
    
    public nwz(final Method a) {
        this.a = a;
    }
    
    @Override
    public final void a(final Closeable closeable, final Throwable t, final Throwable t2) {
        if (t == t2) {
            return;
        }
        try {
            this.a.invoke(t, t2);
        }
        finally {
            nwy.a.a(closeable, t, t2);
        }
    }
}
