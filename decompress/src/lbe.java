// 
// Decompiled by Procyon v0.6.0
// 

public final class lbe
{
    public final kzp a;
    public final kzl b;
    private krc c;
    
    public lbe(final kzl b, final kzp a, final krc c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final kvs a() {
        synchronized (this) {
            return laz.k(this.a);
        }
    }
    
    public final kvx b() {
        return this.a.b;
    }
    
    final void c() {
        synchronized (this) {
            final krc c = this.c;
            this.c = null;
            monitorexit(this);
            if (c != null) {
                c.close();
            }
        }
    }
    
    final boolean d() {
        monitorenter(this);
        try {
            final boolean b = this.c != null;
            monitorexit(this);
            return b;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final boolean e() {
        return this.a.k();
    }
    
    @Override
    public final String toString() {
        return this.a.toString();
    }
}
