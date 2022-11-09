// 
// Decompiled by Procyon v0.6.0
// 

public final class dqu implements krc
{
    public final hih a;
    private krd b;
    private boolean c;
    private boolean d;
    private aza e;
    
    public dqu(final hih a) {
        this.d = false;
        this.a = a;
        this.b = krd.c;
        this.c = false;
    }
    
    public final aza a() {
        synchronized (this) {
            return this.e;
        }
    }
    
    public final krd b() {
        synchronized (this) {
            return this.b;
        }
    }
    
    public final void c(final aza e) {
        synchronized (this) {
            if (this.d) {
                return;
            }
            this.e = e;
            if (!this.c) {
                this.c = true;
            }
        }
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            if (this.d) {
                return;
            }
            this.d = true;
            this.e = null;
        }
    }
    
    public final void d(final krd b) {
        synchronized (this) {
            if (this.b == krd.c) {
                b.a(krd.b);
            }
            if (!this.b.equals(krd.a)) {
                b.equals(krd.a);
            }
            this.b = b;
        }
    }
    
    public final boolean e() {
        synchronized (this) {
            return this.c;
        }
    }
    
    public final int f() {
        monitorenter(this);
        try {
            int n;
            if (this.b.d()) {
                n = 2;
            }
            else {
                n = 1;
            }
            monitorexit(this);
            return n;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
