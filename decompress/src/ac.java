import java.util.Iterator;
import java.io.IOException;
import java.io.Closeable;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ac
{
    public final HashMap a;
    
    public ac() {
        this.a = new HashMap();
    }
    
    public final void a() {
        for (y y : this.a.values()) {
            y.b = true;
            synchronized (y.a) {
                for (final Object next : y.a.values()) {
                    if (next instanceof Closeable) {
                        try {
                            ((Closeable)next).close();
                            continue;
                        }
                        catch (final IOException ex) {
                            throw new RuntimeException(ex);
                        }
                        break;
                    }
                }
                monitorexit(y.a);
                y.a();
                continue;
            }
            break;
        }
        this.a.clear();
    }
}
