import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public class kjk implements krc
{
    private final kjk a;
    private final kkp b;
    private List c;
    
    public kjk() {
        this(kks.a);
    }
    
    private kjk(final kjk a, final kkp b) {
        this.b = b;
        this.a = a;
        this.c = new ArrayList();
    }
    
    public kjk(final kkp b) {
        this.b = b;
        this.a = null;
        this.c = new ArrayList();
    }
    
    public boolean a() {
        synchronized (this) {
            return this.c == null;
        }
    }
    
    public final kjk b() {
        final kjk kjk = new kjk(this, this.b);
        this.c(kjk);
        return kjk;
    }
    
    public final void c(final krc krc) {
        krc.getClass();
        synchronized (this) {
            final List c = this.c;
            boolean b;
            if (c == null) {
                b = true;
            }
            else {
                c.add(krc);
                b = false;
            }
            monitorexit(this);
            if (b) {
                this.b.a(krc);
            }
        }
    }
    
    @Override
    public void close() {
        synchronized (this) {
            final List c = this.c;
            if (c != null) {
                this.c = null;
                final kjk a = this.a;
                if (a != null) {
                    synchronized (a) {
                        final List c2 = a.c;
                        if (c2 != null) {
                            c2.remove(this);
                        }
                    }
                }
                monitorexit(this);
                this.b.b(c);
            }
        }
    }
}
