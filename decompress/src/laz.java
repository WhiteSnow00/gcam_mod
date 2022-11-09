// 
// Decompiled by Procyon v0.6.0
// 

final class laz implements kvs
{
    private final kzp a;
    private final krc b;
    private boolean c;
    
    public laz(final kzp a, final krc b) {
        this.c = false;
        this.a = a;
        this.b = b;
    }
    
    public static kvs k(final kzp kzp) {
        final krc b = kzp.b();
        if (b == null) {
            return null;
        }
        return new laz(kzp, b);
    }
    
    @Override
    public final kvs a() {
        synchronized (this) {
            if (this.c) {
                return null;
            }
            return k(this.a);
        }
    }
    
    @Override
    public final kvx b() {
        synchronized (this) {
            return this.a.b;
        }
    }
    
    @Override
    public final ljm c() {
        synchronized (this) {
            return this.a.d();
        }
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            if (!this.c) {
                this.c = true;
                this.b.close();
            }
        }
    }
    
    @Override
    public final lju d(final kwz kwz) {
        synchronized (this) {
            if (this.c) {
                return null;
            }
            return this.a.e(kwz);
        }
    }
    
    @Override
    public final boolean e() {
        synchronized (this) {
            return this.c;
        }
    }
    
    @Override
    public final boolean f() {
        synchronized (this) {
            return this.a.k();
        }
    }
    
    @Override
    public final boolean g() {
        synchronized (this) {
            return this.a.l();
        }
    }
    
    @Override
    public final boolean h() {
        synchronized (this) {
            return this.a.m();
        }
    }
    
    @Override
    public final kzl i() {
        synchronized (this) {
            return this.a.c;
        }
    }
    
    @Override
    public final void j(final kwp kwp) {
        synchronized (this) {
            this.a.o(kwp);
        }
    }
    
    @Override
    public final String toString() {
        return this.a.toString();
    }
}
