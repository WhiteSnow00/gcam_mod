import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nxb implements Closeable
{
    public static final nxa a;
    final nxa b;
    public final Deque c;
    public Throwable d;
    
    static {
        nxa nxa;
        try {
            final nwz nwz = new nwz(Throwable.class.getMethod("addSuppressed", Throwable.class));
        }
        finally {
            nxa = null;
        }
        nxa a2 = nxa;
        if (nxa == null) {
            a2 = nwy.a;
        }
        a = a2;
    }
    
    public nxb(final nxa b) {
        this.c = new ArrayDeque(4);
        b.getClass();
        this.b = b;
    }
    
    @Override
    public final void close() {
        Throwable d = this.d;
        while (!this.c.isEmpty()) {
            final Closeable closeable = this.c.removeFirst();
            try {
                closeable.close();
            }
            finally {
                if (d == null) {
                    final Throwable t;
                    d = t;
                }
                else {
                    final Throwable t;
                    this.b.a(closeable, d, t);
                }
            }
        }
        if (this.d == null && d != null) {
            njt.c(d, IOException.class);
            throw new AssertionError((Object)d);
        }
    }
}
