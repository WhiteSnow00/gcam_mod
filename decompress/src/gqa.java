import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gqa implements krc
{
    public final ofn a;
    public final gue b;
    public List c;
    public gud d;
    
    public gqa(final gue b) {
        this.a = ofn.f();
        this.c = new ArrayList();
        this.b = b;
    }
    
    public final int a() {
        return this.c.size();
    }
    
    public final void b() {
        this.close();
        if (!this.a.isDone()) {
            this.a.cancel(true);
        }
        final Iterator iterator = this.c.iterator();
        while (iterator.hasNext()) {
            ((kvs)iterator.next()).close();
        }
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            final gud d = this.d;
            if (d != null) {
                d.a();
            }
        }
    }
}
