import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mem
{
    final List a;
    public volatile boolean b;
    
    public mem() {
        this.a = new ArrayList();
    }
    
    public final void a() {
        monitorenter(this);
        try {
            if (this.b) {
                return;
            }
            this.b = true;
            synchronized (this.a) {
                for (final men men : this.a) {
                    try {
                        men.a();
                    }
                    catch (final RuntimeException ex) {}
                }
                this.a.clear();
                monitorexit(this.a);
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
